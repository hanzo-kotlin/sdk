// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking

import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.add.AddAddAllowedIpParams
import ai.hanzo.api.models.add.AddAddAllowedIpResponse
import com.google.errorprone.annotations.MustBeClosed

interface AddService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Add Allowed Ip */
    fun addAllowedIp(
        params: AddAddAllowedIpParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AddAddAllowedIpResponse

    /** A view of [AddService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /add/allowed_ip`, but is otherwise the same as
         * [AddService.addAllowedIp].
         */
        @MustBeClosed
        fun addAllowedIp(
            params: AddAddAllowedIpParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AddAddAllowedIpResponse>
    }
}
