// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking

import ai.hanzo.api.TestServerExtension
import ai.hanzo.api.client.okhttp.HanzoOkHttpClient
import ai.hanzo.api.models.euassemblyai.EuAssemblyaiCreateParams
import ai.hanzo.api.models.euassemblyai.EuAssemblyaiDeleteParams
import ai.hanzo.api.models.euassemblyai.EuAssemblyaiPatchParams
import ai.hanzo.api.models.euassemblyai.EuAssemblyaiRetrieveParams
import ai.hanzo.api.models.euassemblyai.EuAssemblyaiUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class EuAssemblyaiServiceTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val euAssemblyaiService = client.euAssemblyai()

        val euAssemblyai =
            euAssemblyaiService.create(
                EuAssemblyaiCreateParams.builder().endpoint("endpoint").build()
            )

        euAssemblyai.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun retrieve() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val euAssemblyaiService = client.euAssemblyai()

        val euAssemblyai =
            euAssemblyaiService.retrieve(
                EuAssemblyaiRetrieveParams.builder().endpoint("endpoint").build()
            )

        euAssemblyai.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun update() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val euAssemblyaiService = client.euAssemblyai()

        val euAssemblyai =
            euAssemblyaiService.update(
                EuAssemblyaiUpdateParams.builder().endpoint("endpoint").build()
            )

        euAssemblyai.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun delete() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val euAssemblyaiService = client.euAssemblyai()

        val euAssemblyai =
            euAssemblyaiService.delete(
                EuAssemblyaiDeleteParams.builder().endpoint("endpoint").build()
            )

        euAssemblyai.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun patch() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val euAssemblyaiService = client.euAssemblyai()

        val response =
            euAssemblyaiService.patch(
                EuAssemblyaiPatchParams.builder().endpoint("endpoint").build()
            )

        response.validate()
    }
}
