// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.hanzo_ai.api.core.RequestOptions
import com.hanzo_ai.api.core.http.HttpResponseFor
import com.hanzo_ai.api.models.gemini.GeminiCreateParams
import com.hanzo_ai.api.models.gemini.GeminiCreateResponse
import com.hanzo_ai.api.models.gemini.GeminiDeleteParams
import com.hanzo_ai.api.models.gemini.GeminiDeleteResponse
import com.hanzo_ai.api.models.gemini.GeminiPatchParams
import com.hanzo_ai.api.models.gemini.GeminiPatchResponse
import com.hanzo_ai.api.models.gemini.GeminiRetrieveParams
import com.hanzo_ai.api.models.gemini.GeminiRetrieveResponse
import com.hanzo_ai.api.models.gemini.GeminiUpdateParams
import com.hanzo_ai.api.models.gemini.GeminiUpdateResponse

interface GeminiService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** [Docs](https://docs.llm.ai/docs/pass_through/google_ai_studio) */
    fun create(
        params: GeminiCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GeminiCreateResponse

    /** [Docs](https://docs.llm.ai/docs/pass_through/google_ai_studio) */
    fun retrieve(
        params: GeminiRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GeminiRetrieveResponse

    /** [Docs](https://docs.llm.ai/docs/pass_through/google_ai_studio) */
    fun update(
        params: GeminiUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GeminiUpdateResponse

    /** [Docs](https://docs.llm.ai/docs/pass_through/google_ai_studio) */
    fun delete(
        params: GeminiDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GeminiDeleteResponse

    /** [Docs](https://docs.llm.ai/docs/pass_through/google_ai_studio) */
    fun patch(
        params: GeminiPatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GeminiPatchResponse

    /** A view of [GeminiService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /gemini/{endpoint}`, but is otherwise the same as
         * [GeminiService.create].
         */
        @MustBeClosed
        fun create(
            params: GeminiCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GeminiCreateResponse>

        /**
         * Returns a raw HTTP response for `get /gemini/{endpoint}`, but is otherwise the same as
         * [GeminiService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: GeminiRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GeminiRetrieveResponse>

        /**
         * Returns a raw HTTP response for `put /gemini/{endpoint}`, but is otherwise the same as
         * [GeminiService.update].
         */
        @MustBeClosed
        fun update(
            params: GeminiUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GeminiUpdateResponse>

        /**
         * Returns a raw HTTP response for `delete /gemini/{endpoint}`, but is otherwise the same as
         * [GeminiService.delete].
         */
        @MustBeClosed
        fun delete(
            params: GeminiDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GeminiDeleteResponse>

        /**
         * Returns a raw HTTP response for `patch /gemini/{endpoint}`, but is otherwise the same as
         * [GeminiService.patch].
         */
        @MustBeClosed
        fun patch(
            params: GeminiPatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GeminiPatchResponse>
    }
}
