// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking.model

import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.model.info.InfoListParams
import ai.hanzo.api.models.model.info.InfoListResponse
import com.google.errorprone.annotations.MustBeClosed

interface InfoService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Provides more info about each model in /models, including config.yaml descriptions (except
     * api key and api base)
     *
     * Parameters: llm_model_id: Optional[str] = None (this is the value of `x-llm-model-id`
     * returned in response headers)
     *
     *     - When llm_model_id is passed, it will return the info for that specific model
     *     - When llm_model_id is not passed, it will return the info for all models
     *
     * Returns: Returns a dictionary containing information about each model.
     *
     * Example Response:
     * ```json
     * {
     *   "data": [
     *     {
     *       "model_name": "fake-openai-endpoint",
     *       "llm_params": {
     *         "api_base": "https://exampleopenaiendpoint-production.up.railway.app/",
     *         "model": "openai/fake"
     *       },
     *       "model_info": {
     *         "id": "112f74fab24a7a5245d2ced3536dd8f5f9192c57ee6e332af0f0512e08bed5af",
     *         "db_model": false
     *       }
     *     }
     *   ]
     * }
     * ```
     */
    fun list(
        params: InfoListParams = InfoListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InfoListResponse

    /** @see [list] */
    fun list(requestOptions: RequestOptions): InfoListResponse =
        list(InfoListParams.none(), requestOptions)

    /** A view of [InfoService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /model/info`, but is otherwise the same as
         * [InfoService.list].
         */
        @MustBeClosed
        fun list(
            params: InfoListParams = InfoListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InfoListResponse>

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<InfoListResponse> =
            list(InfoListParams.none(), requestOptions)
    }
}
