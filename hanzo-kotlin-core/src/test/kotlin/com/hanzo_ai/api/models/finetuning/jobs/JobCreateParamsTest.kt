// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.models.finetuning.jobs

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class JobCreateParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
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
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.customLlmProvider()).isEqualTo(JobCreateParams.CustomLlmProvider.OPENAI)
        assertThat(body.model()).isEqualTo("model")
        assertThat(body.trainingFile()).isEqualTo("training_file")
        assertThat(body.hyperparameters())
            .isEqualTo(
                JobCreateParams.Hyperparameters.builder()
                    .batchSize("string")
                    .learningRateMultiplier("string")
                    .nEpochs("string")
                    .build()
            )
        assertThat(body.integrations()).containsExactly("string")
        assertThat(body.seed()).isEqualTo(0L)
        assertThat(body.suffix()).isEqualTo("suffix")
        assertThat(body.validationFile()).isEqualTo("validation_file")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            JobCreateParams.builder()
                .customLlmProvider(JobCreateParams.CustomLlmProvider.OPENAI)
                .model("model")
                .trainingFile("training_file")
                .build()

        val body = params._body()

        assertThat(body.customLlmProvider()).isEqualTo(JobCreateParams.CustomLlmProvider.OPENAI)
        assertThat(body.model()).isEqualTo("model")
        assertThat(body.trainingFile()).isEqualTo("training_file")
    }
}
