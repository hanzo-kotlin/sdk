// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking

import ai.hanzo.api.client.okhttp.HanzoOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ResponseServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = HanzoOkHttpClient.builder().apiKey("My API Key").build()
        val responseService = client.responses()

        val response = responseService.create()

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = HanzoOkHttpClient.builder().apiKey("My API Key").build()
        val responseService = client.responses()

        val response = responseService.retrieve("response_id")

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = HanzoOkHttpClient.builder().apiKey("My API Key").build()
        val responseService = client.responses()

        val response = responseService.delete("response_id")

        response.validate()
    }
}
