package ai.hanzo

import ai.hanzo.cloud.api.AgentsApi
import ai.hanzo.cloud.api.BillingApi
import ai.hanzo.cloud.api.ChatApi
import ai.hanzo.cloud.api.KeysApi
import ai.hanzo.cloud.api.KvApi
import ai.hanzo.cloud.api.ModelsApi
import ai.hanzo.cloud.api.ToolsApi
import ai.hanzo.cloud.infrastructure.ApiClient
import ai.hanzo.cloud.model.CreateAgentIn
import ai.hanzo.cloud.model.ProvisionRequest
import okhttp3.mockwebserver.MockResponse
import okhttp3.mockwebserver.MockWebServer
import okhttp3.mockwebserver.RecordedRequest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertNull
import org.junit.jupiter.api.Assertions.assertTrue
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
        // `Hanzo`'s interceptor is what puts the bearer and the org on every
        // request, and this is the assertion that says it still does.
        assertEquals("Bearer test-key", request.getHeader("Authorization"))
        assertEquals("test-org", request.getHeader("X-Org-Id"))
    }

    @Test fun hello() = assertRoute("GET", "/v1/keys") { api(::KeysApi).getKeys() }

    @Test
    fun chat() =
        assertRoute("POST", "/v1/chat/completions") { api(::ChatApi).postChatCompletions() }

    @Test
    fun money() = assertRoute("GET", "/v1/billing/balance") { api(::BillingApi).getBillingBalance() }

    @Test
    fun store() =
        assertRoute("POST", "/v1/kv") { api(::KvApi).postKv(ProvisionRequest(name = "sdk-example")) }

    @Test
    fun agent() =
        assertRoute("POST", "/v1/agents") {
            api(::AgentsApi).postAgents(CreateAgentIn(name = "sdk-example"))
        }

    @Test fun tools() = assertRoute("GET", "/v1/tools") { api(::ToolsApi).getTools() }

    /**
     * With no key the client sends no `Authorization` header, so the API is the
     * one that says no. `examples/hello` exists to show that answer.
     *
     * It holds even while another instance in this same process is holding a
     * key, which is not free: the generated `ApiClient.accessToken` is one
     * field per process, so a client that read it would inherit that key here.
     * Setting the field first is how this test is made to mean that.
     */
    @Test
    fun anUnauthenticatedClientSendsNoCredential() {
        ApiClient.accessToken = "someone-elses-key"
        val request = probe({ api(::KeysApi).getKeys() }, apiKey = null)
        assertNull(request.getHeader("Authorization"))
    }

    /**
     * Two tenants, one process: each client sends the credential it was handed.
     * The credential is a value on the instance, not a slot somewhere both can
     * reach, so serving a second tenant cannot re-point the first one's calls.
     */
    @Test
    fun eachClientKeepsItsOwnCredential() {
        assertEquals("Bearer acme", probe({ api(::KeysApi).getKeys() }, apiKey = "acme").getHeader("Authorization"))
        assertEquals("Bearer globex", probe({ api(::KeysApi).getKeys() }, apiKey = "globex").getHeader("Authorization"))
    }

    /**
     * The document says which routes need the credential, and the client says
     * it back. Four operations carry `security: []` — `get_models` is the one
     * `hello` opens with — and every other one inherits the top-level `bearer`.
     * Reading it off the generated request config is reading the declaration,
     * not a probe result someone wrote down.
     */
    @Test
    fun theDocumentSaysWhichRoutesNeedTheCredential() {
        assertFalse(ModelsApi().getModelsRequestConfig().requiresAuthentication)
        assertTrue(KeysApi().getKeysRequestConfig().requiresAuthentication)
    }

    @Test
    fun theDefaultBaseUrlIsTheGateway() {
        assertEquals("https://api.hanzo.ai", Hanzo.DEFAULT_BASE_URL)
    }
}
