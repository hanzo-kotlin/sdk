// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking

import ai.hanzo.api.client.okhttp.HanzoOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ProviderServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun listBudgets() {
        val client = HanzoOkHttpClient.builder().apiKey("My API Key").build()
        val providerService = client.provider()

        val response = providerService.listBudgets()

        response.validate()
    }
}
