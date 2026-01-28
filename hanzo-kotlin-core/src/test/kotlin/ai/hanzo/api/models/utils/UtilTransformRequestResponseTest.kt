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
                .rawRequestBody(
                    UtilTransformRequestResponse.RawRequestBody.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .rawRequestHeaders(
                    UtilTransformRequestResponse.RawRequestHeaders.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        assertThat(utilTransformRequestResponse.error()).isEqualTo("error")
        assertThat(utilTransformRequestResponse.rawRequestApiBase())
            .isEqualTo("raw_request_api_base")
        assertThat(utilTransformRequestResponse.rawRequestBody())
            .isEqualTo(
                UtilTransformRequestResponse.RawRequestBody.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(utilTransformRequestResponse.rawRequestHeaders())
            .isEqualTo(
                UtilTransformRequestResponse.RawRequestHeaders.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val utilTransformRequestResponse =
            UtilTransformRequestResponse.builder()
                .error("error")
                .rawRequestApiBase("raw_request_api_base")
                .rawRequestBody(
                    UtilTransformRequestResponse.RawRequestBody.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .rawRequestHeaders(
                    UtilTransformRequestResponse.RawRequestHeaders.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val roundtrippedUtilTransformRequestResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(utilTransformRequestResponse),
                jacksonTypeRef<UtilTransformRequestResponse>(),
            )

        assertThat(roundtrippedUtilTransformRequestResponse).isEqualTo(utilTransformRequestResponse)
    }
}
