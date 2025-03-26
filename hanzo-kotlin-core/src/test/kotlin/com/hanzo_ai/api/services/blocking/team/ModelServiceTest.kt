// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.blocking.team

import com.hanzo_ai.api.TestServerExtension
import com.hanzo_ai.api.client.okhttp.HanzoOkHttpClient
import com.hanzo_ai.api.models.team.model.ModelAddParams
import com.hanzo_ai.api.models.team.model.ModelRemoveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ModelServiceTest {

    @Disabled("skipped: tests are disabled for the time being")
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

    @Disabled("skipped: tests are disabled for the time being")
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
