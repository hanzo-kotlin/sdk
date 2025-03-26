// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.credentials

import ai.hanzo.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CredentialCreateParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        CredentialCreateParams.builder()
            .credentialInfo(JsonValue.from(mapOf<String, Any>()))
            .credentialName("credential_name")
            .credentialValues(JsonValue.from(mapOf<String, Any>()))
            .modelId("model_id")
            .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun body() {
        val params =
            CredentialCreateParams.builder()
                .credentialInfo(JsonValue.from(mapOf<String, Any>()))
                .credentialName("credential_name")
                .credentialValues(JsonValue.from(mapOf<String, Any>()))
                .modelId("model_id")
                .build()

        val body = params._body()

        assertThat(body._credentialInfo()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.credentialName()).isEqualTo("credential_name")
        assertThat(body._credentialValues()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.modelId()).isEqualTo("model_id")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CredentialCreateParams.builder()
                .credentialInfo(JsonValue.from(mapOf<String, Any>()))
                .credentialName("credential_name")
                .build()

        val body = params._body()

        assertThat(body._credentialInfo()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.credentialName()).isEqualTo("credential_name")
    }
}
