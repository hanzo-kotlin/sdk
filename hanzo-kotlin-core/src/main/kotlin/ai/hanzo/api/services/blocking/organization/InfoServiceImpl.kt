// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking.organization

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
import ai.hanzo.api.core.prepare
import ai.hanzo.api.models.organization.OrganizationTableWithMembers
import ai.hanzo.api.models.organization.info.InfoDeprecatedParams
import ai.hanzo.api.models.organization.info.InfoDeprecatedResponse
import ai.hanzo.api.models.organization.info.InfoRetrieveParams

class InfoServiceImpl internal constructor(private val clientOptions: ClientOptions) : InfoService {

    private val withRawResponse: InfoService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): InfoService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): InfoService =
        InfoServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun retrieve(
        params: InfoRetrieveParams,
        requestOptions: RequestOptions,
    ): OrganizationTableWithMembers =
        // get /organization/info
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun deprecated(
        params: InfoDeprecatedParams,
        requestOptions: RequestOptions,
    ): InfoDeprecatedResponse =
        // post /organization/info
        withRawResponse().deprecated(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        InfoService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): InfoService.WithRawResponse =
            InfoServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier).build())

        private val retrieveHandler: Handler<OrganizationTableWithMembers> =
            jsonHandler<OrganizationTableWithMembers>(clientOptions.jsonMapper)

        override fun retrieve(
            params: InfoRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OrganizationTableWithMembers> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("organization", "info")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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

        override fun deprecated(
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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
