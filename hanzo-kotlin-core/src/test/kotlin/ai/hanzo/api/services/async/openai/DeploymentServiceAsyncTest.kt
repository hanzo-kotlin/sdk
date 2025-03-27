// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async.openai

import ai.hanzo.api.TestServerExtension
import ai.hanzo.api.client.okhttp.HanzoOkHttpClientAsync
import ai.hanzo.api.models.openai.deployments.DeploymentCompleteParams
import ai.hanzo.api.models.openai.deployments.DeploymentEmbedParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DeploymentServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun complete() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val deploymentServiceAsync = client.openai().deployments()

        val response =
            deploymentServiceAsync.complete(
                DeploymentCompleteParams.builder().model("model").build()
            )

        response.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun embed() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val deploymentServiceAsync = client.openai().deployments()

        val response =
            deploymentServiceAsync.embed(DeploymentEmbedParams.builder().model("model").build())

        response.validate()
    }
}
