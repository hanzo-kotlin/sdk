// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.TestServerExtension
import ai.hanzo.api.client.okhttp.HanzoOkHttpClientAsync
import ai.hanzo.api.core.JsonValue
import ai.hanzo.api.models.model.ModelCreateParams
import ai.hanzo.api.models.model.ModelDeleteParams
import ai.hanzo.api.models.model.ModelInfo
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ModelServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun create() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val modelServiceAsync = client.model()

        val model =
            modelServiceAsync.create(
                ModelCreateParams.builder()
                    .llmParams(
                        ModelCreateParams.LlmParams.builder()
                            .model("model")
                            .apiBase("api_base")
                            .apiKey("api_key")
                            .apiVersion("api_version")
                            .awsAccessKeyId("aws_access_key_id")
                            .awsRegionName("aws_region_name")
                            .awsSecretAccessKey("aws_secret_access_key")
                            .budgetDuration("budget_duration")
                            .addConfigurableClientsideAuthParam("string")
                            .customLlmProvider("custom_llm_provider")
                            .inputCostPerSecond(0.0)
                            .inputCostPerToken(0.0)
                            .llmTraceId("llm_trace_id")
                            .maxBudget(0.0)
                            .maxFileSizeMb(0.0)
                            .maxRetries(0L)
                            .mergeReasoningContentInChoices(true)
                            .modelInfo(JsonValue.from(mapOf<String, Any>()))
                            .organization("organization")
                            .outputCostPerSecond(0.0)
                            .outputCostPerToken(0.0)
                            .regionName("region_name")
                            .rpm(0L)
                            .streamTimeout(0.0)
                            .timeout(0.0)
                            .tpm(0L)
                            .useInPassThrough(true)
                            .vertexCredentials(JsonValue.from(mapOf<String, Any>()))
                            .vertexLocation("vertex_location")
                            .vertexProject("vertex_project")
                            .watsonxRegionName("watsonx_region_name")
                            .build()
                    )
                    .modelInfo(
                        ModelInfo.builder()
                            .id("id")
                            .baseModel("base_model")
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .createdBy("created_by")
                            .dbModel(true)
                            .teamId("team_id")
                            .teamPublicModelName("team_public_model_name")
                            .tier(ModelInfo.Tier.FREE)
                            .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .updatedBy("updated_by")
                            .build()
                    )
                    .modelName("model_name")
                    .build()
            )

        model.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun delete() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val modelServiceAsync = client.model()

        val model = modelServiceAsync.delete(ModelDeleteParams.builder().id("id").build())

        model.validate()
    }
}
