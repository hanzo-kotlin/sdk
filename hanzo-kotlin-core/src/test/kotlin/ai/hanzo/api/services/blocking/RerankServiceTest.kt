// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking

import ai.hanzo.api.client.okhttp.HanzoOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class RerankServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = HanzoOkHttpClient.builder().apiKey("My API Key").build()
        val rerankService = client.rerank()

        val rerank = rerankService.create()

        rerank.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createV1() {
        val client = HanzoOkHttpClient.builder().apiKey("My API Key").build()
        val rerankService = client.rerank()

        val response = rerankService.createV1()

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createV2() {
        val client = HanzoOkHttpClient.builder().apiKey("My API Key").build()
        val rerankService = client.rerank()

        val response = rerankService.createV2()

        response.validate()
    }
}
