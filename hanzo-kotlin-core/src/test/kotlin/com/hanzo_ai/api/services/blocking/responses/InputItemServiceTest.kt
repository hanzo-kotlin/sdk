// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.blocking.responses

import com.hanzo_ai.api.TestServerExtension
import com.hanzo_ai.api.client.okhttp.HanzoOkHttpClient
import com.hanzo_ai.api.models.responses.inputitems.InputItemListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class InputItemServiceTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun list() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inputItemService = client.responses().inputItems()

        val inputItem =
            inputItemService.list(InputItemListParams.builder().responseId("response_id").build())

        inputItem.validate()
    }
}
