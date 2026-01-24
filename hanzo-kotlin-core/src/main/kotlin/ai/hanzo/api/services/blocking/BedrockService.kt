// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking

import ai.hanzo.api.core.ClientOptions
import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.bedrock.BedrockCreateParams
import ai.hanzo.api.models.bedrock.BedrockCreateResponse
import ai.hanzo.api.models.bedrock.BedrockDeleteParams
import ai.hanzo.api.models.bedrock.BedrockDeleteResponse
import ai.hanzo.api.models.bedrock.BedrockPatchParams
import ai.hanzo.api.models.bedrock.BedrockPatchResponse
import ai.hanzo.api.models.bedrock.BedrockRetrieveParams
import ai.hanzo.api.models.bedrock.BedrockRetrieveResponse
import ai.hanzo.api.models.bedrock.BedrockUpdateParams
import ai.hanzo.api.models.bedrock.BedrockUpdateResponse
import com.google.errorprone.annotations.MustBeClosed

interface BedrockService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): BedrockService

    /**
     * This is the v1 passthrough for Bedrock. V2 is handled by the `/bedrock/v2` endpoint.
     * [Docs](https://docs.litellm.ai/docs/pass_through/bedrock)
     */
    fun create(
        endpoint: String,
        params: BedrockCreateParams = BedrockCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BedrockCreateResponse = create(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see create */
    fun create(
        params: BedrockCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BedrockCreateResponse

    /** @see create */
    fun create(endpoint: String, requestOptions: RequestOptions): BedrockCreateResponse =
        create(endpoint, BedrockCreateParams.none(), requestOptions)

    /**
     * This is the v1 passthrough for Bedrock. V2 is handled by the `/bedrock/v2` endpoint.
     * [Docs](https://docs.litellm.ai/docs/pass_through/bedrock)
     */
    fun retrieve(
        endpoint: String,
        params: BedrockRetrieveParams = BedrockRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BedrockRetrieveResponse =
        retrieve(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: BedrockRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BedrockRetrieveResponse

    /** @see retrieve */
    fun retrieve(endpoint: String, requestOptions: RequestOptions): BedrockRetrieveResponse =
        retrieve(endpoint, BedrockRetrieveParams.none(), requestOptions)

    /**
     * This is the v1 passthrough for Bedrock. V2 is handled by the `/bedrock/v2` endpoint.
     * [Docs](https://docs.litellm.ai/docs/pass_through/bedrock)
     */
    fun update(
        endpoint: String,
        params: BedrockUpdateParams = BedrockUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BedrockUpdateResponse = update(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see update */
    fun update(
        params: BedrockUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BedrockUpdateResponse

    /** @see update */
    fun update(endpoint: String, requestOptions: RequestOptions): BedrockUpdateResponse =
        update(endpoint, BedrockUpdateParams.none(), requestOptions)

    /**
     * This is the v1 passthrough for Bedrock. V2 is handled by the `/bedrock/v2` endpoint.
     * [Docs](https://docs.litellm.ai/docs/pass_through/bedrock)
     */
    fun delete(
        endpoint: String,
        params: BedrockDeleteParams = BedrockDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BedrockDeleteResponse = delete(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see delete */
    fun delete(
        params: BedrockDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BedrockDeleteResponse

    /** @see delete */
    fun delete(endpoint: String, requestOptions: RequestOptions): BedrockDeleteResponse =
        delete(endpoint, BedrockDeleteParams.none(), requestOptions)

    /**
     * This is the v1 passthrough for Bedrock. V2 is handled by the `/bedrock/v2` endpoint.
     * [Docs](https://docs.litellm.ai/docs/pass_through/bedrock)
     */
    fun patch(
        endpoint: String,
        params: BedrockPatchParams = BedrockPatchParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BedrockPatchResponse = patch(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see patch */
    fun patch(
        params: BedrockPatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BedrockPatchResponse

    /** @see patch */
    fun patch(endpoint: String, requestOptions: RequestOptions): BedrockPatchResponse =
        patch(endpoint, BedrockPatchParams.none(), requestOptions)

    /** A view of [BedrockService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): BedrockService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /bedrock/{endpoint}`, but is otherwise the same as
         * [BedrockService.create].
         */
        @MustBeClosed
        fun create(
            endpoint: String,
            params: BedrockCreateParams = BedrockCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BedrockCreateResponse> =
            create(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(
            params: BedrockCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BedrockCreateResponse>

        /** @see create */
        @MustBeClosed
        fun create(
            endpoint: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BedrockCreateResponse> =
            create(endpoint, BedrockCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /bedrock/{endpoint}`, but is otherwise the same as
         * [BedrockService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            endpoint: String,
            params: BedrockRetrieveParams = BedrockRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BedrockRetrieveResponse> =
            retrieve(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: BedrockRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BedrockRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            endpoint: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BedrockRetrieveResponse> =
            retrieve(endpoint, BedrockRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /bedrock/{endpoint}`, but is otherwise the same as
         * [BedrockService.update].
         */
        @MustBeClosed
        fun update(
            endpoint: String,
            params: BedrockUpdateParams = BedrockUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BedrockUpdateResponse> =
            update(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: BedrockUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BedrockUpdateResponse>

        /** @see update */
        @MustBeClosed
        fun update(
            endpoint: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BedrockUpdateResponse> =
            update(endpoint, BedrockUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /bedrock/{endpoint}`, but is otherwise the same
         * as [BedrockService.delete].
         */
        @MustBeClosed
        fun delete(
            endpoint: String,
            params: BedrockDeleteParams = BedrockDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BedrockDeleteResponse> =
            delete(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: BedrockDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BedrockDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(
            endpoint: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BedrockDeleteResponse> =
            delete(endpoint, BedrockDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /bedrock/{endpoint}`, but is otherwise the same as
         * [BedrockService.patch].
         */
        @MustBeClosed
        fun patch(
            endpoint: String,
            params: BedrockPatchParams = BedrockPatchParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BedrockPatchResponse> =
            patch(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see patch */
        @MustBeClosed
        fun patch(
            params: BedrockPatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BedrockPatchResponse>

        /** @see patch */
        @MustBeClosed
        fun patch(
            endpoint: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BedrockPatchResponse> =
            patch(endpoint, BedrockPatchParams.none(), requestOptions)
    }
}
