// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.blocking

import com.hanzo_ai.api.TestServerExtension
import com.hanzo_ai.api.client.okhttp.HanzoOkHttpClient
import com.hanzo_ai.api.models.cohere.CohereCreateParams
import com.hanzo_ai.api.models.cohere.CohereDeleteParams
import com.hanzo_ai.api.models.cohere.CohereModifyParams
import com.hanzo_ai.api.models.cohere.CohereRetrieveParams
import com.hanzo_ai.api.models.cohere.CohereUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CohereServiceTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cohereService = client.cohere()

        val cohere = cohereService.create(CohereCreateParams.builder().endpoint("endpoint").build())

        cohere.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun retrieve() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cohereService = client.cohere()

        val cohere =
            cohereService.retrieve(CohereRetrieveParams.builder().endpoint("endpoint").build())

        cohere.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun update() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cohereService = client.cohere()

        val cohere = cohereService.update(CohereUpdateParams.builder().endpoint("endpoint").build())

        cohere.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun delete() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cohereService = client.cohere()

        val cohere = cohereService.delete(CohereDeleteParams.builder().endpoint("endpoint").build())

        cohere.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun modify() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cohereService = client.cohere()

        val response =
            cohereService.modify(CohereModifyParams.builder().endpoint("endpoint").build())

        response.validate()
    }
}
