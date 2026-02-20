// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.client.okhttp.HanzoOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ResponseServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun create() {
        val client = HanzoOkHttpClientAsync.builder().apiKey("My API Key").build()
        val responseServiceAsync = client.responses()

        val response = responseServiceAsync.create()

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun retrieve() {
        val client = HanzoOkHttpClientAsync.builder().apiKey("My API Key").build()
        val responseServiceAsync = client.responses()

        val response = responseServiceAsync.retrieve("response_id")

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun delete() {
        val client = HanzoOkHttpClientAsync.builder().apiKey("My API Key").build()
        val responseServiceAsync = client.responses()

        val response = responseServiceAsync.delete("response_id")

        response.validate()
    }
}
