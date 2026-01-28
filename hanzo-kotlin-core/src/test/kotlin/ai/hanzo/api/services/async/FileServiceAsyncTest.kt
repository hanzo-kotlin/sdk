// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.TestServerExtension
import ai.hanzo.api.client.okhttp.HanzoOkHttpClientAsync
import ai.hanzo.api.models.files.FileCreateParams
import ai.hanzo.api.models.files.FileDeleteParams
import ai.hanzo.api.models.files.FileListParams
import ai.hanzo.api.models.files.FileRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class FileServiceAsyncTest {

    @Disabled("Prism tests are disabled")
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
                    .file("some content".byteInputStream())
                    .purpose("purpose")
                    .customLlmProvider("custom_llm_provider")
                    .litellmMetadata("litellm_metadata")
                    .targetModelNames("target_model_names")
                    .targetStorage("target_storage")
                    .build()
            )

        file.validate()
    }

    @Disabled("Prism tests are disabled")
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

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun list() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val fileServiceAsync = client.files()

        val files =
            fileServiceAsync.list(
                FileListParams.builder()
                    .provider("provider")
                    .purpose("purpose")
                    .targetModelNames("target_model_names")
                    .build()
            )

        files.validate()
    }

    @Disabled("Prism tests are disabled")
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
