// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking

import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.model.ModelCreateParams
import ai.hanzo.api.models.model.ModelCreateResponse
import ai.hanzo.api.models.model.ModelDeleteParams
import ai.hanzo.api.models.model.ModelDeleteResponse
import ai.hanzo.api.services.blocking.model.InfoService
import ai.hanzo.api.services.blocking.model.UpdateService
import com.google.errorprone.annotations.MustBeClosed

interface ModelService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun info(): InfoService

    fun update(): UpdateService

    /** Allows adding new models to the model list in the config.yaml */
    fun create(
        params: ModelCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ModelCreateResponse

    /** Allows deleting models in the model list in the config.yaml */
    fun delete(
        params: ModelDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ModelDeleteResponse

    /** A view of [ModelService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        fun info(): InfoService.WithRawResponse

        fun update(): UpdateService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /model/new`, but is otherwise the same as
         * [ModelService.create].
         */
        @MustBeClosed
        fun create(
            params: ModelCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ModelCreateResponse>

        /**
         * Returns a raw HTTP response for `post /model/delete`, but is otherwise the same as
         * [ModelService.delete].
         */
        @MustBeClosed
        fun delete(
            params: ModelDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ModelDeleteResponse>
    }
}
