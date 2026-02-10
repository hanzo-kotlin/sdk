// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.credentials

import ai.hanzo.api.core.JsonValue
import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CredentialItemTest {

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

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val credentialItem =
            CredentialItem.builder()
                .credentialInfo(JsonValue.from(mapOf<String, Any>()))
                .credentialName("credential_name")
                .credentialValues(JsonValue.from(mapOf<String, Any>()))
                .build()

        val roundtrippedCredentialItem =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(credentialItem),
                jacksonTypeRef<CredentialItem>(),
            )

        assertThat(roundtrippedCredentialItem).isEqualTo(credentialItem)
    }
}
