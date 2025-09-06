// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.customer

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerDeleteParamsTest {

    @Test
    fun create() {
        CustomerDeleteParams.builder().addUserId("string").build()
    }

    @Test
    fun body() {
        val params = CustomerDeleteParams.builder().addUserId("string").build()

        val body = params._body()

        assertThat(body.userIds()).containsExactly("string")
    }
}
