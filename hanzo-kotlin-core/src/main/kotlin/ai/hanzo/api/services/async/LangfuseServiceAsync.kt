// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.langfuse.LangfuseCreateParams
import ai.hanzo.api.models.langfuse.LangfuseCreateResponse
import ai.hanzo.api.models.langfuse.LangfuseDeleteParams
import ai.hanzo.api.models.langfuse.LangfuseDeleteResponse
import ai.hanzo.api.models.langfuse.LangfusePatchParams
import ai.hanzo.api.models.langfuse.LangfusePatchResponse
import ai.hanzo.api.models.langfuse.LangfuseRetrieveParams
import ai.hanzo.api.models.langfuse.LangfuseRetrieveResponse
import ai.hanzo.api.models.langfuse.LangfuseUpdateParams
import ai.hanzo.api.models.langfuse.LangfuseUpdateResponse
import com.google.errorprone.annotations.MustBeClosed

interface LangfuseServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Call Langfuse via LLM proxy. Works with Langfuse SDK.
     *
     * [Docs](https://docs.hanzo.ai/docs/pass_through/langfuse)
     */
    suspend fun create(
        endpoint: String,
        params: LangfuseCreateParams = LangfuseCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LangfuseCreateResponse =
        create(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see [create] */
    suspend fun create(
        params: LangfuseCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LangfuseCreateResponse

    /** @see [create] */
    suspend fun create(endpoint: String, requestOptions: RequestOptions): LangfuseCreateResponse =
        create(endpoint, LangfuseCreateParams.none(), requestOptions)

    /**
     * Call Langfuse via LLM proxy. Works with Langfuse SDK.
     *
     * [Docs](https://docs.hanzo.ai/docs/pass_through/langfuse)
     */
    suspend fun retrieve(
        endpoint: String,
        params: LangfuseRetrieveParams = LangfuseRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LangfuseRetrieveResponse =
        retrieve(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see [retrieve] */
    suspend fun retrieve(
        params: LangfuseRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LangfuseRetrieveResponse

    /** @see [retrieve] */
    suspend fun retrieve(
        endpoint: String,
        requestOptions: RequestOptions,
    ): LangfuseRetrieveResponse = retrieve(endpoint, LangfuseRetrieveParams.none(), requestOptions)

    /**
     * Call Langfuse via LLM proxy. Works with Langfuse SDK.
     *
     * [Docs](https://docs.hanzo.ai/docs/pass_through/langfuse)
     */
    suspend fun update(
        endpoint: String,
        params: LangfuseUpdateParams = LangfuseUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LangfuseUpdateResponse =
        update(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see [update] */
    suspend fun update(
        params: LangfuseUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LangfuseUpdateResponse

    /** @see [update] */
    suspend fun update(endpoint: String, requestOptions: RequestOptions): LangfuseUpdateResponse =
        update(endpoint, LangfuseUpdateParams.none(), requestOptions)

    /**
     * Call Langfuse via LLM proxy. Works with Langfuse SDK.
     *
     * [Docs](https://docs.hanzo.ai/docs/pass_through/langfuse)
     */
    suspend fun delete(
        endpoint: String,
        params: LangfuseDeleteParams = LangfuseDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LangfuseDeleteResponse =
        delete(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see [delete] */
    suspend fun delete(
        params: LangfuseDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LangfuseDeleteResponse

    /** @see [delete] */
    suspend fun delete(endpoint: String, requestOptions: RequestOptions): LangfuseDeleteResponse =
        delete(endpoint, LangfuseDeleteParams.none(), requestOptions)

    /**
     * Call Langfuse via LLM proxy. Works with Langfuse SDK.
     *
     * [Docs](https://docs.hanzo.ai/docs/pass_through/langfuse)
     */
    suspend fun patch(
        endpoint: String,
        params: LangfusePatchParams = LangfusePatchParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LangfusePatchResponse = patch(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see [patch] */
    suspend fun patch(
        params: LangfusePatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LangfusePatchResponse

    /** @see [patch] */
    suspend fun patch(endpoint: String, requestOptions: RequestOptions): LangfusePatchResponse =
        patch(endpoint, LangfusePatchParams.none(), requestOptions)

    /**
     * A view of [LangfuseServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /langfuse/{endpoint}`, but is otherwise the same as
         * [LangfuseServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            endpoint: String,
            params: LangfuseCreateParams = LangfuseCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LangfuseCreateResponse> =
            create(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see [create] */
        @MustBeClosed
        suspend fun create(
            params: LangfuseCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LangfuseCreateResponse>

        /** @see [create] */
        @MustBeClosed
        suspend fun create(
            endpoint: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LangfuseCreateResponse> =
            create(endpoint, LangfuseCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /langfuse/{endpoint}`, but is otherwise the same as
         * [LangfuseServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            endpoint: String,
            params: LangfuseRetrieveParams = LangfuseRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LangfuseRetrieveResponse> =
            retrieve(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            params: LangfuseRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LangfuseRetrieveResponse>

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            endpoint: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LangfuseRetrieveResponse> =
            retrieve(endpoint, LangfuseRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /langfuse/{endpoint}`, but is otherwise the same as
         * [LangfuseServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            endpoint: String,
            params: LangfuseUpdateParams = LangfuseUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LangfuseUpdateResponse> =
            update(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see [update] */
        @MustBeClosed
        suspend fun update(
            params: LangfuseUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LangfuseUpdateResponse>

        /** @see [update] */
        @MustBeClosed
        suspend fun update(
            endpoint: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LangfuseUpdateResponse> =
            update(endpoint, LangfuseUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /langfuse/{endpoint}`, but is otherwise the same
         * as [LangfuseServiceAsync.delete].
         */
        @MustBeClosed
        suspend fun delete(
            endpoint: String,
            params: LangfuseDeleteParams = LangfuseDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LangfuseDeleteResponse> =
            delete(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see [delete] */
        @MustBeClosed
        suspend fun delete(
            params: LangfuseDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LangfuseDeleteResponse>

        /** @see [delete] */
        @MustBeClosed
        suspend fun delete(
            endpoint: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LangfuseDeleteResponse> =
            delete(endpoint, LangfuseDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /langfuse/{endpoint}`, but is otherwise the same
         * as [LangfuseServiceAsync.patch].
         */
        @MustBeClosed
        suspend fun patch(
            endpoint: String,
            params: LangfusePatchParams = LangfusePatchParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LangfusePatchResponse> =
            patch(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see [patch] */
        @MustBeClosed
        suspend fun patch(
            params: LangfusePatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LangfusePatchResponse>

        /** @see [patch] */
        @MustBeClosed
        suspend fun patch(
            endpoint: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LangfusePatchResponse> =
            patch(endpoint, LangfusePatchParams.none(), requestOptions)
    }
}
