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
import com.hanzo_ai.api.models.delete.DeleteCreateAllowedIpParams
import com.hanzo_ai.api.models.delete.DeleteCreateAllowedIpResponse

class DeleteServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    DeleteService {

    private val withRawResponse: DeleteService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DeleteService.WithRawResponse = withRawResponse

    override fun createAllowedIp(
        params: DeleteCreateAllowedIpParams,
        requestOptions: RequestOptions,
    ): DeleteCreateAllowedIpResponse =
        // post /delete/allowed_ip
        withRawResponse().createAllowedIp(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DeleteService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createAllowedIpHandler: Handler<DeleteCreateAllowedIpResponse> =
            jsonHandler<DeleteCreateAllowedIpResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun createAllowedIp(
            params: DeleteCreateAllowedIpParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DeleteCreateAllowedIpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("delete", "allowed_ip")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { createAllowedIpHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
