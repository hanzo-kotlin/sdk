// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.euassemblyai

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EuAssemblyaiDeleteResponseTest {

    @Test
    fun create() {
        val euAssemblyaiDeleteResponse = EuAssemblyaiDeleteResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val euAssemblyaiDeleteResponse = EuAssemblyaiDeleteResponse.builder().build()

        val roundtrippedEuAssemblyaiDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(euAssemblyaiDeleteResponse),
                jacksonTypeRef<EuAssemblyaiDeleteResponse>(),
            )

        assertThat(roundtrippedEuAssemblyaiDeleteResponse).isEqualTo(euAssemblyaiDeleteResponse)
    }
}
