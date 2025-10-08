// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking.model

import ai.hanzo.api.core.ClientOptions
import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.model.update.UpdateDeployment
import ai.hanzo.api.models.model.update.UpdateFullParams
import ai.hanzo.api.models.model.update.UpdateFullResponse
import ai.hanzo.api.models.model.update.UpdatePartialParams
import ai.hanzo.api.models.model.update.UpdatePartialResponse
import com.google.errorprone.annotations.MustBeClosed

interface UpdateService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): UpdateService

    /** Edit existing model params */
    fun full(
        params: UpdateFullParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UpdateFullResponse

    /** @see full */
    fun full(
        updateDeployment: UpdateDeployment,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UpdateFullResponse =
        full(UpdateFullParams.builder().updateDeployment(updateDeployment).build(), requestOptions)

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
        modelId: String,
        params: UpdatePartialParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UpdatePartialResponse = partial(params.toBuilder().modelId(modelId).build(), requestOptions)

    /** @see partial */
    fun partial(
        params: UpdatePartialParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UpdatePartialResponse

    /** A view of [UpdateService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): UpdateService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /model/update`, but is otherwise the same as
         * [UpdateService.full].
         */
        @MustBeClosed
        fun full(
            params: UpdateFullParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UpdateFullResponse>

        /** @see full */
        @MustBeClosed
        fun full(
            updateDeployment: UpdateDeployment,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UpdateFullResponse> =
            full(
                UpdateFullParams.builder().updateDeployment(updateDeployment).build(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `patch /model/{model_id}/update`, but is otherwise the
         * same as [UpdateService.partial].
         */
        @MustBeClosed
        fun partial(
            modelId: String,
            params: UpdatePartialParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UpdatePartialResponse> =
            partial(params.toBuilder().modelId(modelId).build(), requestOptions)

        /** @see partial */
        @MustBeClosed
        fun partial(
            params: UpdatePartialParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UpdatePartialResponse>
    }
}
