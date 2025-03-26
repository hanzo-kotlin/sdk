// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.async

import com.hanzo_ai.api.TestServerExtension
import com.hanzo_ai.api.client.okhttp.HanzoOkHttpClientAsync
import com.hanzo_ai.api.models.health.HealthCheckAllParams
import com.hanzo_ai.api.models.health.HealthCheckServicesParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class HealthServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun checkAll() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val healthServiceAsync = client.health()

        val response =
            healthServiceAsync.checkAll(HealthCheckAllParams.builder().model("model").build())

        response.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun checkLiveliness() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val healthServiceAsync = client.health()

        val response = healthServiceAsync.checkLiveliness()

        response.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun checkLiveness() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val healthServiceAsync = client.health()

        val response = healthServiceAsync.checkLiveness()

        response.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun checkReadiness() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val healthServiceAsync = client.health()

        val response = healthServiceAsync.checkReadiness()

        response.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun checkServices() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val healthServiceAsync = client.health()

        val response =
            healthServiceAsync.checkServices(
                HealthCheckServicesParams.builder()
                    .service(HealthCheckServicesParams.Service.SLACK_BUDGET_ALERTS)
                    .build()
            )

        response.validate()
    }
}
