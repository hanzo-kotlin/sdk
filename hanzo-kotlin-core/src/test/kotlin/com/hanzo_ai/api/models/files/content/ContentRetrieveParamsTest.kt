// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.models.files.content

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ContentRetrieveParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        ContentRetrieveParams.builder().provider("provider").fileId("file_id").build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun pathParams() {
        val params = ContentRetrieveParams.builder().provider("provider").fileId("file_id").build()

        assertThat(params._pathParam(0)).isEqualTo("provider")
        assertThat(params._pathParam(1)).isEqualTo("file_id")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
