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
import ai.hanzo.api.models.budget.BudgetCreateParams
import ai.hanzo.api.models.budget.BudgetCreateResponse
import ai.hanzo.api.models.budget.BudgetDeleteParams
import ai.hanzo.api.models.budget.BudgetDeleteResponse
import ai.hanzo.api.models.budget.BudgetInfoParams
import ai.hanzo.api.models.budget.BudgetInfoResponse
import ai.hanzo.api.models.budget.BudgetListParams
import ai.hanzo.api.models.budget.BudgetListResponse
import ai.hanzo.api.models.budget.BudgetSettingsParams
import ai.hanzo.api.models.budget.BudgetSettingsResponse
import ai.hanzo.api.models.budget.BudgetUpdateParams
import ai.hanzo.api.models.budget.BudgetUpdateResponse

class BudgetServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    BudgetServiceAsync {

    private val withRawResponse: BudgetServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BudgetServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): BudgetServiceAsync =
        BudgetServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun create(
        params: BudgetCreateParams,
        requestOptions: RequestOptions,
    ): BudgetCreateResponse =
        // post /budget/new
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun update(
        params: BudgetUpdateParams,
        requestOptions: RequestOptions,
    ): BudgetUpdateResponse =
        // post /budget/update
        withRawResponse().update(params, requestOptions).parse()

    override suspend fun list(
        params: BudgetListParams,
        requestOptions: RequestOptions,
    ): BudgetListResponse =
        // get /budget/list
        withRawResponse().list(params, requestOptions).parse()

    override suspend fun delete(
        params: BudgetDeleteParams,
        requestOptions: RequestOptions,
    ): BudgetDeleteResponse =
        // post /budget/delete
        withRawResponse().delete(params, requestOptions).parse()

    override suspend fun info(
        params: BudgetInfoParams,
        requestOptions: RequestOptions,
    ): BudgetInfoResponse =
        // post /budget/info
        withRawResponse().info(params, requestOptions).parse()

    override suspend fun settings(
        params: BudgetSettingsParams,
        requestOptions: RequestOptions,
    ): BudgetSettingsResponse =
        // get /budget/settings
        withRawResponse().settings(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BudgetServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): BudgetServiceAsync.WithRawResponse =
            BudgetServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val createHandler: Handler<BudgetCreateResponse> =
            jsonHandler<BudgetCreateResponse>(clientOptions.jsonMapper)

        override suspend fun create(
            params: BudgetCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BudgetCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("budget", "new")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateHandler: Handler<BudgetUpdateResponse> =
            jsonHandler<BudgetUpdateResponse>(clientOptions.jsonMapper)

        override suspend fun update(
            params: BudgetUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BudgetUpdateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("budget", "update")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<BudgetListResponse> =
            jsonHandler<BudgetListResponse>(clientOptions.jsonMapper)

        override suspend fun list(
            params: BudgetListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BudgetListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("budget", "list")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val deleteHandler: Handler<BudgetDeleteResponse> =
            jsonHandler<BudgetDeleteResponse>(clientOptions.jsonMapper)

        override suspend fun delete(
            params: BudgetDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BudgetDeleteResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("budget", "delete")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { deleteHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val infoHandler: Handler<BudgetInfoResponse> =
            jsonHandler<BudgetInfoResponse>(clientOptions.jsonMapper)

        override suspend fun info(
            params: BudgetInfoParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BudgetInfoResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("budget", "info")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { infoHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val settingsHandler: Handler<BudgetSettingsResponse> =
            jsonHandler<BudgetSettingsResponse>(clientOptions.jsonMapper)

        override suspend fun settings(
            params: BudgetSettingsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BudgetSettingsResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("budget", "settings")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { settingsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
