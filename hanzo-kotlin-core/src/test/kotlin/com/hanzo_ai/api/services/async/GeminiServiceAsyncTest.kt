// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.async

import com.hanzo_ai.api.TestServerExtension
import com.hanzo_ai.api.client.okhttp.HanzoOkHttpClientAsync
import com.hanzo_ai.api.models.gemini.GeminiCreateParams
import com.hanzo_ai.api.models.gemini.GeminiDeleteParams
import com.hanzo_ai.api.models.gemini.GeminiPatchParams
import com.hanzo_ai.api.models.gemini.GeminiRetrieveParams
import com.hanzo_ai.api.models.gemini.GeminiUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class GeminiServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun create() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val geminiServiceAsync = client.gemini()

        val gemini =
            geminiServiceAsync.create(GeminiCreateParams.builder().endpoint("endpoint").build())

        gemini.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun retrieve() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val geminiServiceAsync = client.gemini()

        val gemini =
            geminiServiceAsync.retrieve(GeminiRetrieveParams.builder().endpoint("endpoint").build())

        gemini.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun update() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val geminiServiceAsync = client.gemini()

        val gemini =
            geminiServiceAsync.update(GeminiUpdateParams.builder().endpoint("endpoint").build())

        gemini.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun delete() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val geminiServiceAsync = client.gemini()

        val gemini =
            geminiServiceAsync.delete(GeminiDeleteParams.builder().endpoint("endpoint").build())

        gemini.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun patch() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val geminiServiceAsync = client.gemini()

        val response =
            geminiServiceAsync.patch(GeminiPatchParams.builder().endpoint("endpoint").build())

        response.validate()
    }
}
