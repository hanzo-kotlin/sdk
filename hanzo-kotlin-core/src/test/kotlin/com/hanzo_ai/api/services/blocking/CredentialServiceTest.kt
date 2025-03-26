// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.blocking

import com.hanzo_ai.api.TestServerExtension
import com.hanzo_ai.api.client.okhttp.HanzoOkHttpClient
import com.hanzo_ai.api.core.JsonValue
import com.hanzo_ai.api.models.credentials.CredentialCreateParams
import com.hanzo_ai.api.models.credentials.CredentialDeleteParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CredentialServiceTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val credentialService = client.credentials()

        val credential =
            credentialService.create(
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
    fun list() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val credentialService = client.credentials()

        val credential = credentialService.list()

        credential.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun delete() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val credentialService = client.credentials()

        val credential =
            credentialService.delete(
                CredentialDeleteParams.builder().credentialName("credential_name").build()
            )

        credential.validate()
    }
}
