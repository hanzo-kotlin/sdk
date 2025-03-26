// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.TestServerExtension
import ai.hanzo.api.client.okhttp.HanzoOkHttpClientAsync
import ai.hanzo.api.models.azure.AzureCallParams
import ai.hanzo.api.models.azure.AzureCreateParams
import ai.hanzo.api.models.azure.AzureDeleteParams
import ai.hanzo.api.models.azure.AzurePatchParams
import ai.hanzo.api.models.azure.AzureUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AzureServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun create() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val azureServiceAsync = client.azure()

        val azure =
            azureServiceAsync.create(AzureCreateParams.builder().endpoint("endpoint").build())

        azure.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun update() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val azureServiceAsync = client.azure()

        val azure =
            azureServiceAsync.update(AzureUpdateParams.builder().endpoint("endpoint").build())

        azure.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun delete() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val azureServiceAsync = client.azure()

        val azure =
            azureServiceAsync.delete(AzureDeleteParams.builder().endpoint("endpoint").build())

        azure.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun call() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val azureServiceAsync = client.azure()

        val response =
            azureServiceAsync.call(AzureCallParams.builder().endpoint("endpoint").build())

        response.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun patch() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val azureServiceAsync = client.azure()

        val response =
            azureServiceAsync.patch(AzurePatchParams.builder().endpoint("endpoint").build())

        response.validate()
    }
}
