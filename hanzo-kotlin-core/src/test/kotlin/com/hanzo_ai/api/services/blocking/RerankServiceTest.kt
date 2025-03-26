// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.blocking

import com.hanzo_ai.api.TestServerExtension
import com.hanzo_ai.api.client.okhttp.HanzoOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class RerankServiceTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val rerankService = client.rerank()

        val rerank = rerankService.create()

        rerank.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun createV1() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val rerankService = client.rerank()

        val response = rerankService.createV1()

        response.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun createV2() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val rerankService = client.rerank()

        val response = rerankService.createV2()

        response.validate()
    }
}
