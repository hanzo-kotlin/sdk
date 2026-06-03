// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking

import ai.hanzo.api.client.okhttp.HanzoOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class EngineServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun complete() {
        val client = HanzoOkHttpClient.builder().apiKey("My API Key").build()
        val engineService = client.engines()

        val response = engineService.complete("model")

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun embed() {
        val client = HanzoOkHttpClient.builder().apiKey("My API Key").build()
        val engineService = client.engines()

        val response = engineService.embed("model")

        response.validate()
    }
}
