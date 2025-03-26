// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.blocking

import com.hanzo_ai.api.TestServerExtension
import com.hanzo_ai.api.client.okhttp.HanzoOkHttpClient
import com.hanzo_ai.api.models.batches.BatchCancelWithProviderParams
import com.hanzo_ai.api.models.batches.BatchCreateParams
import com.hanzo_ai.api.models.batches.BatchCreateWithProviderParams
import com.hanzo_ai.api.models.batches.BatchListParams
import com.hanzo_ai.api.models.batches.BatchListWithProviderParams
import com.hanzo_ai.api.models.batches.BatchRetrieveParams
import com.hanzo_ai.api.models.batches.BatchRetrieveWithProviderParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class BatchServiceTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val batchService = client.batches()

        val batch = batchService.create(BatchCreateParams.builder().provider("provider").build())

        batch.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun retrieve() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val batchService = client.batches()

        val batch =
            batchService.retrieve(
                BatchRetrieveParams.builder().batchId("batch_id").provider("provider").build()
            )

        batch.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun list() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val batchService = client.batches()

        val batch =
            batchService.list(
                BatchListParams.builder().after("after").limit(0L).provider("provider").build()
            )

        batch.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun cancelWithProvider() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val batchService = client.batches()

        val response =
            batchService.cancelWithProvider(
                BatchCancelWithProviderParams.builder()
                    .provider("provider")
                    .batchId("batch_id")
                    .build()
            )

        response.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun createWithProvider() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val batchService = client.batches()

        val response =
            batchService.createWithProvider(
                BatchCreateWithProviderParams.builder().provider("provider").build()
            )

        response.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun listWithProvider() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val batchService = client.batches()

        val response =
            batchService.listWithProvider(
                BatchListWithProviderParams.builder()
                    .provider("provider")
                    .after("after")
                    .limit(0L)
                    .build()
            )

        response.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun retrieveWithProvider() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val batchService = client.batches()

        val response =
            batchService.retrieveWithProvider(
                BatchRetrieveWithProviderParams.builder()
                    .provider("provider")
                    .batchId("batch_id")
                    .build()
            )

        response.validate()
    }
}
