// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.core.ClientOptions
import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.handlers.errorBodyHandler
import ai.hanzo.api.core.handlers.errorHandler
import ai.hanzo.api.core.handlers.jsonHandler
import ai.hanzo.api.core.http.HttpMethod
import ai.hanzo.api.core.http.HttpRequest
import ai.hanzo.api.core.http.HttpResponse
import ai.hanzo.api.core.http.HttpResponse.Handler
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.core.http.json
import ai.hanzo.api.core.http.parseable
import ai.hanzo.api.core.prepareAsync
import ai.hanzo.api.models.delete.DeleteCreateAllowedIpParams
import ai.hanzo.api.models.delete.DeleteCreateAllowedIpResponse

class DeleteServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    DeleteServiceAsync {

    private val withRawResponse: DeleteServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DeleteServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): DeleteServiceAsync =
        DeleteServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun createAllowedIp(
        params: DeleteCreateAllowedIpParams,
        requestOptions: RequestOptions,
    ): DeleteCreateAllowedIpResponse =
        // post /delete/allowed_ip
        withRawResponse().createAllowedIp(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DeleteServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): DeleteServiceAsync.WithRawResponse =
            DeleteServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val createAllowedIpHandler: Handler<DeleteCreateAllowedIpResponse> =
            jsonHandler<DeleteCreateAllowedIpResponse>(clientOptions.jsonMapper)

        override suspend fun createAllowedIp(
            params: DeleteCreateAllowedIpParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DeleteCreateAllowedIpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("delete", "allowed_ip")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
