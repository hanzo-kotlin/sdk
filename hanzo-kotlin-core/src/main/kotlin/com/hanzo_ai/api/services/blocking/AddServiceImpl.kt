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
import com.hanzo_ai.api.models.add.AddAddAllowedIpParams
import com.hanzo_ai.api.models.add.AddAddAllowedIpResponse

class AddServiceImpl internal constructor(private val clientOptions: ClientOptions) : AddService {

    private val withRawResponse: AddService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AddService.WithRawResponse = withRawResponse

    override fun addAllowedIp(
        params: AddAddAllowedIpParams,
        requestOptions: RequestOptions,
    ): AddAddAllowedIpResponse =
        // post /add/allowed_ip
        withRawResponse().addAllowedIp(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AddService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val addAllowedIpHandler: Handler<AddAddAllowedIpResponse> =
            jsonHandler<AddAddAllowedIpResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun addAllowedIp(
            params: AddAddAllowedIpParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AddAddAllowedIpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("add", "allowed_ip")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { addAllowedIpHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
