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
import com.hanzo_ai.api.core.http.multipartFormData
import com.hanzo_ai.api.core.http.parseable
import com.hanzo_ai.api.core.prepare
import com.hanzo_ai.api.models.files.FileCreateParams
import com.hanzo_ai.api.models.files.FileCreateResponse
import com.hanzo_ai.api.models.files.FileDeleteParams
import com.hanzo_ai.api.models.files.FileDeleteResponse
import com.hanzo_ai.api.models.files.FileListParams
import com.hanzo_ai.api.models.files.FileListResponse
import com.hanzo_ai.api.models.files.FileRetrieveParams
import com.hanzo_ai.api.models.files.FileRetrieveResponse
import com.hanzo_ai.api.services.blocking.files.ContentService
import com.hanzo_ai.api.services.blocking.files.ContentServiceImpl

class FileServiceImpl internal constructor(private val clientOptions: ClientOptions) : FileService {

    private val withRawResponse: FileService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val content: ContentService by lazy { ContentServiceImpl(clientOptions) }

    override fun withRawResponse(): FileService.WithRawResponse = withRawResponse

    override fun content(): ContentService = content

    override fun create(
        params: FileCreateParams,
        requestOptions: RequestOptions,
    ): FileCreateResponse =
        // post /{provider}/v1/files
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: FileRetrieveParams,
        requestOptions: RequestOptions,
    ): FileRetrieveResponse =
        // get /{provider}/v1/files/{file_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(params: FileListParams, requestOptions: RequestOptions): FileListResponse =
        // get /{provider}/v1/files
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: FileDeleteParams,
        requestOptions: RequestOptions,
    ): FileDeleteResponse =
        // delete /{provider}/v1/files/{file_id}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        FileService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val content: ContentService.WithRawResponse by lazy {
            ContentServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun content(): ContentService.WithRawResponse = content

        private val createHandler: Handler<FileCreateResponse> =
            jsonHandler<FileCreateResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: FileCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FileCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(params._pathParam(0), "v1", "files")
                    .body(multipartFormData(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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

        private val retrieveHandler: Handler<FileRetrieveResponse> =
            jsonHandler<FileRetrieveResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: FileRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FileRetrieveResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(params._pathParam(0), "v1", "files", params._pathParam(1))
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

        private val listHandler: Handler<FileListResponse> =
            jsonHandler<FileListResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun list(
            params: FileListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FileListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(params._pathParam(0), "v1", "files")
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

        private val deleteHandler: Handler<FileDeleteResponse> =
            jsonHandler<FileDeleteResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun delete(
            params: FileDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FileDeleteResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments(params._pathParam(0), "v1", "files", params._pathParam(1))
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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
    }
}
