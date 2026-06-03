// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.client.okhttp.HanzoOkHttpClientAsync
import ai.hanzo.api.core.JsonValue
import ai.hanzo.api.models.credentials.CredentialCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CredentialServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun create() {
        val client = HanzoOkHttpClientAsync.builder().apiKey("My API Key").build()
        val credentialServiceAsync = client.credentials()

        val credential =
            credentialServiceAsync.create(
                CredentialCreateParams.builder()
                    .credentialInfo(JsonValue.from(mapOf<String, Any>()))
                    .credentialName("credential_name")
                    .credentialValues(JsonValue.from(mapOf<String, Any>()))
                    .modelId("model_id")
                    .build()
            )

        credential.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun list() {
        val client = HanzoOkHttpClientAsync.builder().apiKey("My API Key").build()
        val credentialServiceAsync = client.credentials()

        val credentials = credentialServiceAsync.list()

        credentials.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun delete() {
        val client = HanzoOkHttpClientAsync.builder().apiKey("My API Key").build()
        val credentialServiceAsync = client.credentials()

        val credential = credentialServiceAsync.delete("credential_name")

        credential.validate()
    }
}
