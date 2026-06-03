// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async.batches

import ai.hanzo.api.client.okhttp.HanzoOkHttpClientAsync
import ai.hanzo.api.models.batches.cancel.CancelCancelParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CancelServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun cancel() {
        val client = HanzoOkHttpClientAsync.builder().apiKey("My API Key").build()
        val cancelServiceAsync = client.batches().cancel()

        val response =
            cancelServiceAsync.cancel(
                CancelCancelParams.builder().batchId("batch_id").provider("provider").build()
            )

        response.validate()
    }
}
