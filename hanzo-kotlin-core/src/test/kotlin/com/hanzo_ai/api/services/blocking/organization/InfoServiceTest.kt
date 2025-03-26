// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.blocking.organization

import com.hanzo_ai.api.TestServerExtension
import com.hanzo_ai.api.client.okhttp.HanzoOkHttpClient
import com.hanzo_ai.api.models.organization.info.InfoDeprecatedParams
import com.hanzo_ai.api.models.organization.info.InfoRetrieveParams
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
