// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.assemblyai

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AssemblyaiCreateResponseTest {

    @Test
    fun create() {
        val assemblyaiCreateResponse = AssemblyaiCreateResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val assemblyaiCreateResponse = AssemblyaiCreateResponse.builder().build()

        val roundtrippedAssemblyaiCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(assemblyaiCreateResponse),
                jacksonTypeRef<AssemblyaiCreateResponse>(),
            )

        assertThat(roundtrippedAssemblyaiCreateResponse).isEqualTo(assemblyaiCreateResponse)
    }
}
