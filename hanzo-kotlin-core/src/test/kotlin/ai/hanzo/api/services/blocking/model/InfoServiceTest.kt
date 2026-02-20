// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking.model

import ai.hanzo.api.client.okhttp.HanzoOkHttpClient
import ai.hanzo.api.models.model.info.InfoListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class InfoServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client = HanzoOkHttpClient.builder().apiKey("My API Key").build()
        val infoService = client.model().info()

        val infos = infoService.list(InfoListParams.builder().llmModelId("llm_model_id").build())

        infos.validate()
    }
}
