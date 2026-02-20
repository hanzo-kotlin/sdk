// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking

import ai.hanzo.api.client.okhttp.HanzoOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AssistantServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client = HanzoOkHttpClient.builder().apiKey("My API Key").build()
        val assistantService = client.assistants()

        val assistant = assistantService.create()

        assistant.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client = HanzoOkHttpClient.builder().apiKey("My API Key").build()
        val assistantService = client.assistants()

        val assistants = assistantService.list()

        assistants.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client = HanzoOkHttpClient.builder().apiKey("My API Key").build()
        val assistantService = client.assistants()

        val assistant = assistantService.delete("assistant_id")

        assistant.validate()
    }
}
