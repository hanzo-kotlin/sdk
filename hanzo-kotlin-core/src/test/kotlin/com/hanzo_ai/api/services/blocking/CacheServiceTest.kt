// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.blocking

import com.hanzo_ai.api.TestServerExtension
import com.hanzo_ai.api.client.okhttp.HanzoOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CacheServiceTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun delete() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cacheService = client.cache()

        val cache = cacheService.delete()

        cache.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun flushAll() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cacheService = client.cache()

        val response = cacheService.flushAll()

        response.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun ping() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cacheService = client.cache()

        val response = cacheService.ping()

        response.validate()
    }
}
