// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.client.okhttp.HanzoOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AssistantServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun create() {
        val client = HanzoOkHttpClientAsync.builder().apiKey("My API Key").build()
        val assistantServiceAsync = client.assistants()

        val assistant = assistantServiceAsync.create()

        assistant.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun list() {
        val client = HanzoOkHttpClientAsync.builder().apiKey("My API Key").build()
        val assistantServiceAsync = client.assistants()

        val assistants = assistantServiceAsync.list()

        assistants.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun delete() {
        val client = HanzoOkHttpClientAsync.builder().apiKey("My API Key").build()
        val assistantServiceAsync = client.assistants()

        val assistant = assistantServiceAsync.delete("assistant_id")

        assistant.validate()
    }
}
