// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.async

import com.hanzo_ai.api.TestServerExtension
import com.hanzo_ai.api.client.okhttp.HanzoOkHttpClientAsync
import com.hanzo_ai.api.models.bedrock.BedrockCreateParams
import com.hanzo_ai.api.models.bedrock.BedrockDeleteParams
import com.hanzo_ai.api.models.bedrock.BedrockPatchParams
import com.hanzo_ai.api.models.bedrock.BedrockRetrieveParams
import com.hanzo_ai.api.models.bedrock.BedrockUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class BedrockServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun create() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val bedrockServiceAsync = client.bedrock()

        val bedrock =
            bedrockServiceAsync.create(BedrockCreateParams.builder().endpoint("endpoint").build())

        bedrock.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun retrieve() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val bedrockServiceAsync = client.bedrock()

        val bedrock =
            bedrockServiceAsync.retrieve(
                BedrockRetrieveParams.builder().endpoint("endpoint").build()
            )

        bedrock.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun update() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val bedrockServiceAsync = client.bedrock()

        val bedrock =
            bedrockServiceAsync.update(BedrockUpdateParams.builder().endpoint("endpoint").build())

        bedrock.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun delete() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val bedrockServiceAsync = client.bedrock()

        val bedrock =
            bedrockServiceAsync.delete(BedrockDeleteParams.builder().endpoint("endpoint").build())

        bedrock.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun patch() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val bedrockServiceAsync = client.bedrock()

        val response =
            bedrockServiceAsync.patch(BedrockPatchParams.builder().endpoint("endpoint").build())

        response.validate()
    }
}
