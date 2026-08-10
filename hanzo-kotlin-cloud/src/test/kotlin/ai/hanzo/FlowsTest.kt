package ai.hanzo

import ai.hanzo.cloud.api.AgentsApi
import ai.hanzo.cloud.api.BillingApi
import ai.hanzo.cloud.api.ChatApi
import ai.hanzo.cloud.api.KeysApi
import ai.hanzo.cloud.api.KvApi
import ai.hanzo.cloud.api.ToolsApi
import ai.hanzo.cloud.model.CreateAgentIn
import ai.hanzo.cloud.model.ProvisionRequest
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
        // The document hanzoai/cloud emits declares no security scheme, so the
        // generated calls carry no credential of their own; `Hanzo`'s
        // interceptor is what puts the bearer and the org on every request, and
        // this is the assertion that says it still does.
        assertEquals("Bearer test-key", request.getHeader("Authorization"))
        assertEquals("test-org", request.getHeader("X-Org-Id"))
    }

    @Test fun hello() = assertRoute("GET", "/v1/keys") { api(::KeysApi).getV1Keys() }

    @Test
    fun chat() =
        assertRoute("POST", "/v1/chat/completions") { api(::ChatApi).postV1ChatCompletions() }

    @Test
    fun money() = assertRoute("GET", "/v1/billing/balance") { api(::BillingApi).getV1BillingBalance() }

    @Test
    fun store() =
        assertRoute("POST", "/v1/kv") { api(::KvApi).postV1Kv(ProvisionRequest(name = "sdk-example")) }

    @Test
    fun agent() =
        assertRoute("POST", "/v1/agents") {
            api(::AgentsApi).postV1Agents(CreateAgentIn(name = "sdk-example"))
        }

    @Test fun tools() = assertRoute("GET", "/v1/tools") { api(::ToolsApi).getV1Tools() }

    /**
     * With no key the client sends no `Authorization` header, so the API is the
     * one that says no. `examples/hello` exists to show that answer.
     */
    @Test
    fun anUnauthenticatedClientSendsNoCredential() {
        val request = probe({ api(::KeysApi).getV1Keys() }, apiKey = null)
        assertNull(request.getHeader("Authorization"))
    }

    @Test
    fun theDefaultBaseUrlIsTheGateway() {
        assertEquals("https://api.hanzo.ai", Hanzo.DEFAULT_BASE_URL)
    }
}
