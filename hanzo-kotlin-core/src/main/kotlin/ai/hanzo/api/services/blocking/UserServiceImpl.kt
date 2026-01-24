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
import ai.hanzo.api.models.user.UserCreateParams
import ai.hanzo.api.models.user.UserCreateResponse
import ai.hanzo.api.models.user.UserDeleteParams
import ai.hanzo.api.models.user.UserDeleteResponse
import ai.hanzo.api.models.user.UserRetrieveInfoParams
import ai.hanzo.api.models.user.UserRetrieveInfoResponse
import ai.hanzo.api.models.user.UserUpdateParams
import ai.hanzo.api.models.user.UserUpdateResponse

class UserServiceImpl internal constructor(private val clientOptions: ClientOptions) : UserService {

    private val withRawResponse: UserService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): UserService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): UserService =
        UserServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun create(
        params: UserCreateParams,
        requestOptions: RequestOptions,
    ): UserCreateResponse =
        // post /user/new
        withRawResponse().create(params, requestOptions).parse()

    override fun update(
        params: UserUpdateParams,
        requestOptions: RequestOptions,
    ): UserUpdateResponse =
        // post /user/update
        withRawResponse().update(params, requestOptions).parse()

    override fun delete(
        params: UserDeleteParams,
        requestOptions: RequestOptions,
    ): UserDeleteResponse =
        // post /user/delete
        withRawResponse().delete(params, requestOptions).parse()

    override fun retrieveInfo(
        params: UserRetrieveInfoParams,
        requestOptions: RequestOptions,
    ): UserRetrieveInfoResponse =
        // get /user/info
        withRawResponse().retrieveInfo(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        UserService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): UserService.WithRawResponse =
            UserServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier).build())

        private val createHandler: Handler<UserCreateResponse> =
            jsonHandler<UserCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: UserCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UserCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("user", "new")
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

        private val updateHandler: Handler<UserUpdateResponse> =
            jsonHandler<UserUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: UserUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UserUpdateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("user", "update")
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

        private val deleteHandler: Handler<UserDeleteResponse> =
            jsonHandler<UserDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: UserDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UserDeleteResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("user", "delete")
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

        private val retrieveInfoHandler: Handler<UserRetrieveInfoResponse> =
            jsonHandler<UserRetrieveInfoResponse>(clientOptions.jsonMapper)

        override fun retrieveInfo(
            params: UserRetrieveInfoParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UserRetrieveInfoResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("user", "info")
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
    }
}
