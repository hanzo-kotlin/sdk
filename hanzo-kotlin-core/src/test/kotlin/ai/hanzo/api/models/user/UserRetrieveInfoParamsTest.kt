// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.user

import ai.hanzo.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserRetrieveInfoParamsTest {

    @Test
    fun create() {
        UserRetrieveInfoParams.builder().userId("user_id").build()
    }

    @Test
    fun queryParams() {
        val params = UserRetrieveInfoParams.builder().userId("user_id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("user_id", "user_id").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = UserRetrieveInfoParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
