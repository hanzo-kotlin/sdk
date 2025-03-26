// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.async.batches

import com.hanzo_ai.api.TestServerExtension
import com.hanzo_ai.api.client.okhttp.HanzoOkHttpClientAsync
import com.hanzo_ai.api.models.batches.cancel.CancelCancelParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CancelServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun cancel() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cancelServiceAsync = client.batches().cancel()

        val response =
            cancelServiceAsync.cancel(
                CancelCancelParams.builder().batchId("batch_id").provider("provider").build()
            )

        response.validate()
    }
}
