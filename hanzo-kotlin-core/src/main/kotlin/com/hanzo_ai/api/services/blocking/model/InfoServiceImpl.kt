// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.blocking.model

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
import com.hanzo_ai.api.models.model.info.InfoListParams
import com.hanzo_ai.api.models.model.info.InfoListResponse

class InfoServiceImpl internal constructor(private val clientOptions: ClientOptions) : InfoService {

    private val withRawResponse: InfoService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): InfoService.WithRawResponse = withRawResponse

    override fun list(params: InfoListParams, requestOptions: RequestOptions): InfoListResponse =
        // get /model/info
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        InfoService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val listHandler: Handler<InfoListResponse> =
            jsonHandler<InfoListResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun list(
            params: InfoListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InfoListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("model", "info")
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
