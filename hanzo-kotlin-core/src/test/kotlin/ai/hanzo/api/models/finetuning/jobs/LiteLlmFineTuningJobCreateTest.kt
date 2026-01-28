// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.finetuning.jobs

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LiteLlmFineTuningJobCreateTest {

    @Test
    fun create() {
        val liteLlmFineTuningJobCreate =
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

        assertThat(liteLlmFineTuningJobCreate.model()).isEqualTo("model")
        assertThat(liteLlmFineTuningJobCreate.trainingFile()).isEqualTo("training_file")
        assertThat(liteLlmFineTuningJobCreate.customLlmProvider())
            .isEqualTo(LiteLlmFineTuningJobCreate.CustomLlmProvider.OPENAI)
        assertThat(liteLlmFineTuningJobCreate.hyperparameters())
            .isEqualTo(
                LiteLlmFineTuningJobCreate.Hyperparameters.builder()
                    .batchSize("string")
                    .learningRateMultiplier("string")
                    .nEpochs("string")
                    .build()
            )
        assertThat(liteLlmFineTuningJobCreate.integrations()).containsExactly("string")
        assertThat(liteLlmFineTuningJobCreate.seed()).isEqualTo(0L)
        assertThat(liteLlmFineTuningJobCreate.suffix()).isEqualTo("suffix")
        assertThat(liteLlmFineTuningJobCreate.validationFile()).isEqualTo("validation_file")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val liteLlmFineTuningJobCreate =
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

        val roundtrippedLiteLlmFineTuningJobCreate =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(liteLlmFineTuningJobCreate),
                jacksonTypeRef<LiteLlmFineTuningJobCreate>(),
            )

        assertThat(roundtrippedLiteLlmFineTuningJobCreate).isEqualTo(liteLlmFineTuningJobCreate)
    }
}
