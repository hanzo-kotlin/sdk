// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.async

import com.hanzo_ai.api.TestServerExtension
import com.hanzo_ai.api.client.okhttp.HanzoOkHttpClientAsync
import com.hanzo_ai.api.models.euassemblyai.EuAssemblyaiCreateParams
import com.hanzo_ai.api.models.euassemblyai.EuAssemblyaiDeleteParams
import com.hanzo_ai.api.models.euassemblyai.EuAssemblyaiPatchParams
import com.hanzo_ai.api.models.euassemblyai.EuAssemblyaiRetrieveParams
import com.hanzo_ai.api.models.euassemblyai.EuAssemblyaiUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class EuAssemblyaiServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun create() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val euAssemblyaiServiceAsync = client.euAssemblyai()

        val euAssemblyai =
            euAssemblyaiServiceAsync.create(
                EuAssemblyaiCreateParams.builder().endpoint("endpoint").build()
            )

        euAssemblyai.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun retrieve() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val euAssemblyaiServiceAsync = client.euAssemblyai()

        val euAssemblyai =
            euAssemblyaiServiceAsync.retrieve(
                EuAssemblyaiRetrieveParams.builder().endpoint("endpoint").build()
            )

        euAssemblyai.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun update() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val euAssemblyaiServiceAsync = client.euAssemblyai()

        val euAssemblyai =
            euAssemblyaiServiceAsync.update(
                EuAssemblyaiUpdateParams.builder().endpoint("endpoint").build()
            )

        euAssemblyai.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun delete() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val euAssemblyaiServiceAsync = client.euAssemblyai()

        val euAssemblyai =
            euAssemblyaiServiceAsync.delete(
                EuAssemblyaiDeleteParams.builder().endpoint("endpoint").build()
            )

        euAssemblyai.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun patch() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val euAssemblyaiServiceAsync = client.euAssemblyai()

        val response =
            euAssemblyaiServiceAsync.patch(
                EuAssemblyaiPatchParams.builder().endpoint("endpoint").build()
            )

        response.validate()
    }
}
