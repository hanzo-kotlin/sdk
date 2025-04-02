// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ClientGetHomeResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val clientGetHomeResponse = ClientGetHomeResponse.builder().build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val clientGetHomeResponse = ClientGetHomeResponse.builder().build()

        val roundtrippedClientGetHomeResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(clientGetHomeResponse),
                jacksonTypeRef<ClientGetHomeResponse>(),
            )

        assertThat(roundtrippedClientGetHomeResponse).isEqualTo(clientGetHomeResponse)
    }
}
