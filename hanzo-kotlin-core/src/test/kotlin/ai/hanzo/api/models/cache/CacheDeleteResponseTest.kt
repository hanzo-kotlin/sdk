// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.cache

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CacheDeleteResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val cacheDeleteResponse = CacheDeleteResponse.builder().build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cacheDeleteResponse = CacheDeleteResponse.builder().build()

        val roundtrippedCacheDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cacheDeleteResponse),
                jacksonTypeRef<CacheDeleteResponse>(),
            )

        assertThat(roundtrippedCacheDeleteResponse).isEqualTo(cacheDeleteResponse)
    }
}
