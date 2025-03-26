// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.hanzo_ai.api.core.RequestOptions
import com.hanzo_ai.api.core.http.HttpResponseFor
import com.hanzo_ai.api.models.langfuse.LangfuseCreateParams
import com.hanzo_ai.api.models.langfuse.LangfuseCreateResponse
import com.hanzo_ai.api.models.langfuse.LangfuseDeleteParams
import com.hanzo_ai.api.models.langfuse.LangfuseDeleteResponse
import com.hanzo_ai.api.models.langfuse.LangfusePatchParams
import com.hanzo_ai.api.models.langfuse.LangfusePatchResponse
import com.hanzo_ai.api.models.langfuse.LangfuseRetrieveParams
import com.hanzo_ai.api.models.langfuse.LangfuseRetrieveResponse
import com.hanzo_ai.api.models.langfuse.LangfuseUpdateParams
import com.hanzo_ai.api.models.langfuse.LangfuseUpdateResponse

interface LangfuseService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Call Langfuse via LLM proxy. Works with Langfuse SDK.
     *
     * [Docs](https://docs.llm.ai/docs/pass_through/langfuse)
     */
    fun create(
        params: LangfuseCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LangfuseCreateResponse

    /**
     * Call Langfuse via LLM proxy. Works with Langfuse SDK.
     *
     * [Docs](https://docs.llm.ai/docs/pass_through/langfuse)
     */
    fun retrieve(
        params: LangfuseRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LangfuseRetrieveResponse

    /**
     * Call Langfuse via LLM proxy. Works with Langfuse SDK.
     *
     * [Docs](https://docs.llm.ai/docs/pass_through/langfuse)
     */
    fun update(
        params: LangfuseUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LangfuseUpdateResponse

    /**
     * Call Langfuse via LLM proxy. Works with Langfuse SDK.
     *
     * [Docs](https://docs.llm.ai/docs/pass_through/langfuse)
     */
    fun delete(
        params: LangfuseDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LangfuseDeleteResponse

    /**
     * Call Langfuse via LLM proxy. Works with Langfuse SDK.
     *
     * [Docs](https://docs.llm.ai/docs/pass_through/langfuse)
     */
    fun patch(
        params: LangfusePatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LangfusePatchResponse

    /** A view of [LangfuseService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /langfuse/{endpoint}`, but is otherwise the same as
         * [LangfuseService.create].
         */
        @MustBeClosed
        fun create(
            params: LangfuseCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LangfuseCreateResponse>

        /**
         * Returns a raw HTTP response for `get /langfuse/{endpoint}`, but is otherwise the same as
         * [LangfuseService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: LangfuseRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LangfuseRetrieveResponse>

        /**
         * Returns a raw HTTP response for `put /langfuse/{endpoint}`, but is otherwise the same as
         * [LangfuseService.update].
         */
        @MustBeClosed
        fun update(
            params: LangfuseUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LangfuseUpdateResponse>

        /**
         * Returns a raw HTTP response for `delete /langfuse/{endpoint}`, but is otherwise the same
         * as [LangfuseService.delete].
         */
        @MustBeClosed
        fun delete(
            params: LangfuseDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LangfuseDeleteResponse>

        /**
         * Returns a raw HTTP response for `patch /langfuse/{endpoint}`, but is otherwise the same
         * as [LangfuseService.patch].
         */
        @MustBeClosed
        fun patch(
            params: LangfusePatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LangfusePatchResponse>
    }
}
