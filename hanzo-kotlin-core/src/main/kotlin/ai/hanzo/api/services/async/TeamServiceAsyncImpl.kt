// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.core.ClientOptions
import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.checkRequired
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
import ai.hanzo.api.models.team.TeamAddMemberParams
import ai.hanzo.api.models.team.TeamAddMemberResponse
import ai.hanzo.api.models.team.TeamBlockParams
import ai.hanzo.api.models.team.TeamBlockResponse
import ai.hanzo.api.models.team.TeamCreateParams
import ai.hanzo.api.models.team.TeamCreateResponse
import ai.hanzo.api.models.team.TeamDeleteParams
import ai.hanzo.api.models.team.TeamDeleteResponse
import ai.hanzo.api.models.team.TeamDisableLoggingParams
import ai.hanzo.api.models.team.TeamDisableLoggingResponse
import ai.hanzo.api.models.team.TeamListAvailableParams
import ai.hanzo.api.models.team.TeamListAvailableResponse
import ai.hanzo.api.models.team.TeamListParams
import ai.hanzo.api.models.team.TeamListResponse
import ai.hanzo.api.models.team.TeamRemoveMemberParams
import ai.hanzo.api.models.team.TeamRemoveMemberResponse
import ai.hanzo.api.models.team.TeamRetrieveInfoParams
import ai.hanzo.api.models.team.TeamRetrieveInfoResponse
import ai.hanzo.api.models.team.TeamUnblockParams
import ai.hanzo.api.models.team.TeamUnblockResponse
import ai.hanzo.api.models.team.TeamUpdateMemberParams
import ai.hanzo.api.models.team.TeamUpdateMemberResponse
import ai.hanzo.api.models.team.TeamUpdateParams
import ai.hanzo.api.models.team.TeamUpdateResponse
import ai.hanzo.api.services.async.team.CallbackServiceAsync
import ai.hanzo.api.services.async.team.CallbackServiceAsyncImpl
import ai.hanzo.api.services.async.team.ModelServiceAsync
import ai.hanzo.api.services.async.team.ModelServiceAsyncImpl

class TeamServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    TeamServiceAsync {

    private val withRawResponse: TeamServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val model: ModelServiceAsync by lazy { ModelServiceAsyncImpl(clientOptions) }

