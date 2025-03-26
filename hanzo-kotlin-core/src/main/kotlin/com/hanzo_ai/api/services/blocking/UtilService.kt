// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.hanzo_ai.api.core.RequestOptions
import com.hanzo_ai.api.core.http.HttpResponseFor
import com.hanzo_ai.api.models.utils.UtilGetSupportedOpenAIParamsParams
import com.hanzo_ai.api.models.utils.UtilGetSupportedOpenAIParamsResponse
import com.hanzo_ai.api.models.utils.UtilTokenCounterParams
import com.hanzo_ai.api.models.utils.UtilTokenCounterResponse
import com.hanzo_ai.api.models.utils.UtilTransformRequestParams
import com.hanzo_ai.api.models.utils.UtilTransformRequestResponse

interface UtilService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns supported openai params for a given llm model name
     *
     * e.g. `gpt-4` vs `gpt-3.5-turbo`
     *
     * Example curl:
     * ```
     * curl -X GET --location 'http://localhost:4000/utils/supported_openai_params?model=gpt-3.5-turbo-16k'         --header 'Authorization: Bearer sk-1234'
     * ```
     */
    fun getSupportedOpenAIParams(
        params: UtilGetSupportedOpenAIParamsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UtilGetSupportedOpenAIParamsResponse

    /** Token Counter */
    fun tokenCounter(
        params: UtilTokenCounterParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UtilTokenCounterResponse

    /** Transform Request */
    fun transformRequest(
        params: UtilTransformRequestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UtilTransformRequestResponse

    /** A view of [UtilService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /utils/supported_openai_params`, but is otherwise
         * the same as [UtilService.getSupportedOpenAIParams].
         */
        @MustBeClosed
        fun getSupportedOpenAIParams(
            params: UtilGetSupportedOpenAIParamsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UtilGetSupportedOpenAIParamsResponse>

        /**
         * Returns a raw HTTP response for `post /utils/token_counter`, but is otherwise the same as
         * [UtilService.tokenCounter].
         */
        @MustBeClosed
        fun tokenCounter(
            params: UtilTokenCounterParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UtilTokenCounterResponse>

        /**
         * Returns a raw HTTP response for `post /utils/transform_request`, but is otherwise the
         * same as [UtilService.transformRequest].
         */
        @MustBeClosed
        fun transformRequest(
            params: UtilTransformRequestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UtilTransformRequestResponse>
    }
}
