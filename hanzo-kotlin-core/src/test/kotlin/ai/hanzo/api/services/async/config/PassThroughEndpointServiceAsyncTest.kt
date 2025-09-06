// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async.config

import ai.hanzo.api.TestServerExtension
import ai.hanzo.api.client.okhttp.HanzoOkHttpClientAsync
import ai.hanzo.api.core.JsonValue
import ai.hanzo.api.models.config.passthroughendpoint.PassThroughEndpointCreateParams
import ai.hanzo.api.models.config.passthroughendpoint.PassThroughEndpointDeleteParams
import ai.hanzo.api.models.config.passthroughendpoint.PassThroughEndpointListParams
import ai.hanzo.api.models.config.passthroughendpoint.PassThroughGenericEndpoint
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PassThroughEndpointServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun create() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val passThroughEndpointServiceAsync = client.config().passThroughEndpoint()

        val passThroughEndpoint =
            passThroughEndpointServiceAsync.create(
                PassThroughEndpointCreateParams.builder()
                    .passThroughGenericEndpoint(
                        PassThroughGenericEndpoint.builder()
                            .headers(JsonValue.from(mapOf<String, Any>()))
                            .path("path")
                            .target("target")
                            .build()
                    )
                    .build()
            )

        passThroughEndpoint.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun update() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val passThroughEndpointServiceAsync = client.config().passThroughEndpoint()

        val passThroughEndpoint = passThroughEndpointServiceAsync.update("endpoint_id")

        passThroughEndpoint.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun list() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val passThroughEndpointServiceAsync = client.config().passThroughEndpoint()

        val passThroughEndpointResponse =
            passThroughEndpointServiceAsync.list(
                PassThroughEndpointListParams.builder().endpointId("endpoint_id").build()
            )

        passThroughEndpointResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun delete() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val passThroughEndpointServiceAsync = client.config().passThroughEndpoint()

        val passThroughEndpointResponse =
            passThroughEndpointServiceAsync.delete(
                PassThroughEndpointDeleteParams.builder().endpointId("endpoint_id").build()
            )

        passThroughEndpointResponse.validate()
    }
}
