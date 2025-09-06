// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking.config

import ai.hanzo.api.TestServerExtension
import ai.hanzo.api.client.okhttp.HanzoOkHttpClient
import ai.hanzo.api.core.JsonValue
import ai.hanzo.api.models.config.passthroughendpoint.PassThroughEndpointCreateParams
import ai.hanzo.api.models.config.passthroughendpoint.PassThroughEndpointDeleteParams
import ai.hanzo.api.models.config.passthroughendpoint.PassThroughEndpointListParams
import ai.hanzo.api.models.config.passthroughendpoint.PassThroughGenericEndpoint
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PassThroughEndpointServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val passThroughEndpointService = client.config().passThroughEndpoint()

        val passThroughEndpoint =
            passThroughEndpointService.create(
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
    fun update() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val passThroughEndpointService = client.config().passThroughEndpoint()

        val passThroughEndpoint = passThroughEndpointService.update("endpoint_id")

        passThroughEndpoint.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val passThroughEndpointService = client.config().passThroughEndpoint()

        val passThroughEndpointResponse =
            passThroughEndpointService.list(
                PassThroughEndpointListParams.builder().endpointId("endpoint_id").build()
            )

        passThroughEndpointResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val passThroughEndpointService = client.config().passThroughEndpoint()

        val passThroughEndpointResponse =
            passThroughEndpointService.delete(
                PassThroughEndpointDeleteParams.builder().endpointId("endpoint_id").build()
            )

        passThroughEndpointResponse.validate()
    }
}
