// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking.batches

import ai.hanzo.api.client.okhttp.HanzoOkHttpClient
import ai.hanzo.api.models.batches.cancel.CancelCancelParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CancelServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun cancel() {
        val client = HanzoOkHttpClient.builder().apiKey("My API Key").build()
        val cancelService = client.batches().cancel()

        val response =
            cancelService.cancel(
                CancelCancelParams.builder().batchId("batch_id").provider("provider").build()
            )

        response.validate()
    }
}
