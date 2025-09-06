// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.active

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActiveListCallbacksResponseTest {

    @Test
    fun create() {
        val activeListCallbacksResponse = ActiveListCallbacksResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val activeListCallbacksResponse = ActiveListCallbacksResponse.builder().build()

        val roundtrippedActiveListCallbacksResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(activeListCallbacksResponse),
                jacksonTypeRef<ActiveListCallbacksResponse>(),
            )

        assertThat(roundtrippedActiveListCallbacksResponse).isEqualTo(activeListCallbacksResponse)
    }
}
