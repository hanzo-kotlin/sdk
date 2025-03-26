// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.blocking

import com.hanzo_ai.api.TestServerExtension
import com.hanzo_ai.api.client.okhttp.HanzoOkHttpClient
import com.hanzo_ai.api.models.gemini.GeminiCreateParams
import com.hanzo_ai.api.models.gemini.GeminiDeleteParams
import com.hanzo_ai.api.models.gemini.GeminiPatchParams
import com.hanzo_ai.api.models.gemini.GeminiRetrieveParams
import com.hanzo_ai.api.models.gemini.GeminiUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class GeminiServiceTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val geminiService = client.gemini()

        val gemini = geminiService.create(GeminiCreateParams.builder().endpoint("endpoint").build())

        gemini.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun retrieve() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val geminiService = client.gemini()

        val gemini =
            geminiService.retrieve(GeminiRetrieveParams.builder().endpoint("endpoint").build())

        gemini.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun update() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val geminiService = client.gemini()

        val gemini = geminiService.update(GeminiUpdateParams.builder().endpoint("endpoint").build())

        gemini.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun delete() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val geminiService = client.gemini()

        val gemini = geminiService.delete(GeminiDeleteParams.builder().endpoint("endpoint").build())

        gemini.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun patch() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val geminiService = client.gemini()

        val response = geminiService.patch(GeminiPatchParams.builder().endpoint("endpoint").build())

        response.validate()
    }
}
