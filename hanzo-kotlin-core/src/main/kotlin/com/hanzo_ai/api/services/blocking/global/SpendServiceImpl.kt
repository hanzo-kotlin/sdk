// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.blocking.global

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
import com.hanzo_ai.api.core.prepare
import com.hanzo_ai.api.models.global.spend.SpendListTagsParams
import com.hanzo_ai.api.models.global.spend.SpendListTagsResponse
import com.hanzo_ai.api.models.global.spend.SpendResetParams
import com.hanzo_ai.api.models.global.spend.SpendResetResponse
import com.hanzo_ai.api.models.global.spend.SpendRetrieveReportParams
import com.hanzo_ai.api.models.global.spend.SpendRetrieveReportResponse

class SpendServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SpendService {

    private val withRawResponse: SpendService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SpendService.WithRawResponse = withRawResponse

    override fun listTags(
        params: SpendListTagsParams,
        requestOptions: RequestOptions,
    ): List<SpendListTagsResponse> =
        // get /global/spend/tags
        withRawResponse().listTags(params, requestOptions).parse()

    override fun reset(
        params: SpendResetParams,
        requestOptions: RequestOptions,
    ): SpendResetResponse =
        // post /global/spend/reset
        withRawResponse().reset(params, requestOptions).parse()

    override fun retrieveReport(
        params: SpendRetrieveReportParams,
        requestOptions: RequestOptions,
    ): List<SpendRetrieveReportResponse> =
        // get /global/spend/report
        withRawResponse().retrieveReport(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SpendService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val listTagsHandler: Handler<List<SpendListTagsResponse>> =
            jsonHandler<List<SpendListTagsResponse>>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun listTags(
            params: SpendListTagsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<SpendListTagsResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("global", "spend", "tags")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { listTagsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }

        private val resetHandler: Handler<SpendResetResponse> =
            jsonHandler<SpendResetResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun reset(
            params: SpendResetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SpendResetResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("global", "spend", "reset")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { resetHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveReportHandler: Handler<List<SpendRetrieveReportResponse>> =
            jsonHandler<List<SpendRetrieveReportResponse>>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieveReport(
            params: SpendRetrieveReportParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<SpendRetrieveReportResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("global", "spend", "report")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { retrieveReportHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }
    }
}
