// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.credentials

import ai.hanzo.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CredentialCreateParamsTest {

    @Test
    fun create() {
        CredentialCreateParams.builder()
            .credentialInfo(
                CredentialCreateParams.CredentialInfo.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .credentialName("credential_name")
            .credentialValues(
                CredentialCreateParams.CredentialValues.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .modelId("model_id")
            .build()
    }

    @Test
    fun body() {
        val params =
            CredentialCreateParams.builder()
                .credentialInfo(
                    CredentialCreateParams.CredentialInfo.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .credentialName("credential_name")
                .credentialValues(
                    CredentialCreateParams.CredentialValues.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .modelId("model_id")
                .build()

        val body = params._body()

        assertThat(body.credentialInfo())
            .isEqualTo(
                CredentialCreateParams.CredentialInfo.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.credentialName()).isEqualTo("credential_name")
        assertThat(body.credentialValues())
            .isEqualTo(
                CredentialCreateParams.CredentialValues.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.modelId()).isEqualTo("model_id")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CredentialCreateParams.builder()
                .credentialInfo(
                    CredentialCreateParams.CredentialInfo.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .credentialName("credential_name")
                .build()

        val body = params._body()

        assertThat(body.credentialInfo())
            .isEqualTo(
                CredentialCreateParams.CredentialInfo.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.credentialName()).isEqualTo("credential_name")
    }
}
