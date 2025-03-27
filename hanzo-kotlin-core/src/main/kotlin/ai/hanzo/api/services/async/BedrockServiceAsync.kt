// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

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

interface BedrockServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** [Docs](https://docs.hanzo.ai/docs/pass_through/bedrock) */
    suspend fun create(
        params: BedrockCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BedrockCreateResponse

    /** [Docs](https://docs.hanzo.ai/docs/pass_through/bedrock) */
    suspend fun retrieve(
        params: BedrockRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BedrockRetrieveResponse

    /** [Docs](https://docs.hanzo.ai/docs/pass_through/bedrock) */
    suspend fun update(
        params: BedrockUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BedrockUpdateResponse

    /** [Docs](https://docs.hanzo.ai/docs/pass_through/bedrock) */
    suspend fun delete(
        params: BedrockDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BedrockDeleteResponse

    /** [Docs](https://docs.hanzo.ai/docs/pass_through/bedrock) */
    suspend fun patch(
        params: BedrockPatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BedrockPatchResponse

    /**
     * A view of [BedrockServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /bedrock/{endpoint}`, but is otherwise the same as
         * [BedrockServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: BedrockCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BedrockCreateResponse>

        /**
         * Returns a raw HTTP response for `get /bedrock/{endpoint}`, but is otherwise the same as
         * [BedrockServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            params: BedrockRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BedrockRetrieveResponse>

        /**
         * Returns a raw HTTP response for `put /bedrock/{endpoint}`, but is otherwise the same as
         * [BedrockServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            params: BedrockUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BedrockUpdateResponse>

        /**
         * Returns a raw HTTP response for `delete /bedrock/{endpoint}`, but is otherwise the same
         * as [BedrockServiceAsync.delete].
         */
        @MustBeClosed
        suspend fun delete(
            params: BedrockDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BedrockDeleteResponse>

        /**
         * Returns a raw HTTP response for `patch /bedrock/{endpoint}`, but is otherwise the same as
         * [BedrockServiceAsync.patch].
         */
        @MustBeClosed
        suspend fun patch(
            params: BedrockPatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BedrockPatchResponse>
    }
}
