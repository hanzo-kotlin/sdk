// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.user

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserListResponseTest {

    @Test
    fun create() {
        val userListResponse = UserListResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val userListResponse = UserListResponse.builder().build()

        val roundtrippedUserListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(userListResponse),
                jacksonTypeRef<UserListResponse>(),
            )

        assertThat(roundtrippedUserListResponse).isEqualTo(userListResponse)
    }
}
