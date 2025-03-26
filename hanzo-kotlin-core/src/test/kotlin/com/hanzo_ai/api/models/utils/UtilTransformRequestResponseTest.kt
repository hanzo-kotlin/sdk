// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.models.utils

import com.hanzo_ai.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class UtilTransformRequestResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val utilTransformRequestResponse =
            UtilTransformRequestResponse.builder()
                .error("error")
                .rawRequestApiBase("raw_request_api_base")
                .rawRequestBody(JsonValue.from(mapOf<String, Any>()))
                .rawRequestHeaders(JsonValue.from(mapOf<String, Any>()))
                .build()

        assertThat(utilTransformRequestResponse.error()).isEqualTo("error")
        assertThat(utilTransformRequestResponse.rawRequestApiBase())
            .isEqualTo("raw_request_api_base")
        assertThat(utilTransformRequestResponse._rawRequestBody())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(utilTransformRequestResponse._rawRequestHeaders())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
    }
}
