// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.core.ClientOptions
import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.handlers.errorBodyHandler
import ai.hanzo.api.core.handlers.errorHandler
import ai.hanzo.api.core.handlers.jsonHandler
import ai.hanzo.api.core.http.HttpMethod
import ai.hanzo.api.core.http.HttpRequest
import ai.hanzo.api.core.http.HttpResponse
import ai.hanzo.api.core.http.HttpResponse.Handler
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.core.http.json
import ai.hanzo.api.core.http.parseable
import ai.hanzo.api.core.prepareAsync
import ai.hanzo.api.models.spend.SpendCalculateSpendParams
import ai.hanzo.api.models.spend.SpendCalculateSpendResponse
import ai.hanzo.api.models.spend.SpendListLogsParams
import ai.hanzo.api.models.spend.SpendListLogsResponse
import ai.hanzo.api.models.spend.SpendListTagsParams
import ai.hanzo.api.models.spend.SpendListTagsResponse

class SpendServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    SpendServiceAsync {

    private val withRawResponse: SpendServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SpendServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): SpendServiceAsync =
        SpendServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun calculateSpend(
        params: SpendCalculateSpendParams,
        requestOptions: RequestOptions,
    ): SpendCalculateSpendResponse =
        // post /spend/calculate
        withRawResponse().calculateSpend(params, requestOptions).parse()

    override suspend fun listLogs(
        params: SpendListLogsParams,
        requestOptions: RequestOptions,
    ): List<SpendListLogsResponse> =
        // get /spend/logs
        withRawResponse().listLogs(params, requestOptions).parse()

    override suspend fun listTags(
        params: SpendListTagsParams,
        requestOptions: RequestOptions,
    ): List<SpendListTagsResponse> =
        // get /spend/tags
        withRawResponse().listTags(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SpendServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): SpendServiceAsync.WithRawResponse =
            SpendServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val calculateSpendHandler: Handler<SpendCalculateSpendResponse> =
            jsonHandler<SpendCalculateSpendResponse>(clientOptions.jsonMapper)

        override suspend fun calculateSpend(
            params: SpendCalculateSpendParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SpendCalculateSpendResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("spend", "calculate")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
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

        override suspend fun listLogs(
            params: SpendListLogsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<SpendListLogsResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("spend", "logs")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
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

        override suspend fun listTags(
            params: SpendListTagsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<SpendListTagsResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("spend", "tags")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
