// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.euassemblyai

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class EuAssemblyaiUpdateResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val euAssemblyaiUpdateResponse = EuAssemblyaiUpdateResponse.builder().build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val euAssemblyaiUpdateResponse = EuAssemblyaiUpdateResponse.builder().build()

        val roundtrippedEuAssemblyaiUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(euAssemblyaiUpdateResponse),
                jacksonTypeRef<EuAssemblyaiUpdateResponse>(),
            )

        assertThat(roundtrippedEuAssemblyaiUpdateResponse).isEqualTo(euAssemblyaiUpdateResponse)
    }
}
