// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking.responses

import ai.hanzo.api.TestServerExtension
import ai.hanzo.api.client.okhttp.HanzoOkHttpClient
import ai.hanzo.api.models.responses.inputitems.InputItemListParams
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

        val inputItems =
            inputItemService.list(InputItemListParams.builder().responseId("response_id").build())

        inputItems.validate()
    }
}
