// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.async.finetuning

import com.hanzo_ai.api.core.ClientOptions
import com.hanzo_ai.api.core.JsonValue
import com.hanzo_ai.api.core.RequestOptions
import com.hanzo_ai.api.core.handlers.errorHandler
import com.hanzo_ai.api.core.handlers.jsonHandler
import com.hanzo_ai.api.core.handlers.withErrorHandler
import com.hanzo_ai.api.core.http.HttpMethod
import com.hanzo_ai.api.core.http.HttpRequest
import com.hanzo_ai.api.core.http.HttpResponse.Handler
import com.hanzo_ai.api.core.http.HttpResponseFor
import com.hanzo_ai.api.core.http.json
import com.hanzo_ai.api.core.http.parseable
import com.hanzo_ai.api.core.prepareAsync
import com.hanzo_ai.api.models.finetuning.jobs.JobCreateParams
import com.hanzo_ai.api.models.finetuning.jobs.JobCreateResponse
import com.hanzo_ai.api.models.finetuning.jobs.JobListParams
import com.hanzo_ai.api.models.finetuning.jobs.JobListResponse
import com.hanzo_ai.api.models.finetuning.jobs.JobRetrieveParams
import com.hanzo_ai.api.models.finetuning.jobs.JobRetrieveResponse
import com.hanzo_ai.api.services.async.finetuning.jobs.CancelServiceAsync
import com.hanzo_ai.api.services.async.finetuning.jobs.CancelServiceAsyncImpl

class JobServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    JobServiceAsync {

    private val withRawResponse: JobServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val cancel: CancelServiceAsync by lazy { CancelServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): JobServiceAsync.WithRawResponse = withRawResponse

    override fun cancel(): CancelServiceAsync = cancel

    override suspend fun create(
        params: JobCreateParams,
        requestOptions: RequestOptions,
    ): JobCreateResponse =
        // post /v1/fine_tuning/jobs
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun retrieve(
        params: JobRetrieveParams,
        requestOptions: RequestOptions,
    ): JobRetrieveResponse =
        // get /v1/fine_tuning/jobs/{fine_tuning_job_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun list(
        params: JobListParams,
        requestOptions: RequestOptions,
    ): JobListResponse =
        // get /v1/fine_tuning/jobs
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        JobServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val cancel: CancelServiceAsync.WithRawResponse by lazy {
            CancelServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun cancel(): CancelServiceAsync.WithRawResponse = cancel

        private val createHandler: Handler<JobCreateResponse> =
            jsonHandler<JobCreateResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun create(
            params: JobCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<JobCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "fine_tuning", "jobs")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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

        override suspend fun retrieve(
            params: JobRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<JobRetrieveResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "fine_tuning", "jobs", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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

        override suspend fun list(
            params: JobListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<JobListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "fine_tuning", "jobs")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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
