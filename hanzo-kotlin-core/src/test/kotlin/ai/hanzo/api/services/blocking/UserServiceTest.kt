// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking

import ai.hanzo.api.TestServerExtension
import ai.hanzo.api.client.okhttp.HanzoOkHttpClient
import ai.hanzo.api.core.JsonValue
import ai.hanzo.api.models.user.UserCreateParams
import ai.hanzo.api.models.user.UserDeleteParams
import ai.hanzo.api.models.user.UserRetrieveInfoParams
import ai.hanzo.api.models.user.UserUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class UserServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val userService = client.user()

        val user =
            userService.create(
                UserCreateParams.builder()
                    .aliases(
                        UserCreateParams.Aliases.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .addAllowedCacheControl(JsonValue.from(mapOf<String, Any>()))
                    .autoCreateKey(true)
                    .blocked(true)
                    .budgetDuration("budget_duration")
                    .config(
                        UserCreateParams.Config.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .duration("duration")
                    .addGuardrail("string")
                    .keyAlias("key_alias")
                    .maxBudget(0.0)
                    .maxParallelRequests(0L)
                    .metadata(
                        UserCreateParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .modelMaxBudget(
                        UserCreateParams.ModelMaxBudget.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .modelRpmLimit(
                        UserCreateParams.ModelRpmLimit.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .modelTpmLimit(
                        UserCreateParams.ModelTpmLimit.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .addModel(JsonValue.from(mapOf<String, Any>()))
                    .objectPermission(
                        UserCreateParams.ObjectPermission.builder()
                            .addAgentAccessGroup("string")
                            .addAgent("string")
                            .addMcpAccessGroup("string")
                            .addMcpServer("string")
                            .mcpToolPermissions(
                                UserCreateParams.ObjectPermission.McpToolPermissions.builder()
                                    .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                                    .build()
                            )
                            .addVectorStore("string")
                            .build()
                    )
                    .addOrganization("string")
                    .permissions(
                        UserCreateParams.Permissions.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .addPrompt("string")
                    .rpmLimit(0L)
                    .sendInviteEmail(true)
                    .spend(0.0)
                    .ssoUserId("sso_user_id")
                    .teamId("team_id")
                    .teamsOfStrings(listOf("string"))
                    .tpmLimit(0L)
                    .userAlias("user_alias")
                    .userEmail("user_email")
                    .userId("user_id")
                    .userRole(UserCreateParams.UserRole.PROXY_ADMIN)
                    .build()
            )

        user.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val userService = client.user()

        val user =
            userService.update(
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
            )

        user.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val userService = client.user()

        val user =
            userService.delete(
                UserDeleteParams.builder()
                    .litellmChangedBy("litellm-changed-by")
                    .addUserId("string")
                    .build()
            )

        user.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveInfo() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val userService = client.user()

        val response =
            userService.retrieveInfo(UserRetrieveInfoParams.builder().userId("user_id").build())

        response.validate()
    }
}
