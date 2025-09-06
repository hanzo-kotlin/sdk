// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.assemblyai

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AssemblyaiDeleteResponseTest {

    @Test
    fun create() {
        val assemblyaiDeleteResponse = AssemblyaiDeleteResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val assemblyaiDeleteResponse = AssemblyaiDeleteResponse.builder().build()

        val roundtrippedAssemblyaiDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(assemblyaiDeleteResponse),
                jacksonTypeRef<AssemblyaiDeleteResponse>(),
            )

        assertThat(roundtrippedAssemblyaiDeleteResponse).isEqualTo(assemblyaiDeleteResponse)
    }
}
