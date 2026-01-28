// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking

import ai.hanzo.api.core.ClientOptions
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

interface AnthropicService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AnthropicService

    /** [Docs](https://docs.litellm.ai/docs/pass_through/anthropic_completion) */
    fun create(
        endpoint: String,
        params: AnthropicCreateParams = AnthropicCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AnthropicCreateResponse =
        create(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see create */
    fun create(
        params: AnthropicCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AnthropicCreateResponse

    /** @see create */
    fun create(endpoint: String, requestOptions: RequestOptions): AnthropicCreateResponse =
        create(endpoint, AnthropicCreateParams.none(), requestOptions)

    /** [Docs](https://docs.litellm.ai/docs/pass_through/anthropic_completion) */
    fun retrieve(
        endpoint: String,
        params: AnthropicRetrieveParams = AnthropicRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AnthropicRetrieveResponse =
        retrieve(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: AnthropicRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AnthropicRetrieveResponse

    /** @see retrieve */
    fun retrieve(endpoint: String, requestOptions: RequestOptions): AnthropicRetrieveResponse =
        retrieve(endpoint, AnthropicRetrieveParams.none(), requestOptions)

    /** [Docs](https://docs.litellm.ai/docs/pass_through/anthropic_completion) */
    fun update(
        endpoint: String,
        params: AnthropicUpdateParams = AnthropicUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AnthropicUpdateResponse =
        update(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see update */
    fun update(
        params: AnthropicUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AnthropicUpdateResponse

    /** @see update */
    fun update(endpoint: String, requestOptions: RequestOptions): AnthropicUpdateResponse =
        update(endpoint, AnthropicUpdateParams.none(), requestOptions)

    /** [Docs](https://docs.litellm.ai/docs/pass_through/anthropic_completion) */
    fun delete(
        endpoint: String,
        params: AnthropicDeleteParams = AnthropicDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AnthropicDeleteResponse =
        delete(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see delete */
    fun delete(
        params: AnthropicDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AnthropicDeleteResponse

    /** @see delete */
    fun delete(endpoint: String, requestOptions: RequestOptions): AnthropicDeleteResponse =
        delete(endpoint, AnthropicDeleteParams.none(), requestOptions)

    /** [Docs](https://docs.litellm.ai/docs/pass_through/anthropic_completion) */
    fun modify(
        endpoint: String,
        params: AnthropicModifyParams = AnthropicModifyParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AnthropicModifyResponse =
        modify(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see modify */
    fun modify(
        params: AnthropicModifyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AnthropicModifyResponse

    /** @see modify */
    fun modify(endpoint: String, requestOptions: RequestOptions): AnthropicModifyResponse =
        modify(endpoint, AnthropicModifyParams.none(), requestOptions)

    /** A view of [AnthropicService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AnthropicService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /anthropic/{endpoint}`, but is otherwise the same
         * as [AnthropicService.create].
         */
        @MustBeClosed
        fun create(
            endpoint: String,
            params: AnthropicCreateParams = AnthropicCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AnthropicCreateResponse> =
            create(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(
            params: AnthropicCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AnthropicCreateResponse>

        /** @see create */
        @MustBeClosed
        fun create(
            endpoint: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AnthropicCreateResponse> =
            create(endpoint, AnthropicCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /anthropic/{endpoint}`, but is otherwise the same as
         * [AnthropicService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            endpoint: String,
            params: AnthropicRetrieveParams = AnthropicRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AnthropicRetrieveResponse> =
            retrieve(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: AnthropicRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AnthropicRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            endpoint: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AnthropicRetrieveResponse> =
            retrieve(endpoint, AnthropicRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /anthropic/{endpoint}`, but is otherwise the same as
         * [AnthropicService.update].
         */
        @MustBeClosed
        fun update(
            endpoint: String,
            params: AnthropicUpdateParams = AnthropicUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AnthropicUpdateResponse> =
            update(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: AnthropicUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AnthropicUpdateResponse>

        /** @see update */
        @MustBeClosed
        fun update(
            endpoint: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AnthropicUpdateResponse> =
            update(endpoint, AnthropicUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /anthropic/{endpoint}`, but is otherwise the same
         * as [AnthropicService.delete].
         */
        @MustBeClosed
        fun delete(
            endpoint: String,
            params: AnthropicDeleteParams = AnthropicDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AnthropicDeleteResponse> =
            delete(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: AnthropicDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AnthropicDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(
            endpoint: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AnthropicDeleteResponse> =
            delete(endpoint, AnthropicDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /anthropic/{endpoint}`, but is otherwise the same
         * as [AnthropicService.modify].
         */
        @MustBeClosed
        fun modify(
            endpoint: String,
            params: AnthropicModifyParams = AnthropicModifyParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AnthropicModifyResponse> =
            modify(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see modify */
        @MustBeClosed
        fun modify(
            params: AnthropicModifyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AnthropicModifyResponse>

        /** @see modify */
        @MustBeClosed
        fun modify(
            endpoint: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AnthropicModifyResponse> =
            modify(endpoint, AnthropicModifyParams.none(), requestOptions)
    }
}
