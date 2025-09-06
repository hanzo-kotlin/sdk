// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.assemblyai

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AssemblyaiPatchResponseTest {

    @Test
    fun create() {
        val assemblyaiPatchResponse = AssemblyaiPatchResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val assemblyaiPatchResponse = AssemblyaiPatchResponse.builder().build()

        val roundtrippedAssemblyaiPatchResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(assemblyaiPatchResponse),
                jacksonTypeRef<AssemblyaiPatchResponse>(),
            )

        assertThat(roundtrippedAssemblyaiPatchResponse).isEqualTo(assemblyaiPatchResponse)
    }
}
