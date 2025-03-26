// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.blocking.files

import com.hanzo_ai.api.TestServerExtension
import com.hanzo_ai.api.client.okhttp.HanzoOkHttpClient
import com.hanzo_ai.api.models.files.content.ContentRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ContentServiceTest {

    @Disabled("skipped: tests are disabled for the time being")
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
