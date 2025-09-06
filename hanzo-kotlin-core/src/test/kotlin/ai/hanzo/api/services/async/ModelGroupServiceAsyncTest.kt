// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.TestServerExtension
import ai.hanzo.api.client.okhttp.HanzoOkHttpClientAsync
import ai.hanzo.api.models.modelgroup.ModelGroupRetrieveInfoParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ModelGroupServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun retrieveInfo() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val modelGroupServiceAsync = client.modelGroup()

        val response =
            modelGroupServiceAsync.retrieveInfo(
                ModelGroupRetrieveInfoParams.builder().modelGroup("model_group").build()
            )

        response.validate()
    }
}
