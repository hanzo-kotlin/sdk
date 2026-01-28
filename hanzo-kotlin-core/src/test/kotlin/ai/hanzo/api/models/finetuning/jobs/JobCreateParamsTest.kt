// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.finetuning.jobs

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class JobCreateParamsTest {

    @Test
    fun create() {
        JobCreateParams.builder()
            .liteLlmFineTuningJobCreate(
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
            .build()
    }

    @Test
    fun body() {
        val params =
            JobCreateParams.builder()
                .liteLlmFineTuningJobCreate(
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
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
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
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            JobCreateParams.builder()
                .liteLlmFineTuningJobCreate(
                    LiteLlmFineTuningJobCreate.builder()
                        .model("model")
                        .trainingFile("training_file")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                LiteLlmFineTuningJobCreate.builder()
                    .model("model")
                    .trainingFile("training_file")
                    .build()
            )
    }
}
