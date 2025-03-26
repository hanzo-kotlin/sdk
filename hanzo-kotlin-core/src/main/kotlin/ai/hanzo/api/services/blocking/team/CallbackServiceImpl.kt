// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking.team

import ai.hanzo.api.core.ClientOptions
import ai.hanzo.api.core.JsonValue
import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.handlers.errorHandler
import ai.hanzo.api.core.handlers.jsonHandler
import ai.hanzo.api.core.handlers.withErrorHandler
import ai.hanzo.api.core.http.HttpMethod
import ai.hanzo.api.core.http.HttpRequest
import ai.hanzo.api.core.http.HttpResponse.Handler
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.core.http.json
import ai.hanzo.api.core.http.parseable
import ai.hanzo.api.core.prepare
import ai.hanzo.api.models.team.callback.CallbackAddParams
import ai.hanzo.api.models.team.callback.CallbackAddResponse
import ai.hanzo.api.models.team.callback.CallbackRetrieveParams
import ai.hanzo.api.models.team.callback.CallbackRetrieveResponse

class CallbackServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CallbackService {

    private val withRawResponse: CallbackService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CallbackService.WithRawResponse = withRawResponse

    override fun retrieve(
        params: CallbackRetrieveParams,
        requestOptions: RequestOptions,
    ): CallbackRetrieveResponse =
        // get /team/{team_id}/callback
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun add(
        params: CallbackAddParams,
        requestOptions: RequestOptions,
    ): CallbackAddResponse =
        // post /team/{team_id}/callback
        withRawResponse().add(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CallbackService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val retrieveHandler: Handler<CallbackRetrieveResponse> =
            jsonHandler<CallbackRetrieveResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: CallbackRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CallbackRetrieveResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("team", params._pathParam(0), "callback")
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

        private val addHandler: Handler<CallbackAddResponse> =
            jsonHandler<CallbackAddResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun add(
            params: CallbackAddParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CallbackAddResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("team", params._pathParam(0), "callback")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { addHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
