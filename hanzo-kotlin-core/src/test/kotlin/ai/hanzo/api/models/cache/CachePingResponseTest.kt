// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.cache

import ai.hanzo.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CachePingResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val cachePingResponse =
            CachePingResponse.builder()
                .cacheType("cache_type")
                .status("status")
                .healthCheckCacheParams(JsonValue.from(mapOf<String, Any>()))
                .llmCacheParams("llm_cache_params")
                .pingResponse(true)
                .setCacheResponse("set_cache_response")
                .build()

        assertThat(cachePingResponse.cacheType()).isEqualTo("cache_type")
        assertThat(cachePingResponse.status()).isEqualTo("status")
        assertThat(cachePingResponse._healthCheckCacheParams())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(cachePingResponse.llmCacheParams()).isEqualTo("llm_cache_params")
        assertThat(cachePingResponse.pingResponse()).isEqualTo(true)
        assertThat(cachePingResponse.setCacheResponse()).isEqualTo("set_cache_response")
    }
}
