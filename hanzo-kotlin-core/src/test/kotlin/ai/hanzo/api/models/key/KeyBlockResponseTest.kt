// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.key

import ai.hanzo.api.core.JsonValue
import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class KeyBlockResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val keyBlockResponse =
            KeyBlockResponse.builder()
                .token("token")
                .aliases(JsonValue.from(mapOf<String, Any>()))
                .addAllowedCacheControl(JsonValue.from(mapOf<String, Any>()))
                .blocked(true)
                .budgetDuration("budget_duration")
                .budgetResetAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .config(JsonValue.from(mapOf<String, Any>()))
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdBy("created_by")
                .expires("string")
                .keyAlias("key_alias")
                .keyName("key_name")
                .llmBudgetTable(JsonValue.from(mapOf<String, Any>()))
                .maxBudget(0.0)
                .maxParallelRequests(0L)
                .metadata(JsonValue.from(mapOf<String, Any>()))
                .modelMaxBudget(JsonValue.from(mapOf<String, Any>()))
                .modelSpend(JsonValue.from(mapOf<String, Any>()))
                .addModel(JsonValue.from(mapOf<String, Any>()))
                .orgId("org_id")
                .permissions(JsonValue.from(mapOf<String, Any>()))
                .rpmLimit(0L)
                .softBudgetCooldown(true)
                .spend(0.0)
                .teamId("team_id")
                .tpmLimit(0L)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .updatedBy("updated_by")
                .userId("user_id")
                .build()

        assertThat(keyBlockResponse.token()).isEqualTo("token")
        assertThat(keyBlockResponse._aliases()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(keyBlockResponse.allowedCacheControls())
            .containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(keyBlockResponse.blocked()).isEqualTo(true)
        assertThat(keyBlockResponse.budgetDuration()).isEqualTo("budget_duration")
        assertThat(keyBlockResponse.budgetResetAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(keyBlockResponse._config()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(keyBlockResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(keyBlockResponse.createdBy()).isEqualTo("created_by")
        assertThat(keyBlockResponse.expires())
            .isEqualTo(KeyBlockResponse.Expires.ofString("string"))
        assertThat(keyBlockResponse.keyAlias()).isEqualTo("key_alias")
        assertThat(keyBlockResponse.keyName()).isEqualTo("key_name")
        assertThat(keyBlockResponse._llmBudgetTable())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(keyBlockResponse.maxBudget()).isEqualTo(0.0)
        assertThat(keyBlockResponse.maxParallelRequests()).isEqualTo(0L)
        assertThat(keyBlockResponse._metadata()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(keyBlockResponse._modelMaxBudget())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(keyBlockResponse._modelSpend()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(keyBlockResponse.models()).containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(keyBlockResponse.orgId()).isEqualTo("org_id")
        assertThat(keyBlockResponse._permissions()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(keyBlockResponse.rpmLimit()).isEqualTo(0L)
        assertThat(keyBlockResponse.softBudgetCooldown()).isEqualTo(true)
        assertThat(keyBlockResponse.spend()).isEqualTo(0.0)
        assertThat(keyBlockResponse.teamId()).isEqualTo("team_id")
        assertThat(keyBlockResponse.tpmLimit()).isEqualTo(0L)
        assertThat(keyBlockResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(keyBlockResponse.updatedBy()).isEqualTo("updated_by")
        assertThat(keyBlockResponse.userId()).isEqualTo("user_id")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val keyBlockResponse =
            KeyBlockResponse.builder()
                .token("token")
                .aliases(JsonValue.from(mapOf<String, Any>()))
                .addAllowedCacheControl(JsonValue.from(mapOf<String, Any>()))
                .blocked(true)
                .budgetDuration("budget_duration")
                .budgetResetAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .config(JsonValue.from(mapOf<String, Any>()))
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdBy("created_by")
                .expires("string")
                .keyAlias("key_alias")
                .keyName("key_name")
                .llmBudgetTable(JsonValue.from(mapOf<String, Any>()))
                .maxBudget(0.0)
                .maxParallelRequests(0L)
                .metadata(JsonValue.from(mapOf<String, Any>()))
                .modelMaxBudget(JsonValue.from(mapOf<String, Any>()))
                .modelSpend(JsonValue.from(mapOf<String, Any>()))
                .addModel(JsonValue.from(mapOf<String, Any>()))
                .orgId("org_id")
                .permissions(JsonValue.from(mapOf<String, Any>()))
                .rpmLimit(0L)
                .softBudgetCooldown(true)
                .spend(0.0)
                .teamId("team_id")
                .tpmLimit(0L)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .updatedBy("updated_by")
                .userId("user_id")
                .build()

        val roundtrippedKeyBlockResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(keyBlockResponse),
                jacksonTypeRef<KeyBlockResponse>(),
            )

        assertThat(roundtrippedKeyBlockResponse).isEqualTo(keyBlockResponse)
    }
}
