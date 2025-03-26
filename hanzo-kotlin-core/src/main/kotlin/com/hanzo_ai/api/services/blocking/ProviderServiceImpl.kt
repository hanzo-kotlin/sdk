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
import com.hanzo_ai.api.core.http.parseable
import com.hanzo_ai.api.core.prepare
import com.hanzo_ai.api.models.provider.ProviderListBudgetsParams
import com.hanzo_ai.api.models.provider.ProviderListBudgetsResponse

class ProviderServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ProviderService {

    private val withRawResponse: ProviderService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ProviderService.WithRawResponse = withRawResponse

    override fun listBudgets(
        params: ProviderListBudgetsParams,
        requestOptions: RequestOptions,
    ): ProviderListBudgetsResponse =
        // get /provider/budgets
        withRawResponse().listBudgets(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ProviderService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val listBudgetsHandler: Handler<ProviderListBudgetsResponse> =
            jsonHandler<ProviderListBudgetsResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun listBudgets(
            params: ProviderListBudgetsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ProviderListBudgetsResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("provider", "budgets")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { listBudgetsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
