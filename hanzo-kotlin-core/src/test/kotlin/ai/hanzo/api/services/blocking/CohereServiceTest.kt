// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking

import ai.hanzo.api.client.okhttp.HanzoOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CohereServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = HanzoOkHttpClient.builder().apiKey("My API Key").build()
        val cohereService = client.cohere()

        val cohere = cohereService.create("endpoint")

        cohere.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = HanzoOkHttpClient.builder().apiKey("My API Key").build()
        val cohereService = client.cohere()

        val cohere = cohereService.retrieve("endpoint")

        cohere.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = HanzoOkHttpClient.builder().apiKey("My API Key").build()
        val cohereService = client.cohere()

        val cohere = cohereService.update("endpoint")

        cohere.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = HanzoOkHttpClient.builder().apiKey("My API Key").build()
        val cohereService = client.cohere()

        val cohere = cohereService.delete("endpoint")

        cohere.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun modify() {
        val client = HanzoOkHttpClient.builder().apiKey("My API Key").build()
        val cohereService = client.cohere()

        val response = cohereService.modify("endpoint")

        response.validate()
    }
}
