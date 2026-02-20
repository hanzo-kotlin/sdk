// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.client.okhttp.HanzoOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ActiveServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun listCallbacks() {
        val client = HanzoOkHttpClientAsync.builder().apiKey("My API Key").build()
        val activeServiceAsync = client.active()

        val response = activeServiceAsync.listCallbacks()

        response.validate()
    }
}
