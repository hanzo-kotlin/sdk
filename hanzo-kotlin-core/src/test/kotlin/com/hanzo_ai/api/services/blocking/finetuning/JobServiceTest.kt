// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.blocking.finetuning

import com.hanzo_ai.api.TestServerExtension
import com.hanzo_ai.api.client.okhttp.HanzoOkHttpClient
import com.hanzo_ai.api.models.finetuning.jobs.JobCreateParams
import com.hanzo_ai.api.models.finetuning.jobs.JobListParams
import com.hanzo_ai.api.models.finetuning.jobs.JobRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class JobServiceTest {

    @Disabled("skipped: tests are disabled for the time being")
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

    @Disabled("skipped: tests are disabled for the time being")
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

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun list() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val jobService = client.fineTuning().jobs()

        val job =
            jobService.list(
                JobListParams.builder()
                    .customLlmProvider(JobListParams.CustomLlmProvider.OPENAI)
                    .after("after")
                    .limit(0L)
                    .build()
            )

        job.validate()
    }
}
