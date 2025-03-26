// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.hanzo_ai.api.core.RequestOptions
import com.hanzo_ai.api.core.http.HttpResponseFor
import com.hanzo_ai.api.models.add.AddAddAllowedIpParams
import com.hanzo_ai.api.models.add.AddAddAllowedIpResponse

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
