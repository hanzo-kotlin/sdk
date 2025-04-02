// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.user

import ai.hanzo.api.core.JsonValue
import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class UserCreateResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val userCreateResponse =
            UserCreateResponse.builder()
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
                .addTeam(JsonValue.from(mapOf<String, Any>()))
                .tokenId("token_id")
                .tpmLimit(0L)
                .updatedBy("updated_by")
                .userAlias("user_alias")
                .userEmail("user_email")
                .userId("user_id")
                .userRole(UserCreateResponse.UserRole.PROXY_ADMIN)
                .build()

        assertThat(userCreateResponse.expires())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(userCreateResponse.key()).isEqualTo("key")
        assertThat(userCreateResponse.token()).isEqualTo("token")
        assertThat(userCreateResponse._aliases()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(userCreateResponse.allowedCacheControls())
            .containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(userCreateResponse.blocked()).isEqualTo(true)
        assertThat(userCreateResponse.budgetDuration()).isEqualTo("budget_duration")
        assertThat(userCreateResponse.budgetId()).isEqualTo("budget_id")
        assertThat(userCreateResponse._config()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(userCreateResponse.createdBy()).isEqualTo("created_by")
        assertThat(userCreateResponse.duration()).isEqualTo("duration")
        assertThat(userCreateResponse.enforcedParams()).containsExactly("string")
        assertThat(userCreateResponse.guardrails()).containsExactly("string")
        assertThat(userCreateResponse.keyAlias()).isEqualTo("key_alias")
        assertThat(userCreateResponse.keyName()).isEqualTo("key_name")
        assertThat(userCreateResponse._llmBudgetTable())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(userCreateResponse.maxBudget()).isEqualTo(0.0)
        assertThat(userCreateResponse.maxParallelRequests()).isEqualTo(0L)
        assertThat(userCreateResponse._metadata()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(userCreateResponse._modelMaxBudget())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(userCreateResponse._modelRpmLimit())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(userCreateResponse._modelTpmLimit())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(userCreateResponse.models())
            .containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(userCreateResponse._permissions())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(userCreateResponse.rpmLimit()).isEqualTo(0L)
        assertThat(userCreateResponse.spend()).isEqualTo(0.0)
        assertThat(userCreateResponse.tags()).containsExactly("string")
        assertThat(userCreateResponse.teamId()).isEqualTo("team_id")
        assertThat(userCreateResponse.teams()).containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(userCreateResponse.tokenId()).isEqualTo("token_id")
        assertThat(userCreateResponse.tpmLimit()).isEqualTo(0L)
        assertThat(userCreateResponse.updatedBy()).isEqualTo("updated_by")
        assertThat(userCreateResponse.userAlias()).isEqualTo("user_alias")
        assertThat(userCreateResponse.userEmail()).isEqualTo("user_email")
        assertThat(userCreateResponse.userId()).isEqualTo("user_id")
        assertThat(userCreateResponse.userRole()).isEqualTo(UserCreateResponse.UserRole.PROXY_ADMIN)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val userCreateResponse =
            UserCreateResponse.builder()
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
                .addTeam(JsonValue.from(mapOf<String, Any>()))
                .tokenId("token_id")
                .tpmLimit(0L)
                .updatedBy("updated_by")
                .userAlias("user_alias")
                .userEmail("user_email")
                .userId("user_id")
                .userRole(UserCreateResponse.UserRole.PROXY_ADMIN)
                .build()

        val roundtrippedUserCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(userCreateResponse),
                jacksonTypeRef<UserCreateResponse>(),
            )

        assertThat(roundtrippedUserCreateResponse).isEqualTo(userCreateResponse)
    }
}
