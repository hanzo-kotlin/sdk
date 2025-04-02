// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.credentials

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CredentialDeleteResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val credentialDeleteResponse = CredentialDeleteResponse.builder().build()
    }

    @Disabled("skipped: tests are disabled for the time being")
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
