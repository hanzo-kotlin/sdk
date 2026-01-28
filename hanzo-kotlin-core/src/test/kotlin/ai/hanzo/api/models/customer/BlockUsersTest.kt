// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.customer

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BlockUsersTest {

    @Test
    fun create() {
        val blockUsers = BlockUsers.builder().addUserId("string").build()

        assertThat(blockUsers.userIds()).containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val blockUsers = BlockUsers.builder().addUserId("string").build()

        val roundtrippedBlockUsers =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(blockUsers),
                jacksonTypeRef<BlockUsers>(),
            )

        assertThat(roundtrippedBlockUsers).isEqualTo(blockUsers)
    }
}
