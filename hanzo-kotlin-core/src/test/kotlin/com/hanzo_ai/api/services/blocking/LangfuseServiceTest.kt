// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.blocking

import com.hanzo_ai.api.TestServerExtension
import com.hanzo_ai.api.client.okhttp.HanzoOkHttpClient
import com.hanzo_ai.api.models.langfuse.LangfuseCreateParams
import com.hanzo_ai.api.models.langfuse.LangfuseDeleteParams
import com.hanzo_ai.api.models.langfuse.LangfusePatchParams
import com.hanzo_ai.api.models.langfuse.LangfuseRetrieveParams
import com.hanzo_ai.api.models.langfuse.LangfuseUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class LangfuseServiceTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val langfuseService = client.langfuse()

        val langfuse =
            langfuseService.create(LangfuseCreateParams.builder().endpoint("endpoint").build())

        langfuse.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun retrieve() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val langfuseService = client.langfuse()

        val langfuse =
            langfuseService.retrieve(LangfuseRetrieveParams.builder().endpoint("endpoint").build())

        langfuse.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun update() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val langfuseService = client.langfuse()

        val langfuse =
            langfuseService.update(LangfuseUpdateParams.builder().endpoint("endpoint").build())

        langfuse.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun delete() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val langfuseService = client.langfuse()

        val langfuse =
            langfuseService.delete(LangfuseDeleteParams.builder().endpoint("endpoint").build())

        langfuse.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun patch() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val langfuseService = client.langfuse()

        val response =
            langfuseService.patch(LangfusePatchParams.builder().endpoint("endpoint").build())

        response.validate()
    }
}
