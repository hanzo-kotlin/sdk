// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.core.ClientOptions
import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.utils.UtilGetSupportedOpenAIParamsParams
import ai.hanzo.api.models.utils.UtilGetSupportedOpenAIParamsResponse
import ai.hanzo.api.models.utils.UtilTokenCounterParams
import ai.hanzo.api.models.utils.UtilTokenCounterResponse
import ai.hanzo.api.models.utils.UtilTransformRequestParams
import ai.hanzo.api.models.utils.UtilTransformRequestResponse
import com.google.errorprone.annotations.MustBeClosed

interface UtilServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): UtilServiceAsync

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
    suspend fun getSupportedOpenAIParams(
        params: UtilGetSupportedOpenAIParamsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UtilGetSupportedOpenAIParamsResponse

    /** Token Counter */
    suspend fun tokenCounter(
        params: UtilTokenCounterParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UtilTokenCounterResponse

    /** Transform Request */
    suspend fun transformRequest(
        params: UtilTransformRequestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UtilTransformRequestResponse

    /** A view of [UtilServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): UtilServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /utils/supported_openai_params`, but is otherwise
         * the same as [UtilServiceAsync.getSupportedOpenAIParams].
         */
        @MustBeClosed
        suspend fun getSupportedOpenAIParams(
            params: UtilGetSupportedOpenAIParamsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UtilGetSupportedOpenAIParamsResponse>

        /**
         * Returns a raw HTTP response for `post /utils/token_counter`, but is otherwise the same as
         * [UtilServiceAsync.tokenCounter].
         */
        @MustBeClosed
        suspend fun tokenCounter(
            params: UtilTokenCounterParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UtilTokenCounterResponse>

        /**
         * Returns a raw HTTP response for `post /utils/transform_request`, but is otherwise the
         * same as [UtilServiceAsync.transformRequest].
         */
        @MustBeClosed
        suspend fun transformRequest(
            params: UtilTransformRequestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UtilTransformRequestResponse>
    }
}
