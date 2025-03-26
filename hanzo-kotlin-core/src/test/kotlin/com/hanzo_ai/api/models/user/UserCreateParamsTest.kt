// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.models.user

import com.hanzo_ai.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class UserCreateParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        UserCreateParams.builder()
            .aliases(JsonValue.from(mapOf<String, Any>()))
            .addAllowedCacheControl(JsonValue.from(mapOf<String, Any>()))
            .autoCreateKey(true)
            .blocked(true)
            .budgetDuration("budget_duration")
            .config(JsonValue.from(mapOf<String, Any>()))
            .duration("duration")
            .addGuardrail("string")
            .keyAlias("key_alias")
            .maxBudget(0.0)
            .maxParallelRequests(0L)
            .metadata(JsonValue.from(mapOf<String, Any>()))
            .modelMaxBudget(JsonValue.from(mapOf<String, Any>()))
            .modelRpmLimit(JsonValue.from(mapOf<String, Any>()))
            .modelTpmLimit(JsonValue.from(mapOf<String, Any>()))
            .addModel(JsonValue.from(mapOf<String, Any>()))
            .permissions(JsonValue.from(mapOf<String, Any>()))
            .rpmLimit(0L)
            .sendInviteEmail(true)
            .spend(0.0)
            .teamId("team_id")
            .addTeam(JsonValue.from(mapOf<String, Any>()))
            .tpmLimit(0L)
            .userAlias("user_alias")
            .userEmail("user_email")
            .userId("user_id")
            .userRole(UserCreateParams.UserRole.PROXY_ADMIN)
            .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun body() {
        val params =
            UserCreateParams.builder()
                .aliases(JsonValue.from(mapOf<String, Any>()))
                .addAllowedCacheControl(JsonValue.from(mapOf<String, Any>()))
                .autoCreateKey(true)
                .blocked(true)
                .budgetDuration("budget_duration")
                .config(JsonValue.from(mapOf<String, Any>()))
                .duration("duration")
                .addGuardrail("string")
                .keyAlias("key_alias")
                .maxBudget(0.0)
                .maxParallelRequests(0L)
                .metadata(JsonValue.from(mapOf<String, Any>()))
                .modelMaxBudget(JsonValue.from(mapOf<String, Any>()))
                .modelRpmLimit(JsonValue.from(mapOf<String, Any>()))
                .modelTpmLimit(JsonValue.from(mapOf<String, Any>()))
                .addModel(JsonValue.from(mapOf<String, Any>()))
                .permissions(JsonValue.from(mapOf<String, Any>()))
                .rpmLimit(0L)
                .sendInviteEmail(true)
                .spend(0.0)
                .teamId("team_id")
                .addTeam(JsonValue.from(mapOf<String, Any>()))
                .tpmLimit(0L)
                .userAlias("user_alias")
                .userEmail("user_email")
                .userId("user_id")
                .userRole(UserCreateParams.UserRole.PROXY_ADMIN)
                .build()

        val body = params._body()

        assertThat(body._aliases()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.allowedCacheControls())
            .containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.autoCreateKey()).isEqualTo(true)
        assertThat(body.blocked()).isEqualTo(true)
        assertThat(body.budgetDuration()).isEqualTo("budget_duration")
        assertThat(body._config()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.duration()).isEqualTo("duration")
        assertThat(body.guardrails()).containsExactly("string")
        assertThat(body.keyAlias()).isEqualTo("key_alias")
        assertThat(body.maxBudget()).isEqualTo(0.0)
        assertThat(body.maxParallelRequests()).isEqualTo(0L)
        assertThat(body._metadata()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body._modelMaxBudget()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body._modelRpmLimit()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body._modelTpmLimit()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.models()).containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(body._permissions()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.rpmLimit()).isEqualTo(0L)
        assertThat(body.sendInviteEmail()).isEqualTo(true)
        assertThat(body.spend()).isEqualTo(0.0)
        assertThat(body.teamId()).isEqualTo("team_id")
        assertThat(body.teams()).containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.tpmLimit()).isEqualTo(0L)
        assertThat(body.userAlias()).isEqualTo("user_alias")
        assertThat(body.userEmail()).isEqualTo("user_email")
        assertThat(body.userId()).isEqualTo("user_id")
        assertThat(body.userRole()).isEqualTo(UserCreateParams.UserRole.PROXY_ADMIN)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun bodyWithoutOptionalFields() {
        val params = UserCreateParams.builder().build()

        val body = params._body()
    }
}
