// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.key.regenerate

import ai.hanzo.api.core.JsonValue
import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class RegenerateKeyRequestTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val regenerateKeyRequest =
            RegenerateKeyRequest.builder()
                .aliases(JsonValue.from(mapOf<String, Any>()))
                .addAllowedCacheControl(JsonValue.from(mapOf<String, Any>()))
                .blocked(true)
                .budgetDuration("budget_duration")
                .budgetId("budget_id")
                .config(JsonValue.from(mapOf<String, Any>()))
                .duration("duration")
                .addEnforcedParam("string")
                .addGuardrail("string")
                .key("key")
                .keyAlias("key_alias")
                .maxBudget(0.0)
                .maxParallelRequests(0L)
                .metadata(JsonValue.from(mapOf<String, Any>()))
                .modelMaxBudget(JsonValue.from(mapOf<String, Any>()))
                .modelRpmLimit(JsonValue.from(mapOf<String, Any>()))
                .modelTpmLimit(JsonValue.from(mapOf<String, Any>()))
                .addModel(JsonValue.from(mapOf<String, Any>()))
                .newMasterKey("new_master_key")
                .permissions(JsonValue.from(mapOf<String, Any>()))
                .rpmLimit(0L)
                .sendInviteEmail(true)
                .softBudget(0.0)
                .spend(0.0)
                .addTag("string")
                .teamId("team_id")
                .tpmLimit(0L)
                .userId("user_id")
                .build()

        assertThat(regenerateKeyRequest._aliases()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(regenerateKeyRequest.allowedCacheControls())
            .containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(regenerateKeyRequest.blocked()).isEqualTo(true)
        assertThat(regenerateKeyRequest.budgetDuration()).isEqualTo("budget_duration")
        assertThat(regenerateKeyRequest.budgetId()).isEqualTo("budget_id")
        assertThat(regenerateKeyRequest._config()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(regenerateKeyRequest.duration()).isEqualTo("duration")
        assertThat(regenerateKeyRequest.enforcedParams()).containsExactly("string")
        assertThat(regenerateKeyRequest.guardrails()).containsExactly("string")
        assertThat(regenerateKeyRequest.key()).isEqualTo("key")
        assertThat(regenerateKeyRequest.keyAlias()).isEqualTo("key_alias")
        assertThat(regenerateKeyRequest.maxBudget()).isEqualTo(0.0)
        assertThat(regenerateKeyRequest.maxParallelRequests()).isEqualTo(0L)
        assertThat(regenerateKeyRequest._metadata()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(regenerateKeyRequest._modelMaxBudget())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(regenerateKeyRequest._modelRpmLimit())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(regenerateKeyRequest._modelTpmLimit())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(regenerateKeyRequest.models())
            .containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(regenerateKeyRequest.newMasterKey()).isEqualTo("new_master_key")
        assertThat(regenerateKeyRequest._permissions())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(regenerateKeyRequest.rpmLimit()).isEqualTo(0L)
        assertThat(regenerateKeyRequest.sendInviteEmail()).isEqualTo(true)
        assertThat(regenerateKeyRequest.softBudget()).isEqualTo(0.0)
        assertThat(regenerateKeyRequest.spend()).isEqualTo(0.0)
        assertThat(regenerateKeyRequest.tags()).containsExactly("string")
        assertThat(regenerateKeyRequest.teamId()).isEqualTo("team_id")
        assertThat(regenerateKeyRequest.tpmLimit()).isEqualTo(0L)
        assertThat(regenerateKeyRequest.userId()).isEqualTo("user_id")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val regenerateKeyRequest =
            RegenerateKeyRequest.builder()
                .aliases(JsonValue.from(mapOf<String, Any>()))
                .addAllowedCacheControl(JsonValue.from(mapOf<String, Any>()))
                .blocked(true)
                .budgetDuration("budget_duration")
                .budgetId("budget_id")
                .config(JsonValue.from(mapOf<String, Any>()))
                .duration("duration")
                .addEnforcedParam("string")
                .addGuardrail("string")
                .key("key")
                .keyAlias("key_alias")
                .maxBudget(0.0)
                .maxParallelRequests(0L)
                .metadata(JsonValue.from(mapOf<String, Any>()))
                .modelMaxBudget(JsonValue.from(mapOf<String, Any>()))
                .modelRpmLimit(JsonValue.from(mapOf<String, Any>()))
                .modelTpmLimit(JsonValue.from(mapOf<String, Any>()))
                .addModel(JsonValue.from(mapOf<String, Any>()))
                .newMasterKey("new_master_key")
                .permissions(JsonValue.from(mapOf<String, Any>()))
                .rpmLimit(0L)
                .sendInviteEmail(true)
                .softBudget(0.0)
                .spend(0.0)
                .addTag("string")
                .teamId("team_id")
                .tpmLimit(0L)
                .userId("user_id")
                .build()

        val roundtrippedRegenerateKeyRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(regenerateKeyRequest),
                jacksonTypeRef<RegenerateKeyRequest>(),
            )

        assertThat(roundtrippedRegenerateKeyRequest).isEqualTo(regenerateKeyRequest)
    }
}
