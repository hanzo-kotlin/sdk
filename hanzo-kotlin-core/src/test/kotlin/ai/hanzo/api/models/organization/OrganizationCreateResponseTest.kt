// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.organization

import ai.hanzo.api.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class OrganizationCreateResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val organizationCreateResponse =
            OrganizationCreateResponse.builder()
                .budgetId("budget_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdBy("created_by")
                .addModel("string")
                .organizationId("organization_id")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .updatedBy("updated_by")
                .metadata(JsonValue.from(mapOf<String, Any>()))
                .organizationAlias("organization_alias")
                .spend(0.0)
                .build()

        assertThat(organizationCreateResponse.budgetId()).isEqualTo("budget_id")
        assertThat(organizationCreateResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(organizationCreateResponse.createdBy()).isEqualTo("created_by")
        assertThat(organizationCreateResponse.models()).containsExactly("string")
        assertThat(organizationCreateResponse.organizationId()).isEqualTo("organization_id")
        assertThat(organizationCreateResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(organizationCreateResponse.updatedBy()).isEqualTo("updated_by")
        assertThat(organizationCreateResponse._metadata())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(organizationCreateResponse.organizationAlias()).isEqualTo("organization_alias")
        assertThat(organizationCreateResponse.spend()).isEqualTo(0.0)
    }
}
