// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking.finetuning.jobs

import ai.hanzo.api.client.okhttp.HanzoOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CancelServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client = HanzoOkHttpClient.builder().apiKey("My API Key").build()
        val cancelService = client.fineTuning().jobs().cancel()

        val cancel = cancelService.create("fine_tuning_job_id")

        cancel.validate()
    }
}
