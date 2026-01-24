// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking.responses

import ai.hanzo.api.core.ClientOptions
import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.responses.inputitems.InputItemListParams
import ai.hanzo.api.models.responses.inputitems.InputItemListResponse
import com.google.errorprone.annotations.MustBeClosed

interface InputItemService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): InputItemService

    /** List input items for a response. */
    fun list(
        responseId: String,
        params: InputItemListParams = InputItemListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InputItemListResponse =
        list(params.toBuilder().responseId(responseId).build(), requestOptions)

    /** @see list */
    fun list(
        params: InputItemListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InputItemListResponse

    /** @see list */
    fun list(responseId: String, requestOptions: RequestOptions): InputItemListResponse =
        list(responseId, InputItemListParams.none(), requestOptions)

    /** A view of [InputItemService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): InputItemService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/responses/{response_id}/input_items`, but is
         * otherwise the same as [InputItemService.list].
         */
        @MustBeClosed
        fun list(
            responseId: String,
            params: InputItemListParams = InputItemListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InputItemListResponse> =
            list(params.toBuilder().responseId(responseId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            params: InputItemListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InputItemListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            responseId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InputItemListResponse> =
            list(responseId, InputItemListParams.none(), requestOptions)
    }
}
