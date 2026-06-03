// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking

import ai.hanzo.api.core.ClientOptions
import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.gemini.GeminiCreateParams
import ai.hanzo.api.models.gemini.GeminiCreateResponse
import ai.hanzo.api.models.gemini.GeminiDeleteParams
import ai.hanzo.api.models.gemini.GeminiDeleteResponse
import ai.hanzo.api.models.gemini.GeminiPatchParams
import ai.hanzo.api.models.gemini.GeminiPatchResponse
import ai.hanzo.api.models.gemini.GeminiRetrieveParams
import ai.hanzo.api.models.gemini.GeminiRetrieveResponse
import ai.hanzo.api.models.gemini.GeminiUpdateParams
import ai.hanzo.api.models.gemini.GeminiUpdateResponse
import com.google.errorprone.annotations.MustBeClosed

interface GeminiService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): GeminiService

    /** [Docs](https://docs.hanzo.ai/docs/pass_through/google_ai_studio) */
    fun create(
        endpoint: String,
        params: GeminiCreateParams = GeminiCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GeminiCreateResponse = create(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see create */
    fun create(
        params: GeminiCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GeminiCreateResponse

    /** @see create */
    fun create(endpoint: String, requestOptions: RequestOptions): GeminiCreateResponse =
        create(endpoint, GeminiCreateParams.none(), requestOptions)

    /** [Docs](https://docs.hanzo.ai/docs/pass_through/google_ai_studio) */
    fun retrieve(
        endpoint: String,
        params: GeminiRetrieveParams = GeminiRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GeminiRetrieveResponse =
        retrieve(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: GeminiRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GeminiRetrieveResponse

    /** @see retrieve */
    fun retrieve(endpoint: String, requestOptions: RequestOptions): GeminiRetrieveResponse =
        retrieve(endpoint, GeminiRetrieveParams.none(), requestOptions)

    /** [Docs](https://docs.hanzo.ai/docs/pass_through/google_ai_studio) */
    fun update(
        endpoint: String,
        params: GeminiUpdateParams = GeminiUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GeminiUpdateResponse = update(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see update */
    fun update(
        params: GeminiUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GeminiUpdateResponse

    /** @see update */
    fun update(endpoint: String, requestOptions: RequestOptions): GeminiUpdateResponse =
        update(endpoint, GeminiUpdateParams.none(), requestOptions)

    /** [Docs](https://docs.hanzo.ai/docs/pass_through/google_ai_studio) */
    fun delete(
        endpoint: String,
        params: GeminiDeleteParams = GeminiDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GeminiDeleteResponse = delete(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see delete */
    fun delete(
        params: GeminiDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GeminiDeleteResponse

    /** @see delete */
    fun delete(endpoint: String, requestOptions: RequestOptions): GeminiDeleteResponse =
        delete(endpoint, GeminiDeleteParams.none(), requestOptions)

    /** [Docs](https://docs.hanzo.ai/docs/pass_through/google_ai_studio) */
    fun patch(
        endpoint: String,
        params: GeminiPatchParams = GeminiPatchParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GeminiPatchResponse = patch(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see patch */
    fun patch(
        params: GeminiPatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GeminiPatchResponse

    /** @see patch */
    fun patch(endpoint: String, requestOptions: RequestOptions): GeminiPatchResponse =
        patch(endpoint, GeminiPatchParams.none(), requestOptions)

    /** A view of [GeminiService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): GeminiService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /gemini/{endpoint}`, but is otherwise the same as
         * [GeminiService.create].
         */
        @MustBeClosed
        fun create(
            endpoint: String,
            params: GeminiCreateParams = GeminiCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GeminiCreateResponse> =
            create(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(
            params: GeminiCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GeminiCreateResponse>

        /** @see create */
        @MustBeClosed
        fun create(
            endpoint: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<GeminiCreateResponse> =
            create(endpoint, GeminiCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /gemini/{endpoint}`, but is otherwise the same as
         * [GeminiService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            endpoint: String,
            params: GeminiRetrieveParams = GeminiRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GeminiRetrieveResponse> =
            retrieve(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: GeminiRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GeminiRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            endpoint: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<GeminiRetrieveResponse> =
            retrieve(endpoint, GeminiRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /gemini/{endpoint}`, but is otherwise the same as
         * [GeminiService.update].
         */
        @MustBeClosed
        fun update(
            endpoint: String,
            params: GeminiUpdateParams = GeminiUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GeminiUpdateResponse> =
            update(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: GeminiUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GeminiUpdateResponse>

        /** @see update */
        @MustBeClosed
        fun update(
            endpoint: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<GeminiUpdateResponse> =
            update(endpoint, GeminiUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /gemini/{endpoint}`, but is otherwise the same as
         * [GeminiService.delete].
         */
        @MustBeClosed
        fun delete(
            endpoint: String,
            params: GeminiDeleteParams = GeminiDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GeminiDeleteResponse> =
            delete(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: GeminiDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GeminiDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(
            endpoint: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<GeminiDeleteResponse> =
            delete(endpoint, GeminiDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /gemini/{endpoint}`, but is otherwise the same as
         * [GeminiService.patch].
         */
        @MustBeClosed
        fun patch(
            endpoint: String,
            params: GeminiPatchParams = GeminiPatchParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GeminiPatchResponse> =
            patch(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see patch */
        @MustBeClosed
        fun patch(
            params: GeminiPatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GeminiPatchResponse>

        /** @see patch */
        @MustBeClosed
        fun patch(
            endpoint: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<GeminiPatchResponse> =
            patch(endpoint, GeminiPatchParams.none(), requestOptions)
    }
}
