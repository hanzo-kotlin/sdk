// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.credentials

import ai.hanzo.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CredentialItemTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val credentialItem =
            CredentialItem.builder()
                .credentialInfo(JsonValue.from(mapOf<String, Any>()))
                .credentialName("credential_name")
                .credentialValues(JsonValue.from(mapOf<String, Any>()))
                .build()

        assertThat(credentialItem._credentialInfo()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(credentialItem.credentialName()).isEqualTo("credential_name")
        assertThat(credentialItem._credentialValues())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
    }
}
