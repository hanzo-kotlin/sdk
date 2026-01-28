// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.euassemblyai

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EuAssemblyaiPatchResponseTest {

    @Test
    fun create() {
        val euAssemblyaiPatchResponse = EuAssemblyaiPatchResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val euAssemblyaiPatchResponse = EuAssemblyaiPatchResponse.builder().build()

        val roundtrippedEuAssemblyaiPatchResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(euAssemblyaiPatchResponse),
                jacksonTypeRef<EuAssemblyaiPatchResponse>(),
            )

        assertThat(roundtrippedEuAssemblyaiPatchResponse).isEqualTo(euAssemblyaiPatchResponse)
    }
}
