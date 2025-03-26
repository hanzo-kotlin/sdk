// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.team

import ai.hanzo.api.core.JsonValue
import ai.hanzo.api.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TeamUpdateParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        TeamUpdateParams.builder()
            .llmChangedBy("llm-changed-by")
            .teamId("team_id")
            .blocked(true)
            .budgetDuration("budget_duration")
            .addGuardrail("string")
            .maxBudget(0.0)
            .metadata(JsonValue.from(mapOf<String, Any>()))
            .modelAliases(JsonValue.from(mapOf<String, Any>()))
            .addModel(JsonValue.from(mapOf<String, Any>()))
            .organizationId("organization_id")
            .rpmLimit(0L)
            .addTag(JsonValue.from(mapOf<String, Any>()))
            .teamAlias("team_alias")
            .tpmLimit(0L)
            .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun headers() {
        val params =
            TeamUpdateParams.builder()
                .llmChangedBy("llm-changed-by")
                .teamId("team_id")
                .blocked(true)
                .budgetDuration("budget_duration")
                .addGuardrail("string")
                .maxBudget(0.0)
                .metadata(JsonValue.from(mapOf<String, Any>()))
                .modelAliases(JsonValue.from(mapOf<String, Any>()))
                .addModel(JsonValue.from(mapOf<String, Any>()))
                .organizationId("organization_id")
                .rpmLimit(0L)
                .addTag(JsonValue.from(mapOf<String, Any>()))
                .teamAlias("team_alias")
                .tpmLimit(0L)
                .build()

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(Headers.builder().put("llm-changed-by", "llm-changed-by").build())
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun headersWithoutOptionalFields() {
        val params = TeamUpdateParams.builder().teamId("team_id").build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun body() {
        val params =
            TeamUpdateParams.builder()
                .llmChangedBy("llm-changed-by")
                .teamId("team_id")
                .blocked(true)
                .budgetDuration("budget_duration")
                .addGuardrail("string")
                .maxBudget(0.0)
                .metadata(JsonValue.from(mapOf<String, Any>()))
                .modelAliases(JsonValue.from(mapOf<String, Any>()))
                .addModel(JsonValue.from(mapOf<String, Any>()))
                .organizationId("organization_id")
                .rpmLimit(0L)
                .addTag(JsonValue.from(mapOf<String, Any>()))
                .teamAlias("team_alias")
                .tpmLimit(0L)
                .build()

        val body = params._body()

        assertThat(body.teamId()).isEqualTo("team_id")
        assertThat(body.blocked()).isEqualTo(true)
        assertThat(body.budgetDuration()).isEqualTo("budget_duration")
        assertThat(body.guardrails()).containsExactly("string")
        assertThat(body.maxBudget()).isEqualTo(0.0)
        assertThat(body._metadata()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body._modelAliases()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.models()).containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.organizationId()).isEqualTo("organization_id")
        assertThat(body.rpmLimit()).isEqualTo(0L)
        assertThat(body.tags()).containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.teamAlias()).isEqualTo("team_alias")
        assertThat(body.tpmLimit()).isEqualTo(0L)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun bodyWithoutOptionalFields() {
        val params = TeamUpdateParams.builder().teamId("team_id").build()

        val body = params._body()

        assertThat(body.teamId()).isEqualTo("team_id")
    }
}
