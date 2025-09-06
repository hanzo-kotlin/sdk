// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking.files

import ai.hanzo.api.TestServerExtension
import ai.hanzo.api.client.okhttp.HanzoOkHttpClient
import ai.hanzo.api.models.files.content.ContentRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ContentServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val contentService = client.files().content()

        val content =
            contentService.retrieve(
                ContentRetrieveParams.builder().provider("provider").fileId("file_id").build()
            )

        content.validate()
    }
}
