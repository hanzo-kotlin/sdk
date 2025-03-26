// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.blocking

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
import com.hanzo_ai.api.models.spend.SpendCalculateSpendParams
import com.hanzo_ai.api.models.spend.SpendCalculateSpendResponse
import com.hanzo_ai.api.models.spend.SpendListLogsParams
import com.hanzo_ai.api.models.spend.SpendListLogsResponse
import com.hanzo_ai.api.models.spend.SpendListTagsParams
import com.hanzo_ai.api.models.spend.SpendListTagsResponse

class SpendServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SpendService {

    private val withRawResponse: SpendService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SpendService.WithRawResponse = withRawResponse

    override fun calculateSpend(
        params: SpendCalculateSpendParams,
        requestOptions: RequestOptions,
    ): SpendCalculateSpendResponse =
        // post /spend/calculate
        withRawResponse().calculateSpend(params, requestOptions).parse()

    override fun listLogs(
        params: SpendListLogsParams,
        requestOptions: RequestOptions,
    ): List<SpendListLogsResponse> =
        // get /spend/logs
        withRawResponse().listLogs(params, requestOptions).parse()

    override fun listTags(
        params: SpendListTagsParams,
        requestOptions: RequestOptions,
    ): List<SpendListTagsResponse> =
        // get /spend/tags
        withRawResponse().listTags(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SpendService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val calculateSpendHandler: Handler<SpendCalculateSpendResponse> =
            jsonHandler<SpendCalculateSpendResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun calculateSpend(
            params: SpendCalculateSpendParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SpendCalculateSpendResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("spend", "calculate")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { calculateSpendHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listLogsHandler: Handler<List<SpendListLogsResponse>> =
            jsonHandler<List<SpendListLogsResponse>>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun listLogs(
            params: SpendListLogsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<SpendListLogsResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("spend", "logs")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { listLogsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }

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
                    .addPathSegments("spend", "tags")
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
    }
}
