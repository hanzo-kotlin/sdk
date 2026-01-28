// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.credentials

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CredentialDeleteResponseTest {

    @Test
    fun create() {
        val credentialDeleteResponse = CredentialDeleteResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val credentialDeleteResponse = CredentialDeleteResponse.builder().build()

        val roundtrippedCredentialDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(credentialDeleteResponse),
                jacksonTypeRef<CredentialDeleteResponse>(),
            )

        assertThat(roundtrippedCredentialDeleteResponse).isEqualTo(credentialDeleteResponse)
    }
}
