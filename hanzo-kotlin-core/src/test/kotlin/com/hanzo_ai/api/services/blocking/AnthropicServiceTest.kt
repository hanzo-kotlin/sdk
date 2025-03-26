// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.blocking

import com.hanzo_ai.api.TestServerExtension
import com.hanzo_ai.api.client.okhttp.HanzoOkHttpClient
import com.hanzo_ai.api.models.anthropic.AnthropicCreateParams
import com.hanzo_ai.api.models.anthropic.AnthropicDeleteParams
import com.hanzo_ai.api.models.anthropic.AnthropicModifyParams
import com.hanzo_ai.api.models.anthropic.AnthropicRetrieveParams
import com.hanzo_ai.api.models.anthropic.AnthropicUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AnthropicServiceTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val anthropicService = client.anthropic()

        val anthropic =
            anthropicService.create(AnthropicCreateParams.builder().endpoint("endpoint").build())

        anthropic.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun retrieve() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val anthropicService = client.anthropic()

        val anthropic =
            anthropicService.retrieve(
                AnthropicRetrieveParams.builder().endpoint("endpoint").build()
            )

        anthropic.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun update() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val anthropicService = client.anthropic()

        val anthropic =
            anthropicService.update(AnthropicUpdateParams.builder().endpoint("endpoint").build())

        anthropic.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun delete() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val anthropicService = client.anthropic()

        val anthropic =
            anthropicService.delete(AnthropicDeleteParams.builder().endpoint("endpoint").build())

        anthropic.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun modify() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val anthropicService = client.anthropic()

        val response =
            anthropicService.modify(AnthropicModifyParams.builder().endpoint("endpoint").build())

        response.validate()
    }
}
