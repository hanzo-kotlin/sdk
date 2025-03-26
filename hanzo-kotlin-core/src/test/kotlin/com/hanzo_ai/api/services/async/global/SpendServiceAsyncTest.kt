// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.async.global

import com.hanzo_ai.api.TestServerExtension
import com.hanzo_ai.api.client.okhttp.HanzoOkHttpClientAsync
import com.hanzo_ai.api.models.global.spend.SpendListTagsParams
import com.hanzo_ai.api.models.global.spend.SpendRetrieveReportParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SpendServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun listTags() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val spendServiceAsync = client.global().spend()

        val response =
            spendServiceAsync.listTags(
                SpendListTagsParams.builder()
                    .endDate("end_date")
                    .startDate("start_date")
                    .tags("tags")
                    .build()
            )

        response.forEach { it.validate() }
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun reset() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val spendServiceAsync = client.global().spend()

        val response = spendServiceAsync.reset()

        response.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun retrieveReport() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val spendServiceAsync = client.global().spend()

        val response =
            spendServiceAsync.retrieveReport(
                SpendRetrieveReportParams.builder()
                    .apiKey("api_key")
                    .customerId("customer_id")
                    .endDate("end_date")
                    .groupBy(SpendRetrieveReportParams.GroupBy.TEAM)
                    .internalUserId("internal_user_id")
                    .startDate("start_date")
                    .teamId("team_id")
                    .build()
            )

        response.forEach { it.validate() }
    }
}
