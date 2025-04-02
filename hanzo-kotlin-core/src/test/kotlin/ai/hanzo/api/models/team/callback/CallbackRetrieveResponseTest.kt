// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.team.callback

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CallbackRetrieveResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val callbackRetrieveResponse = CallbackRetrieveResponse.builder().build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val callbackRetrieveResponse = CallbackRetrieveResponse.builder().build()

        val roundtrippedCallbackRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(callbackRetrieveResponse),
                jacksonTypeRef<CallbackRetrieveResponse>(),
            )

        assertThat(roundtrippedCallbackRetrieveResponse).isEqualTo(callbackRetrieveResponse)
    }
}
