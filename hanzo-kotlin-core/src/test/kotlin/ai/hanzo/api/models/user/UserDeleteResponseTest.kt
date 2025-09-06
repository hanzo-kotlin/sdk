// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.user

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserDeleteResponseTest {

    @Test
    fun create() {
        val userDeleteResponse = UserDeleteResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val userDeleteResponse = UserDeleteResponse.builder().build()

        val roundtrippedUserDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(userDeleteResponse),
                jacksonTypeRef<UserDeleteResponse>(),
            )

        assertThat(roundtrippedUserDeleteResponse).isEqualTo(userDeleteResponse)
    }
}
