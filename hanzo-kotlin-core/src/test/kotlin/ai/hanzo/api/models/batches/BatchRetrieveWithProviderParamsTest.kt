// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.batches

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchRetrieveWithProviderParamsTest {

    @Test
    fun create() {
        BatchRetrieveWithProviderParams.builder().provider("provider").batchId("batch_id").build()
    }

    @Test
    fun pathParams() {
        val params =
            BatchRetrieveWithProviderParams.builder()
                .provider("provider")
                .batchId("batch_id")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("provider")
        assertThat(params._pathParam(1)).isEqualTo("batch_id")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
