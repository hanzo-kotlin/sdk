// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking

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
import ai.hanzo.api.models.customer.CustomerBlockParams
import ai.hanzo.api.models.customer.CustomerBlockResponse
import ai.hanzo.api.models.customer.CustomerCreateParams
import ai.hanzo.api.models.customer.CustomerCreateResponse
import ai.hanzo.api.models.customer.CustomerDeleteParams
import ai.hanzo.api.models.customer.CustomerDeleteResponse
import ai.hanzo.api.models.customer.CustomerListParams
import ai.hanzo.api.models.customer.CustomerRetrieveInfoParams
import ai.hanzo.api.models.customer.CustomerUnblockParams
import ai.hanzo.api.models.customer.CustomerUnblockResponse
import ai.hanzo.api.models.customer.CustomerUpdateParams
import ai.hanzo.api.models.customer.CustomerUpdateResponse
import ai.hanzo.api.models.customer.LiteLlmEndUserTable

class CustomerServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CustomerService {

    private val withRawResponse: CustomerService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CustomerService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CustomerService =
        CustomerServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun create(
        params: CustomerCreateParams,
        requestOptions: RequestOptions,
    ): CustomerCreateResponse =
        // post /customer/new
        withRawResponse().create(params, requestOptions).parse()

    override fun update(
        params: CustomerUpdateParams,
        requestOptions: RequestOptions,
    ): CustomerUpdateResponse =
        // post /customer/update
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: CustomerListParams,
        requestOptions: RequestOptions,
    ): List<LiteLlmEndUserTable> =
        // get /customer/list
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: CustomerDeleteParams,
        requestOptions: RequestOptions,
    ): CustomerDeleteResponse =
        // post /customer/delete
        withRawResponse().delete(params, requestOptions).parse()

    override fun block(
        params: CustomerBlockParams,
        requestOptions: RequestOptions,
    ): CustomerBlockResponse =
        // post /customer/block
        withRawResponse().block(params, requestOptions).parse()

    override fun retrieveInfo(
        params: CustomerRetrieveInfoParams,
        requestOptions: RequestOptions,
    ): LiteLlmEndUserTable =
        // get /customer/info
        withRawResponse().retrieveInfo(params, requestOptions).parse()

    override fun unblock(
        params: CustomerUnblockParams,
        requestOptions: RequestOptions,
    ): CustomerUnblockResponse =
        // post /customer/unblock
        withRawResponse().unblock(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CustomerService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): CustomerService.WithRawResponse =
            CustomerServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val createHandler: Handler<CustomerCreateResponse> =
            jsonHandler<CustomerCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: CustomerCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CustomerCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("customer", "new")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateHandler: Handler<CustomerUpdateResponse> =
            jsonHandler<CustomerUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: CustomerUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CustomerUpdateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("customer", "update")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<List<LiteLlmEndUserTable>> =
            jsonHandler<List<LiteLlmEndUserTable>>(clientOptions.jsonMapper)

        override fun list(
            params: CustomerListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<LiteLlmEndUserTable>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("customer", "list")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }

        private val deleteHandler: Handler<CustomerDeleteResponse> =
            jsonHandler<CustomerDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: CustomerDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CustomerDeleteResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("customer", "delete")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { deleteHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val blockHandler: Handler<CustomerBlockResponse> =
            jsonHandler<CustomerBlockResponse>(clientOptions.jsonMapper)

        override fun block(
            params: CustomerBlockParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CustomerBlockResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("customer", "block")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { blockHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveInfoHandler: Handler<LiteLlmEndUserTable> =
            jsonHandler<LiteLlmEndUserTable>(clientOptions.jsonMapper)

        override fun retrieveInfo(
            params: CustomerRetrieveInfoParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LiteLlmEndUserTable> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("customer", "info")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveInfoHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val unblockHandler: Handler<CustomerUnblockResponse> =
            jsonHandler<CustomerUnblockResponse>(clientOptions.jsonMapper)

        override fun unblock(
            params: CustomerUnblockParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CustomerUnblockResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("customer", "unblock")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { unblockHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
