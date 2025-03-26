// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.async

import com.hanzo_ai.api.TestServerExtension
import com.hanzo_ai.api.client.okhttp.HanzoOkHttpClientAsync
import com.hanzo_ai.api.core.JsonValue
import com.hanzo_ai.api.models.credentials.CredentialCreateParams
import com.hanzo_ai.api.models.credentials.CredentialDeleteParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CredentialServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun create() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun list() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val credentialServiceAsync = client.credentials()

        val credential = credentialServiceAsync.list()

        credential.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun delete() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val credentialServiceAsync = client.credentials()

        val credential =
            credentialServiceAsync.delete(
                CredentialDeleteParams.builder().credentialName("credential_name").build()
            )

        credential.validate()
    }
}
