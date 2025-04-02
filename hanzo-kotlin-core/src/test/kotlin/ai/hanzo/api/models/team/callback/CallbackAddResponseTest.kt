// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.team.callback

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CallbackAddResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val callbackAddResponse = CallbackAddResponse.builder().build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val callbackAddResponse = CallbackAddResponse.builder().build()

        val roundtrippedCallbackAddResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(callbackAddResponse),
                jacksonTypeRef<CallbackAddResponse>(),
            )

        assertThat(roundtrippedCallbackAddResponse).isEqualTo(callbackAddResponse)
    }
}
