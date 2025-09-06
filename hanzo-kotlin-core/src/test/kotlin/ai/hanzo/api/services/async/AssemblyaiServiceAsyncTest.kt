// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.TestServerExtension
import ai.hanzo.api.client.okhttp.HanzoOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AssemblyaiServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun create() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val assemblyaiServiceAsync = client.assemblyai()

        val assemblyai = assemblyaiServiceAsync.create("endpoint")

        assemblyai.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun retrieve() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val assemblyaiServiceAsync = client.assemblyai()

        val assemblyai = assemblyaiServiceAsync.retrieve("endpoint")

        assemblyai.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun update() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val assemblyaiServiceAsync = client.assemblyai()

        val assemblyai = assemblyaiServiceAsync.update("endpoint")

        assemblyai.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun delete() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val assemblyaiServiceAsync = client.assemblyai()

        val assemblyai = assemblyaiServiceAsync.delete("endpoint")

        assemblyai.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun patch() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val assemblyaiServiceAsync = client.assemblyai()

        val response = assemblyaiServiceAsync.patch("endpoint")

        response.validate()
    }
}
