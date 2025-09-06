// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.credentials

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CredentialDeleteParamsTest {

    @Test
    fun create() {
        CredentialDeleteParams.builder().credentialName("credential_name").build()
    }

    @Test
    fun pathParams() {
        val params = CredentialDeleteParams.builder().credentialName("credential_name").build()

        assertThat(params._pathParam(0)).isEqualTo("credential_name")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
