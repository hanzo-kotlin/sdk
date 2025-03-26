// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.hanzo_ai.api.core.RequestOptions
import com.hanzo_ai.api.core.http.HttpResponseFor
import com.hanzo_ai.api.models.model.ModelCreateParams
import com.hanzo_ai.api.models.model.ModelCreateResponse
import com.hanzo_ai.api.models.model.ModelDeleteParams
import com.hanzo_ai.api.models.model.ModelDeleteResponse
import com.hanzo_ai.api.services.async.model.InfoServiceAsync
import com.hanzo_ai.api.services.async.model.UpdateServiceAsync

interface ModelServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun info(): InfoServiceAsync

    fun update(): UpdateServiceAsync

    /** Allows adding new models to the model list in the config.yaml */
    suspend fun create(
        params: ModelCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ModelCreateResponse

    /** Allows deleting models in the model list in the config.yaml */
    suspend fun delete(
        params: ModelDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ModelDeleteResponse

    /** A view of [ModelServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        fun info(): InfoServiceAsync.WithRawResponse

        fun update(): UpdateServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /model/new`, but is otherwise the same as
         * [ModelServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: ModelCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ModelCreateResponse>

        /**
         * Returns a raw HTTP response for `post /model/delete`, but is otherwise the same as
         * [ModelServiceAsync.delete].
         */
        @MustBeClosed
        suspend fun delete(
            params: ModelDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ModelDeleteResponse>
    }
}
