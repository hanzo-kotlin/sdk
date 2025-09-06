// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.utils

import ai.hanzo.api.core.Enum
import ai.hanzo.api.core.ExcludeMissing
import ai.hanzo.api.core.JsonField
import ai.hanzo.api.core.JsonMissing
import ai.hanzo.api.core.JsonValue
import ai.hanzo.api.core.Params
import ai.hanzo.api.core.checkRequired
import ai.hanzo.api.core.http.Headers
import ai.hanzo.api.core.http.QueryParams
import ai.hanzo.api.errors.HanzoInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects

/** Transform Request */
class UtilTransformRequestParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun callType(): CallType = body.callType()

    fun _requestBody(): JsonValue = body._requestBody()

    /**
     * Returns the raw JSON value of [callType].
     *
     * Unlike [callType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _callType(): JsonField<CallType> = body._callType()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [UtilTransformRequestParams].
         *
         * The following fields are required:
         * ```kotlin
         * .callType()
         * .requestBody()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [UtilTransformRequestParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(utilTransformRequestParams: UtilTransformRequestParams) = apply {
            body = utilTransformRequestParams.body.toBuilder()
            additionalHeaders = utilTransformRequestParams.additionalHeaders.toBuilder()
            additionalQueryParams = utilTransformRequestParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [callType]
         * - [requestBody]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun callType(callType: CallType) = apply { body.callType(callType) }

        /**
         * Sets [Builder.callType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.callType] with a well-typed [CallType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun callType(callType: JsonField<CallType>) = apply { body.callType(callType) }

        fun requestBody(requestBody: JsonValue) = apply { body.requestBody(requestBody) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
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
         * Returns an immutable instance of [UtilTransformRequestParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .callType()
         * .requestBody()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): UtilTransformRequestParams =
            UtilTransformRequestParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    private constructor(
        private val callType: JsonField<CallType>,
        private val requestBody: JsonValue,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("call_type")
            @ExcludeMissing
            callType: JsonField<CallType> = JsonMissing.of(),
            @JsonProperty("request_body") @ExcludeMissing requestBody: JsonValue = JsonMissing.of(),
        ) : this(callType, requestBody, mutableMapOf())

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun callType(): CallType = callType.getRequired("call_type")

        @JsonProperty("request_body") @ExcludeMissing fun _requestBody(): JsonValue = requestBody

        /**
         * Returns the raw JSON value of [callType].
         *
         * Unlike [callType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("call_type") @ExcludeMissing fun _callType(): JsonField<CallType> = callType

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```kotlin
             * .callType()
             * .requestBody()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var callType: JsonField<CallType>? = null
            private var requestBody: JsonValue? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                callType = body.callType
                requestBody = body.requestBody
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun callType(callType: CallType) = callType(JsonField.of(callType))

            /**
             * Sets [Builder.callType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.callType] with a well-typed [CallType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun callType(callType: JsonField<CallType>) = apply { this.callType = callType }

            fun requestBody(requestBody: JsonValue) = apply { this.requestBody = requestBody }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .callType()
             * .requestBody()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("callType", callType),
                    checkRequired("requestBody", requestBody),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            callType().validate()
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
        internal fun validity(): Int = (callType.asKnown()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                callType == other.callType &&
                requestBody == other.requestBody &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(callType, requestBody, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{callType=$callType, requestBody=$requestBody, additionalProperties=$additionalProperties}"
    }

    class CallType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            val EMBEDDING = of("embedding")

            val AEMBEDDING = of("aembedding")

            val COMPLETION = of("completion")

            val ACOMPLETION = of("acompletion")

            val ATEXT_COMPLETION = of("atext_completion")

            val TEXT_COMPLETION = of("text_completion")

            val IMAGE_GENERATION = of("image_generation")

            val AIMAGE_GENERATION = of("aimage_generation")

            val MODERATION = of("moderation")

            val AMODERATION = of("amoderation")

            val ATRANSCRIPTION = of("atranscription")

            val TRANSCRIPTION = of("transcription")

            val ASPEECH = of("aspeech")

            val SPEECH = of("speech")

            val RERANK = of("rerank")

            val ARERANK = of("arerank")

            val _AREALTIME = of("_arealtime")

            val CREATE_BATCH = of("create_batch")

            val ACREATE_BATCH = of("acreate_batch")

            val ARETRIEVE_BATCH = of("aretrieve_batch")

            val RETRIEVE_BATCH = of("retrieve_batch")

            val PASS_THROUGH_ENDPOINT = of("pass_through_endpoint")

            val ANTHROPIC_MESSAGES = of("anthropic_messages")

            val GET_ASSISTANTS = of("get_assistants")

            val AGET_ASSISTANTS = of("aget_assistants")

            val CREATE_ASSISTANTS = of("create_assistants")

            val ACREATE_ASSISTANTS = of("acreate_assistants")

            val DELETE_ASSISTANT = of("delete_assistant")

            val ADELETE_ASSISTANT = of("adelete_assistant")

            val ACREATE_THREAD = of("acreate_thread")

            val CREATE_THREAD = of("create_thread")

            val AGET_THREAD = of("aget_thread")

            val GET_THREAD = of("get_thread")

            val A_ADD_MESSAGE = of("a_add_message")

            val ADD_MESSAGE = of("add_message")

            val AGET_MESSAGES = of("aget_messages")

            val GET_MESSAGES = of("get_messages")

            val ARUN_THREAD = of("arun_thread")

            val RUN_THREAD = of("run_thread")

            val ARUN_THREAD_STREAM = of("arun_thread_stream")

            val RUN_THREAD_STREAM = of("run_thread_stream")

            val AFILE_RETRIEVE = of("afile_retrieve")

            val FILE_RETRIEVE = of("file_retrieve")

            val AFILE_DELETE = of("afile_delete")

            val FILE_DELETE = of("file_delete")

            val AFILE_LIST = of("afile_list")

            val FILE_LIST = of("file_list")

            val ACREATE_FILE = of("acreate_file")

            val CREATE_FILE = of("create_file")

            val AFILE_CONTENT = of("afile_content")

            val FILE_CONTENT = of("file_content")

            val CREATE_FINE_TUNING_JOB = of("create_fine_tuning_job")

            val ACREATE_FINE_TUNING_JOB = of("acreate_fine_tuning_job")

            val ACANCEL_FINE_TUNING_JOB = of("acancel_fine_tuning_job")

            val CANCEL_FINE_TUNING_JOB = of("cancel_fine_tuning_job")

            val ALIST_FINE_TUNING_JOBS = of("alist_fine_tuning_jobs")

            val LIST_FINE_TUNING_JOBS = of("list_fine_tuning_jobs")

            val ARETRIEVE_FINE_TUNING_JOB = of("aretrieve_fine_tuning_job")

            val RETRIEVE_FINE_TUNING_JOB = of("retrieve_fine_tuning_job")

            val RESPONSES = of("responses")

            val ARESPONSES = of("aresponses")

            fun of(value: String) = CallType(JsonField.of(value))
        }

        /** An enum containing [CallType]'s known values. */
        enum class Known {
            EMBEDDING,
            AEMBEDDING,
            COMPLETION,
            ACOMPLETION,
            ATEXT_COMPLETION,
            TEXT_COMPLETION,
            IMAGE_GENERATION,
            AIMAGE_GENERATION,
            MODERATION,
            AMODERATION,
            ATRANSCRIPTION,
            TRANSCRIPTION,
            ASPEECH,
            SPEECH,
            RERANK,
            ARERANK,
            _AREALTIME,
            CREATE_BATCH,
            ACREATE_BATCH,
            ARETRIEVE_BATCH,
            RETRIEVE_BATCH,
            PASS_THROUGH_ENDPOINT,
            ANTHROPIC_MESSAGES,
            GET_ASSISTANTS,
            AGET_ASSISTANTS,
            CREATE_ASSISTANTS,
            ACREATE_ASSISTANTS,
            DELETE_ASSISTANT,
            ADELETE_ASSISTANT,
            ACREATE_THREAD,
            CREATE_THREAD,
            AGET_THREAD,
            GET_THREAD,
            A_ADD_MESSAGE,
            ADD_MESSAGE,
            AGET_MESSAGES,
            GET_MESSAGES,
            ARUN_THREAD,
            RUN_THREAD,
            ARUN_THREAD_STREAM,
            RUN_THREAD_STREAM,
            AFILE_RETRIEVE,
            FILE_RETRIEVE,
            AFILE_DELETE,
            FILE_DELETE,
            AFILE_LIST,
            FILE_LIST,
            ACREATE_FILE,
            CREATE_FILE,
            AFILE_CONTENT,
            FILE_CONTENT,
            CREATE_FINE_TUNING_JOB,
            ACREATE_FINE_TUNING_JOB,
            ACANCEL_FINE_TUNING_JOB,
            CANCEL_FINE_TUNING_JOB,
            ALIST_FINE_TUNING_JOBS,
            LIST_FINE_TUNING_JOBS,
            ARETRIEVE_FINE_TUNING_JOB,
            RETRIEVE_FINE_TUNING_JOB,
            RESPONSES,
            ARESPONSES,
        }

        /**
         * An enum containing [CallType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [CallType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            EMBEDDING,
            AEMBEDDING,
            COMPLETION,
            ACOMPLETION,
            ATEXT_COMPLETION,
            TEXT_COMPLETION,
            IMAGE_GENERATION,
            AIMAGE_GENERATION,
            MODERATION,
            AMODERATION,
            ATRANSCRIPTION,
            TRANSCRIPTION,
            ASPEECH,
            SPEECH,
            RERANK,
            ARERANK,
            _AREALTIME,
            CREATE_BATCH,
            ACREATE_BATCH,
            ARETRIEVE_BATCH,
            RETRIEVE_BATCH,
            PASS_THROUGH_ENDPOINT,
            ANTHROPIC_MESSAGES,
            GET_ASSISTANTS,
            AGET_ASSISTANTS,
            CREATE_ASSISTANTS,
            ACREATE_ASSISTANTS,
            DELETE_ASSISTANT,
            ADELETE_ASSISTANT,
            ACREATE_THREAD,
            CREATE_THREAD,
            AGET_THREAD,
            GET_THREAD,
            A_ADD_MESSAGE,
            ADD_MESSAGE,
            AGET_MESSAGES,
            GET_MESSAGES,
            ARUN_THREAD,
            RUN_THREAD,
            ARUN_THREAD_STREAM,
            RUN_THREAD_STREAM,
            AFILE_RETRIEVE,
            FILE_RETRIEVE,
            AFILE_DELETE,
            FILE_DELETE,
            AFILE_LIST,
            FILE_LIST,
            ACREATE_FILE,
            CREATE_FILE,
            AFILE_CONTENT,
            FILE_CONTENT,
            CREATE_FINE_TUNING_JOB,
            ACREATE_FINE_TUNING_JOB,
            ACANCEL_FINE_TUNING_JOB,
            CANCEL_FINE_TUNING_JOB,
            ALIST_FINE_TUNING_JOBS,
            LIST_FINE_TUNING_JOBS,
            ARETRIEVE_FINE_TUNING_JOB,
            RETRIEVE_FINE_TUNING_JOB,
            RESPONSES,
            ARESPONSES,
            /** An enum member indicating that [CallType] was instantiated with an unknown value. */
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
                EMBEDDING -> Value.EMBEDDING
                AEMBEDDING -> Value.AEMBEDDING
                COMPLETION -> Value.COMPLETION
                ACOMPLETION -> Value.ACOMPLETION
                ATEXT_COMPLETION -> Value.ATEXT_COMPLETION
                TEXT_COMPLETION -> Value.TEXT_COMPLETION
                IMAGE_GENERATION -> Value.IMAGE_GENERATION
                AIMAGE_GENERATION -> Value.AIMAGE_GENERATION
                MODERATION -> Value.MODERATION
                AMODERATION -> Value.AMODERATION
                ATRANSCRIPTION -> Value.ATRANSCRIPTION
                TRANSCRIPTION -> Value.TRANSCRIPTION
                ASPEECH -> Value.ASPEECH
                SPEECH -> Value.SPEECH
                RERANK -> Value.RERANK
                ARERANK -> Value.ARERANK
                _AREALTIME -> Value._AREALTIME
                CREATE_BATCH -> Value.CREATE_BATCH
                ACREATE_BATCH -> Value.ACREATE_BATCH
                ARETRIEVE_BATCH -> Value.ARETRIEVE_BATCH
                RETRIEVE_BATCH -> Value.RETRIEVE_BATCH
                PASS_THROUGH_ENDPOINT -> Value.PASS_THROUGH_ENDPOINT
                ANTHROPIC_MESSAGES -> Value.ANTHROPIC_MESSAGES
                GET_ASSISTANTS -> Value.GET_ASSISTANTS
                AGET_ASSISTANTS -> Value.AGET_ASSISTANTS
                CREATE_ASSISTANTS -> Value.CREATE_ASSISTANTS
                ACREATE_ASSISTANTS -> Value.ACREATE_ASSISTANTS
                DELETE_ASSISTANT -> Value.DELETE_ASSISTANT
                ADELETE_ASSISTANT -> Value.ADELETE_ASSISTANT
                ACREATE_THREAD -> Value.ACREATE_THREAD
                CREATE_THREAD -> Value.CREATE_THREAD
                AGET_THREAD -> Value.AGET_THREAD
                GET_THREAD -> Value.GET_THREAD
                A_ADD_MESSAGE -> Value.A_ADD_MESSAGE
                ADD_MESSAGE -> Value.ADD_MESSAGE
                AGET_MESSAGES -> Value.AGET_MESSAGES
                GET_MESSAGES -> Value.GET_MESSAGES
                ARUN_THREAD -> Value.ARUN_THREAD
                RUN_THREAD -> Value.RUN_THREAD
                ARUN_THREAD_STREAM -> Value.ARUN_THREAD_STREAM
                RUN_THREAD_STREAM -> Value.RUN_THREAD_STREAM
                AFILE_RETRIEVE -> Value.AFILE_RETRIEVE
                FILE_RETRIEVE -> Value.FILE_RETRIEVE
                AFILE_DELETE -> Value.AFILE_DELETE
                FILE_DELETE -> Value.FILE_DELETE
                AFILE_LIST -> Value.AFILE_LIST
                FILE_LIST -> Value.FILE_LIST
                ACREATE_FILE -> Value.ACREATE_FILE
                CREATE_FILE -> Value.CREATE_FILE
                AFILE_CONTENT -> Value.AFILE_CONTENT
                FILE_CONTENT -> Value.FILE_CONTENT
                CREATE_FINE_TUNING_JOB -> Value.CREATE_FINE_TUNING_JOB
                ACREATE_FINE_TUNING_JOB -> Value.ACREATE_FINE_TUNING_JOB
                ACANCEL_FINE_TUNING_JOB -> Value.ACANCEL_FINE_TUNING_JOB
                CANCEL_FINE_TUNING_JOB -> Value.CANCEL_FINE_TUNING_JOB
                ALIST_FINE_TUNING_JOBS -> Value.ALIST_FINE_TUNING_JOBS
                LIST_FINE_TUNING_JOBS -> Value.LIST_FINE_TUNING_JOBS
                ARETRIEVE_FINE_TUNING_JOB -> Value.ARETRIEVE_FINE_TUNING_JOB
                RETRIEVE_FINE_TUNING_JOB -> Value.RETRIEVE_FINE_TUNING_JOB
                RESPONSES -> Value.RESPONSES
                ARESPONSES -> Value.ARESPONSES
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
                EMBEDDING -> Known.EMBEDDING
                AEMBEDDING -> Known.AEMBEDDING
                COMPLETION -> Known.COMPLETION
                ACOMPLETION -> Known.ACOMPLETION
                ATEXT_COMPLETION -> Known.ATEXT_COMPLETION
                TEXT_COMPLETION -> Known.TEXT_COMPLETION
                IMAGE_GENERATION -> Known.IMAGE_GENERATION
                AIMAGE_GENERATION -> Known.AIMAGE_GENERATION
                MODERATION -> Known.MODERATION
                AMODERATION -> Known.AMODERATION
                ATRANSCRIPTION -> Known.ATRANSCRIPTION
                TRANSCRIPTION -> Known.TRANSCRIPTION
                ASPEECH -> Known.ASPEECH
                SPEECH -> Known.SPEECH
                RERANK -> Known.RERANK
                ARERANK -> Known.ARERANK
                _AREALTIME -> Known._AREALTIME
                CREATE_BATCH -> Known.CREATE_BATCH
                ACREATE_BATCH -> Known.ACREATE_BATCH
                ARETRIEVE_BATCH -> Known.ARETRIEVE_BATCH
                RETRIEVE_BATCH -> Known.RETRIEVE_BATCH
                PASS_THROUGH_ENDPOINT -> Known.PASS_THROUGH_ENDPOINT
                ANTHROPIC_MESSAGES -> Known.ANTHROPIC_MESSAGES
                GET_ASSISTANTS -> Known.GET_ASSISTANTS
                AGET_ASSISTANTS -> Known.AGET_ASSISTANTS
                CREATE_ASSISTANTS -> Known.CREATE_ASSISTANTS
                ACREATE_ASSISTANTS -> Known.ACREATE_ASSISTANTS
                DELETE_ASSISTANT -> Known.DELETE_ASSISTANT
                ADELETE_ASSISTANT -> Known.ADELETE_ASSISTANT
                ACREATE_THREAD -> Known.ACREATE_THREAD
                CREATE_THREAD -> Known.CREATE_THREAD
                AGET_THREAD -> Known.AGET_THREAD
                GET_THREAD -> Known.GET_THREAD
                A_ADD_MESSAGE -> Known.A_ADD_MESSAGE
                ADD_MESSAGE -> Known.ADD_MESSAGE
                AGET_MESSAGES -> Known.AGET_MESSAGES
                GET_MESSAGES -> Known.GET_MESSAGES
                ARUN_THREAD -> Known.ARUN_THREAD
                RUN_THREAD -> Known.RUN_THREAD
                ARUN_THREAD_STREAM -> Known.ARUN_THREAD_STREAM
                RUN_THREAD_STREAM -> Known.RUN_THREAD_STREAM
                AFILE_RETRIEVE -> Known.AFILE_RETRIEVE
                FILE_RETRIEVE -> Known.FILE_RETRIEVE
                AFILE_DELETE -> Known.AFILE_DELETE
                FILE_DELETE -> Known.FILE_DELETE
                AFILE_LIST -> Known.AFILE_LIST
                FILE_LIST -> Known.FILE_LIST
                ACREATE_FILE -> Known.ACREATE_FILE
                CREATE_FILE -> Known.CREATE_FILE
                AFILE_CONTENT -> Known.AFILE_CONTENT
                FILE_CONTENT -> Known.FILE_CONTENT
                CREATE_FINE_TUNING_JOB -> Known.CREATE_FINE_TUNING_JOB
                ACREATE_FINE_TUNING_JOB -> Known.ACREATE_FINE_TUNING_JOB
                ACANCEL_FINE_TUNING_JOB -> Known.ACANCEL_FINE_TUNING_JOB
                CANCEL_FINE_TUNING_JOB -> Known.CANCEL_FINE_TUNING_JOB
                ALIST_FINE_TUNING_JOBS -> Known.ALIST_FINE_TUNING_JOBS
                LIST_FINE_TUNING_JOBS -> Known.LIST_FINE_TUNING_JOBS
                ARETRIEVE_FINE_TUNING_JOB -> Known.ARETRIEVE_FINE_TUNING_JOB
                RETRIEVE_FINE_TUNING_JOB -> Known.RETRIEVE_FINE_TUNING_JOB
                RESPONSES -> Known.RESPONSES
                ARESPONSES -> Known.ARESPONSES
                else -> throw HanzoInvalidDataException("Unknown CallType: $value")
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

        fun validate(): CallType = apply {
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

            return other is CallType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UtilTransformRequestParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "UtilTransformRequestParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
