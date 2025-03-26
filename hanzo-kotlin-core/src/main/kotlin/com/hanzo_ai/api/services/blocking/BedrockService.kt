// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.hanzo_ai.api.core.RequestOptions
import com.hanzo_ai.api.core.http.HttpResponseFor
import com.hanzo_ai.api.models.bedrock.BedrockCreateParams
import com.hanzo_ai.api.models.bedrock.BedrockCreateResponse
import com.hanzo_ai.api.models.bedrock.BedrockDeleteParams
import com.hanzo_ai.api.models.bedrock.BedrockDeleteResponse
import com.hanzo_ai.api.models.bedrock.BedrockPatchParams
import com.hanzo_ai.api.models.bedrock.BedrockPatchResponse
import com.hanzo_ai.api.models.bedrock.BedrockRetrieveParams
import com.hanzo_ai.api.models.bedrock.BedrockRetrieveResponse
import com.hanzo_ai.api.models.bedrock.BedrockUpdateParams
import com.hanzo_ai.api.models.bedrock.BedrockUpdateResponse

interface BedrockService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** [Docs](https://docs.llm.ai/docs/pass_through/bedrock) */
    fun create(
        params: BedrockCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BedrockCreateResponse

    /** [Docs](https://docs.llm.ai/docs/pass_through/bedrock) */
    fun retrieve(
        params: BedrockRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BedrockRetrieveResponse

    /** [Docs](https://docs.llm.ai/docs/pass_through/bedrock) */
    fun update(
        params: BedrockUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BedrockUpdateResponse

    /** [Docs](https://docs.llm.ai/docs/pass_through/bedrock) */
    fun delete(
        params: BedrockDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BedrockDeleteResponse

    /** [Docs](https://docs.llm.ai/docs/pass_through/bedrock) */
    fun patch(
        params: BedrockPatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BedrockPatchResponse

    /** A view of [BedrockService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /bedrock/{endpoint}`, but is otherwise the same as
         * [BedrockService.create].
         */
        @MustBeClosed
        fun create(
            params: BedrockCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BedrockCreateResponse>

        /**
         * Returns a raw HTTP response for `get /bedrock/{endpoint}`, but is otherwise the same as
         * [BedrockService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: BedrockRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BedrockRetrieveResponse>

        /**
         * Returns a raw HTTP response for `put /bedrock/{endpoint}`, but is otherwise the same as
         * [BedrockService.update].
         */
        @MustBeClosed
        fun update(
            params: BedrockUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BedrockUpdateResponse>

        /**
         * Returns a raw HTTP response for `delete /bedrock/{endpoint}`, but is otherwise the same
         * as [BedrockService.delete].
         */
        @MustBeClosed
        fun delete(
            params: BedrockDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BedrockDeleteResponse>

        /**
         * Returns a raw HTTP response for `patch /bedrock/{endpoint}`, but is otherwise the same as
         * [BedrockService.patch].
         */
        @MustBeClosed
        fun patch(
            params: BedrockPatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BedrockPatchResponse>
    }
}
