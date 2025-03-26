// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.models.model.info

import com.hanzo_ai.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class InfoListParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        InfoListParams.builder().llmModelId("llm_model_id").build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParams() {
        val params = InfoListParams.builder().llmModelId("llm_model_id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("llm_model_id", "llm_model_id").build())
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = InfoListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
