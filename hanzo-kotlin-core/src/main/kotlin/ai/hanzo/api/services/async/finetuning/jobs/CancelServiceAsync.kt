// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async.finetuning.jobs

import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.finetuning.jobs.cancel.CancelCreateParams
import ai.hanzo.api.models.finetuning.jobs.cancel.CancelCreateResponse
import com.google.errorprone.annotations.MustBeClosed

interface CancelServiceAsync {

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
    suspend fun create(
        fineTuningJobId: String,
        params: CancelCreateParams = CancelCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CancelCreateResponse =
        create(params.toBuilder().fineTuningJobId(fineTuningJobId).build(), requestOptions)

    /** @see [create] */
    suspend fun create(
        params: CancelCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CancelCreateResponse

    /** @see [create] */
    suspend fun create(
        fineTuningJobId: String,
        requestOptions: RequestOptions,
    ): CancelCreateResponse = create(fineTuningJobId, CancelCreateParams.none(), requestOptions)

    /**
     * A view of [CancelServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /v1/fine_tuning/jobs/{fine_tuning_job_id}/cancel`,
         * but is otherwise the same as [CancelServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            fineTuningJobId: String,
            params: CancelCreateParams = CancelCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CancelCreateResponse> =
            create(params.toBuilder().fineTuningJobId(fineTuningJobId).build(), requestOptions)

        /** @see [create] */
        @MustBeClosed
        suspend fun create(
            params: CancelCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CancelCreateResponse>

        /** @see [create] */
        @MustBeClosed
        suspend fun create(
            fineTuningJobId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CancelCreateResponse> =
            create(fineTuningJobId, CancelCreateParams.none(), requestOptions)
    }
}
