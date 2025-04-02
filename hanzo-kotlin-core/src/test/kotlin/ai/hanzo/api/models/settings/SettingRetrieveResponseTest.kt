// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.settings

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SettingRetrieveResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val settingRetrieveResponse = SettingRetrieveResponse.builder().build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val settingRetrieveResponse = SettingRetrieveResponse.builder().build()

        val roundtrippedSettingRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(settingRetrieveResponse),
                jacksonTypeRef<SettingRetrieveResponse>(),
            )

        assertThat(roundtrippedSettingRetrieveResponse).isEqualTo(settingRetrieveResponse)
    }
}
