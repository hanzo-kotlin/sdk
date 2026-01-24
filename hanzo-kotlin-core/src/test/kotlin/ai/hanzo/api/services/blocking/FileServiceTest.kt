// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking

import ai.hanzo.api.TestServerExtension
import ai.hanzo.api.client.okhttp.HanzoOkHttpClient
import ai.hanzo.api.models.files.FileCreateParams
import ai.hanzo.api.models.files.FileDeleteParams
import ai.hanzo.api.models.files.FileListParams
import ai.hanzo.api.models.files.FileRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class FileServiceTest {

    @Disabled("Prism tests are disabled")
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

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val fileService = client.files()

        val files =
            fileService.list(
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
