// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.client.okhttp.HanzoOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class GuardrailServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun list() {
        val client = HanzoOkHttpClientAsync.builder().apiKey("My API Key").build()
        val guardrailServiceAsync = client.guardrails()

        val guardrails = guardrailServiceAsync.list()

        guardrails.validate()
    }
}
