// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.client.okhttp.HanzoOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class LangfuseServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun create() {
        val client = HanzoOkHttpClientAsync.builder().apiKey("My API Key").build()
        val langfuseServiceAsync = client.langfuse()

        val langfuse = langfuseServiceAsync.create("endpoint")

        langfuse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun retrieve() {
        val client = HanzoOkHttpClientAsync.builder().apiKey("My API Key").build()
        val langfuseServiceAsync = client.langfuse()

        val langfuse = langfuseServiceAsync.retrieve("endpoint")

        langfuse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun update() {
        val client = HanzoOkHttpClientAsync.builder().apiKey("My API Key").build()
        val langfuseServiceAsync = client.langfuse()

        val langfuse = langfuseServiceAsync.update("endpoint")

        langfuse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun delete() {
        val client = HanzoOkHttpClientAsync.builder().apiKey("My API Key").build()
        val langfuseServiceAsync = client.langfuse()

        val langfuse = langfuseServiceAsync.delete("endpoint")

        langfuse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun patch() {
        val client = HanzoOkHttpClientAsync.builder().apiKey("My API Key").build()
        val langfuseServiceAsync = client.langfuse()

        val response = langfuseServiceAsync.patch("endpoint")

        response.validate()
    }
}
