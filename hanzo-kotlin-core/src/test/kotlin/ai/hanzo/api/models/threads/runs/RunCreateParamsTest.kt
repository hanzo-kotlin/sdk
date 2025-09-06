// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.threads.runs

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RunCreateParamsTest {

    @Test
    fun create() {
        RunCreateParams.builder().threadId("thread_id").build()
    }

    @Test
    fun pathParams() {
        val params = RunCreateParams.builder().threadId("thread_id").build()

        assertThat(params._pathParam(0)).isEqualTo("thread_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
