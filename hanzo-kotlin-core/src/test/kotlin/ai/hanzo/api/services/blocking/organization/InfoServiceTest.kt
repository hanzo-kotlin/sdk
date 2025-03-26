// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking.organization

import ai.hanzo.api.TestServerExtension
import ai.hanzo.api.client.okhttp.HanzoOkHttpClient
import ai.hanzo.api.models.organization.info.InfoDeprecatedParams
import ai.hanzo.api.models.organization.info.InfoRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class InfoServiceTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun retrieve() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val infoService = client.organization().info()

        val info =
            infoService.retrieve(
                InfoRetrieveParams.builder().organizationId("organization_id").build()
            )

        info.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun deprecated() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val infoService = client.organization().info()

        val response =
            infoService.deprecated(InfoDeprecatedParams.builder().addOrganization("string").build())

        response.validate()
    }
}
