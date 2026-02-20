// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async.team

import ai.hanzo.api.client.okhttp.HanzoOkHttpClientAsync
import ai.hanzo.api.models.team.model.ModelAddParams
import ai.hanzo.api.models.team.model.ModelRemoveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ModelServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun add() {
        val client = HanzoOkHttpClientAsync.builder().apiKey("My API Key").build()
        val modelServiceAsync = client.team().model()

        val response =
            modelServiceAsync.add(
                ModelAddParams.builder().addModel("string").teamId("team_id").build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun remove() {
        val client = HanzoOkHttpClientAsync.builder().apiKey("My API Key").build()
        val modelServiceAsync = client.team().model()

        val model =
            modelServiceAsync.remove(
                ModelRemoveParams.builder().addModel("string").teamId("team_id").build()
            )

        model.validate()
    }
}
