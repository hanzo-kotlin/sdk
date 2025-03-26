// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.config.passthroughendpoint

import ai.hanzo.api.core.JsonValue
import ai.hanzo.api.core.Params
import ai.hanzo.api.core.checkRequired
import ai.hanzo.api.core.http.Headers
import ai.hanzo.api.core.http.QueryParams
import java.util.Objects

/** Create new pass-through endpoint */
class PassThroughEndpointCreateParams
private constructor(
    private val passThroughGenericEndpoint: PassThroughGenericEndpoint,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun passThroughGenericEndpoint(): PassThroughGenericEndpoint = passThroughGenericEndpoint

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        passThroughGenericEndpoint._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [PassThroughEndpointCreateParams].
         *
         * The following fields are required:
         * ```kotlin
         * .passThroughGenericEndpoint()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [PassThroughEndpointCreateParams]. */
    class Builder internal constructor() {

        private var passThroughGenericEndpoint: PassThroughGenericEndpoint? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(passThroughEndpointCreateParams: PassThroughEndpointCreateParams) =
            apply {
                passThroughGenericEndpoint =
                    passThroughEndpointCreateParams.passThroughGenericEndpoint
                additionalHeaders = passThroughEndpointCreateParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    passThroughEndpointCreateParams.additionalQueryParams.toBuilder()
            }

        fun passThroughGenericEndpoint(passThroughGenericEndpoint: PassThroughGenericEndpoint) =
            apply {
                this.passThroughGenericEndpoint = passThroughGenericEndpoint
            }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [PassThroughEndpointCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .passThroughGenericEndpoint()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PassThroughEndpointCreateParams =
            PassThroughEndpointCreateParams(
                checkRequired("passThroughGenericEndpoint", passThroughGenericEndpoint),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    internal fun _body(): PassThroughGenericEndpoint = passThroughGenericEndpoint

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PassThroughEndpointCreateParams && passThroughGenericEndpoint == other.passThroughGenericEndpoint && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(passThroughGenericEndpoint, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "PassThroughEndpointCreateParams{passThroughGenericEndpoint=$passThroughGenericEndpoint, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
