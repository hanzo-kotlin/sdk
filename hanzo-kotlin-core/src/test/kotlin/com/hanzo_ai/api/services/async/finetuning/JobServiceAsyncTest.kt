// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.async.finetuning

import com.hanzo_ai.api.TestServerExtension
import com.hanzo_ai.api.client.okhttp.HanzoOkHttpClientAsync
import com.hanzo_ai.api.models.finetuning.jobs.JobCreateParams
import com.hanzo_ai.api.models.finetuning.jobs.JobListParams
import com.hanzo_ai.api.models.finetuning.jobs.JobRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class JobServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
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

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun list() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val jobServiceAsync = client.fineTuning().jobs()

        val job =
            jobServiceAsync.list(
                JobListParams.builder()
                    .customLlmProvider(JobListParams.CustomLlmProvider.OPENAI)
                    .after("after")
                    .limit(0L)
                    .build()
            )

        job.validate()
    }
}
