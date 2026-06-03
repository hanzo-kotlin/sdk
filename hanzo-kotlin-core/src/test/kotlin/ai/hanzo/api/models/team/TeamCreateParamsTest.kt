// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.team

import ai.hanzo.api.core.JsonValue
import ai.hanzo.api.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TeamCreateParamsTest {

    @Test
    fun create() {
        TeamCreateParams.builder()
            .llmChangedBy("llm-changed-by")
            .addAdmin(JsonValue.from(mapOf<String, Any>()))
            .blocked(true)
            .budgetDuration("budget_duration")
            .addGuardrail("string")
            .maxBudget(0.0)
            .addMember(JsonValue.from(mapOf<String, Any>()))
            .addMembersWithRole(
                Member.builder()
                    .role(Member.Role.ADMIN)
                    .userEmail("user_email")
                    .userId("user_id")
                    .build()
            )
            .metadata(JsonValue.from(mapOf<String, Any>()))
            .modelAliases(JsonValue.from(mapOf<String, Any>()))
            .addModel(JsonValue.from(mapOf<String, Any>()))
            .organizationId("organization_id")
            .rpmLimit(0L)
            .addTag(JsonValue.from(mapOf<String, Any>()))
            .teamAlias("team_alias")
            .teamId("team_id")
            .tpmLimit(0L)
            .build()
    }

    @Test
    fun headers() {
        val params =
            TeamCreateParams.builder()
                .llmChangedBy("llm-changed-by")
                .addAdmin(JsonValue.from(mapOf<String, Any>()))
                .blocked(true)
                .budgetDuration("budget_duration")
                .addGuardrail("string")
                .maxBudget(0.0)
                .addMember(JsonValue.from(mapOf<String, Any>()))
                .addMembersWithRole(
                    Member.builder()
                        .role(Member.Role.ADMIN)
                        .userEmail("user_email")
                        .userId("user_id")
                        .build()
                )
                .metadata(JsonValue.from(mapOf<String, Any>()))
                .modelAliases(JsonValue.from(mapOf<String, Any>()))
                .addModel(JsonValue.from(mapOf<String, Any>()))
                .organizationId("organization_id")
                .rpmLimit(0L)
                .addTag(JsonValue.from(mapOf<String, Any>()))
                .teamAlias("team_alias")
                .teamId("team_id")
                .tpmLimit(0L)
                .build()

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(Headers.builder().put("llm-changed-by", "llm-changed-by").build())
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params = TeamCreateParams.builder().build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            TeamCreateParams.builder()
                .llmChangedBy("llm-changed-by")
                .addAdmin(JsonValue.from(mapOf<String, Any>()))
                .blocked(true)
                .budgetDuration("budget_duration")
                .addGuardrail("string")
                .maxBudget(0.0)
                .addMember(JsonValue.from(mapOf<String, Any>()))
                .addMembersWithRole(
                    Member.builder()
                        .role(Member.Role.ADMIN)
                        .userEmail("user_email")
                        .userId("user_id")
                        .build()
                )
                .metadata(JsonValue.from(mapOf<String, Any>()))
                .modelAliases(JsonValue.from(mapOf<String, Any>()))
                .addModel(JsonValue.from(mapOf<String, Any>()))
                .organizationId("organization_id")
                .rpmLimit(0L)
                .addTag(JsonValue.from(mapOf<String, Any>()))
                .teamAlias("team_alias")
                .teamId("team_id")
                .tpmLimit(0L)
                .build()

        val body = params._body()

        assertThat(body.admins()).containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.blocked()).isEqualTo(true)
        assertThat(body.budgetDuration()).isEqualTo("budget_duration")
        assertThat(body.guardrails()).containsExactly("string")
        assertThat(body.maxBudget()).isEqualTo(0.0)
        assertThat(body.members()).containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.membersWithRoles())
            .containsExactly(
                Member.builder()
                    .role(Member.Role.ADMIN)
                    .userEmail("user_email")
                    .userId("user_id")
                    .build()
            )
        assertThat(body._metadata()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body._modelAliases()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.models()).containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.organizationId()).isEqualTo("organization_id")
        assertThat(body.rpmLimit()).isEqualTo(0L)
        assertThat(body.tags()).containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.teamAlias()).isEqualTo("team_alias")
        assertThat(body.teamId()).isEqualTo("team_id")
        assertThat(body.tpmLimit()).isEqualTo(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = TeamCreateParams.builder().build()

        val body = params._body()
    }
}
