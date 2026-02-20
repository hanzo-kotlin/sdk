// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking

import ai.hanzo.api.client.okhttp.HanzoOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class GuardrailServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client = HanzoOkHttpClient.builder().apiKey("My API Key").build()
        val guardrailService = client.guardrails()

        val guardrails = guardrailService.list()

        guardrails.validate()
    }
}
