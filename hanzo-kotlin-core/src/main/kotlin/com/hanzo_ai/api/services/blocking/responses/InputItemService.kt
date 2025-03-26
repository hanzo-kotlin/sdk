// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.blocking.responses

import com.google.errorprone.annotations.MustBeClosed
import com.hanzo_ai.api.core.RequestOptions
import com.hanzo_ai.api.core.http.HttpResponseFor
import com.hanzo_ai.api.models.responses.inputitems.InputItemListParams
import com.hanzo_ai.api.models.responses.inputitems.InputItemListResponse

interface InputItemService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Get input items for a response.
     *
     * Follows the OpenAI Responses API spec:
     * https://platform.openai.com/docs/api-reference/responses/input-items
     *
     * ```bash
     * curl -X GET http://localhost:4000/v1/responses/resp_abc123/input_items     -H "Authorization: Bearer sk-1234"
     * ```
     */
    fun list(
        params: InputItemListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InputItemListResponse

    /** A view of [InputItemService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /v1/responses/{response_id}/input_items`, but is
         * otherwise the same as [InputItemService.list].
         */
        @MustBeClosed
        fun list(
            params: InputItemListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InputItemListResponse>
    }
}
