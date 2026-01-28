// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.TestServerExtension
import ai.hanzo.api.client.okhttp.HanzoOkHttpClientAsync
import ai.hanzo.api.models.batches.BatchCancelWithProviderParams
import ai.hanzo.api.models.batches.BatchCreateParams
import ai.hanzo.api.models.batches.BatchListParams
import ai.hanzo.api.models.batches.BatchListWithProviderParams
import ai.hanzo.api.models.batches.BatchRetrieveParams
import ai.hanzo.api.models.batches.BatchRetrieveWithProviderParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class BatchServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun create() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val batchServiceAsync = client.batches()

        val batch =
            batchServiceAsync.create(BatchCreateParams.builder().provider("provider").build())

        batch.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun retrieve() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val batchServiceAsync = client.batches()

        val batch =
            batchServiceAsync.retrieve(
                BatchRetrieveParams.builder().batchId("batch_id").provider("provider").build()
            )

        batch.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun list() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val batchServiceAsync = client.batches()

        val batches =
            batchServiceAsync.list(
                BatchListParams.builder()
                    .after("after")
                    .limit(0L)
                    .provider("provider")
                    .targetModelNames("target_model_names")
                    .build()
            )

        batches.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun cancelWithProvider() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val batchServiceAsync = client.batches()

        val response =
            batchServiceAsync.cancelWithProvider(
                BatchCancelWithProviderParams.builder()
                    .provider("provider")
                    .batchId("batch_id")
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun createWithProvider() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val batchServiceAsync = client.batches()

        val response = batchServiceAsync.createWithProvider("provider")

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun listWithProvider() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val batchServiceAsync = client.batches()

        val response =
            batchServiceAsync.listWithProvider(
                BatchListWithProviderParams.builder()
                    .provider("provider")
                    .after("after")
                    .limit(0L)
                    .targetModelNames("target_model_names")
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun retrieveWithProvider() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val batchServiceAsync = client.batches()

        val response =
            batchServiceAsync.retrieveWithProvider(
                BatchRetrieveWithProviderParams.builder()
                    .provider("provider")
                    .batchId("batch_id")
                    .build()
            )

        response.validate()
    }
}
