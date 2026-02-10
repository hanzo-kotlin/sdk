// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking

import ai.hanzo.api.TestServerExtension
import ai.hanzo.api.client.okhttp.HanzoOkHttpClient
import ai.hanzo.api.models.health.HealthCheckAllParams
import ai.hanzo.api.models.health.HealthCheckServicesParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class HealthServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun checkAll() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val healthService = client.health()

        val response = healthService.checkAll(HealthCheckAllParams.builder().model("model").build())

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun checkLiveliness() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val healthService = client.health()

        val response = healthService.checkLiveliness()

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun checkLiveness() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val healthService = client.health()

        val response = healthService.checkLiveness()

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun checkReadiness() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val healthService = client.health()

        val response = healthService.checkReadiness()

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun checkServices() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val healthService = client.health()

        val response =
            healthService.checkServices(
                HealthCheckServicesParams.builder()
                    .service(HealthCheckServicesParams.Service.SLACK_BUDGET_ALERTS)
                    .build()
            )

        response.validate()
    }
}
