// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.async

import com.hanzo_ai.api.TestServerExtension
import com.hanzo_ai.api.client.okhttp.HanzoOkHttpClientAsync
import com.hanzo_ai.api.models.langfuse.LangfuseCreateParams
import com.hanzo_ai.api.models.langfuse.LangfuseDeleteParams
import com.hanzo_ai.api.models.langfuse.LangfusePatchParams
import com.hanzo_ai.api.models.langfuse.LangfuseRetrieveParams
import com.hanzo_ai.api.models.langfuse.LangfuseUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class LangfuseServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun create() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val langfuseServiceAsync = client.langfuse()

        val langfuse =
            langfuseServiceAsync.create(LangfuseCreateParams.builder().endpoint("endpoint").build())

        langfuse.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun retrieve() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val langfuseServiceAsync = client.langfuse()

        val langfuse =
            langfuseServiceAsync.retrieve(
                LangfuseRetrieveParams.builder().endpoint("endpoint").build()
            )

        langfuse.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun update() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val langfuseServiceAsync = client.langfuse()

        val langfuse =
            langfuseServiceAsync.update(LangfuseUpdateParams.builder().endpoint("endpoint").build())

        langfuse.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun delete() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val langfuseServiceAsync = client.langfuse()

        val langfuse =
            langfuseServiceAsync.delete(LangfuseDeleteParams.builder().endpoint("endpoint").build())

        langfuse.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun patch() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val langfuseServiceAsync = client.langfuse()

        val response =
            langfuseServiceAsync.patch(LangfusePatchParams.builder().endpoint("endpoint").build())

        response.validate()
    }
}
