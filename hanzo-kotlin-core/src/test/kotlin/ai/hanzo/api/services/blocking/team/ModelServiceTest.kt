// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking.team

import ai.hanzo.api.TestServerExtension
import ai.hanzo.api.client.okhttp.HanzoOkHttpClient
import ai.hanzo.api.models.team.model.ModelAddParams
import ai.hanzo.api.models.team.model.ModelRemoveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ModelServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun add() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val modelService = client.team().model()

        val response =
            modelService.add(ModelAddParams.builder().addModel("string").teamId("team_id").build())

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun remove() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val modelService = client.team().model()

        val model =
            modelService.remove(
                ModelRemoveParams.builder().addModel("string").teamId("team_id").build()
            )

        model.validate()
    }
}
