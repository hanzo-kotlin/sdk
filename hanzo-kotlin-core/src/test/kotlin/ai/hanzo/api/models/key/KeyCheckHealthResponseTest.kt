// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.key

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class KeyCheckHealthResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val keyCheckHealthResponse =
            KeyCheckHealthResponse.builder()
                .key(KeyCheckHealthResponse.Key.HEALTHY)
                .loggingCallbacks(
                    KeyCheckHealthResponse.LoggingCallbacks.builder()
                        .addCallback("string")
                        .details("details")
                        .status(KeyCheckHealthResponse.LoggingCallbacks.Status.HEALTHY)
                        .build()
                )
                .build()

        assertThat(keyCheckHealthResponse.key()).isEqualTo(KeyCheckHealthResponse.Key.HEALTHY)
        assertThat(keyCheckHealthResponse.loggingCallbacks())
            .isEqualTo(
                KeyCheckHealthResponse.LoggingCallbacks.builder()
                    .addCallback("string")
                    .details("details")
                    .status(KeyCheckHealthResponse.LoggingCallbacks.Status.HEALTHY)
                    .build()
            )
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val keyCheckHealthResponse =
            KeyCheckHealthResponse.builder()
                .key(KeyCheckHealthResponse.Key.HEALTHY)
                .loggingCallbacks(
                    KeyCheckHealthResponse.LoggingCallbacks.builder()
                        .addCallback("string")
                        .details("details")
                        .status(KeyCheckHealthResponse.LoggingCallbacks.Status.HEALTHY)
                        .build()
                )
                .build()

        val roundtrippedKeyCheckHealthResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(keyCheckHealthResponse),
                jacksonTypeRef<KeyCheckHealthResponse>(),
            )

        assertThat(roundtrippedKeyCheckHealthResponse).isEqualTo(keyCheckHealthResponse)
    }
}
