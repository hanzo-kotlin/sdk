// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking

import ai.hanzo.api.TestServerExtension
import ai.hanzo.api.client.okhttp.HanzoOkHttpClient
import ai.hanzo.api.core.JsonValue
import ai.hanzo.api.models.spend.SpendCalculateSpendParams
import ai.hanzo.api.models.spend.SpendListLogsParams
import ai.hanzo.api.models.spend.SpendListTagsParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SpendServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun calculateSpend() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val spendService = client.spend()

        val response =
            spendService.calculateSpend(
                SpendCalculateSpendParams.builder()
                    .completionResponse(JsonValue.from(mapOf<String, Any>()))
                    .addMessage(JsonValue.from(mapOf<String, Any>()))
                    .model("model")
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listLogs() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val spendService = client.spend()

        val response =
            spendService.listLogs(
                SpendListLogsParams.builder()
                    .apiKey("api_key")
                    .endDate("end_date")
                    .requestId("request_id")
                    .startDate("start_date")
                    .userId("user_id")
                    .build()
            )

        response.forEach { it.validate() }
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listTags() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val spendService = client.spend()

        val response =
            spendService.listTags(
                SpendListTagsParams.builder().endDate("end_date").startDate("start_date").build()
            )

        response.forEach { it.validate() }
    }
}
