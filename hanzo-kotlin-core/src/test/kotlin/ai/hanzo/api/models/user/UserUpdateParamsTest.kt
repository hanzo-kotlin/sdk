// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.user

import ai.hanzo.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserUpdateParamsTest {

    @Test
    fun create() {
        UserUpdateParams.builder()
            .aliases(
                UserUpdateParams.Aliases.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .addAllowedCacheControl(JsonValue.from(mapOf<String, Any>()))
            .blocked(true)
            .budgetDuration("budget_duration")
            .config(
                UserUpdateParams.Config.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .duration("duration")
            .addGuardrail("string")
            .keyAlias("key_alias")
            .maxBudget(0.0)
            .maxParallelRequests(0L)
            .metadata(
                UserUpdateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .modelMaxBudget(
                UserUpdateParams.ModelMaxBudget.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .modelRpmLimit(
                UserUpdateParams.ModelRpmLimit.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .modelTpmLimit(
                UserUpdateParams.ModelTpmLimit.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .addModel(JsonValue.from(mapOf<String, Any>()))
            .objectPermission(
                UserUpdateParams.ObjectPermission.builder()
                    .addAgentAccessGroup("string")
                    .addAgent("string")
                    .addMcpAccessGroup("string")
                    .addMcpServer("string")
                    .mcpToolPermissions(
                        UserUpdateParams.ObjectPermission.McpToolPermissions.builder()
                            .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                            .build()
                    )
                    .addVectorStore("string")
                    .build()
            )
            .password("password")
            .permissions(
                UserUpdateParams.Permissions.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .addPrompt("string")
            .rpmLimit(0L)
            .spend(0.0)
            .teamId("team_id")
            .tpmLimit(0L)
            .userAlias("user_alias")
            .userEmail("user_email")
            .userId("user_id")
            .userRole(UserUpdateParams.UserRole.PROXY_ADMIN)
            .build()
    }

    @Test
    fun body() {
        val params =
            UserUpdateParams.builder()
                .aliases(
                    UserUpdateParams.Aliases.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .addAllowedCacheControl(JsonValue.from(mapOf<String, Any>()))
                .blocked(true)
                .budgetDuration("budget_duration")
                .config(
                    UserUpdateParams.Config.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .duration("duration")
                .addGuardrail("string")
                .keyAlias("key_alias")
                .maxBudget(0.0)
                .maxParallelRequests(0L)
                .metadata(
                    UserUpdateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .modelMaxBudget(
                    UserUpdateParams.ModelMaxBudget.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .modelRpmLimit(
                    UserUpdateParams.ModelRpmLimit.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .modelTpmLimit(
                    UserUpdateParams.ModelTpmLimit.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .addModel(JsonValue.from(mapOf<String, Any>()))
                .objectPermission(
                    UserUpdateParams.ObjectPermission.builder()
                        .addAgentAccessGroup("string")
                        .addAgent("string")
                        .addMcpAccessGroup("string")
                        .addMcpServer("string")
                        .mcpToolPermissions(
                            UserUpdateParams.ObjectPermission.McpToolPermissions.builder()
                                .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                                .build()
                        )
                        .addVectorStore("string")
                        .build()
                )
                .password("password")
                .permissions(
                    UserUpdateParams.Permissions.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .addPrompt("string")
                .rpmLimit(0L)
                .spend(0.0)
                .teamId("team_id")
                .tpmLimit(0L)
                .userAlias("user_alias")
                .userEmail("user_email")
                .userId("user_id")
                .userRole(UserUpdateParams.UserRole.PROXY_ADMIN)
                .build()

        val body = params._body()

        assertThat(body.aliases())
            .isEqualTo(
                UserUpdateParams.Aliases.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.allowedCacheControls())
            .containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.blocked()).isEqualTo(true)
        assertThat(body.budgetDuration()).isEqualTo("budget_duration")
        assertThat(body.config())
            .isEqualTo(
                UserUpdateParams.Config.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.duration()).isEqualTo("duration")
        assertThat(body.guardrails()).containsExactly("string")
        assertThat(body.keyAlias()).isEqualTo("key_alias")
        assertThat(body.maxBudget()).isEqualTo(0.0)
        assertThat(body.maxParallelRequests()).isEqualTo(0L)
        assertThat(body.metadata())
            .isEqualTo(
                UserUpdateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.modelMaxBudget())
            .isEqualTo(
                UserUpdateParams.ModelMaxBudget.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.modelRpmLimit())
            .isEqualTo(
                UserUpdateParams.ModelRpmLimit.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.modelTpmLimit())
            .isEqualTo(
                UserUpdateParams.ModelTpmLimit.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.models()).containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.objectPermission())
            .isEqualTo(
                UserUpdateParams.ObjectPermission.builder()
                    .addAgentAccessGroup("string")
                    .addAgent("string")
                    .addMcpAccessGroup("string")
                    .addMcpServer("string")
                    .mcpToolPermissions(
                        UserUpdateParams.ObjectPermission.McpToolPermissions.builder()
                            .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                            .build()
                    )
                    .addVectorStore("string")
                    .build()
            )
        assertThat(body.password()).isEqualTo("password")
        assertThat(body.permissions())
            .isEqualTo(
                UserUpdateParams.Permissions.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.prompts()).containsExactly("string")
        assertThat(body.rpmLimit()).isEqualTo(0L)
        assertThat(body.spend()).isEqualTo(0.0)
        assertThat(body.teamId()).isEqualTo("team_id")
        assertThat(body.tpmLimit()).isEqualTo(0L)
        assertThat(body.userAlias()).isEqualTo("user_alias")
        assertThat(body.userEmail()).isEqualTo("user_email")
        assertThat(body.userId()).isEqualTo("user_id")
        assertThat(body.userRole()).isEqualTo(UserUpdateParams.UserRole.PROXY_ADMIN)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = UserUpdateParams.builder().build()

        val body = params._body()
    }
}
