// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.async.images

import com.google.errorprone.annotations.MustBeClosed
import com.hanzo_ai.api.core.RequestOptions
import com.hanzo_ai.api.core.http.HttpResponseFor
import com.hanzo_ai.api.models.images.generations.GenerationCreateParams
import com.hanzo_ai.api.models.images.generations.GenerationCreateResponse

interface GenerationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Image Generation */
    suspend fun create(
        params: GenerationCreateParams = GenerationCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GenerationCreateResponse

    /** @see [create] */
    suspend fun create(requestOptions: RequestOptions): GenerationCreateResponse =
        create(GenerationCreateParams.none(), requestOptions)

    /**
     * A view of [GenerationServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /v1/images/generations`, but is otherwise the same
         * as [GenerationServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: GenerationCreateParams = GenerationCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GenerationCreateResponse>

        /** @see [create] */
        @MustBeClosed
        suspend fun create(
            requestOptions: RequestOptions
        ): HttpResponseFor<GenerationCreateResponse> =
            create(GenerationCreateParams.none(), requestOptions)
    }
}
