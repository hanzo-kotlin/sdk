// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.organization

import ai.hanzo.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OrganizationCreateParamsTest {

    @Test
    fun create() {
        OrganizationCreateParams.builder()
            .organizationAlias("organization_alias")
            .budgetDuration("budget_duration")
            .budgetId("budget_id")
            .maxBudget(0.0)
            .maxParallelRequests(0L)
            .metadata(
                OrganizationCreateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .modelMaxBudget(
                OrganizationCreateParams.ModelMaxBudget.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .modelRpmLimit(
                OrganizationCreateParams.ModelRpmLimit.builder()
                    .putAdditionalProperty("foo", JsonValue.from(0))
                    .build()
            )
            .modelTpmLimit(
                OrganizationCreateParams.ModelTpmLimit.builder()
                    .putAdditionalProperty("foo", JsonValue.from(0))
                    .build()
            )
            .addModel(JsonValue.from(mapOf<String, Any>()))
            .objectPermission(
                OrganizationCreateParams.ObjectPermission.builder()
                    .addAgentAccessGroup("string")
                    .addAgent("string")
                    .addMcpAccessGroup("string")
                    .addMcpServer("string")
                    .mcpToolPermissions(
                        OrganizationCreateParams.ObjectPermission.McpToolPermissions.builder()
                            .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                            .build()
                    )
                    .addVectorStore("string")
                    .build()
            )
            .organizationId("organization_id")
            .rpmLimit(0L)
            .softBudget(0.0)
            .tpmLimit(0L)
            .build()
    }

    @Test
    fun body() {
        val params =
            OrganizationCreateParams.builder()
                .organizationAlias("organization_alias")
                .budgetDuration("budget_duration")
                .budgetId("budget_id")
                .maxBudget(0.0)
                .maxParallelRequests(0L)
                .metadata(
                    OrganizationCreateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .modelMaxBudget(
                    OrganizationCreateParams.ModelMaxBudget.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .modelRpmLimit(
                    OrganizationCreateParams.ModelRpmLimit.builder()
                        .putAdditionalProperty("foo", JsonValue.from(0))
                        .build()
                )
                .modelTpmLimit(
                    OrganizationCreateParams.ModelTpmLimit.builder()
                        .putAdditionalProperty("foo", JsonValue.from(0))
                        .build()
                )
                .addModel(JsonValue.from(mapOf<String, Any>()))
                .objectPermission(
                    OrganizationCreateParams.ObjectPermission.builder()
                        .addAgentAccessGroup("string")
                        .addAgent("string")
                        .addMcpAccessGroup("string")
                        .addMcpServer("string")
                        .mcpToolPermissions(
                            OrganizationCreateParams.ObjectPermission.McpToolPermissions.builder()
                                .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                                .build()
                        )
                        .addVectorStore("string")
                        .build()
                )
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
        assertThat(body.metadata())
            .isEqualTo(
                OrganizationCreateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.modelMaxBudget())
            .isEqualTo(
                OrganizationCreateParams.ModelMaxBudget.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.modelRpmLimit())
            .isEqualTo(
                OrganizationCreateParams.ModelRpmLimit.builder()
                    .putAdditionalProperty("foo", JsonValue.from(0))
                    .build()
            )
        assertThat(body.modelTpmLimit())
            .isEqualTo(
                OrganizationCreateParams.ModelTpmLimit.builder()
                    .putAdditionalProperty("foo", JsonValue.from(0))
                    .build()
            )
        assertThat(body.models()).containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.objectPermission())
            .isEqualTo(
                OrganizationCreateParams.ObjectPermission.builder()
                    .addAgentAccessGroup("string")
                    .addAgent("string")
                    .addMcpAccessGroup("string")
                    .addMcpServer("string")
                    .mcpToolPermissions(
                        OrganizationCreateParams.ObjectPermission.McpToolPermissions.builder()
                            .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                            .build()
                    )
                    .addVectorStore("string")
                    .build()
            )
        assertThat(body.organizationId()).isEqualTo("organization_id")
        assertThat(body.rpmLimit()).isEqualTo(0L)
        assertThat(body.softBudget()).isEqualTo(0.0)
        assertThat(body.tpmLimit()).isEqualTo(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            OrganizationCreateParams.builder().organizationAlias("organization_alias").build()

        val body = params._body()

        assertThat(body.organizationAlias()).isEqualTo("organization_alias")
    }
}
