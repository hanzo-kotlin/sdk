// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.client.okhttp.HanzoOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CacheServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun delete() {
        val client = HanzoOkHttpClientAsync.builder().apiKey("My API Key").build()
        val cacheServiceAsync = client.cache()

        val cache = cacheServiceAsync.delete()

        cache.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun flushAll() {
        val client = HanzoOkHttpClientAsync.builder().apiKey("My API Key").build()
        val cacheServiceAsync = client.cache()

        val response = cacheServiceAsync.flushAll()

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun ping() {
        val client = HanzoOkHttpClientAsync.builder().apiKey("My API Key").build()
        val cacheServiceAsync = client.cache()

        val response = cacheServiceAsync.ping()

        response.validate()
    }
}
