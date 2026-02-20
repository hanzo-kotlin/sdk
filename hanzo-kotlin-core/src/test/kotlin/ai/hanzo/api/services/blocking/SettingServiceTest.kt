// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking

import ai.hanzo.api.client.okhttp.HanzoOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SettingServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client = HanzoOkHttpClient.builder().apiKey("My API Key").build()
        val settingService = client.settings()

        val setting = settingService.retrieve()

        setting.validate()
    }
}
