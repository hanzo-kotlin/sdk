// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.models.files

import com.hanzo_ai.api.core.MultipartField
import java.io.InputStream
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class FileCreateParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        FileCreateParams.builder()
            .provider("provider")
            .file("some content".toByteArray())
            .purpose("purpose")
            .customLlmProvider("custom_llm_provider")
            .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun pathParams() {
        val params =
            FileCreateParams.builder()
                .provider("provider")
                .file("some content".toByteArray())
                .purpose("purpose")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("provider")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun body() {
        val params =
            FileCreateParams.builder()
                .provider("provider")
                .file("some content".toByteArray())
                .purpose("purpose")
                .customLlmProvider("custom_llm_provider")
                .build()

        val body = params._body()

        assertThat(body.filterValues { !it.value.isNull() })
            .usingRecursiveComparison()
            // TODO(AssertJ): Replace this and the `mapValues` below with:
            // https://github.com/assertj/assertj/issues/3165
            .withEqualsForType(
                { a, b -> a.readBytes() contentEquals b.readBytes() },
                InputStream::class.java,
            )
            .isEqualTo(
                mapOf(
                        "file" to MultipartField.of("some content".toByteArray()),
                        "purpose" to MultipartField.of("purpose"),
                        "custom_llm_provider" to MultipartField.of("custom_llm_provider"),
                    )
                    .mapValues { (_, field) ->
                        field.map { (it as? ByteArray)?.inputStream() ?: it }
                    }
            )
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            FileCreateParams.builder()
                .provider("provider")
                .file("some content".toByteArray())
                .purpose("purpose")
                .build()

        val body = params._body()

        assertThat(body.filterValues { !it.value.isNull() })
            .usingRecursiveComparison()
            // TODO(AssertJ): Replace this and the `mapValues` below with:
            // https://github.com/assertj/assertj/issues/3165
            .withEqualsForType(
                { a, b -> a.readBytes() contentEquals b.readBytes() },
                InputStream::class.java,
            )
            .isEqualTo(
                mapOf(
                        "file" to MultipartField.of("some content".toByteArray()),
                        "purpose" to MultipartField.of("purpose"),
                    )
                    .mapValues { (_, field) ->
                        field.map { (it as? ByteArray)?.inputStream() ?: it }
                    }
            )
    }
}
