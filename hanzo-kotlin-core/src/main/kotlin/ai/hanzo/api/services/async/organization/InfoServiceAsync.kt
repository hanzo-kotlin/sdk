// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async.organization

import ai.hanzo.api.core.ClientOptions
import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.organization.OrganizationTableWithMembers
import ai.hanzo.api.models.organization.info.InfoDeprecatedParams
import ai.hanzo.api.models.organization.info.InfoDeprecatedResponse
import ai.hanzo.api.models.organization.info.InfoRetrieveParams
import com.google.errorprone.annotations.MustBeClosed

interface InfoServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): InfoServiceAsync

    /** Get the org specific information */
    suspend fun retrieve(
        params: InfoRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OrganizationTableWithMembers

    /** DEPRECATED: Use GET /organization/info instead */
    suspend fun deprecated(
        params: InfoDeprecatedParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InfoDeprecatedResponse

    /** A view of [InfoServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): InfoServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /organization/info`, but is otherwise the same as
         * [InfoServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            params: InfoRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OrganizationTableWithMembers>

        /**
         * Returns a raw HTTP response for `post /organization/info`, but is otherwise the same as
         * [InfoServiceAsync.deprecated].
         */
        @MustBeClosed
        suspend fun deprecated(
            params: InfoDeprecatedParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InfoDeprecatedResponse>
    }
}
