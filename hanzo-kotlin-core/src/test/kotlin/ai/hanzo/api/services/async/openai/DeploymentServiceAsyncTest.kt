// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async.openai

import ai.hanzo.api.client.okhttp.HanzoOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class DeploymentServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun complete() {
        val client = HanzoOkHttpClientAsync.builder().apiKey("My API Key").build()
        val deploymentServiceAsync = client.openai().deployments()

        val response = deploymentServiceAsync.complete("model")

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun embed() {
        val client = HanzoOkHttpClientAsync.builder().apiKey("My API Key").build()
        val deploymentServiceAsync = client.openai().deployments()

        val response = deploymentServiceAsync.embed("model")

        response.validate()
    }
}
