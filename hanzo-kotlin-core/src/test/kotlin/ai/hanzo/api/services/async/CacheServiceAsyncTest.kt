// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.TestServerExtension
import ai.hanzo.api.client.okhttp.HanzoOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CacheServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun delete() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cacheServiceAsync = client.cache()

        val cache = cacheServiceAsync.delete()

        cache.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun flushAll() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cacheServiceAsync = client.cache()

        val response = cacheServiceAsync.flushAll()

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun ping() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cacheServiceAsync = client.cache()

        val response = cacheServiceAsync.ping()

        response.validate()
    }
}
