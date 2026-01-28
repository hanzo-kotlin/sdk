// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.cache

import ai.hanzo.api.core.JsonValue
import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CachePingResponseTest {

    @Test
    fun create() {
        val cachePingResponse =
            CachePingResponse.builder()
                .cacheType("cache_type")
                .status("status")
                .healthCheckCacheParams(
                    CachePingResponse.HealthCheckCacheParams.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .litellmCacheParams("litellm_cache_params")
                .pingResponse(true)
                .setCacheResponse("set_cache_response")
                .build()

        assertThat(cachePingResponse.cacheType()).isEqualTo("cache_type")
        assertThat(cachePingResponse.status()).isEqualTo("status")
        assertThat(cachePingResponse.healthCheckCacheParams())
            .isEqualTo(
                CachePingResponse.HealthCheckCacheParams.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(cachePingResponse.litellmCacheParams()).isEqualTo("litellm_cache_params")
        assertThat(cachePingResponse.pingResponse()).isEqualTo(true)
        assertThat(cachePingResponse.setCacheResponse()).isEqualTo("set_cache_response")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cachePingResponse =
            CachePingResponse.builder()
                .cacheType("cache_type")
                .status("status")
                .healthCheckCacheParams(
                    CachePingResponse.HealthCheckCacheParams.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .litellmCacheParams("litellm_cache_params")
                .pingResponse(true)
                .setCacheResponse("set_cache_response")
                .build()

        val roundtrippedCachePingResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cachePingResponse),
                jacksonTypeRef<CachePingResponse>(),
            )

        assertThat(roundtrippedCachePingResponse).isEqualTo(cachePingResponse)
    }
}
