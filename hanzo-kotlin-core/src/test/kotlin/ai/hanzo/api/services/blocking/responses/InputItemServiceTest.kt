// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking.responses

import ai.hanzo.api.client.okhttp.HanzoOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class InputItemServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client = HanzoOkHttpClient.builder().apiKey("My API Key").build()
        val inputItemService = client.responses().inputItems()

        val inputItems = inputItemService.list("response_id")

        inputItems.validate()
    }
}
