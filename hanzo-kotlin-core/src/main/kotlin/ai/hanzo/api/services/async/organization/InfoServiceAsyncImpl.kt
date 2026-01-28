// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async.organization

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
import ai.hanzo.api.models.organization.OrganizationTableWithMembers
import ai.hanzo.api.models.organization.info.InfoDeprecatedParams
import ai.hanzo.api.models.organization.info.InfoDeprecatedResponse
import ai.hanzo.api.models.organization.info.InfoRetrieveParams

class InfoServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    InfoServiceAsync {

    private val withRawResponse: InfoServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): InfoServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): InfoServiceAsync =
        InfoServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun retrieve(
        params: InfoRetrieveParams,
        requestOptions: RequestOptions,
    ): OrganizationTableWithMembers =
        // get /organization/info
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun deprecated(
        params: InfoDeprecatedParams,
        requestOptions: RequestOptions,
    ): InfoDeprecatedResponse =
        // post /organization/info
        withRawResponse().deprecated(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        InfoServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): InfoServiceAsync.WithRawResponse =
            InfoServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val retrieveHandler: Handler<OrganizationTableWithMembers> =
            jsonHandler<OrganizationTableWithMembers>(clientOptions.jsonMapper)

        override suspend fun retrieve(
            params: InfoRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OrganizationTableWithMembers> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("organization", "info")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
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

        override suspend fun deprecated(
            params: InfoDeprecatedParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InfoDeprecatedResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("organization", "info")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
