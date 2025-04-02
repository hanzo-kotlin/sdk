// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.user

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class UserUpdateResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val userUpdateResponse = UserUpdateResponse.builder().build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val userUpdateResponse = UserUpdateResponse.builder().build()

        val roundtrippedUserUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(userUpdateResponse),
                jacksonTypeRef<UserUpdateResponse>(),
            )

        assertThat(roundtrippedUserUpdateResponse).isEqualTo(userUpdateResponse)
    }
}
