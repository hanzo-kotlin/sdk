// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking

import ai.hanzo.api.client.okhttp.HanzoOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ActiveServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun listCallbacks() {
        val client = HanzoOkHttpClient.builder().apiKey("My API Key").build()
        val activeService = client.active()

        val response = activeService.listCallbacks()

        response.validate()
    }
}
