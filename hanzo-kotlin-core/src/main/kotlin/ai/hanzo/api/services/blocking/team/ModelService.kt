// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking.team

import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.team.model.ModelAddParams
import ai.hanzo.api.models.team.model.ModelAddResponse
import ai.hanzo.api.models.team.model.ModelRemoveParams
import ai.hanzo.api.models.team.model.ModelRemoveResponse
import com.google.errorprone.annotations.MustBeClosed

interface ModelService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Add models to a team's allowed model list. Only proxy admin or team admin can add models.
     *
     * Parameters:
     * - team_id: str - Required. The team to add models to
     * - models: List[str] - Required. List of models to add to the team
     *
     * Example Request:
     * ```
     * curl --location 'http://0.0.0.0:4000/team/model/add'     --header 'Authorization: Bearer sk-1234'     --header 'Content-Type: application/json'     --data '{
     *     "team_id": "team-1234",
     *     "models": ["gpt-4", "claude-2"]
     * }'
     * ```
     */
    fun add(
        params: ModelAddParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ModelAddResponse

    /**
     * Remove models from a team's allowed model list. Only proxy admin or team admin can remove
     * models.
     *
     * Parameters:
     * - team_id: str - Required. The team to remove models from
     * - models: List[str] - Required. List of models to remove from the team
     *
     * Example Request:
     * ```
     * curl --location 'http://0.0.0.0:4000/team/model/delete'     --header 'Authorization: Bearer sk-1234'     --header 'Content-Type: application/json'     --data '{
     *     "team_id": "team-1234",
     *     "models": ["gpt-4"]
     * }'
     * ```
     */
    fun remove(
        params: ModelRemoveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ModelRemoveResponse

    /** A view of [ModelService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /team/model/add`, but is otherwise the same as
         * [ModelService.add].
         */
        @MustBeClosed
        fun add(
            params: ModelAddParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ModelAddResponse>

        /**
         * Returns a raw HTTP response for `post /team/model/delete`, but is otherwise the same as
         * [ModelService.remove].
         */
        @MustBeClosed
        fun remove(
            params: ModelRemoveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ModelRemoveResponse>
    }
}
