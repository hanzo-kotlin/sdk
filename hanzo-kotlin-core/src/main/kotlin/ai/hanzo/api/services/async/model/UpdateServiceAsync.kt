// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async.model

import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.model.update.UpdateFullParams
import ai.hanzo.api.models.model.update.UpdateFullResponse
import ai.hanzo.api.models.model.update.UpdatePartialParams
import ai.hanzo.api.models.model.update.UpdatePartialResponse
import com.google.errorprone.annotations.MustBeClosed

interface UpdateServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Edit existing model params */
    suspend fun full(
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
    suspend fun partial(
        modelId: String,
        params: UpdatePartialParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UpdatePartialResponse = partial(params.toBuilder().modelId(modelId).build(), requestOptions)

    /** @see [partial] */
    suspend fun partial(
        params: UpdatePartialParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UpdatePartialResponse

    /**
     * A view of [UpdateServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /model/update`, but is otherwise the same as
         * [UpdateServiceAsync.full].
         */
        @MustBeClosed
        suspend fun full(
            params: UpdateFullParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UpdateFullResponse>

        /**
         * Returns a raw HTTP response for `patch /model/{model_id}/update`, but is otherwise the
         * same as [UpdateServiceAsync.partial].
         */
        @MustBeClosed
        suspend fun partial(
            modelId: String,
            params: UpdatePartialParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UpdatePartialResponse> =
            partial(params.toBuilder().modelId(modelId).build(), requestOptions)

        /** @see [partial] */
        @MustBeClosed
        suspend fun partial(
            params: UpdatePartialParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UpdatePartialResponse>
    }
}
