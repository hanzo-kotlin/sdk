// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking.finetuning.jobs

import ai.hanzo.api.TestServerExtension
import ai.hanzo.api.client.okhttp.HanzoOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CancelServiceTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cancelService = client.fineTuning().jobs().cancel()

        val cancel = cancelService.create("fine_tuning_job_id")

        cancel.validate()
    }
}
