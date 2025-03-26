// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.blocking

import com.hanzo_ai.api.TestServerExtension
import com.hanzo_ai.api.client.okhttp.HanzoOkHttpClient
import com.hanzo_ai.api.models.bedrock.BedrockCreateParams
import com.hanzo_ai.api.models.bedrock.BedrockDeleteParams
import com.hanzo_ai.api.models.bedrock.BedrockPatchParams
import com.hanzo_ai.api.models.bedrock.BedrockRetrieveParams
import com.hanzo_ai.api.models.bedrock.BedrockUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class BedrockServiceTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val bedrockService = client.bedrock()

        val bedrock =
            bedrockService.create(BedrockCreateParams.builder().endpoint("endpoint").build())

        bedrock.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun retrieve() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val bedrockService = client.bedrock()

        val bedrock =
            bedrockService.retrieve(BedrockRetrieveParams.builder().endpoint("endpoint").build())

        bedrock.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun update() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val bedrockService = client.bedrock()

        val bedrock =
            bedrockService.update(BedrockUpdateParams.builder().endpoint("endpoint").build())

        bedrock.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun delete() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val bedrockService = client.bedrock()

        val bedrock =
            bedrockService.delete(BedrockDeleteParams.builder().endpoint("endpoint").build())

        bedrock.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun patch() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val bedrockService = client.bedrock()

        val response =
            bedrockService.patch(BedrockPatchParams.builder().endpoint("endpoint").build())

        response.validate()
    }
}
