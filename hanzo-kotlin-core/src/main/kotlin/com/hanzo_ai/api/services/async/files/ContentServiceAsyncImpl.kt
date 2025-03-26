// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.async.files

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
import com.hanzo_ai.api.models.files.content.ContentRetrieveParams
import com.hanzo_ai.api.models.files.content.ContentRetrieveResponse

class ContentServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ContentServiceAsync {

    private val withRawResponse: ContentServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ContentServiceAsync.WithRawResponse = withRawResponse

    override suspend fun retrieve(
        params: ContentRetrieveParams,
        requestOptions: RequestOptions,
    ): ContentRetrieveResponse =
        // get /{provider}/v1/files/{file_id}/content
        withRawResponse().retrieve(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ContentServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val retrieveHandler: Handler<ContentRetrieveResponse> =
            jsonHandler<ContentRetrieveResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun retrieve(
            params: ContentRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ContentRetrieveResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        params._pathParam(0),
                        "v1",
                        "files",
                        params._pathParam(1),
                        "content",
                    )
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
