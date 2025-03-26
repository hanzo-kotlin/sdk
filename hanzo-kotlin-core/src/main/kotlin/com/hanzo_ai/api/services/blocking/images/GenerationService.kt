// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.blocking.images

import com.google.errorprone.annotations.MustBeClosed
import com.hanzo_ai.api.core.RequestOptions
import com.hanzo_ai.api.core.http.HttpResponseFor
import com.hanzo_ai.api.models.images.generations.GenerationCreateParams
import com.hanzo_ai.api.models.images.generations.GenerationCreateResponse

interface GenerationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Image Generation */
    fun create(
        params: GenerationCreateParams = GenerationCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GenerationCreateResponse

    /** @see [create] */
    fun create(requestOptions: RequestOptions): GenerationCreateResponse =
        create(GenerationCreateParams.none(), requestOptions)

    /** A view of [GenerationService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /v1/images/generations`, but is otherwise the same
         * as [GenerationService.create].
         */
        @MustBeClosed
        fun create(
            params: GenerationCreateParams = GenerationCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GenerationCreateResponse>

        /** @see [create] */
        @MustBeClosed
        fun create(requestOptions: RequestOptions): HttpResponseFor<GenerationCreateResponse> =
            create(GenerationCreateParams.none(), requestOptions)
    }
}
