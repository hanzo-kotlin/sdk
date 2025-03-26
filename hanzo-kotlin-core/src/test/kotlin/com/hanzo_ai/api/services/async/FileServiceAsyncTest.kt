// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.async

import com.hanzo_ai.api.TestServerExtension
import com.hanzo_ai.api.client.okhttp.HanzoOkHttpClientAsync
import com.hanzo_ai.api.models.files.FileCreateParams
import com.hanzo_ai.api.models.files.FileDeleteParams
import com.hanzo_ai.api.models.files.FileListParams
import com.hanzo_ai.api.models.files.FileRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class FileServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun create() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val fileServiceAsync = client.files()

        val file =
            fileServiceAsync.create(
                FileCreateParams.builder()
                    .provider("provider")
                    .file("some content".toByteArray())
                    .purpose("purpose")
                    .customLlmProvider("custom_llm_provider")
                    .build()
            )

        file.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun retrieve() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val fileServiceAsync = client.files()

        val file =
            fileServiceAsync.retrieve(
                FileRetrieveParams.builder().provider("provider").fileId("file_id").build()
            )

        file.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun list() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val fileServiceAsync = client.files()

        val file =
            fileServiceAsync.list(
                FileListParams.builder().provider("provider").purpose("purpose").build()
            )

        file.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun delete() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val fileServiceAsync = client.files()

        val file =
            fileServiceAsync.delete(
                FileDeleteParams.builder().provider("provider").fileId("file_id").build()
            )

        file.validate()
    }
}
