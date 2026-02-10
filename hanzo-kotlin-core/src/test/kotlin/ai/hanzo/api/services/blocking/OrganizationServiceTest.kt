// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking

import ai.hanzo.api.TestServerExtension
import ai.hanzo.api.client.okhttp.HanzoOkHttpClient
import ai.hanzo.api.core.JsonValue
import ai.hanzo.api.models.organization.OrgMember
import ai.hanzo.api.models.organization.OrganizationAddMemberParams
import ai.hanzo.api.models.organization.OrganizationCreateParams
import ai.hanzo.api.models.organization.OrganizationDeleteMemberParams
import ai.hanzo.api.models.organization.OrganizationDeleteParams
import ai.hanzo.api.models.organization.OrganizationUpdateMemberParams
import ai.hanzo.api.models.organization.OrganizationUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class OrganizationServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val organizationService = client.organization()

        val organization =
            organizationService.create(
                OrganizationCreateParams.builder()
                    .organizationAlias("organization_alias")
                    .budgetDuration("budget_duration")
                    .budgetId("budget_id")
                    .maxBudget(0.0)
                    .maxParallelRequests(0L)
                    .metadata(JsonValue.from(mapOf<String, Any>()))
                    .modelMaxBudget(JsonValue.from(mapOf<String, Any>()))
                    .addModel(JsonValue.from(mapOf<String, Any>()))
                    .organizationId("organization_id")
                    .rpmLimit(0L)
                    .softBudget(0.0)
                    .tpmLimit(0L)
                    .build()
            )

        organization.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val organizationService = client.organization()

        val organization =
            organizationService.update(
                OrganizationUpdateParams.builder()
                    .budgetId("budget_id")
                    .metadata(JsonValue.from(mapOf<String, Any>()))
                    .addModel("string")
                    .organizationAlias("organization_alias")
                    .organizationId("organization_id")
                    .spend(0.0)
                    .updatedBy("updated_by")
                    .build()
            )

        organization.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val organizationService = client.organization()

        val organizations = organizationService.list()

        organizations.forEach { it.validate() }
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val organizationService = client.organization()

        val organizations =
            organizationService.delete(
                OrganizationDeleteParams.builder().addOrganizationId("string").build()
            )

        organizations.forEach { it.validate() }
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun addMember() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val organizationService = client.organization()

        val response =
            organizationService.addMember(
                OrganizationAddMemberParams.builder()
                    .memberOfOrgMembers(
                        listOf(
                            OrgMember.builder()
                                .role(OrgMember.Role.ORG_ADMIN)
                                .userEmail("user_email")
                                .userId("user_id")
                                .build()
                        )
                    )
                    .organizationId("organization_id")
                    .maxBudgetInOrganization(0.0)
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun deleteMember() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val organizationService = client.organization()

        val response =
            organizationService.deleteMember(
                OrganizationDeleteMemberParams.builder()
                    .organizationId("organization_id")
                    .userEmail("user_email")
                    .userId("user_id")
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun updateMember() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val organizationService = client.organization()

        val response =
            organizationService.updateMember(
                OrganizationUpdateMemberParams.builder()
                    .organizationId("organization_id")
                    .maxBudgetInOrganization(0.0)
                    .role(OrganizationUpdateMemberParams.Role.PROXY_ADMIN)
                    .userEmail("user_email")
                    .userId("user_id")
                    .build()
            )

        response.validate()
    }
}
