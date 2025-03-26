// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.blocking.files

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
import com.hanzo_ai.api.models.files.content.ContentRetrieveParams
import com.hanzo_ai.api.models.files.content.ContentRetrieveResponse

class ContentServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ContentService {

    private val withRawResponse: ContentService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ContentService.WithRawResponse = withRawResponse

    override fun retrieve(
        params: ContentRetrieveParams,
        requestOptions: RequestOptions,
    ): ContentRetrieveResponse =
        // get /{provider}/v1/files/{file_id}/content
        withRawResponse().retrieve(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ContentService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val retrieveHandler: Handler<ContentRetrieveResponse> =
            jsonHandler<ContentRetrieveResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
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
    }
}
