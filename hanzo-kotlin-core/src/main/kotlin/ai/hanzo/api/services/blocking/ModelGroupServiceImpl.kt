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
import ai.hanzo.api.core.http.parseable
import ai.hanzo.api.core.prepare
import ai.hanzo.api.models.modelgroup.ModelGroupRetrieveInfoParams
import ai.hanzo.api.models.modelgroup.ModelGroupRetrieveInfoResponse

class ModelGroupServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ModelGroupService {

    private val withRawResponse: ModelGroupService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ModelGroupService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ModelGroupService =
        ModelGroupServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun retrieveInfo(
        params: ModelGroupRetrieveInfoParams,
        requestOptions: RequestOptions,
    ): ModelGroupRetrieveInfoResponse =
        // get /model_group/info
        withRawResponse().retrieveInfo(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ModelGroupService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ModelGroupService.WithRawResponse =
            ModelGroupServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val retrieveInfoHandler: Handler<ModelGroupRetrieveInfoResponse> =
            jsonHandler<ModelGroupRetrieveInfoResponse>(clientOptions.jsonMapper)

        override fun retrieveInfo(
            params: ModelGroupRetrieveInfoParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ModelGroupRetrieveInfoResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("model_group", "info")
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
