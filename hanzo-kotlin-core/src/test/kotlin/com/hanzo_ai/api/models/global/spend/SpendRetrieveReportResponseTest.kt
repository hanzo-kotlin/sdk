// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.models.global.spend

import com.hanzo_ai.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SpendRetrieveReportResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val spendRetrieveReportResponse =
            SpendRetrieveReportResponse.builder()
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

        assertThat(spendRetrieveReportResponse.apiKey()).isEqualTo("api_key")
        assertThat(spendRetrieveReportResponse.callType()).isEqualTo("call_type")
        assertThat(spendRetrieveReportResponse.endTime())
            .isEqualTo(SpendRetrieveReportResponse.EndTime.ofString("string"))
        assertThat(spendRetrieveReportResponse.messages())
            .isEqualTo(SpendRetrieveReportResponse.Messages.ofString("string"))
        assertThat(spendRetrieveReportResponse.requestId()).isEqualTo("request_id")
        assertThat(spendRetrieveReportResponse.response())
            .isEqualTo(SpendRetrieveReportResponse.Response.ofString("string"))
        assertThat(spendRetrieveReportResponse.startTime())
            .isEqualTo(SpendRetrieveReportResponse.StartTime.ofString("string"))
        assertThat(spendRetrieveReportResponse.apiBase()).isEqualTo("api_base")
        assertThat(spendRetrieveReportResponse.cacheHit()).isEqualTo("cache_hit")
        assertThat(spendRetrieveReportResponse.cacheKey()).isEqualTo("cache_key")
        assertThat(spendRetrieveReportResponse.completionTokens()).isEqualTo(0L)
        assertThat(spendRetrieveReportResponse._metadata())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(spendRetrieveReportResponse.model()).isEqualTo("model")
        assertThat(spendRetrieveReportResponse.promptTokens()).isEqualTo(0L)
        assertThat(spendRetrieveReportResponse._requestTags())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(spendRetrieveReportResponse.requesterIpAddress())
            .isEqualTo("requester_ip_address")
        assertThat(spendRetrieveReportResponse.spend()).isEqualTo(0.0)
        assertThat(spendRetrieveReportResponse.totalTokens()).isEqualTo(0L)
        assertThat(spendRetrieveReportResponse.user()).isEqualTo("user")
    }
}
