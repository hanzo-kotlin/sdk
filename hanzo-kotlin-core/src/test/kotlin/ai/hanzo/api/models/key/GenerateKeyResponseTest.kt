// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.key

import ai.hanzo.api.core.JsonValue
import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class GenerateKeyResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val generateKeyResponse =
            GenerateKeyResponse.builder()
                .expires(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .key("key")
                .token("token")
                .aliases(JsonValue.from(mapOf<String, Any>()))
                .addAllowedCacheControl(JsonValue.from(mapOf<String, Any>()))
                .blocked(true)
                .budgetDuration("budget_duration")
                .budgetId("budget_id")
                .config(JsonValue.from(mapOf<String, Any>()))
                .createdBy("created_by")
                .duration("duration")
                .addEnforcedParam("string")
                .addGuardrail("string")
                .keyAlias("key_alias")
                .keyName("key_name")
                .llmBudgetTable(JsonValue.from(mapOf<String, Any>()))
                .maxBudget(0.0)
                .maxParallelRequests(0L)
                .metadata(JsonValue.from(mapOf<String, Any>()))
                .modelMaxBudget(JsonValue.from(mapOf<String, Any>()))
                .modelRpmLimit(JsonValue.from(mapOf<String, Any>()))
                .modelTpmLimit(JsonValue.from(mapOf<String, Any>()))
                .addModel(JsonValue.from(mapOf<String, Any>()))
                .permissions(JsonValue.from(mapOf<String, Any>()))
                .rpmLimit(0L)
                .spend(0.0)
                .addTag("string")
                .teamId("team_id")
                .tokenId("token_id")
                .tpmLimit(0L)
                .updatedBy("updated_by")
                .userId("user_id")
                .build()

        assertThat(generateKeyResponse.expires())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(generateKeyResponse.key()).isEqualTo("key")
        assertThat(generateKeyResponse.token()).isEqualTo("token")
        assertThat(generateKeyResponse._aliases()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(generateKeyResponse.allowedCacheControls())
            .containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(generateKeyResponse.blocked()).isEqualTo(true)
        assertThat(generateKeyResponse.budgetDuration()).isEqualTo("budget_duration")
        assertThat(generateKeyResponse.budgetId()).isEqualTo("budget_id")
        assertThat(generateKeyResponse._config()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(generateKeyResponse.createdBy()).isEqualTo("created_by")
        assertThat(generateKeyResponse.duration()).isEqualTo("duration")
        assertThat(generateKeyResponse.enforcedParams()).containsExactly("string")
        assertThat(generateKeyResponse.guardrails()).containsExactly("string")
        assertThat(generateKeyResponse.keyAlias()).isEqualTo("key_alias")
        assertThat(generateKeyResponse.keyName()).isEqualTo("key_name")
        assertThat(generateKeyResponse._llmBudgetTable())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(generateKeyResponse.maxBudget()).isEqualTo(0.0)
        assertThat(generateKeyResponse.maxParallelRequests()).isEqualTo(0L)
        assertThat(generateKeyResponse._metadata()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(generateKeyResponse._modelMaxBudget())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(generateKeyResponse._modelRpmLimit())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(generateKeyResponse._modelTpmLimit())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(generateKeyResponse.models())
            .containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(generateKeyResponse._permissions())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(generateKeyResponse.rpmLimit()).isEqualTo(0L)
        assertThat(generateKeyResponse.spend()).isEqualTo(0.0)
        assertThat(generateKeyResponse.tags()).containsExactly("string")
        assertThat(generateKeyResponse.teamId()).isEqualTo("team_id")
        assertThat(generateKeyResponse.tokenId()).isEqualTo("token_id")
        assertThat(generateKeyResponse.tpmLimit()).isEqualTo(0L)
        assertThat(generateKeyResponse.updatedBy()).isEqualTo("updated_by")
        assertThat(generateKeyResponse.userId()).isEqualTo("user_id")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val generateKeyResponse =
            GenerateKeyResponse.builder()
                .expires(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .key("key")
                .token("token")
                .aliases(JsonValue.from(mapOf<String, Any>()))
                .addAllowedCacheControl(JsonValue.from(mapOf<String, Any>()))
                .blocked(true)
                .budgetDuration("budget_duration")
                .budgetId("budget_id")
                .config(JsonValue.from(mapOf<String, Any>()))
                .createdBy("created_by")
                .duration("duration")
                .addEnforcedParam("string")
                .addGuardrail("string")
                .keyAlias("key_alias")
                .keyName("key_name")
                .llmBudgetTable(JsonValue.from(mapOf<String, Any>()))
                .maxBudget(0.0)
                .maxParallelRequests(0L)
                .metadata(JsonValue.from(mapOf<String, Any>()))
                .modelMaxBudget(JsonValue.from(mapOf<String, Any>()))
                .modelRpmLimit(JsonValue.from(mapOf<String, Any>()))
                .modelTpmLimit(JsonValue.from(mapOf<String, Any>()))
                .addModel(JsonValue.from(mapOf<String, Any>()))
                .permissions(JsonValue.from(mapOf<String, Any>()))
                .rpmLimit(0L)
                .spend(0.0)
                .addTag("string")
                .teamId("team_id")
                .tokenId("token_id")
                .tpmLimit(0L)
                .updatedBy("updated_by")
                .userId("user_id")
                .build()

        val roundtrippedGenerateKeyResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(generateKeyResponse),
                jacksonTypeRef<GenerateKeyResponse>(),
            )

        assertThat(roundtrippedGenerateKeyResponse).isEqualTo(generateKeyResponse)
    }
}
