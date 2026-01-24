// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking

import ai.hanzo.api.core.ClientOptions
import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.responses.ResponseCreateParams
import ai.hanzo.api.models.responses.ResponseCreateResponse
import ai.hanzo.api.models.responses.ResponseDeleteParams
import ai.hanzo.api.models.responses.ResponseDeleteResponse
import ai.hanzo.api.models.responses.ResponseRetrieveParams
import ai.hanzo.api.models.responses.ResponseRetrieveResponse
import ai.hanzo.api.services.blocking.responses.InputItemService
import com.google.errorprone.annotations.MustBeClosed

interface ResponseService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ResponseService

    fun inputItems(): InputItemService

    /**
     * Follows the OpenAI Responses API spec:
     * https://platform.openai.com/docs/api-reference/responses
     *
     * Supports background mode with polling_via_cache for partial response retrieval. When
     * background=true and polling_via_cache is enabled, returns a polling_id immediately and
     * streams the response in the background, updating Redis cache.
     *
     * ```bash
     * # Normal request
     * curl -X POST http://localhost:4000/v1/responses     -H "Content-Type: application/json"     -H "Authorization: Bearer sk-1234"     -d '{
     *     "model": "gpt-4o",
     *     "input": "Tell me about AI"
     * }'
     *
     * # Background request with polling
     * curl -X POST http://localhost:4000/v1/responses     -H "Content-Type: application/json"     -H "Authorization: Bearer sk-1234"     -d '{
     *     "model": "gpt-4o",
     *     "input": "Tell me about AI",
     *     "background": true
     * }'
     * ```
     */
    fun create(
        params: ResponseCreateParams = ResponseCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ResponseCreateResponse

    /** @see create */
    fun create(requestOptions: RequestOptions): ResponseCreateResponse =
        create(ResponseCreateParams.none(), requestOptions)

    /**
     * Get a response by ID.
     *
     * Supports both:
     * - Polling IDs (litellm_poll_*): Returns cumulative cached content from background responses
     * - Provider response IDs: Passes through to provider API
     *
     * Follows the OpenAI Responses API spec:
     * https://platform.openai.com/docs/api-reference/responses/get
     *
     * ```bash
     * # Get polling response
     * curl -X GET http://localhost:4000/v1/responses/litellm_poll_abc123     -H "Authorization: Bearer sk-1234"
     *
     * # Get provider response
     * curl -X GET http://localhost:4000/v1/responses/resp_abc123     -H "Authorization: Bearer sk-1234"
     * ```
     */
    fun retrieve(
        responseId: String,
        params: ResponseRetrieveParams = ResponseRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ResponseRetrieveResponse =
        retrieve(params.toBuilder().responseId(responseId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: ResponseRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ResponseRetrieveResponse

    /** @see retrieve */
    fun retrieve(responseId: String, requestOptions: RequestOptions): ResponseRetrieveResponse =
        retrieve(responseId, ResponseRetrieveParams.none(), requestOptions)

    /**
     * Delete a response by ID.
     *
     * Supports both:
     * - Polling IDs (litellm_poll_*): Deletes from Redis cache
     * - Provider response IDs: Passes through to provider API
     *
     * Follows the OpenAI Responses API spec:
     * https://platform.openai.com/docs/api-reference/responses/delete
     *
     * ```bash
     * curl -X DELETE http://localhost:4000/v1/responses/resp_abc123     -H "Authorization: Bearer sk-1234"
     * ```
     */
    fun delete(
        responseId: String,
        params: ResponseDeleteParams = ResponseDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ResponseDeleteResponse =
        delete(params.toBuilder().responseId(responseId).build(), requestOptions)

    /** @see delete */
    fun delete(
        params: ResponseDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ResponseDeleteResponse

    /** @see delete */
    fun delete(responseId: String, requestOptions: RequestOptions): ResponseDeleteResponse =
        delete(responseId, ResponseDeleteParams.none(), requestOptions)

    /** A view of [ResponseService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ResponseService.WithRawResponse

        fun inputItems(): InputItemService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/responses`, but is otherwise the same as
         * [ResponseService.create].
         */
        @MustBeClosed
        fun create(
            params: ResponseCreateParams = ResponseCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ResponseCreateResponse>

        /** @see create */
        @MustBeClosed
        fun create(requestOptions: RequestOptions): HttpResponseFor<ResponseCreateResponse> =
            create(ResponseCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/responses/{response_id}`, but is otherwise the
         * same as [ResponseService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            responseId: String,
            params: ResponseRetrieveParams = ResponseRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ResponseRetrieveResponse> =
            retrieve(params.toBuilder().responseId(responseId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: ResponseRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ResponseRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            responseId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ResponseRetrieveResponse> =
            retrieve(responseId, ResponseRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/responses/{response_id}`, but is otherwise
         * the same as [ResponseService.delete].
         */
        @MustBeClosed
        fun delete(
            responseId: String,
            params: ResponseDeleteParams = ResponseDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ResponseDeleteResponse> =
            delete(params.toBuilder().responseId(responseId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: ResponseDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ResponseDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(
            responseId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ResponseDeleteResponse> =
            delete(responseId, ResponseDeleteParams.none(), requestOptions)
    }
}
