// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking.threads

import ai.hanzo.api.client.okhttp.HanzoOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class RunServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = HanzoOkHttpClient.builder().apiKey("My API Key").build()
        val runService = client.threads().runs()

        val run = runService.create("thread_id")

        run.validate()
    }
}
