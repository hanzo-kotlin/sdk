// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking.finetuning

import ai.hanzo.api.TestServerExtension
import ai.hanzo.api.client.okhttp.HanzoOkHttpClient
import ai.hanzo.api.models.finetuning.jobs.JobCreateParams
import ai.hanzo.api.models.finetuning.jobs.JobListParams
import ai.hanzo.api.models.finetuning.jobs.JobRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class JobServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val jobService = client.fineTuning().jobs()

        val job =
            jobService.create(
                JobCreateParams.builder()
                    .customLlmProvider(JobCreateParams.CustomLlmProvider.OPENAI)
                    .model("model")
                    .trainingFile("training_file")
                    .hyperparameters(
                        JobCreateParams.Hyperparameters.builder()
                            .batchSize("string")
                            .learningRateMultiplier("string")
                            .nEpochs("string")
                            .build()
                    )
                    .addIntegration("string")
                    .seed(0L)
                    .suffix("suffix")
                    .validationFile("validation_file")
                    .build()
            )

        job.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val jobService = client.fineTuning().jobs()

        val job =
            jobService.retrieve(
                JobRetrieveParams.builder()
                    .fineTuningJobId("fine_tuning_job_id")
                    .customLlmProvider(JobRetrieveParams.CustomLlmProvider.OPENAI)
                    .build()
            )

        job.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val jobService = client.fineTuning().jobs()

        val jobs =
            jobService.list(
                JobListParams.builder()
                    .customLlmProvider(JobListParams.CustomLlmProvider.OPENAI)
                    .after("after")
                    .limit(0L)
                    .build()
            )

        jobs.validate()
    }
}