    private val callback: CallbackServiceAsync by lazy { CallbackServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): TeamServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): TeamServiceAsync =
        TeamServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun model(): ModelServiceAsync = model

    override fun callback(): CallbackServiceAsync = callback

    override suspend fun create(
        params: TeamCreateParams,
        requestOptions: RequestOptions,
    ): TeamCreateResponse =
        // post /team/new
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun update(
        params: TeamUpdateParams,
        requestOptions: RequestOptions,
    ): TeamUpdateResponse =
        // post /team/update
        withRawResponse().update(params, requestOptions).parse()

    override suspend fun list(
        params: TeamListParams,
        requestOptions: RequestOptions,
    ): TeamListResponse =
        // get /team/list
        withRawResponse().list(params, requestOptions).parse()

    override suspend fun delete(
        params: TeamDeleteParams,
        requestOptions: RequestOptions,
    ): TeamDeleteResponse =
        // post /team/delete
        withRawResponse().delete(params, requestOptions).parse()

    override suspend fun addMember(
        params: TeamAddMemberParams,
        requestOptions: RequestOptions,
    ): TeamAddMemberResponse =
        // post /team/member_add
        withRawResponse().addMember(params, requestOptions).parse()

    override suspend fun block(
        params: TeamBlockParams,
        requestOptions: RequestOptions,
    ): TeamBlockResponse =
        // post /team/block
        withRawResponse().block(params, requestOptions).parse()

    override suspend fun disableLogging(
        params: TeamDisableLoggingParams,
        requestOptions: RequestOptions,
    ): TeamDisableLoggingResponse =
        // post /team/{team_id}/disable_logging
        withRawResponse().disableLogging(params, requestOptions).parse()

    override suspend fun listAvailable(
        params: TeamListAvailableParams,
        requestOptions: RequestOptions,
    ): TeamListAvailableResponse =
        // get /team/available
        withRawResponse().listAvailable(params, requestOptions).parse()

    override suspend fun removeMember(
        params: TeamRemoveMemberParams,
        requestOptions: RequestOptions,
    ): TeamRemoveMemberResponse =
        // post /team/member_delete
        withRawResponse().removeMember(params, requestOptions).parse()

    override suspend fun retrieveInfo(
        params: TeamRetrieveInfoParams,
        requestOptions: RequestOptions,
    ): TeamRetrieveInfoResponse =
        // get /team/info
        withRawResponse().retrieveInfo(params, requestOptions).parse()

    override suspend fun unblock(
        params: TeamUnblockParams,
        requestOptions: RequestOptions,
    ): TeamUnblockResponse =
        // post /team/unblock
        withRawResponse().unblock(params, requestOptions).parse()

    override suspend fun updateMember(
        params: TeamUpdateMemberParams,
        requestOptions: RequestOptions,
    ): TeamUpdateMemberResponse =
        // post /team/member_update
        withRawResponse().updateMember(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TeamServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val model: ModelServiceAsync.WithRawResponse by lazy {
            ModelServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val callback: CallbackServiceAsync.WithRawResponse by lazy {
            CallbackServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): TeamServiceAsync.WithRawResponse =
            TeamServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        override fun model(): ModelServiceAsync.WithRawResponse = model

        override fun callback(): CallbackServiceAsync.WithRawResponse = callback

        private val createHandler: Handler<TeamCreateResponse> =
            jsonHandler<TeamCreateResponse>(clientOptions.jsonMapper)

        override suspend fun create(
            params: TeamCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TeamCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("team", "new")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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

        private val updateHandler: Handler<TeamUpdateResponse> =
            jsonHandler<TeamUpdateResponse>(clientOptions.jsonMapper)

        override suspend fun update(
            params: TeamUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TeamUpdateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("team", "update")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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

        private val listHandler: Handler<TeamListResponse> =
            jsonHandler<TeamListResponse>(clientOptions.jsonMapper)

        override suspend fun list(
            params: TeamListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TeamListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("team", "list")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val deleteHandler: Handler<TeamDeleteResponse> =
            jsonHandler<TeamDeleteResponse>(clientOptions.jsonMapper)

        override suspend fun delete(
            params: TeamDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TeamDeleteResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("team", "delete")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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

        private val addMemberHandler: Handler<TeamAddMemberResponse> =
            jsonHandler<TeamAddMemberResponse>(clientOptions.jsonMapper)

        override suspend fun addMember(
            params: TeamAddMemberParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TeamAddMemberResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("team", "member_add")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { addMemberHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val blockHandler: Handler<TeamBlockResponse> =
            jsonHandler<TeamBlockResponse>(clientOptions.jsonMapper)

        override suspend fun block(
            params: TeamBlockParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TeamBlockResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("team", "block")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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

        private val disableLoggingHandler: Handler<TeamDisableLoggingResponse> =
            jsonHandler<TeamDisableLoggingResponse>(clientOptions.jsonMapper)

        override suspend fun disableLogging(
            params: TeamDisableLoggingParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TeamDisableLoggingResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("teamId", params.teamId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("team", params._pathParam(0), "disable_logging")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { disableLoggingHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listAvailableHandler: Handler<TeamListAvailableResponse> =
            jsonHandler<TeamListAvailableResponse>(clientOptions.jsonMapper)

        override suspend fun listAvailable(
            params: TeamListAvailableParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TeamListAvailableResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("team", "available")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listAvailableHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val removeMemberHandler: Handler<TeamRemoveMemberResponse> =
            jsonHandler<TeamRemoveMemberResponse>(clientOptions.jsonMapper)

        override suspend fun removeMember(
            params: TeamRemoveMemberParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TeamRemoveMemberResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("team", "member_delete")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { removeMemberHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveInfoHandler: Handler<TeamRetrieveInfoResponse> =
            jsonHandler<TeamRetrieveInfoResponse>(clientOptions.jsonMapper)

        override suspend fun retrieveInfo(
            params: TeamRetrieveInfoParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TeamRetrieveInfoResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("team", "info")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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

        private val unblockHandler: Handler<TeamUnblockResponse> =
            jsonHandler<TeamUnblockResponse>(clientOptions.jsonMapper)

        override suspend fun unblock(
            params: TeamUnblockParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TeamUnblockResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("team", "unblock")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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

        private val updateMemberHandler: Handler<TeamUpdateMemberResponse> =
            jsonHandler<TeamUpdateMemberResponse>(clientOptions.jsonMapper)

        override suspend fun updateMember(
            params: TeamUpdateMemberParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TeamUpdateMemberResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("team", "member_update")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateMemberHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
