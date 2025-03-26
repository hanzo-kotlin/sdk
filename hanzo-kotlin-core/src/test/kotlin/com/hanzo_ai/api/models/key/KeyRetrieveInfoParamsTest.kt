// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.models.key

import com.hanzo_ai.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class KeyRetrieveInfoParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        KeyRetrieveInfoParams.builder().key("key").build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParams() {
        val params = KeyRetrieveInfoParams.builder().key("key").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("key", "key").build())
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = KeyRetrieveInfoParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
