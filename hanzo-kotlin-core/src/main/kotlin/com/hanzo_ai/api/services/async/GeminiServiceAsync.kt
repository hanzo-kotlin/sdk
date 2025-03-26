// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.async

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

interface GeminiServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** [Docs](https://docs.llm.ai/docs/pass_through/google_ai_studio) */
    suspend fun create(
        params: GeminiCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GeminiCreateResponse

    /** [Docs](https://docs.llm.ai/docs/pass_through/google_ai_studio) */
    suspend fun retrieve(
        params: GeminiRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GeminiRetrieveResponse

    /** [Docs](https://docs.llm.ai/docs/pass_through/google_ai_studio) */
    suspend fun update(
        params: GeminiUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GeminiUpdateResponse

    /** [Docs](https://docs.llm.ai/docs/pass_through/google_ai_studio) */
    suspend fun delete(
        params: GeminiDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GeminiDeleteResponse

    /** [Docs](https://docs.llm.ai/docs/pass_through/google_ai_studio) */
    suspend fun patch(
        params: GeminiPatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GeminiPatchResponse

    /**
     * A view of [GeminiServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /gemini/{endpoint}`, but is otherwise the same as
         * [GeminiServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: GeminiCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GeminiCreateResponse>

        /**
         * Returns a raw HTTP response for `get /gemini/{endpoint}`, but is otherwise the same as
         * [GeminiServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            params: GeminiRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GeminiRetrieveResponse>

        /**
         * Returns a raw HTTP response for `put /gemini/{endpoint}`, but is otherwise the same as
         * [GeminiServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            params: GeminiUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GeminiUpdateResponse>

        /**
         * Returns a raw HTTP response for `delete /gemini/{endpoint}`, but is otherwise the same as
         * [GeminiServiceAsync.delete].
         */
        @MustBeClosed
        suspend fun delete(
            params: GeminiDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GeminiDeleteResponse>

        /**
         * Returns a raw HTTP response for `patch /gemini/{endpoint}`, but is otherwise the same as
         * [GeminiServiceAsync.patch].
         */
        @MustBeClosed
        suspend fun patch(
            params: GeminiPatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GeminiPatchResponse>
    }
}
