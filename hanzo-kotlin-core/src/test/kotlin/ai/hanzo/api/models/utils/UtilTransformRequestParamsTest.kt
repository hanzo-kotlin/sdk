// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.utils

import ai.hanzo.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UtilTransformRequestParamsTest {

    @Test
    fun create() {
        UtilTransformRequestParams.builder()
            .callType(UtilTransformRequestParams.CallType.EMBEDDING)
            .requestBody(
                UtilTransformRequestParams.RequestBody.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            UtilTransformRequestParams.builder()
                .callType(UtilTransformRequestParams.CallType.EMBEDDING)
                .requestBody(
                    UtilTransformRequestParams.RequestBody.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.callType()).isEqualTo(UtilTransformRequestParams.CallType.EMBEDDING)
        assertThat(body.requestBody())
            .isEqualTo(
                UtilTransformRequestParams.RequestBody.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
    }
}
