// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.credentials

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CredentialCreateResponseTest {

    @Test
    fun create() {
        val credentialCreateResponse = CredentialCreateResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val credentialCreateResponse = CredentialCreateResponse.builder().build()

        val roundtrippedCredentialCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(credentialCreateResponse),
                jacksonTypeRef<CredentialCreateResponse>(),
            )

        assertThat(roundtrippedCredentialCreateResponse).isEqualTo(credentialCreateResponse)
    }
}
