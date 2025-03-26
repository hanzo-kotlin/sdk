// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.hanzo_ai.api.core.RequestOptions
import com.hanzo_ai.api.core.http.HttpResponseFor
import com.hanzo_ai.api.models.delete.DeleteCreateAllowedIpParams
import com.hanzo_ai.api.models.delete.DeleteCreateAllowedIpResponse

interface DeleteService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Delete Allowed Ip */
    fun createAllowedIp(
        params: DeleteCreateAllowedIpParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DeleteCreateAllowedIpResponse

    /** A view of [DeleteService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /delete/allowed_ip`, but is otherwise the same as
         * [DeleteService.createAllowedIp].
         */
        @MustBeClosed
        fun createAllowedIp(
            params: DeleteCreateAllowedIpParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DeleteCreateAllowedIpResponse>
    }
}
