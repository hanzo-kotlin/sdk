// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.delete

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DeleteCreateAllowedIpResponseTest {

    @Test
    fun create() {
        val deleteCreateAllowedIpResponse = DeleteCreateAllowedIpResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val deleteCreateAllowedIpResponse = DeleteCreateAllowedIpResponse.builder().build()

        val roundtrippedDeleteCreateAllowedIpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(deleteCreateAllowedIpResponse),
                jacksonTypeRef<DeleteCreateAllowedIpResponse>(),
            )

        assertThat(roundtrippedDeleteCreateAllowedIpResponse)
            .isEqualTo(deleteCreateAllowedIpResponse)
    }
}
