// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.utils

import ai.hanzo.api.core.JsonValue
import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UtilTransformRequestResponseTest {

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

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val utilTransformRequestResponse =
            UtilTransformRequestResponse.builder()
                .error("error")
                .rawRequestApiBase("raw_request_api_base")
                .rawRequestBody(JsonValue.from(mapOf<String, Any>()))
                .rawRequestHeaders(JsonValue.from(mapOf<String, Any>()))
                .build()

        val roundtrippedUtilTransformRequestResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(utilTransformRequestResponse),
                jacksonTypeRef<UtilTransformRequestResponse>(),
            )

        assertThat(roundtrippedUtilTransformRequestResponse).isEqualTo(utilTransformRequestResponse)
    }
}
