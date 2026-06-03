// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking.cache

import ai.hanzo.api.client.okhttp.HanzoOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class RediServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveInfo() {
        val client = HanzoOkHttpClient.builder().apiKey("My API Key").build()
        val rediService = client.cache().redis()

        val response = rediService.retrieveInfo()

        response.validate()
    }
}
