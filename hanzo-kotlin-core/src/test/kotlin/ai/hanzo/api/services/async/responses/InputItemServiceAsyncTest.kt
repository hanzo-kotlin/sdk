// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async.responses

import ai.hanzo.api.client.okhttp.HanzoOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class InputItemServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun list() {
        val client = HanzoOkHttpClientAsync.builder().apiKey("My API Key").build()
        val inputItemServiceAsync = client.responses().inputItems()

        val inputItems = inputItemServiceAsync.list("response_id")

        inputItems.validate()
    }
}
