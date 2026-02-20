// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.client.okhttp.HanzoOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class EngineServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun complete() {
        val client = HanzoOkHttpClientAsync.builder().apiKey("My API Key").build()
        val engineServiceAsync = client.engines()

        val response = engineServiceAsync.complete("model")

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun embed() {
        val client = HanzoOkHttpClientAsync.builder().apiKey("My API Key").build()
        val engineServiceAsync = client.engines()

        val response = engineServiceAsync.embed("model")

        response.validate()
    }
}
