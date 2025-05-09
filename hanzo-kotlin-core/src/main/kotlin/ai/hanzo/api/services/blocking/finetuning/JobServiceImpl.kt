// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking.finetuning

import ai.hanzo.api.core.ClientOptions
import ai.hanzo.api.core.JsonValue
import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.checkRequired
import ai.hanzo.api.core.handlers.errorHandler
import ai.hanzo.api.core.handlers.jsonHandler
import ai.hanzo.api.core.handlers.withErrorHandler
import ai.hanzo.api.core.http.HttpMethod
import ai.hanzo.api.core.http.HttpRequest
import ai.hanzo.api.core.http.HttpResponse.Handler
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.core.http.json
import ai.hanzo.api.core.http.parseable
import ai.hanzo.api.core.prepare
import ai.hanzo.api.models.finetuning.jobs.JobCreateParams
import ai.hanzo.api.models.finetuning.jobs.JobCreateResponse
import ai.hanzo.api.models.finetuning.jobs.JobListParams
import ai.hanzo.api.models.finetuning.jobs.JobListResponse
import ai.hanzo.api.models.finetuning.jobs.JobRetrieveParams
import ai.hanzo.api.models.finetuning.jobs.JobRetrieveResponse
import ai.hanzo.api.services.blocking.finetuning.jobs.CancelService
import ai.hanzo.api.services.blocking.finetuning.jobs.CancelServiceImpl

class JobServiceImpl internal constructor(private val clientOptions: ClientOptions) : JobService {

    private val withRawResponse: JobService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val cancel: CancelService by lazy { CancelServiceImpl(clientOptions) }

    override fun withRawResponse(): JobService.WithRawResponse = withRawResponse

    override fun cancel(): CancelService = cancel

    override fun create(
        params: JobCreateParams,
        requestOptions: RequestOptions,
    ): JobCreateResponse =
        // post /v1/fine_tuning/jobs
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: JobRetrieveParams,
        requestOptions: RequestOptions,
    ): JobRetrieveResponse =
        // get /v1/fine_tuning/jobs/{fine_tuning_job_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(params: JobListParams, requestOptions: RequestOptions): JobListResponse =
        // get /v1/fine_tuning/jobs
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        JobService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val cancel: CancelService.WithRawResponse by lazy {
            CancelServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun cancel(): CancelService.WithRawResponse = cancel

        private val createHandler: Handler<JobCreateResponse> =
            jsonHandler<JobCreateResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: JobCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<JobCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "fine_tuning", "jobs")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<JobRetrieveResponse> =
            jsonHandler<JobRetrieveResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: JobRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<JobRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("fineTuningJobId", params.fineTuningJobId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "fine_tuning", "jobs", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<JobListResponse> =
            jsonHandler<JobListResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun list(
            params: JobListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<JobListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "fine_tuning", "jobs")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
