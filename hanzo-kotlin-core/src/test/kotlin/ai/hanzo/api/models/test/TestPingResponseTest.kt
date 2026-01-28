// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.test

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TestPingResponseTest {

    @Test
    fun create() {
        val testPingResponse = TestPingResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val testPingResponse = TestPingResponse.builder().build()

        val roundtrippedTestPingResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(testPingResponse),
                jacksonTypeRef<TestPingResponse>(),
            )

        assertThat(roundtrippedTestPingResponse).isEqualTo(testPingResponse)
    }
}
