// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.async

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
import com.hanzo_ai.api.core.http.parseable
import com.hanzo_ai.api.core.prepareAsync
import com.hanzo_ai.api.models.team.TeamAddMemberParams
import com.hanzo_ai.api.models.team.TeamAddMemberResponse
import com.hanzo_ai.api.models.team.TeamBlockParams
import com.hanzo_ai.api.models.team.TeamBlockResponse
import com.hanzo_ai.api.models.team.TeamCreateParams
import com.hanzo_ai.api.models.team.TeamCreateResponse
import com.hanzo_ai.api.models.team.TeamDeleteParams
import com.hanzo_ai.api.models.team.TeamDeleteResponse
import com.hanzo_ai.api.models.team.TeamDisableLoggingParams
import com.hanzo_ai.api.models.team.TeamDisableLoggingResponse
import com.hanzo_ai.api.models.team.TeamListAvailableParams
import com.hanzo_ai.api.models.team.TeamListAvailableResponse
import com.hanzo_ai.api.models.team.TeamListParams
import com.hanzo_ai.api.models.team.TeamListResponse
import com.hanzo_ai.api.models.team.TeamRemoveMemberParams
import com.hanzo_ai.api.models.team.TeamRemoveMemberResponse
import com.hanzo_ai.api.models.team.TeamRetrieveInfoParams
import com.hanzo_ai.api.models.team.TeamRetrieveInfoResponse
import com.hanzo_ai.api.models.team.TeamUnblockParams
import com.hanzo_ai.api.models.team.TeamUnblockResponse
import com.hanzo_ai.api.models.team.TeamUpdateMemberParams
import com.hanzo_ai.api.models.team.TeamUpdateMemberResponse
import com.hanzo_ai.api.models.team.TeamUpdateParams
import com.hanzo_ai.api.models.team.TeamUpdateResponse
import com.hanzo_ai.api.services.async.team.CallbackServiceAsync
import com.hanzo_ai.api.services.async.team.CallbackServiceAsyncImpl
import com.hanzo_ai.api.services.async.team.ModelServiceAsync
import com.hanzo_ai.api.services.async.team.ModelServiceAsyncImpl

class TeamServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    TeamServiceAsync {

    private val withRawResponse: TeamServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val model: ModelServiceAsync by lazy { ModelServiceAsyncImpl(clientOptions) }

    private val callback: CallbackServiceAsync by lazy { CallbackServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): TeamServiceAsync.WithRawResponse = withRawResponse

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

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val model: ModelServiceAsync.WithRawResponse by lazy {
            ModelServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val callback: CallbackServiceAsync.WithRawResponse by lazy {
            CallbackServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun model(): ModelServiceAsync.WithRawResponse = model

        override fun callback(): CallbackServiceAsync.WithRawResponse = callback

        private val createHandler: Handler<TeamCreateResponse> =
            jsonHandler<TeamCreateResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun create(
            params: TeamCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TeamCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("team", "new")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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

        private val updateHandler: Handler<TeamUpdateResponse> =
            jsonHandler<TeamUpdateResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun update(
            params: TeamUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TeamUpdateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("team", "update")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
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
            jsonHandler<TeamListResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun list(
            params: TeamListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TeamListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("team", "list")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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

        private val deleteHandler: Handler<TeamDeleteResponse> =
            jsonHandler<TeamDeleteResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun delete(
            params: TeamDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TeamDeleteResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("team", "delete")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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

        private val addMemberHandler: Handler<TeamAddMemberResponse> =
            jsonHandler<TeamAddMemberResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun addMember(
            params: TeamAddMemberParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TeamAddMemberResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("team", "member_add")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
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
            jsonHandler<TeamBlockResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun block(
            params: TeamBlockParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TeamBlockResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("team", "block")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
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
                .withErrorHandler(errorHandler)

        override suspend fun disableLogging(
            params: TeamDisableLoggingParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TeamDisableLoggingResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("team", params._pathParam(0), "disable_logging")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
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
                .withErrorHandler(errorHandler)

        override suspend fun listAvailable(
            params: TeamListAvailableParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TeamListAvailableResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("team", "available")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
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
                .withErrorHandler(errorHandler)

        override suspend fun removeMember(
            params: TeamRemoveMemberParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TeamRemoveMemberResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("team", "member_delete")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
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
                .withErrorHandler(errorHandler)

        override suspend fun retrieveInfo(
            params: TeamRetrieveInfoParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TeamRetrieveInfoResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("team", "info")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
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
                .withErrorHandler(errorHandler)

        override suspend fun unblock(
            params: TeamUnblockParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TeamUnblockResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("team", "unblock")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
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
                .withErrorHandler(errorHandler)

        override suspend fun updateMember(
            params: TeamUpdateMemberParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TeamUpdateMemberResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("team", "member_update")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
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
