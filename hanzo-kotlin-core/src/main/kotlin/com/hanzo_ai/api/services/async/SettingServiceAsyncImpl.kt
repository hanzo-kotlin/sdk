// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.async

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
import com.hanzo_ai.api.core.prepareAsync
import com.hanzo_ai.api.models.settings.SettingRetrieveParams
import com.hanzo_ai.api.models.settings.SettingRetrieveResponse

class SettingServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    SettingServiceAsync {

    private val withRawResponse: SettingServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SettingServiceAsync.WithRawResponse = withRawResponse

    override suspend fun retrieve(
        params: SettingRetrieveParams,
        requestOptions: RequestOptions,
    ): SettingRetrieveResponse =
        // get /settings
        withRawResponse().retrieve(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SettingServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val retrieveHandler: Handler<SettingRetrieveResponse> =
            jsonHandler<SettingRetrieveResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun retrieve(
            params: SettingRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SettingRetrieveResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("settings")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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
    }
}
