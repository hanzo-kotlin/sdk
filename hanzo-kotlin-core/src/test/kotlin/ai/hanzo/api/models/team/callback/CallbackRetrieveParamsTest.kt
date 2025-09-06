// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.team.callback

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallbackRetrieveParamsTest {

    @Test
    fun create() {
        CallbackRetrieveParams.builder().teamId("team_id").build()
    }

    @Test
    fun pathParams() {
        val params = CallbackRetrieveParams.builder().teamId("team_id").build()

        assertThat(params._pathParam(0)).isEqualTo("team_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
