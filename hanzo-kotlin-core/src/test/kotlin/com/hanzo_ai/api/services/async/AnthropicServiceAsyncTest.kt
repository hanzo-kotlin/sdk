// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.async

import com.hanzo_ai.api.TestServerExtension
import com.hanzo_ai.api.client.okhttp.HanzoOkHttpClientAsync
import com.hanzo_ai.api.models.anthropic.AnthropicCreateParams
import com.hanzo_ai.api.models.anthropic.AnthropicDeleteParams
import com.hanzo_ai.api.models.anthropic.AnthropicModifyParams
import com.hanzo_ai.api.models.anthropic.AnthropicRetrieveParams
import com.hanzo_ai.api.models.anthropic.AnthropicUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AnthropicServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun create() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val anthropicServiceAsync = client.anthropic()

        val anthropic =
            anthropicServiceAsync.create(
                AnthropicCreateParams.builder().endpoint("endpoint").build()
            )

        anthropic.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun retrieve() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val anthropicServiceAsync = client.anthropic()

        val anthropic =
            anthropicServiceAsync.retrieve(
                AnthropicRetrieveParams.builder().endpoint("endpoint").build()
            )

        anthropic.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun update() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val anthropicServiceAsync = client.anthropic()

        val anthropic =
            anthropicServiceAsync.update(
                AnthropicUpdateParams.builder().endpoint("endpoint").build()
            )

        anthropic.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun delete() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val anthropicServiceAsync = client.anthropic()

        val anthropic =
            anthropicServiceAsync.delete(
                AnthropicDeleteParams.builder().endpoint("endpoint").build()
            )

        anthropic.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun modify() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val anthropicServiceAsync = client.anthropic()

        val response =
            anthropicServiceAsync.modify(
                AnthropicModifyParams.builder().endpoint("endpoint").build()
            )

        response.validate()
    }
}
