// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.blocking

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
import com.hanzo_ai.api.services.blocking.openai.DeploymentService

interface OpenAIService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun deployments(): DeploymentService

    /**
     * Simple pass-through for OpenAI. Use this if you want to directly send a request to OpenAI.
     */
    fun create(
        params: OpenAICreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OpenAICreateResponse

    /**
     * Simple pass-through for OpenAI. Use this if you want to directly send a request to OpenAI.
     */
    fun retrieve(
        params: OpenAIRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OpenAIRetrieveResponse

    /**
     * Simple pass-through for OpenAI. Use this if you want to directly send a request to OpenAI.
     */
    fun update(
        params: OpenAIUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OpenAIUpdateResponse

    /**
     * Simple pass-through for OpenAI. Use this if you want to directly send a request to OpenAI.
     */
    fun delete(
        params: OpenAIDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OpenAIDeleteResponse

    /**
     * Simple pass-through for OpenAI. Use this if you want to directly send a request to OpenAI.
     */
    fun patch(
        params: OpenAIPatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OpenAIPatchResponse

    /** A view of [OpenAIService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        fun deployments(): DeploymentService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /openai/{endpoint}`, but is otherwise the same as
         * [OpenAIService.create].
         */
        @MustBeClosed
        fun create(
            params: OpenAICreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OpenAICreateResponse>

        /**
         * Returns a raw HTTP response for `get /openai/{endpoint}`, but is otherwise the same as
         * [OpenAIService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: OpenAIRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OpenAIRetrieveResponse>

        /**
         * Returns a raw HTTP response for `put /openai/{endpoint}`, but is otherwise the same as
         * [OpenAIService.update].
         */
        @MustBeClosed
        fun update(
            params: OpenAIUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OpenAIUpdateResponse>

        /**
         * Returns a raw HTTP response for `delete /openai/{endpoint}`, but is otherwise the same as
         * [OpenAIService.delete].
         */
        @MustBeClosed
        fun delete(
            params: OpenAIDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OpenAIDeleteResponse>

        /**
         * Returns a raw HTTP response for `patch /openai/{endpoint}`, but is otherwise the same as
         * [OpenAIService.patch].
         */
        @MustBeClosed
        fun patch(
            params: OpenAIPatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OpenAIPatchResponse>
    }
}
