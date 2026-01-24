// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async.finetuning

import ai.hanzo.api.TestServerExtension
import ai.hanzo.api.client.okhttp.HanzoOkHttpClientAsync
import ai.hanzo.api.models.finetuning.jobs.JobListParams
import ai.hanzo.api.models.finetuning.jobs.JobRetrieveParams
import ai.hanzo.api.models.finetuning.jobs.LiteLlmFineTuningJobCreate
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class JobServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun create() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val jobServiceAsync = client.fineTuning().jobs()

        val job =
            jobServiceAsync.create(
                LiteLlmFineTuningJobCreate.builder()
                    .model("model")
                    .trainingFile("training_file")
                    .customLlmProvider(LiteLlmFineTuningJobCreate.CustomLlmProvider.OPENAI)
                    .hyperparameters(
                        LiteLlmFineTuningJobCreate.Hyperparameters.builder()
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
    suspend fun retrieve() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val jobServiceAsync = client.fineTuning().jobs()

        val job =
            jobServiceAsync.retrieve(
                JobRetrieveParams.builder()
                    .fineTuningJobId("fine_tuning_job_id")
                    .customLlmProvider(JobRetrieveParams.CustomLlmProvider.OPENAI)
                    .build()
            )

        job.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun list() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val jobServiceAsync = client.fineTuning().jobs()

        val jobs =
            jobServiceAsync.list(
                JobListParams.builder()
                    .after("after")
                    .customLlmProvider(JobListParams.CustomLlmProvider.OPENAI)
                    .limit(0L)
                    .targetModelNames("target_model_names")
                    .build()
            )

        jobs.validate()
    }
}
