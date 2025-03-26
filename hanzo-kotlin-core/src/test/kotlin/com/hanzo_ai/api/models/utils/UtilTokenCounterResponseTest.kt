// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.models.utils

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class UtilTokenCounterResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val utilTokenCounterResponse =
            UtilTokenCounterResponse.builder()
                .modelUsed("model_used")
                .requestModel("request_model")
                .tokenizerType("tokenizer_type")
                .totalTokens(0L)
                .build()

        assertThat(utilTokenCounterResponse.modelUsed()).isEqualTo("model_used")
        assertThat(utilTokenCounterResponse.requestModel()).isEqualTo("request_model")
        assertThat(utilTokenCounterResponse.tokenizerType()).isEqualTo("tokenizer_type")
        assertThat(utilTokenCounterResponse.totalTokens()).isEqualTo(0L)
    }
}
