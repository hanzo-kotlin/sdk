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
import com.hanzo_ai.api.core.http.parseable
import com.hanzo_ai.api.core.prepare
import com.hanzo_ai.api.models.organization.OrganizationAddMemberParams
import com.hanzo_ai.api.models.organization.OrganizationAddMemberResponse
import com.hanzo_ai.api.models.organization.OrganizationCreateParams
import com.hanzo_ai.api.models.organization.OrganizationCreateResponse
import com.hanzo_ai.api.models.organization.OrganizationDeleteMemberParams
import com.hanzo_ai.api.models.organization.OrganizationDeleteMemberResponse
import com.hanzo_ai.api.models.organization.OrganizationDeleteParams
import com.hanzo_ai.api.models.organization.OrganizationDeleteResponse
import com.hanzo_ai.api.models.organization.OrganizationListParams
import com.hanzo_ai.api.models.organization.OrganizationListResponse
import com.hanzo_ai.api.models.organization.OrganizationUpdateMemberParams
import com.hanzo_ai.api.models.organization.OrganizationUpdateMemberResponse
import com.hanzo_ai.api.models.organization.OrganizationUpdateParams
import com.hanzo_ai.api.models.organization.OrganizationUpdateResponse
import com.hanzo_ai.api.services.blocking.organization.InfoService
import com.hanzo_ai.api.services.blocking.organization.InfoServiceImpl

class OrganizationServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    OrganizationService {

    private val withRawResponse: OrganizationService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val info: InfoService by lazy { InfoServiceImpl(clientOptions) }

    override fun withRawResponse(): OrganizationService.WithRawResponse = withRawResponse

    override fun info(): InfoService = info

    override fun create(
        params: OrganizationCreateParams,
        requestOptions: RequestOptions,
    ): OrganizationCreateResponse =
        // post /organization/new
        withRawResponse().create(params, requestOptions).parse()

    override fun update(
        params: OrganizationUpdateParams,
        requestOptions: RequestOptions,
    ): OrganizationUpdateResponse =
        // patch /organization/update
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: OrganizationListParams,
        requestOptions: RequestOptions,
    ): List<OrganizationListResponse> =
        // get /organization/list
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: OrganizationDeleteParams,
        requestOptions: RequestOptions,
    ): List<OrganizationDeleteResponse> =
        // delete /organization/delete
        withRawResponse().delete(params, requestOptions).parse()

    override fun addMember(
        params: OrganizationAddMemberParams,
        requestOptions: RequestOptions,
    ): OrganizationAddMemberResponse =
        // post /organization/member_add
        withRawResponse().addMember(params, requestOptions).parse()

    override fun deleteMember(
        params: OrganizationDeleteMemberParams,
        requestOptions: RequestOptions,
    ): OrganizationDeleteMemberResponse =
        // delete /organization/member_delete
        withRawResponse().deleteMember(params, requestOptions).parse()

    override fun updateMember(
        params: OrganizationUpdateMemberParams,
        requestOptions: RequestOptions,
    ): OrganizationUpdateMemberResponse =
        // patch /organization/member_update
        withRawResponse().updateMember(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        OrganizationService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val info: InfoService.WithRawResponse by lazy {
            InfoServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun info(): InfoService.WithRawResponse = info

        private val createHandler: Handler<OrganizationCreateResponse> =
            jsonHandler<OrganizationCreateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: OrganizationCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OrganizationCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("organization", "new")
                    .body(json(clientOptions.jsonMapper, params._body()))
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

        private val updateHandler: Handler<OrganizationUpdateResponse> =
            jsonHandler<OrganizationUpdateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun update(
            params: OrganizationUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OrganizationUpdateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .addPathSegments("organization", "update")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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

        private val listHandler: Handler<List<OrganizationListResponse>> =
            jsonHandler<List<OrganizationListResponse>>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: OrganizationListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<OrganizationListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("organization", "list")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }

        private val deleteHandler: Handler<List<OrganizationDeleteResponse>> =
            jsonHandler<List<OrganizationDeleteResponse>>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun delete(
            params: OrganizationDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<OrganizationDeleteResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments("organization", "delete")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { deleteHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }

        private val addMemberHandler: Handler<OrganizationAddMemberResponse> =
            jsonHandler<OrganizationAddMemberResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun addMember(
            params: OrganizationAddMemberParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OrganizationAddMemberResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("organization", "member_add")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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

        private val deleteMemberHandler: Handler<OrganizationDeleteMemberResponse> =
            jsonHandler<OrganizationDeleteMemberResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun deleteMember(
            params: OrganizationDeleteMemberParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OrganizationDeleteMemberResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments("organization", "member_delete")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { deleteMemberHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateMemberHandler: Handler<OrganizationUpdateMemberResponse> =
            jsonHandler<OrganizationUpdateMemberResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun updateMember(
            params: OrganizationUpdateMemberParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OrganizationUpdateMemberResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .addPathSegments("organization", "member_update")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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
