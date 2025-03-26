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
import com.hanzo_ai.api.core.http.json
import com.hanzo_ai.api.core.http.parseable
import com.hanzo_ai.api.core.prepareAsync
import com.hanzo_ai.api.models.azure.AzureCallParams
import com.hanzo_ai.api.models.azure.AzureCallResponse
import com.hanzo_ai.api.models.azure.AzureCreateParams
import com.hanzo_ai.api.models.azure.AzureCreateResponse
import com.hanzo_ai.api.models.azure.AzureDeleteParams
import com.hanzo_ai.api.models.azure.AzureDeleteResponse
import com.hanzo_ai.api.models.azure.AzurePatchParams
import com.hanzo_ai.api.models.azure.AzurePatchResponse
import com.hanzo_ai.api.models.azure.AzureUpdateParams
import com.hanzo_ai.api.models.azure.AzureUpdateResponse

class AzureServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AzureServiceAsync {

    private val withRawResponse: AzureServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AzureServiceAsync.WithRawResponse = withRawResponse

    override suspend fun create(
        params: AzureCreateParams,
        requestOptions: RequestOptions,
    ): AzureCreateResponse =
        // post /azure/{endpoint}
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun update(
        params: AzureUpdateParams,
        requestOptions: RequestOptions,
    ): AzureUpdateResponse =
        // put /azure/{endpoint}
        withRawResponse().update(params, requestOptions).parse()

    override suspend fun delete(
        params: AzureDeleteParams,
        requestOptions: RequestOptions,
    ): AzureDeleteResponse =
        // delete /azure/{endpoint}
        withRawResponse().delete(params, requestOptions).parse()

    override suspend fun call(
        params: AzureCallParams,
        requestOptions: RequestOptions,
    ): AzureCallResponse =
        // get /azure/{endpoint}
        withRawResponse().call(params, requestOptions).parse()

    override suspend fun patch(
        params: AzurePatchParams,
        requestOptions: RequestOptions,
    ): AzurePatchResponse =
        // patch /azure/{endpoint}
        withRawResponse().patch(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AzureServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<AzureCreateResponse> =
            jsonHandler<AzureCreateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun create(
            params: AzureCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AzureCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("azure", params._pathParam(0))
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateHandler: Handler<AzureUpdateResponse> =
            jsonHandler<AzureUpdateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun update(
            params: AzureUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AzureUpdateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .addPathSegments("azure", params._pathParam(0))
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val deleteHandler: Handler<AzureDeleteResponse> =
            jsonHandler<AzureDeleteResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun delete(
            params: AzureDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AzureDeleteResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments("azure", params._pathParam(0))
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { deleteHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val callHandler: Handler<AzureCallResponse> =
            jsonHandler<AzureCallResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun call(
            params: AzureCallParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AzureCallResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("azure", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { callHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val patchHandler: Handler<AzurePatchResponse> =
            jsonHandler<AzurePatchResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun patch(
            params: AzurePatchParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AzurePatchResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .addPathSegments("azure", params._pathParam(0))
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { patchHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
