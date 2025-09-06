// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async.global

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
import ai.hanzo.api.models.global.spend.SpendListTagsParams
import ai.hanzo.api.models.global.spend.SpendListTagsResponse
import ai.hanzo.api.models.global.spend.SpendResetParams
import ai.hanzo.api.models.global.spend.SpendResetResponse
import ai.hanzo.api.models.global.spend.SpendRetrieveReportParams
import ai.hanzo.api.models.global.spend.SpendRetrieveReportResponse

class SpendServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    SpendServiceAsync {

    private val withRawResponse: SpendServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SpendServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): SpendServiceAsync =
        SpendServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun listTags(
        params: SpendListTagsParams,
        requestOptions: RequestOptions,
    ): List<SpendListTagsResponse> =
        // get /global/spend/tags
        withRawResponse().listTags(params, requestOptions).parse()

    override suspend fun reset(
        params: SpendResetParams,
        requestOptions: RequestOptions,
    ): SpendResetResponse =
        // post /global/spend/reset
        withRawResponse().reset(params, requestOptions).parse()

    override suspend fun retrieveReport(
        params: SpendRetrieveReportParams,
        requestOptions: RequestOptions,
    ): List<SpendRetrieveReportResponse> =
        // get /global/spend/report
        withRawResponse().retrieveReport(params, requestOptions).parse()

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
                    .addPathSegments("global", "spend", "tags")
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

        private val resetHandler: Handler<SpendResetResponse> =
            jsonHandler<SpendResetResponse>(clientOptions.jsonMapper)

        override suspend fun reset(
            params: SpendResetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SpendResetResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("global", "spend", "reset")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
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

        override suspend fun retrieveReport(
            params: SpendRetrieveReportParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<SpendRetrieveReportResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("global", "spend", "report")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
