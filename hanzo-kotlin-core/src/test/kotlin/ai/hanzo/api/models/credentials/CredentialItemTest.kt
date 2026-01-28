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
                .credentialInfo(
                    CredentialItem.CredentialInfo.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .credentialName("credential_name")
                .credentialValues(
                    CredentialItem.CredentialValues.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        assertThat(credentialItem.credentialInfo())
            .isEqualTo(
                CredentialItem.CredentialInfo.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(credentialItem.credentialName()).isEqualTo("credential_name")
        assertThat(credentialItem.credentialValues())
            .isEqualTo(
                CredentialItem.CredentialValues.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val credentialItem =
            CredentialItem.builder()
                .credentialInfo(
                    CredentialItem.CredentialInfo.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .credentialName("credential_name")
                .credentialValues(
                    CredentialItem.CredentialValues.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val roundtrippedCredentialItem =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(credentialItem),
                jacksonTypeRef<CredentialItem>(),
            )

        assertThat(roundtrippedCredentialItem).isEqualTo(credentialItem)
    }
}
