// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.blocking.openai

import com.hanzo_ai.api.TestServerExtension
import com.hanzo_ai.api.client.okhttp.HanzoOkHttpClient
import com.hanzo_ai.api.models.openai.deployments.DeploymentCompleteParams
import com.hanzo_ai.api.models.openai.deployments.DeploymentEmbedParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DeploymentServiceTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun complete() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val deploymentService = client.openai().deployments()

        val response =
            deploymentService.complete(DeploymentCompleteParams.builder().model("model").build())

        response.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun embed() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val deploymentService = client.openai().deployments()

        val response =
            deploymentService.embed(DeploymentEmbedParams.builder().model("model").build())

        response.validate()
    }
}
