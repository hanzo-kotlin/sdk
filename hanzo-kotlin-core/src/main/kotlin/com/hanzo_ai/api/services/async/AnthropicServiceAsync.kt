// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.hanzo_ai.api.core.RequestOptions
import com.hanzo_ai.api.core.http.HttpResponseFor
import com.hanzo_ai.api.models.anthropic.AnthropicCreateParams
import com.hanzo_ai.api.models.anthropic.AnthropicCreateResponse
import com.hanzo_ai.api.models.anthropic.AnthropicDeleteParams
import com.hanzo_ai.api.models.anthropic.AnthropicDeleteResponse
import com.hanzo_ai.api.models.anthropic.AnthropicModifyParams
import com.hanzo_ai.api.models.anthropic.AnthropicModifyResponse
import com.hanzo_ai.api.models.anthropic.AnthropicRetrieveParams
import com.hanzo_ai.api.models.anthropic.AnthropicRetrieveResponse
import com.hanzo_ai.api.models.anthropic.AnthropicUpdateParams
import com.hanzo_ai.api.models.anthropic.AnthropicUpdateResponse

interface AnthropicServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** [Docs](https://docs.llm.ai/docs/anthropic_completion) */
    suspend fun create(
        params: AnthropicCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AnthropicCreateResponse

    /** [Docs](https://docs.llm.ai/docs/anthropic_completion) */
    suspend fun retrieve(
        params: AnthropicRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AnthropicRetrieveResponse

    /** [Docs](https://docs.llm.ai/docs/anthropic_completion) */
    suspend fun update(
        params: AnthropicUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AnthropicUpdateResponse

    /** [Docs](https://docs.llm.ai/docs/anthropic_completion) */
    suspend fun delete(
        params: AnthropicDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AnthropicDeleteResponse

    /** [Docs](https://docs.llm.ai/docs/anthropic_completion) */
    suspend fun modify(
        params: AnthropicModifyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AnthropicModifyResponse

    /**
     * A view of [AnthropicServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /anthropic/{endpoint}`, but is otherwise the same
         * as [AnthropicServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: AnthropicCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AnthropicCreateResponse>

        /**
         * Returns a raw HTTP response for `get /anthropic/{endpoint}`, but is otherwise the same as
         * [AnthropicServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            params: AnthropicRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AnthropicRetrieveResponse>

        /**
         * Returns a raw HTTP response for `put /anthropic/{endpoint}`, but is otherwise the same as
         * [AnthropicServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            params: AnthropicUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AnthropicUpdateResponse>

        /**
         * Returns a raw HTTP response for `delete /anthropic/{endpoint}`, but is otherwise the same
         * as [AnthropicServiceAsync.delete].
         */
        @MustBeClosed
        suspend fun delete(
            params: AnthropicDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AnthropicDeleteResponse>

        /**
         * Returns a raw HTTP response for `patch /anthropic/{endpoint}`, but is otherwise the same
         * as [AnthropicServiceAsync.modify].
         */
        @MustBeClosed
        suspend fun modify(
            params: AnthropicModifyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AnthropicModifyResponse>
    }
}
