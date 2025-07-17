// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.core.ClientOptions
import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.cache.CacheDeleteParams
import ai.hanzo.api.models.cache.CacheDeleteResponse
import ai.hanzo.api.models.cache.CacheFlushAllParams
import ai.hanzo.api.models.cache.CacheFlushAllResponse
import ai.hanzo.api.models.cache.CachePingParams
import ai.hanzo.api.models.cache.CachePingResponse
import ai.hanzo.api.services.async.cache.RediServiceAsync
import com.google.errorprone.annotations.MustBeClosed

interface CacheServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CacheServiceAsync

    fun redis(): RediServiceAsync

    /**
     * Endpoint for deleting a key from the cache. All responses from llm proxy have
     * `x-llm-cache-key` in the headers
     *
     * Parameters:
     * - **keys**: _Optional[List[str]]_ - A list of keys to delete from the cache. Example {"keys":
     *   ["key1", "key2"]}
     *
     * ```shell
     * curl -X POST "http://0.0.0.0:4000/cache/delete"     -H "Authorization: Bearer sk-1234"     -d '{"keys": ["key1", "key2"]}'
     * ```
     */
    suspend fun delete(
        params: CacheDeleteParams = CacheDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CacheDeleteResponse

    /** @see [delete] */
    suspend fun delete(requestOptions: RequestOptions): CacheDeleteResponse =
        delete(CacheDeleteParams.none(), requestOptions)

    /**
     * A function to flush all items from the cache. (All items will be deleted from the cache with
     * this) Raises HTTPException if the cache is not initialized or if the cache type does not
     * support flushing. Returns a dictionary with the status of the operation.
     *
     * Usage:
     * ```
     * curl -X POST http://0.0.0.0:4000/cache/flushall -H "Authorization: Bearer sk-1234"
     * ```
     */
    suspend fun flushAll(
        params: CacheFlushAllParams = CacheFlushAllParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CacheFlushAllResponse

    /** @see [flushAll] */
    suspend fun flushAll(requestOptions: RequestOptions): CacheFlushAllResponse =
        flushAll(CacheFlushAllParams.none(), requestOptions)

    /** Endpoint for checking if cache can be pinged */
    suspend fun ping(
        params: CachePingParams = CachePingParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CachePingResponse

    /** @see [ping] */
    suspend fun ping(requestOptions: RequestOptions): CachePingResponse =
        ping(CachePingParams.none(), requestOptions)

    /** A view of [CacheServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): CacheServiceAsync.WithRawResponse

        fun redis(): RediServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /cache/delete`, but is otherwise the same as
         * [CacheServiceAsync.delete].
         */
        @MustBeClosed
        suspend fun delete(
            params: CacheDeleteParams = CacheDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CacheDeleteResponse>

        /** @see [delete] */
        @MustBeClosed
        suspend fun delete(requestOptions: RequestOptions): HttpResponseFor<CacheDeleteResponse> =
            delete(CacheDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /cache/flushall`, but is otherwise the same as
         * [CacheServiceAsync.flushAll].
         */
        @MustBeClosed
        suspend fun flushAll(
            params: CacheFlushAllParams = CacheFlushAllParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CacheFlushAllResponse>

        /** @see [flushAll] */
        @MustBeClosed
        suspend fun flushAll(
            requestOptions: RequestOptions
        ): HttpResponseFor<CacheFlushAllResponse> =
            flushAll(CacheFlushAllParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /cache/ping`, but is otherwise the same as
         * [CacheServiceAsync.ping].
         */
        @MustBeClosed
        suspend fun ping(
            params: CachePingParams = CachePingParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CachePingResponse>

        /** @see [ping] */
        @MustBeClosed
        suspend fun ping(requestOptions: RequestOptions): HttpResponseFor<CachePingResponse> =
            ping(CachePingParams.none(), requestOptions)
    }
}
