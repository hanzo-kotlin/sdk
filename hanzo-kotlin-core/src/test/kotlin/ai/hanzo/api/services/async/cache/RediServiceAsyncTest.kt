// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async.cache

import ai.hanzo.api.client.okhttp.HanzoOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class RediServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun retrieveInfo() {
        val client = HanzoOkHttpClientAsync.builder().apiKey("My API Key").build()
        val rediServiceAsync = client.cache().redis()

        val response = rediServiceAsync.retrieveInfo()

        response.validate()
    }
}
