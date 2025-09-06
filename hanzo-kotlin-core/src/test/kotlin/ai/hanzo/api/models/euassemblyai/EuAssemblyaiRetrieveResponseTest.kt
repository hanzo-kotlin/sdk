// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.euassemblyai

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EuAssemblyaiRetrieveResponseTest {

    @Test
    fun create() {
        val euAssemblyaiRetrieveResponse = EuAssemblyaiRetrieveResponse.builder().build()
    }

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
