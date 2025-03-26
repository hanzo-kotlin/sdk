// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.hanzo_ai.api.core.RequestOptions
import com.hanzo_ai.api.core.http.HttpResponseFor
import com.hanzo_ai.api.models.delete.DeleteCreateAllowedIpParams
import com.hanzo_ai.api.models.delete.DeleteCreateAllowedIpResponse

interface DeleteServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Delete Allowed Ip */
    suspend fun createAllowedIp(
        params: DeleteCreateAllowedIpParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DeleteCreateAllowedIpResponse

    /**
     * A view of [DeleteServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /delete/allowed_ip`, but is otherwise the same as
         * [DeleteServiceAsync.createAllowedIp].
         */
        @MustBeClosed
        suspend fun createAllowedIp(
            params: DeleteCreateAllowedIpParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DeleteCreateAllowedIpResponse>
    }
}
