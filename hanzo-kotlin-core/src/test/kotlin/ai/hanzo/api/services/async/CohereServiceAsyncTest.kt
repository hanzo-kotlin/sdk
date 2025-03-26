// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.TestServerExtension
import ai.hanzo.api.client.okhttp.HanzoOkHttpClientAsync
import ai.hanzo.api.models.cohere.CohereCreateParams
import ai.hanzo.api.models.cohere.CohereDeleteParams
import ai.hanzo.api.models.cohere.CohereModifyParams
import ai.hanzo.api.models.cohere.CohereRetrieveParams
import ai.hanzo.api.models.cohere.CohereUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CohereServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun create() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cohereServiceAsync = client.cohere()

        val cohere =
            cohereServiceAsync.create(CohereCreateParams.builder().endpoint("endpoint").build())

        cohere.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun retrieve() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cohereServiceAsync = client.cohere()

        val cohere =
            cohereServiceAsync.retrieve(CohereRetrieveParams.builder().endpoint("endpoint").build())

        cohere.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun update() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cohereServiceAsync = client.cohere()

        val cohere =
            cohereServiceAsync.update(CohereUpdateParams.builder().endpoint("endpoint").build())

        cohere.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun delete() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cohereServiceAsync = client.cohere()

        val cohere =
            cohereServiceAsync.delete(CohereDeleteParams.builder().endpoint("endpoint").build())

        cohere.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun modify() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cohereServiceAsync = client.cohere()

        val response =
            cohereServiceAsync.modify(CohereModifyParams.builder().endpoint("endpoint").build())

        response.validate()
    }
}
