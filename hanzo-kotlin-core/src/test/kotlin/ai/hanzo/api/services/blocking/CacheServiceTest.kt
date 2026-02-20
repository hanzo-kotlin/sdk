// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking

import ai.hanzo.api.client.okhttp.HanzoOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CacheServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client = HanzoOkHttpClient.builder().apiKey("My API Key").build()
        val cacheService = client.cache()

        val cache = cacheService.delete()

        cache.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun flushAll() {
        val client = HanzoOkHttpClient.builder().apiKey("My API Key").build()
        val cacheService = client.cache()

        val response = cacheService.flushAll()

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun ping() {
        val client = HanzoOkHttpClient.builder().apiKey("My API Key").build()
        val cacheService = client.cache()

        val response = cacheService.ping()

        response.validate()
    }
}
