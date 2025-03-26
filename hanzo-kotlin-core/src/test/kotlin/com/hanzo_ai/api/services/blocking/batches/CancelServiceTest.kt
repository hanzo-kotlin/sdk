// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.blocking.batches

import com.hanzo_ai.api.TestServerExtension
import com.hanzo_ai.api.client.okhttp.HanzoOkHttpClient
import com.hanzo_ai.api.models.batches.cancel.CancelCancelParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CancelServiceTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun cancel() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cancelService = client.batches().cancel()

        val response =
            cancelService.cancel(
                CancelCancelParams.builder().batchId("batch_id").provider("provider").build()
            )

        response.validate()
    }
}
