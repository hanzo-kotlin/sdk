// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.global.spend

import ai.hanzo.api.core.JsonValue
import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SpendListTagsResponseTest {

    @Test
    fun create() {
        val spendListTagsResponse =
            SpendListTagsResponse.builder()
                .apiKey("api_key")
                .callType("call_type")
                .endTime("string")
                .messages("string")
                .requestId("request_id")
                .response("string")
                .startTime("string")
                .apiBase("api_base")
                .cacheHit("cache_hit")
                .cacheKey("cache_key")
                .completionTokens(0L)
                .metadata(JsonValue.from(mapOf<String, Any>()))
                .model("model")
                .promptTokens(0L)
                .requestTags(JsonValue.from(mapOf<String, Any>()))
                .requesterIpAddress("requester_ip_address")
                .spend(0.0)
                .totalTokens(0L)
                .user("user")
                .build()

        assertThat(spendListTagsResponse.apiKey()).isEqualTo("api_key")
        assertThat(spendListTagsResponse.callType()).isEqualTo("call_type")
        assertThat(spendListTagsResponse.endTime())
            .isEqualTo(SpendListTagsResponse.EndTime.ofString("string"))
        assertThat(spendListTagsResponse.messages())
            .isEqualTo(SpendListTagsResponse.Messages.ofString("string"))
        assertThat(spendListTagsResponse.requestId()).isEqualTo("request_id")
        assertThat(spendListTagsResponse.response())
            .isEqualTo(SpendListTagsResponse.Response.ofString("string"))
        assertThat(spendListTagsResponse.startTime())
            .isEqualTo(SpendListTagsResponse.StartTime.ofString("string"))
        assertThat(spendListTagsResponse.apiBase()).isEqualTo("api_base")
        assertThat(spendListTagsResponse.cacheHit()).isEqualTo("cache_hit")
        assertThat(spendListTagsResponse.cacheKey()).isEqualTo("cache_key")
        assertThat(spendListTagsResponse.completionTokens()).isEqualTo(0L)
        assertThat(spendListTagsResponse._metadata())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(spendListTagsResponse.model()).isEqualTo("model")
        assertThat(spendListTagsResponse.promptTokens()).isEqualTo(0L)
        assertThat(spendListTagsResponse._requestTags())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(spendListTagsResponse.requesterIpAddress()).isEqualTo("requester_ip_address")
        assertThat(spendListTagsResponse.spend()).isEqualTo(0.0)
        assertThat(spendListTagsResponse.totalTokens()).isEqualTo(0L)
        assertThat(spendListTagsResponse.user()).isEqualTo("user")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val spendListTagsResponse =
            SpendListTagsResponse.builder()
                .apiKey("api_key")
                .callType("call_type")
                .endTime("string")
                .messages("string")
                .requestId("request_id")
                .response("string")
                .startTime("string")
                .apiBase("api_base")
                .cacheHit("cache_hit")
                .cacheKey("cache_key")
                .completionTokens(0L)
                .metadata(JsonValue.from(mapOf<String, Any>()))
                .model("model")
                .promptTokens(0L)
                .requestTags(JsonValue.from(mapOf<String, Any>()))
                .requesterIpAddress("requester_ip_address")
                .spend(0.0)
                .totalTokens(0L)
                .user("user")
                .build()

        val roundtrippedSpendListTagsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(spendListTagsResponse),
                jacksonTypeRef<SpendListTagsResponse>(),
            )

        assertThat(roundtrippedSpendListTagsResponse).isEqualTo(spendListTagsResponse)
    }
}
