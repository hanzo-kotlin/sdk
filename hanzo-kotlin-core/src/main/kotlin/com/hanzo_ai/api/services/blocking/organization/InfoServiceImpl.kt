// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.blocking.organization

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
import com.hanzo_ai.api.models.organization.info.InfoDeprecatedParams
import com.hanzo_ai.api.models.organization.info.InfoDeprecatedResponse
import com.hanzo_ai.api.models.organization.info.InfoRetrieveParams
import com.hanzo_ai.api.models.organization.info.InfoRetrieveResponse

class InfoServiceImpl internal constructor(private val clientOptions: ClientOptions) : InfoService {

    private val withRawResponse: InfoService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): InfoService.WithRawResponse = withRawResponse

    override fun retrieve(
        params: InfoRetrieveParams,
        requestOptions: RequestOptions,
    ): InfoRetrieveResponse =
        // get /organization/info
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun deprecated(
        params: InfoDeprecatedParams,
        requestOptions: RequestOptions,
    ): InfoDeprecatedResponse =
        // post /organization/info
        withRawResponse().deprecated(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        InfoService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val retrieveHandler: Handler<InfoRetrieveResponse> =
            jsonHandler<InfoRetrieveResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: InfoRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InfoRetrieveResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("organization", "info")
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

        private val deprecatedHandler: Handler<InfoDeprecatedResponse> =
            jsonHandler<InfoDeprecatedResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun deprecated(
            params: InfoDeprecatedParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InfoDeprecatedResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("organization", "info")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { deprecatedHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
