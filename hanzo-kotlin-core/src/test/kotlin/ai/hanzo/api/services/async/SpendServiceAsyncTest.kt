// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.TestServerExtension
import ai.hanzo.api.client.okhttp.HanzoOkHttpClientAsync
import ai.hanzo.api.core.JsonValue
import ai.hanzo.api.models.spend.SpendCalculateSpendParams
import ai.hanzo.api.models.spend.SpendListLogsParams
import ai.hanzo.api.models.spend.SpendListTagsParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SpendServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun calculateSpend() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val spendServiceAsync = client.spend()

        val response =
            spendServiceAsync.calculateSpend(
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
    suspend fun listLogs() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val spendServiceAsync = client.spend()

        val response =
            spendServiceAsync.listLogs(
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
    suspend fun listTags() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val spendServiceAsync = client.spend()

        val response =
            spendServiceAsync.listTags(
                SpendListTagsParams.builder().endDate("end_date").startDate("start_date").build()
            )

        response.forEach { it.validate() }
    }
}
