// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking.finetuning.jobs

import ai.hanzo.api.core.ClientOptions
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
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CancelService

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
        fineTuningJobId: String,
        params: CancelCreateParams = CancelCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CancelCreateResponse =
        create(params.toBuilder().fineTuningJobId(fineTuningJobId).build(), requestOptions)

    /** @see create */
    fun create(
        params: CancelCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CancelCreateResponse

    /** @see create */
    fun create(fineTuningJobId: String, requestOptions: RequestOptions): CancelCreateResponse =
        create(fineTuningJobId, CancelCreateParams.none(), requestOptions)

    /** A view of [CancelService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CancelService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/fine_tuning/jobs/{fine_tuning_job_id}/cancel`,
         * but is otherwise the same as [CancelService.create].
         */
        @MustBeClosed
        fun create(
            fineTuningJobId: String,
            params: CancelCreateParams = CancelCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CancelCreateResponse> =
            create(params.toBuilder().fineTuningJobId(fineTuningJobId).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(
            params: CancelCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CancelCreateResponse>

        /** @see create */
        @MustBeClosed
        fun create(
            fineTuningJobId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CancelCreateResponse> =
            create(fineTuningJobId, CancelCreateParams.none(), requestOptions)
    }
}
