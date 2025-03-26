// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.async.organization

import com.hanzo_ai.api.TestServerExtension
import com.hanzo_ai.api.client.okhttp.HanzoOkHttpClientAsync
import com.hanzo_ai.api.models.organization.info.InfoDeprecatedParams
import com.hanzo_ai.api.models.organization.info.InfoRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class InfoServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun retrieve() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val infoServiceAsync = client.organization().info()

        val info =
            infoServiceAsync.retrieve(
                InfoRetrieveParams.builder().organizationId("organization_id").build()
            )

        info.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun deprecated() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val infoServiceAsync = client.organization().info()

        val response =
            infoServiceAsync.deprecated(
                InfoDeprecatedParams.builder().addOrganization("string").build()
            )

        response.validate()
    }
}
