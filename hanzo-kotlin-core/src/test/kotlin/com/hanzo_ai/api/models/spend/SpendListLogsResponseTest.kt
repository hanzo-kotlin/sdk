// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.models.spend

import com.hanzo_ai.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SpendListLogsResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val spendListLogsResponse =
            SpendListLogsResponse.builder()
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

        assertThat(spendListLogsResponse.apiKey()).isEqualTo("api_key")
        assertThat(spendListLogsResponse.callType()).isEqualTo("call_type")
        assertThat(spendListLogsResponse.endTime())
            .isEqualTo(SpendListLogsResponse.EndTime.ofString("string"))
        assertThat(spendListLogsResponse.messages())
            .isEqualTo(SpendListLogsResponse.Messages.ofString("string"))
        assertThat(spendListLogsResponse.requestId()).isEqualTo("request_id")
        assertThat(spendListLogsResponse.response())
            .isEqualTo(SpendListLogsResponse.Response.ofString("string"))
        assertThat(spendListLogsResponse.startTime())
            .isEqualTo(SpendListLogsResponse.StartTime.ofString("string"))
        assertThat(spendListLogsResponse.apiBase()).isEqualTo("api_base")
        assertThat(spendListLogsResponse.cacheHit()).isEqualTo("cache_hit")
        assertThat(spendListLogsResponse.cacheKey()).isEqualTo("cache_key")
        assertThat(spendListLogsResponse.completionTokens()).isEqualTo(0L)
        assertThat(spendListLogsResponse._metadata())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(spendListLogsResponse.model()).isEqualTo("model")
        assertThat(spendListLogsResponse.promptTokens()).isEqualTo(0L)
        assertThat(spendListLogsResponse._requestTags())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(spendListLogsResponse.requesterIpAddress()).isEqualTo("requester_ip_address")
        assertThat(spendListLogsResponse.spend()).isEqualTo(0.0)
        assertThat(spendListLogsResponse.totalTokens()).isEqualTo(0L)
        assertThat(spendListLogsResponse.user()).isEqualTo("user")
    }
}
