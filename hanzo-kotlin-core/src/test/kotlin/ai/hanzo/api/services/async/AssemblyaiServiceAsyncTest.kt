// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.TestServerExtension
import ai.hanzo.api.client.okhttp.HanzoOkHttpClientAsync
import ai.hanzo.api.models.assemblyai.AssemblyaiCreateParams
import ai.hanzo.api.models.assemblyai.AssemblyaiDeleteParams
import ai.hanzo.api.models.assemblyai.AssemblyaiPatchParams
import ai.hanzo.api.models.assemblyai.AssemblyaiRetrieveParams
import ai.hanzo.api.models.assemblyai.AssemblyaiUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AssemblyaiServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun create() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val assemblyaiServiceAsync = client.assemblyai()

        val assemblyai =
            assemblyaiServiceAsync.create(
                AssemblyaiCreateParams.builder().endpoint("endpoint").build()
            )

        assemblyai.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun retrieve() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val assemblyaiServiceAsync = client.assemblyai()

        val assemblyai =
            assemblyaiServiceAsync.retrieve(
                AssemblyaiRetrieveParams.builder().endpoint("endpoint").build()
            )

        assemblyai.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun update() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val assemblyaiServiceAsync = client.assemblyai()

        val assemblyai =
            assemblyaiServiceAsync.update(
                AssemblyaiUpdateParams.builder().endpoint("endpoint").build()
            )

        assemblyai.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun delete() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val assemblyaiServiceAsync = client.assemblyai()

        val assemblyai =
            assemblyaiServiceAsync.delete(
                AssemblyaiDeleteParams.builder().endpoint("endpoint").build()
            )

        assemblyai.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun patch() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val assemblyaiServiceAsync = client.assemblyai()

        val response =
            assemblyaiServiceAsync.patch(
                AssemblyaiPatchParams.builder().endpoint("endpoint").build()
            )

        response.validate()
    }
}
