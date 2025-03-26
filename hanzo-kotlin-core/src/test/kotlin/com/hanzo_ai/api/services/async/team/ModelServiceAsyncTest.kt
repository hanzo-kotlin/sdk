// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.async.team

import com.hanzo_ai.api.TestServerExtension
import com.hanzo_ai.api.client.okhttp.HanzoOkHttpClientAsync
import com.hanzo_ai.api.models.team.model.ModelAddParams
import com.hanzo_ai.api.models.team.model.ModelRemoveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ModelServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun add() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val modelServiceAsync = client.team().model()

        val response =
            modelServiceAsync.add(
                ModelAddParams.builder().addModel("string").teamId("team_id").build()
            )

        response.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun remove() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val modelServiceAsync = client.team().model()

        val model =
            modelServiceAsync.remove(
                ModelRemoveParams.builder().addModel("string").teamId("team_id").build()
            )

        model.validate()
    }
}
