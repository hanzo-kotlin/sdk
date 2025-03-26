// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.async.responses

import com.hanzo_ai.api.TestServerExtension
import com.hanzo_ai.api.client.okhttp.HanzoOkHttpClientAsync
import com.hanzo_ai.api.models.responses.inputitems.InputItemListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class InputItemServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun list() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inputItemServiceAsync = client.responses().inputItems()

        val inputItem =
            inputItemServiceAsync.list(
                InputItemListParams.builder().responseId("response_id").build()
            )

        inputItem.validate()
    }
}
