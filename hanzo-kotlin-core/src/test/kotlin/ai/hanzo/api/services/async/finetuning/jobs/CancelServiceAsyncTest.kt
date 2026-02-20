// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async.finetuning.jobs

import ai.hanzo.api.client.okhttp.HanzoOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CancelServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun create() {
        val client = HanzoOkHttpClientAsync.builder().apiKey("My API Key").build()
        val cancelServiceAsync = client.fineTuning().jobs().cancel()

        val cancel = cancelServiceAsync.create("fine_tuning_job_id")

        cancel.validate()
    }
}
