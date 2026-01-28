// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.finetuning.jobs

import ai.hanzo.api.core.JsonValue
import ai.hanzo.api.core.Params
import ai.hanzo.api.core.checkRequired
import ai.hanzo.api.core.http.Headers
import ai.hanzo.api.core.http.QueryParams
import java.util.Objects

/**
 * Creates a fine-tuning job which begins the process of creating a new model from a given dataset.
 * This is the equivalent of POST https://api.openai.com/v1/fine_tuning/jobs
 *
 * Supports Identical Params as: https://platform.openai.com/docs/api-reference/fine-tuning/create
 *
 * Example Curl:
 * ```
 * curl http://localhost:4000/v1/fine_tuning/jobs       -H "Content-Type: application/json"       -H "Authorization: Bearer sk-1234"       -d '{
 *     "model": "gpt-3.5-turbo",
 *     "training_file": "file-abc123",
 *     "hyperparameters": {
 *       "n_epochs": 4
 *     }
 *   }'
 * ```
 */
class JobCreateParams
private constructor(
    private val liteLlmFineTuningJobCreate: LiteLlmFineTuningJobCreate,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun liteLlmFineTuningJobCreate(): LiteLlmFineTuningJobCreate = liteLlmFineTuningJobCreate

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        liteLlmFineTuningJobCreate._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [JobCreateParams].
         *
         * The following fields are required:
         * ```kotlin
         * .liteLlmFineTuningJobCreate()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [JobCreateParams]. */
    class Builder internal constructor() {

        private var liteLlmFineTuningJobCreate: LiteLlmFineTuningJobCreate? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(jobCreateParams: JobCreateParams) = apply {
            liteLlmFineTuningJobCreate = jobCreateParams.liteLlmFineTuningJobCreate
            additionalHeaders = jobCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = jobCreateParams.additionalQueryParams.toBuilder()
        }

        fun liteLlmFineTuningJobCreate(liteLlmFineTuningJobCreate: LiteLlmFineTuningJobCreate) =
            apply {
                this.liteLlmFineTuningJobCreate = liteLlmFineTuningJobCreate
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
         * Returns an immutable instance of [JobCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .liteLlmFineTuningJobCreate()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): JobCreateParams =
            JobCreateParams(
                checkRequired("liteLlmFineTuningJobCreate", liteLlmFineTuningJobCreate),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): LiteLlmFineTuningJobCreate = liteLlmFineTuningJobCreate

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is JobCreateParams &&
            liteLlmFineTuningJobCreate == other.liteLlmFineTuningJobCreate &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(liteLlmFineTuningJobCreate, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "JobCreateParams{liteLlmFineTuningJobCreate=$liteLlmFineTuningJobCreate, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
