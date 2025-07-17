// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking.finetuning

import ai.hanzo.api.core.ClientOptions
import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.finetuning.jobs.JobCreateParams
import ai.hanzo.api.models.finetuning.jobs.JobCreateResponse
import ai.hanzo.api.models.finetuning.jobs.JobListParams
import ai.hanzo.api.models.finetuning.jobs.JobListResponse
import ai.hanzo.api.models.finetuning.jobs.JobRetrieveParams
import ai.hanzo.api.models.finetuning.jobs.JobRetrieveResponse
import ai.hanzo.api.services.blocking.finetuning.jobs.CancelService
import com.google.errorprone.annotations.MustBeClosed

interface JobService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): JobService

    fun cancel(): CancelService

    /**
     * Creates a fine-tuning job which begins the process of creating a new model from a given
     * dataset. This is the equivalent of POST https://api.openai.com/v1/fine_tuning/jobs
     *
     * Supports Identical Params as:
     * https://platform.openai.com/docs/api-reference/fine-tuning/create
     *
     * Example Curl:
     * ```
     * curl http://localhost:4000/v1/fine_tuning/jobs       -H "Content-Type: application/json"       -H "Authorization: Bearer sk-1234"       -d '{
     *     "model": "gpt-3.5-turbo",
     *     "training_file": "file-abc123",
     *     "hyperparameters": {
     *       "n_epochs": 4
     *     }
     *   }'
     * ```
     */
    fun create(
        params: JobCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): JobCreateResponse

    /**
     * Retrieves a fine-tuning job. This is the equivalent of GET
     * https://api.openai.com/v1/fine_tuning/jobs/{fine_tuning_job_id}
     *
     * Supported Query Params:
     * - `custom_llm_provider`: Name of the LLM provider
     * - `fine_tuning_job_id`: The ID of the fine-tuning job to retrieve.
     */
    fun retrieve(
        fineTuningJobId: String,
        params: JobRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): JobRetrieveResponse =
        retrieve(params.toBuilder().fineTuningJobId(fineTuningJobId).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        params: JobRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): JobRetrieveResponse

    /**
     * Lists fine-tuning jobs for the organization. This is the equivalent of GET
     * https://api.openai.com/v1/fine_tuning/jobs
     *
     * Supported Query Params:
     * - `custom_llm_provider`: Name of the LLM provider
     * - `after`: Identifier for the last job from the previous pagination request.
     * - `limit`: Number of fine-tuning jobs to retrieve (default is 20).
     */
    fun list(
        params: JobListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): JobListResponse

    /** A view of [JobService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): JobService.WithRawResponse

        fun cancel(): CancelService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/fine_tuning/jobs`, but is otherwise the same as
         * [JobService.create].
         */
        @MustBeClosed
        fun create(
            params: JobCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<JobCreateResponse>

        /**
         * Returns a raw HTTP response for `get /v1/fine_tuning/jobs/{fine_tuning_job_id}`, but is
         * otherwise the same as [JobService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            fineTuningJobId: String,
            params: JobRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<JobRetrieveResponse> =
            retrieve(params.toBuilder().fineTuningJobId(fineTuningJobId).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: JobRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<JobRetrieveResponse>

        /**
         * Returns a raw HTTP response for `get /v1/fine_tuning/jobs`, but is otherwise the same as
         * [JobService.list].
         */
        @MustBeClosed
        fun list(
            params: JobListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<JobListResponse>
    }
}
