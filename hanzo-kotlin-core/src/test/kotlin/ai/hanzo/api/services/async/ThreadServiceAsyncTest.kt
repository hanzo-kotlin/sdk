// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.client.okhttp.HanzoOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ThreadServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun create() {
        val client = HanzoOkHttpClientAsync.builder().apiKey("My API Key").build()
        val threadServiceAsync = client.threads()

        val thread = threadServiceAsync.create()

        thread.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun retrieve() {
        val client = HanzoOkHttpClientAsync.builder().apiKey("My API Key").build()
        val threadServiceAsync = client.threads()

        val thread = threadServiceAsync.retrieve("thread_id")

        thread.validate()
    }
}
