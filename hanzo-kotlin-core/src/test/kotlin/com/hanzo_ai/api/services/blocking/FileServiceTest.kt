// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.blocking

import com.hanzo_ai.api.TestServerExtension
import com.hanzo_ai.api.client.okhttp.HanzoOkHttpClient
import com.hanzo_ai.api.models.files.FileCreateParams
import com.hanzo_ai.api.models.files.FileDeleteParams
import com.hanzo_ai.api.models.files.FileListParams
import com.hanzo_ai.api.models.files.FileRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class FileServiceTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val fileService = client.files()

        val file =
            fileService.create(
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
    fun retrieve() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val fileService = client.files()

        val file =
            fileService.retrieve(
                FileRetrieveParams.builder().provider("provider").fileId("file_id").build()
            )

        file.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun list() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val fileService = client.files()

        val file =
            fileService.list(
                FileListParams.builder().provider("provider").purpose("purpose").build()
            )

        file.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun delete() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val fileService = client.files()

        val file =
            fileService.delete(
                FileDeleteParams.builder().provider("provider").fileId("file_id").build()
            )

        file.validate()
    }
}
