// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.client.okhttp.HanzoOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CohereServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun create() {
        val client = HanzoOkHttpClientAsync.builder().apiKey("My API Key").build()
        val cohereServiceAsync = client.cohere()

        val cohere = cohereServiceAsync.create("endpoint")

        cohere.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun retrieve() {
        val client = HanzoOkHttpClientAsync.builder().apiKey("My API Key").build()
        val cohereServiceAsync = client.cohere()

        val cohere = cohereServiceAsync.retrieve("endpoint")

        cohere.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun update() {
        val client = HanzoOkHttpClientAsync.builder().apiKey("My API Key").build()
        val cohereServiceAsync = client.cohere()

        val cohere = cohereServiceAsync.update("endpoint")

        cohere.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun delete() {
        val client = HanzoOkHttpClientAsync.builder().apiKey("My API Key").build()
        val cohereServiceAsync = client.cohere()

        val cohere = cohereServiceAsync.delete("endpoint")

        cohere.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun modify() {
        val client = HanzoOkHttpClientAsync.builder().apiKey("My API Key").build()
        val cohereServiceAsync = client.cohere()

        val response = cohereServiceAsync.modify("endpoint")

        response.validate()
    }
}
