// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.hanzo_ai.api.core.RequestOptions
import com.hanzo_ai.api.core.http.HttpResponseFor
import com.hanzo_ai.api.models.responses.ResponseCreateParams
import com.hanzo_ai.api.models.responses.ResponseCreateResponse
import com.hanzo_ai.api.models.responses.ResponseDeleteParams
import com.hanzo_ai.api.models.responses.ResponseDeleteResponse
import com.hanzo_ai.api.models.responses.ResponseRetrieveParams
import com.hanzo_ai.api.models.responses.ResponseRetrieveResponse
import com.hanzo_ai.api.services.blocking.responses.InputItemService

interface ResponseService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun inputItems(): InputItemService

    /**
     * Follows the OpenAI Responses API spec:
     * https://platform.openai.com/docs/api-reference/responses
     *
     * ```bash
     * curl -X POST http://localhost:4000/v1/responses     -H "Content-Type: application/json"     -H "Authorization: Bearer sk-1234"     -d '{
     *     "model": "gpt-4o",
     *     "input": "Tell me about AI"
     * }'
     * ```
     */
    fun create(
        params: ResponseCreateParams = ResponseCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ResponseCreateResponse

    /** @see [create] */
    fun create(requestOptions: RequestOptions): ResponseCreateResponse =
        create(ResponseCreateParams.none(), requestOptions)

    /**
     * Get a response by ID.
     *
     * Follows the OpenAI Responses API spec:
     * https://platform.openai.com/docs/api-reference/responses/get
     *
     * ```bash
     * curl -X GET http://localhost:4000/v1/responses/resp_abc123     -H "Authorization: Bearer sk-1234"
     * ```
     */
    fun retrieve(
        params: ResponseRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ResponseRetrieveResponse

    /**
     * Delete a response by ID.
     *
     * Follows the OpenAI Responses API spec:
     * https://platform.openai.com/docs/api-reference/responses/delete
     *
     * ```bash
     * curl -X DELETE http://localhost:4000/v1/responses/resp_abc123     -H "Authorization: Bearer sk-1234"
     * ```
     */
    fun delete(
        params: ResponseDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ResponseDeleteResponse

    /** A view of [ResponseService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

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

        /** @see [create] */
        @MustBeClosed
        fun create(requestOptions: RequestOptions): HttpResponseFor<ResponseCreateResponse> =
            create(ResponseCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/responses/{response_id}`, but is otherwise the
         * same as [ResponseService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: ResponseRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ResponseRetrieveResponse>

        /**
         * Returns a raw HTTP response for `delete /v1/responses/{response_id}`, but is otherwise
         * the same as [ResponseService.delete].
         */
        @MustBeClosed
        fun delete(
            params: ResponseDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ResponseDeleteResponse>
    }
}
