// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking.finetuning.jobs

import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.finetuning.jobs.cancel.CancelCreateParams
import ai.hanzo.api.models.finetuning.jobs.cancel.CancelCreateResponse
import com.google.errorprone.annotations.MustBeClosed

interface CancelService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Cancel a fine-tuning job.
     *
     * This is the equivalent of POST
     * https://api.openai.com/v1/fine_tuning/jobs/{fine_tuning_job_id}/cancel
     *
     * Supported Query Params:
     * - `custom_llm_provider`: Name of the LLM provider
     * - `fine_tuning_job_id`: The ID of the fine-tuning job to cancel.
     */
    fun create(
        params: CancelCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CancelCreateResponse

    /** A view of [CancelService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /v1/fine_tuning/jobs/{fine_tuning_job_id}/cancel`,
         * but is otherwise the same as [CancelService.create].
         */
        @MustBeClosed
        fun create(
            params: CancelCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CancelCreateResponse>
    }
}
