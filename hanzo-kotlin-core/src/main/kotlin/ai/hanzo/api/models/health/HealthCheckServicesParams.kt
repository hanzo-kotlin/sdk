// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.health

import ai.hanzo.api.core.Enum
import ai.hanzo.api.core.JsonField
import ai.hanzo.api.core.Params
import ai.hanzo.api.core.checkRequired
import ai.hanzo.api.core.http.Headers
import ai.hanzo.api.core.http.QueryParams
import ai.hanzo.api.errors.HanzoInvalidDataException
import com.fasterxml.jackson.annotation.JsonCreator
import java.util.Objects

/**
 * Use this admin-only endpoint to check if the service is healthy.
 *
 * Example:
 * ```
 * curl -L -X GET 'http://0.0.0.0:4000/health/services?service=datadog'     -H 'Authorization: Bearer sk-1234'
 * ```
 */
class HealthCheckServicesParams
private constructor(
    private val service: Service,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Specify the service being hit. */
    fun service(): Service = service

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [HealthCheckServicesParams].
         *
         * The following fields are required:
         * ```kotlin
         * .service()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [HealthCheckServicesParams]. */
    class Builder internal constructor() {

        private var service: Service? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(healthCheckServicesParams: HealthCheckServicesParams) = apply {
            service = healthCheckServicesParams.service
            additionalHeaders = healthCheckServicesParams.additionalHeaders.toBuilder()
            additionalQueryParams = healthCheckServicesParams.additionalQueryParams.toBuilder()
        }

        /** Specify the service being hit. */
        fun service(service: Service) = apply { this.service = service }

        /**
         * Sets [service] to an arbitrary [String].
         *
         * You should usually call [service] with a well-typed [Service] constant instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun service(value: String) = service(Service.of(value))

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
         * Returns an immutable instance of [HealthCheckServicesParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .service()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): HealthCheckServicesParams =
            HealthCheckServicesParams(
                checkRequired("service", service),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                put("service", service.toString())
                putAll(additionalQueryParams)
            }
            .build()

    /** Specify the service being hit. */
    class Service @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val SLACK_BUDGET_ALERTS = of("slack_budget_alerts")

            val LANGFUSE = of("langfuse")

            val SLACK = of("slack")

            val OPENMETER = of("openmeter")

            val WEBHOOK = of("webhook")

            val EMAIL = of("email")

            val BRAINTRUST = of("braintrust")

            val DATADOG = of("datadog")

            fun of(value: String) = Service(JsonField.of(value))
        }

        /** An enum containing [Service]'s known values. */
        enum class Known {
            SLACK_BUDGET_ALERTS,
            LANGFUSE,
            SLACK,
            OPENMETER,
            WEBHOOK,
            EMAIL,
            BRAINTRUST,
            DATADOG,
        }

        /**
         * An enum containing [Service]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Service] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            SLACK_BUDGET_ALERTS,
            LANGFUSE,
            SLACK,
            OPENMETER,
            WEBHOOK,
            EMAIL,
            BRAINTRUST,
            DATADOG,
            /** An enum member indicating that [Service] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                SLACK_BUDGET_ALERTS -> Value.SLACK_BUDGET_ALERTS
                LANGFUSE -> Value.LANGFUSE
                SLACK -> Value.SLACK
                OPENMETER -> Value.OPENMETER
                WEBHOOK -> Value.WEBHOOK
                EMAIL -> Value.EMAIL
                BRAINTRUST -> Value.BRAINTRUST
                DATADOG -> Value.DATADOG
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws HanzoInvalidDataException if this class instance's value is a not a known member.
         */
        fun known(): Known =
            when (this) {
                SLACK_BUDGET_ALERTS -> Known.SLACK_BUDGET_ALERTS
                LANGFUSE -> Known.LANGFUSE
                SLACK -> Known.SLACK
                OPENMETER -> Known.OPENMETER
                WEBHOOK -> Known.WEBHOOK
                EMAIL -> Known.EMAIL
                BRAINTRUST -> Known.BRAINTRUST
                DATADOG -> Known.DATADOG
                else -> throw HanzoInvalidDataException("Unknown Service: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws HanzoInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString() ?: throw HanzoInvalidDataException("Value is not a String")

        private var validated: Boolean = false

        fun validate(): Service = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: HanzoInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Service && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is HealthCheckServicesParams && service == other.service && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "HealthCheckServicesParams{service=$service, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
