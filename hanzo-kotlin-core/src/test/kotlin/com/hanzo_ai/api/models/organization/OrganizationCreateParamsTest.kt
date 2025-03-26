// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.models.organization

import com.hanzo_ai.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class OrganizationCreateParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        OrganizationCreateParams.builder()
            .organizationAlias("organization_alias")
            .budgetDuration("budget_duration")
            .budgetId("budget_id")
            .maxBudget(0.0)
            .maxParallelRequests(0L)
            .metadata(JsonValue.from(mapOf<String, Any>()))
            .modelMaxBudget(JsonValue.from(mapOf<String, Any>()))
            .addModel(JsonValue.from(mapOf<String, Any>()))
            .organizationId("organization_id")
            .rpmLimit(0L)
            .softBudget(0.0)
            .tpmLimit(0L)
            .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun body() {
        val params =
            OrganizationCreateParams.builder()
                .organizationAlias("organization_alias")
                .budgetDuration("budget_duration")
                .budgetId("budget_id")
                .maxBudget(0.0)
                .maxParallelRequests(0L)
                .metadata(JsonValue.from(mapOf<String, Any>()))
                .modelMaxBudget(JsonValue.from(mapOf<String, Any>()))
                .addModel(JsonValue.from(mapOf<String, Any>()))
                .organizationId("organization_id")
                .rpmLimit(0L)
                .softBudget(0.0)
                .tpmLimit(0L)
                .build()

        val body = params._body()

        assertThat(body.organizationAlias()).isEqualTo("organization_alias")
        assertThat(body.budgetDuration()).isEqualTo("budget_duration")
        assertThat(body.budgetId()).isEqualTo("budget_id")
        assertThat(body.maxBudget()).isEqualTo(0.0)
        assertThat(body.maxParallelRequests()).isEqualTo(0L)
        assertThat(body._metadata()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body._modelMaxBudget()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.models()).containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.organizationId()).isEqualTo("organization_id")
        assertThat(body.rpmLimit()).isEqualTo(0L)
        assertThat(body.softBudget()).isEqualTo(0.0)
        assertThat(body.tpmLimit()).isEqualTo(0L)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            OrganizationCreateParams.builder().organizationAlias("organization_alias").build()

        val body = params._body()

        assertThat(body.organizationAlias()).isEqualTo("organization_alias")
    }
}
