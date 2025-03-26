// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.hanzo_ai.api.core.RequestOptions
import com.hanzo_ai.api.core.http.HttpResponseFor
import com.hanzo_ai.api.models.moderations.ModerationCreateParams
import com.hanzo_ai.api.models.moderations.ModerationCreateResponse

interface ModerationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * The moderations endpoint is a tool you can use to check whether content complies with an LLM
     * Providers policies.
     *
     * Quick Start
     *
     * ```
     * curl --location 'http://0.0.0.0:4000/moderations'     --header 'Content-Type: application/json'     --header 'Authorization: Bearer sk-1234'     --data '{"input": "Sample text goes here", "model": "text-moderation-stable"}'
     * ```
     */
    fun create(
        params: ModerationCreateParams = ModerationCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ModerationCreateResponse

    /** @see [create] */
    fun create(requestOptions: RequestOptions): ModerationCreateResponse =
        create(ModerationCreateParams.none(), requestOptions)

    /** A view of [ModerationService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /v1/moderations`, but is otherwise the same as
         * [ModerationService.create].
         */
        @MustBeClosed
        fun create(
            params: ModerationCreateParams = ModerationCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ModerationCreateResponse>

        /** @see [create] */
        @MustBeClosed
        fun create(requestOptions: RequestOptions): HttpResponseFor<ModerationCreateResponse> =
            create(ModerationCreateParams.none(), requestOptions)
    }
}
