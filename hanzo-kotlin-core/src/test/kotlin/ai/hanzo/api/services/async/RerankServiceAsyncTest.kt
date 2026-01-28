// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.TestServerExtension
import ai.hanzo.api.client.okhttp.HanzoOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class RerankServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun create() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val rerankServiceAsync = client.rerank()

        val rerank = rerankServiceAsync.create()

        rerank.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun createV1() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val rerankServiceAsync = client.rerank()

        val response = rerankServiceAsync.createV1()

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun createV2() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val rerankServiceAsync = client.rerank()

        val response = rerankServiceAsync.createV2()

        response.validate()
    }
}
