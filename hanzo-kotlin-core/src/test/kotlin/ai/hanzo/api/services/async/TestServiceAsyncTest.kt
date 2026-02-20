// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.client.okhttp.HanzoOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TestServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun ping() {
        val client = HanzoOkHttpClientAsync.builder().apiKey("My API Key").build()
        val testServiceAsync = client.test()

        val response = testServiceAsync.ping()

        response.validate()
    }
}
