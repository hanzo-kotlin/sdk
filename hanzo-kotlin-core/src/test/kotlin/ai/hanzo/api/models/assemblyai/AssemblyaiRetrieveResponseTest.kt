// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.assemblyai

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AssemblyaiRetrieveResponseTest {

    @Test
    fun create() {
        val assemblyaiRetrieveResponse = AssemblyaiRetrieveResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val assemblyaiRetrieveResponse = AssemblyaiRetrieveResponse.builder().build()

        val roundtrippedAssemblyaiRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(assemblyaiRetrieveResponse),
                jacksonTypeRef<AssemblyaiRetrieveResponse>(),
            )

        assertThat(roundtrippedAssemblyaiRetrieveResponse).isEqualTo(assemblyaiRetrieveResponse)
    }
}
