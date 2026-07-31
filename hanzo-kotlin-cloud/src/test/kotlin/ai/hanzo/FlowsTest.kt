package ai.hanzo

import ai.hanzo.cloud.api.AgentsApi
import ai.hanzo.cloud.api.AuthApi
import ai.hanzo.cloud.api.BillingApi
import ai.hanzo.cloud.api.KvApi
import ai.hanzo.cloud.api.MCPApi
import ai.hanzo.cloud.api.OpenAICompatibleApi
import ai.hanzo.cloud.model.AiChatCompletionRequest
import ai.hanzo.cloud.model.AiChatMessage
import ai.hanzo.cloud.model.CloudCreateAgentIn
import ai.hanzo.cloud.model.CloudProvisionRequest
import ai.hanzo.cloud.model.McpRequest
import okhttp3.mockwebserver.MockResponse
import okhttp3.mockwebserver.MockWebServer
import okhttp3.mockwebserver.RecordedRequest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNull
import org.junit.jupiter.api.Test

/**
 * The six canonical flows, pinned to the routes hanzoai/openapi `flows.yaml`
 * names. A regeneration that moves an operation fails here instead of shipping
 * examples that quietly call the wrong endpoint — which is the only thing a
 * generated client can get wrong on its own.
 */
class FlowsTest {

    /** Runs [call] against a stub gateway and hands back the request it made. */
    private fun probe(hanzo: Hanzo.() -> Unit, apiKey: String? = "test-key"): RecordedRequest {
        MockWebServer().use { server ->
            server.enqueue(
                MockResponse().setHeader("Content-Type", "application/json").setBody("{}")
            )
            server.start()
            Hanzo(baseUrl = server.url("/").toString(), apiKey = apiKey, orgId = "test-org").hanzo()
            return server.takeRequest()
        }
    }

    private fun assertRoute(method: String, path: String, hanzo: Hanzo.() -> Unit) {
        val request = probe(hanzo)
        assertEquals(method, request.method)
        assertEquals(path, request.path)
        // hanzo.yaml declares `security: [{bearerAuth: []}]` at the document
        // root, so every route wants the key; KV and agents additionally refuse
        // without an org.
        assertEquals("Bearer test-key", request.getHeader("Authorization"))
        assertEquals("test-org", request.getHeader("X-Org-Id"))
    }

    @Test
    fun hello() = assertRoute("GET", "/v1/bot/auth/me") { api(::AuthApi).botAuthMe() }

    @Test
    fun chat() =
        assertRoute("POST", "/v1/chat/completions") {
            api(::OpenAICompatibleApi)
                .aiCreateChatCompletion(
                    AiChatCompletionRequest(
                        model = "zen-1",
                        messages = listOf(AiChatMessage(role = AiChatMessage.Role.user)),
                    )
                )
        }

    @Test
    fun money() =
        assertRoute("GET", "/v1/billing/balance") { api(::BillingApi).cloudGetV1BillingBalance() }

    @Test
    fun store() =
        assertRoute("POST", "/v1/kv") {
            api(::KvApi).cloudPostV1Kv(CloudProvisionRequest(name = "sdk-example"))
        }

    @Test
    fun agent() =
        assertRoute("POST", "/v1/agents") {
            api(::AgentsApi).cloudPostV1Agents(CloudCreateAgentIn(name = "sdk-example"))
        }

    @Test
    fun tools() =
        assertRoute("POST", "/v1/mcp") {
            api(::MCPApi)
                .mcpRpc(
                    McpRequest(
                        jsonrpc = McpRequest.Jsonrpc._2Period0,
                        method = McpRequest.Method.toolsSlashList,
                    )
                )
        }

    /**
     * With no key the client sends no `Authorization` header, so the API is the
     * one that says no. `examples/hello` exists to show that answer.
     */
    @Test
    fun anUnauthenticatedClientSendsNoCredential() {
        val request = probe({ api(::AuthApi).botAuthMe() }, apiKey = null)
        assertNull(request.getHeader("Authorization"))
    }

    @Test
    fun theDefaultBaseUrlIsTheGateway() {
        assertEquals("https://api.hanzo.ai", Hanzo.DEFAULT_BASE_URL)
    }
}
