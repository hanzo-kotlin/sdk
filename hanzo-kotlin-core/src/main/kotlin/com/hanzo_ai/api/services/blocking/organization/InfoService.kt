// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.blocking.organization

import com.google.errorprone.annotations.MustBeClosed
import com.hanzo_ai.api.core.RequestOptions
import com.hanzo_ai.api.core.http.HttpResponseFor
import com.hanzo_ai.api.models.organization.info.InfoDeprecatedParams
import com.hanzo_ai.api.models.organization.info.InfoDeprecatedResponse
import com.hanzo_ai.api.models.organization.info.InfoRetrieveParams
import com.hanzo_ai.api.models.organization.info.InfoRetrieveResponse

interface InfoService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Get the org specific information */
    fun retrieve(
        params: InfoRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InfoRetrieveResponse

    /** DEPRECATED: Use GET /organization/info instead */
    fun deprecated(
        params: InfoDeprecatedParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InfoDeprecatedResponse

    /** A view of [InfoService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /organization/info`, but is otherwise the same as
         * [InfoService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: InfoRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InfoRetrieveResponse>

        /**
         * Returns a raw HTTP response for `post /organization/info`, but is otherwise the same as
         * [InfoService.deprecated].
         */
        @MustBeClosed
        fun deprecated(
            params: InfoDeprecatedParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InfoDeprecatedResponse>
    }
}
