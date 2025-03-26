// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.blocking.model

import com.google.errorprone.annotations.MustBeClosed
import com.hanzo_ai.api.core.RequestOptions
import com.hanzo_ai.api.core.http.HttpResponseFor
import com.hanzo_ai.api.models.model.update.UpdateFullParams
import com.hanzo_ai.api.models.model.update.UpdateFullResponse
import com.hanzo_ai.api.models.model.update.UpdatePartialParams
import com.hanzo_ai.api.models.model.update.UpdatePartialResponse

interface UpdateService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Edit existing model params */
    fun full(
        params: UpdateFullParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UpdateFullResponse

    /**
     * PATCH Endpoint for partial model updates.
     *
     * Only updates the fields specified in the request while preserving other existing values.
     * Follows proper PATCH semantics by only modifying provided fields.
     *
     * Args: model_id: The ID of the model to update patch_data: The fields to update and their new
     * values user_api_key_dict: User authentication information
     *
     * Returns: Updated model information
     *
     * Raises: ProxyException: For various error conditions including authentication and database
     * errors
     */
    fun partial(
        params: UpdatePartialParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UpdatePartialResponse

    /** A view of [UpdateService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /model/update`, but is otherwise the same as
         * [UpdateService.full].
         */
        @MustBeClosed
        fun full(
            params: UpdateFullParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UpdateFullResponse>

        /**
         * Returns a raw HTTP response for `patch /model/{model_id}/update`, but is otherwise the
         * same as [UpdateService.partial].
         */
        @MustBeClosed
        fun partial(
            params: UpdatePartialParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UpdatePartialResponse>
    }
}
