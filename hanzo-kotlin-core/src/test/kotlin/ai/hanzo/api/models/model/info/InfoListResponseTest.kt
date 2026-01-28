// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.model.info

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InfoListResponseTest {

    @Test
    fun create() {
        val infoListResponse = InfoListResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val infoListResponse = InfoListResponse.builder().build()

        val roundtrippedInfoListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(infoListResponse),
                jacksonTypeRef<InfoListResponse>(),
            )

        assertThat(roundtrippedInfoListResponse).isEqualTo(infoListResponse)
    }
}
