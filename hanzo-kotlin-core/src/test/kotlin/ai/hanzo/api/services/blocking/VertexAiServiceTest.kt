// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking

import ai.hanzo.api.TestServerExtension
import ai.hanzo.api.client.okhttp.HanzoOkHttpClient
import ai.hanzo.api.models.vertexai.VertexAiCreateParams
import ai.hanzo.api.models.vertexai.VertexAiDeleteParams
import ai.hanzo.api.models.vertexai.VertexAiPatchParams
import ai.hanzo.api.models.vertexai.VertexAiRetrieveParams
import ai.hanzo.api.models.vertexai.VertexAiUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class VertexAiServiceTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val vertexAiService = client.vertexAi()

        val vertexAi =
            vertexAiService.create(VertexAiCreateParams.builder().endpoint("endpoint").build())

        vertexAi.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun retrieve() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val vertexAiService = client.vertexAi()

        val vertexAi =
            vertexAiService.retrieve(VertexAiRetrieveParams.builder().endpoint("endpoint").build())

        vertexAi.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun update() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val vertexAiService = client.vertexAi()

        val vertexAi =
            vertexAiService.update(VertexAiUpdateParams.builder().endpoint("endpoint").build())

        vertexAi.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun delete() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val vertexAiService = client.vertexAi()

        val vertexAi =
            vertexAiService.delete(VertexAiDeleteParams.builder().endpoint("endpoint").build())

        vertexAi.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun patch() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val vertexAiService = client.vertexAi()

        val response =
            vertexAiService.patch(VertexAiPatchParams.builder().endpoint("endpoint").build())

        response.validate()
    }
}
