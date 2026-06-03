// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking.openai

import ai.hanzo.api.client.okhttp.HanzoOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class DeploymentServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun complete() {
        val client = HanzoOkHttpClient.builder().apiKey("My API Key").build()
        val deploymentService = client.openai().deployments()

        val response = deploymentService.complete("model")

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun embed() {
        val client = HanzoOkHttpClient.builder().apiKey("My API Key").build()
        val deploymentService = client.openai().deployments()

        val response = deploymentService.embed("model")

        response.validate()
    }
}
