// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking

import ai.hanzo.api.core.ClientOptions
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

interface LangfuseService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): LangfuseService

    /**
     * Call Langfuse via LiteLLM proxy. Works with Langfuse SDK.
     *
     * [Docs](https://docs.litellm.ai/docs/pass_through/langfuse)
     */
    fun create(
        endpoint: String,
        params: LangfuseCreateParams = LangfuseCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LangfuseCreateResponse =
        create(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see create */
    fun create(
        params: LangfuseCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LangfuseCreateResponse

    /** @see create */
    fun create(endpoint: String, requestOptions: RequestOptions): LangfuseCreateResponse =
        create(endpoint, LangfuseCreateParams.none(), requestOptions)

    /**
     * Call Langfuse via LiteLLM proxy. Works with Langfuse SDK.
     *
     * [Docs](https://docs.litellm.ai/docs/pass_through/langfuse)
     */
    fun retrieve(
        endpoint: String,
        params: LangfuseRetrieveParams = LangfuseRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LangfuseRetrieveResponse =
        retrieve(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: LangfuseRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LangfuseRetrieveResponse

    /** @see retrieve */
    fun retrieve(endpoint: String, requestOptions: RequestOptions): LangfuseRetrieveResponse =
        retrieve(endpoint, LangfuseRetrieveParams.none(), requestOptions)

    /**
     * Call Langfuse via LiteLLM proxy. Works with Langfuse SDK.
     *
     * [Docs](https://docs.litellm.ai/docs/pass_through/langfuse)
     */
    fun update(
        endpoint: String,
        params: LangfuseUpdateParams = LangfuseUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LangfuseUpdateResponse =
        update(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see update */
    fun update(
        params: LangfuseUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LangfuseUpdateResponse

    /** @see update */
    fun update(endpoint: String, requestOptions: RequestOptions): LangfuseUpdateResponse =
        update(endpoint, LangfuseUpdateParams.none(), requestOptions)

    /**
     * Call Langfuse via LiteLLM proxy. Works with Langfuse SDK.
     *
     * [Docs](https://docs.litellm.ai/docs/pass_through/langfuse)
     */
    fun delete(
        endpoint: String,
        params: LangfuseDeleteParams = LangfuseDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LangfuseDeleteResponse =
        delete(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see delete */
    fun delete(
        params: LangfuseDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LangfuseDeleteResponse

    /** @see delete */
    fun delete(endpoint: String, requestOptions: RequestOptions): LangfuseDeleteResponse =
        delete(endpoint, LangfuseDeleteParams.none(), requestOptions)

    /**
     * Call Langfuse via LiteLLM proxy. Works with Langfuse SDK.
     *
     * [Docs](https://docs.litellm.ai/docs/pass_through/langfuse)
     */
    fun patch(
        endpoint: String,
        params: LangfusePatchParams = LangfusePatchParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LangfusePatchResponse = patch(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see patch */
    fun patch(
        params: LangfusePatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LangfusePatchResponse

    /** @see patch */
    fun patch(endpoint: String, requestOptions: RequestOptions): LangfusePatchResponse =
        patch(endpoint, LangfusePatchParams.none(), requestOptions)

    /** A view of [LangfuseService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): LangfuseService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /langfuse/{endpoint}`, but is otherwise the same as
         * [LangfuseService.create].
         */
        @MustBeClosed
        fun create(
            endpoint: String,
            params: LangfuseCreateParams = LangfuseCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LangfuseCreateResponse> =
            create(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(
            params: LangfuseCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LangfuseCreateResponse>

        /** @see create */
        @MustBeClosed
        fun create(
            endpoint: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LangfuseCreateResponse> =
            create(endpoint, LangfuseCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /langfuse/{endpoint}`, but is otherwise the same as
         * [LangfuseService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            endpoint: String,
            params: LangfuseRetrieveParams = LangfuseRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LangfuseRetrieveResponse> =
            retrieve(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: LangfuseRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LangfuseRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            endpoint: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LangfuseRetrieveResponse> =
            retrieve(endpoint, LangfuseRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /langfuse/{endpoint}`, but is otherwise the same as
         * [LangfuseService.update].
         */
        @MustBeClosed
        fun update(
            endpoint: String,
            params: LangfuseUpdateParams = LangfuseUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LangfuseUpdateResponse> =
            update(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: LangfuseUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LangfuseUpdateResponse>

        /** @see update */
        @MustBeClosed
        fun update(
            endpoint: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LangfuseUpdateResponse> =
            update(endpoint, LangfuseUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /langfuse/{endpoint}`, but is otherwise the same
         * as [LangfuseService.delete].
         */
        @MustBeClosed
        fun delete(
            endpoint: String,
            params: LangfuseDeleteParams = LangfuseDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LangfuseDeleteResponse> =
            delete(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: LangfuseDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LangfuseDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(
            endpoint: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LangfuseDeleteResponse> =
            delete(endpoint, LangfuseDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /langfuse/{endpoint}`, but is otherwise the same
         * as [LangfuseService.patch].
         */
        @MustBeClosed
        fun patch(
            endpoint: String,
            params: LangfusePatchParams = LangfusePatchParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LangfusePatchResponse> =
            patch(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see patch */
        @MustBeClosed
        fun patch(
            params: LangfusePatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LangfusePatchResponse>

        /** @see patch */
        @MustBeClosed
        fun patch(
            endpoint: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LangfusePatchResponse> =
            patch(endpoint, LangfusePatchParams.none(), requestOptions)
    }
}
