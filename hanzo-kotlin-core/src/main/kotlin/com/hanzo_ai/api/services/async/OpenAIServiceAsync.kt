// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.hanzo_ai.api.core.RequestOptions
import com.hanzo_ai.api.core.http.HttpResponseFor
import com.hanzo_ai.api.models.openai.OpenAICreateParams
import com.hanzo_ai.api.models.openai.OpenAICreateResponse
import com.hanzo_ai.api.models.openai.OpenAIDeleteParams
import com.hanzo_ai.api.models.openai.OpenAIDeleteResponse
import com.hanzo_ai.api.models.openai.OpenAIPatchParams
import com.hanzo_ai.api.models.openai.OpenAIPatchResponse
import com.hanzo_ai.api.models.openai.OpenAIRetrieveParams
import com.hanzo_ai.api.models.openai.OpenAIRetrieveResponse
import com.hanzo_ai.api.models.openai.OpenAIUpdateParams
import com.hanzo_ai.api.models.openai.OpenAIUpdateResponse
import com.hanzo_ai.api.services.async.openai.DeploymentServiceAsync

interface OpenAIServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun deployments(): DeploymentServiceAsync

    /**
     * Simple pass-through for OpenAI. Use this if you want to directly send a request to OpenAI.
     */
    suspend fun create(
        params: OpenAICreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OpenAICreateResponse

    /**
     * Simple pass-through for OpenAI. Use this if you want to directly send a request to OpenAI.
     */
    suspend fun retrieve(
        params: OpenAIRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OpenAIRetrieveResponse

    /**
     * Simple pass-through for OpenAI. Use this if you want to directly send a request to OpenAI.
     */
    suspend fun update(
        params: OpenAIUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OpenAIUpdateResponse

    /**
     * Simple pass-through for OpenAI. Use this if you want to directly send a request to OpenAI.
     */
    suspend fun delete(
        params: OpenAIDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OpenAIDeleteResponse

    /**
     * Simple pass-through for OpenAI. Use this if you want to directly send a request to OpenAI.
     */
    suspend fun patch(
        params: OpenAIPatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OpenAIPatchResponse

    /**
     * A view of [OpenAIServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        fun deployments(): DeploymentServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /openai/{endpoint}`, but is otherwise the same as
         * [OpenAIServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: OpenAICreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OpenAICreateResponse>

        /**
         * Returns a raw HTTP response for `get /openai/{endpoint}`, but is otherwise the same as
         * [OpenAIServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            params: OpenAIRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OpenAIRetrieveResponse>

        /**
         * Returns a raw HTTP response for `put /openai/{endpoint}`, but is otherwise the same as
         * [OpenAIServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            params: OpenAIUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OpenAIUpdateResponse>

        /**
         * Returns a raw HTTP response for `delete /openai/{endpoint}`, but is otherwise the same as
         * [OpenAIServiceAsync.delete].
         */
        @MustBeClosed
        suspend fun delete(
            params: OpenAIDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OpenAIDeleteResponse>

        /**
         * Returns a raw HTTP response for `patch /openai/{endpoint}`, but is otherwise the same as
         * [OpenAIServiceAsync.patch].
         */
        @MustBeClosed
        suspend fun patch(
            params: OpenAIPatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OpenAIPatchResponse>
    }
}
