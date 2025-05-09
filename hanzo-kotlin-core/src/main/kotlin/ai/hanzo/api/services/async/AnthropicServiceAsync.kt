// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.anthropic.AnthropicCreateParams
import ai.hanzo.api.models.anthropic.AnthropicCreateResponse
import ai.hanzo.api.models.anthropic.AnthropicDeleteParams
import ai.hanzo.api.models.anthropic.AnthropicDeleteResponse
import ai.hanzo.api.models.anthropic.AnthropicModifyParams
import ai.hanzo.api.models.anthropic.AnthropicModifyResponse
import ai.hanzo.api.models.anthropic.AnthropicRetrieveParams
import ai.hanzo.api.models.anthropic.AnthropicRetrieveResponse
import ai.hanzo.api.models.anthropic.AnthropicUpdateParams
import ai.hanzo.api.models.anthropic.AnthropicUpdateResponse
import com.google.errorprone.annotations.MustBeClosed

interface AnthropicServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** [Docs](https://docs.hanzo.ai/docs/anthropic_completion) */
    suspend fun create(
        endpoint: String,
        params: AnthropicCreateParams = AnthropicCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AnthropicCreateResponse =
        create(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see [create] */
    suspend fun create(
        params: AnthropicCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AnthropicCreateResponse

    /** @see [create] */
    suspend fun create(endpoint: String, requestOptions: RequestOptions): AnthropicCreateResponse =
        create(endpoint, AnthropicCreateParams.none(), requestOptions)

    /** [Docs](https://docs.hanzo.ai/docs/anthropic_completion) */
    suspend fun retrieve(
        endpoint: String,
        params: AnthropicRetrieveParams = AnthropicRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AnthropicRetrieveResponse =
        retrieve(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see [retrieve] */
    suspend fun retrieve(
        params: AnthropicRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AnthropicRetrieveResponse

    /** @see [retrieve] */
    suspend fun retrieve(
        endpoint: String,
        requestOptions: RequestOptions,
    ): AnthropicRetrieveResponse =
        retrieve(endpoint, AnthropicRetrieveParams.none(), requestOptions)

    /** [Docs](https://docs.hanzo.ai/docs/anthropic_completion) */
    suspend fun update(
        endpoint: String,
        params: AnthropicUpdateParams = AnthropicUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AnthropicUpdateResponse =
        update(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see [update] */
    suspend fun update(
        params: AnthropicUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AnthropicUpdateResponse

    /** @see [update] */
    suspend fun update(endpoint: String, requestOptions: RequestOptions): AnthropicUpdateResponse =
        update(endpoint, AnthropicUpdateParams.none(), requestOptions)

    /** [Docs](https://docs.hanzo.ai/docs/anthropic_completion) */
    suspend fun delete(
        endpoint: String,
        params: AnthropicDeleteParams = AnthropicDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AnthropicDeleteResponse =
        delete(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see [delete] */
    suspend fun delete(
        params: AnthropicDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AnthropicDeleteResponse

    /** @see [delete] */
    suspend fun delete(endpoint: String, requestOptions: RequestOptions): AnthropicDeleteResponse =
        delete(endpoint, AnthropicDeleteParams.none(), requestOptions)

    /** [Docs](https://docs.hanzo.ai/docs/anthropic_completion) */
    suspend fun modify(
        endpoint: String,
        params: AnthropicModifyParams = AnthropicModifyParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AnthropicModifyResponse =
        modify(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see [modify] */
    suspend fun modify(
        params: AnthropicModifyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AnthropicModifyResponse

    /** @see [modify] */
    suspend fun modify(endpoint: String, requestOptions: RequestOptions): AnthropicModifyResponse =
        modify(endpoint, AnthropicModifyParams.none(), requestOptions)

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
            endpoint: String,
            params: AnthropicCreateParams = AnthropicCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AnthropicCreateResponse> =
            create(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see [create] */
        @MustBeClosed
        suspend fun create(
            params: AnthropicCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AnthropicCreateResponse>

        /** @see [create] */
        @MustBeClosed
        suspend fun create(
            endpoint: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AnthropicCreateResponse> =
            create(endpoint, AnthropicCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /anthropic/{endpoint}`, but is otherwise the same as
         * [AnthropicServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            endpoint: String,
            params: AnthropicRetrieveParams = AnthropicRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AnthropicRetrieveResponse> =
            retrieve(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            params: AnthropicRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AnthropicRetrieveResponse>

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            endpoint: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AnthropicRetrieveResponse> =
            retrieve(endpoint, AnthropicRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /anthropic/{endpoint}`, but is otherwise the same as
         * [AnthropicServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            endpoint: String,
            params: AnthropicUpdateParams = AnthropicUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AnthropicUpdateResponse> =
            update(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see [update] */
        @MustBeClosed
        suspend fun update(
            params: AnthropicUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AnthropicUpdateResponse>

        /** @see [update] */
        @MustBeClosed
        suspend fun update(
            endpoint: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AnthropicUpdateResponse> =
            update(endpoint, AnthropicUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /anthropic/{endpoint}`, but is otherwise the same
         * as [AnthropicServiceAsync.delete].
         */
        @MustBeClosed
        suspend fun delete(
            endpoint: String,
            params: AnthropicDeleteParams = AnthropicDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AnthropicDeleteResponse> =
            delete(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see [delete] */
        @MustBeClosed
        suspend fun delete(
            params: AnthropicDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AnthropicDeleteResponse>

        /** @see [delete] */
        @MustBeClosed
        suspend fun delete(
            endpoint: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AnthropicDeleteResponse> =
            delete(endpoint, AnthropicDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /anthropic/{endpoint}`, but is otherwise the same
         * as [AnthropicServiceAsync.modify].
         */
        @MustBeClosed
        suspend fun modify(
            endpoint: String,
            params: AnthropicModifyParams = AnthropicModifyParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AnthropicModifyResponse> =
            modify(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see [modify] */
        @MustBeClosed
        suspend fun modify(
            params: AnthropicModifyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AnthropicModifyResponse>

        /** @see [modify] */
        @MustBeClosed
        suspend fun modify(
            endpoint: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AnthropicModifyResponse> =
            modify(endpoint, AnthropicModifyParams.none(), requestOptions)
    }
}
