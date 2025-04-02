// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.euassemblyai

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class EuAssemblyaiRetrieveResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val euAssemblyaiRetrieveResponse = EuAssemblyaiRetrieveResponse.builder().build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val euAssemblyaiRetrieveResponse = EuAssemblyaiRetrieveResponse.builder().build()

        val roundtrippedEuAssemblyaiRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(euAssemblyaiRetrieveResponse),
                jacksonTypeRef<EuAssemblyaiRetrieveResponse>(),
            )

        assertThat(roundtrippedEuAssemblyaiRetrieveResponse).isEqualTo(euAssemblyaiRetrieveResponse)
    }
}
