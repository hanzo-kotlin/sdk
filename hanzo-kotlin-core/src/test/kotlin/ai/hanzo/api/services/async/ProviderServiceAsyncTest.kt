// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.client.okhttp.HanzoOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ProviderServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun listBudgets() {
        val client = HanzoOkHttpClientAsync.builder().apiKey("My API Key").build()
        val providerServiceAsync = client.provider()

        val response = providerServiceAsync.listBudgets()

        response.validate()
    }
}
