// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.organization.info

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InfoDeprecatedResponseTest {

    @Test
    fun create() {
        val infoDeprecatedResponse = InfoDeprecatedResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val infoDeprecatedResponse = InfoDeprecatedResponse.builder().build()

        val roundtrippedInfoDeprecatedResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(infoDeprecatedResponse),
                jacksonTypeRef<InfoDeprecatedResponse>(),
            )

        assertThat(roundtrippedInfoDeprecatedResponse).isEqualTo(infoDeprecatedResponse)
    }
}
