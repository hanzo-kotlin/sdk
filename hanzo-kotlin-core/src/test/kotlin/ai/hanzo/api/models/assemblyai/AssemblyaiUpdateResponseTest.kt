// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.assemblyai

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AssemblyaiUpdateResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val assemblyaiUpdateResponse = AssemblyaiUpdateResponse.builder().build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val assemblyaiUpdateResponse = AssemblyaiUpdateResponse.builder().build()

        val roundtrippedAssemblyaiUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(assemblyaiUpdateResponse),
                jacksonTypeRef<AssemblyaiUpdateResponse>(),
            )

        assertThat(roundtrippedAssemblyaiUpdateResponse).isEqualTo(assemblyaiUpdateResponse)
    }
}
