// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.proguard

import ai.hanzo.api.client.okhttp.HanzoOkHttpClient
import ai.hanzo.api.core.JsonValue
import ai.hanzo.api.core.jsonMapper
import ai.hanzo.api.models.organization.UserRoles
import ai.hanzo.api.models.utils.UtilTokenCounterResponse
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.reflect.full.memberFunctions
import kotlin.reflect.jvm.javaMethod
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProGuardCompatibilityTest {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            // To debug that we're using the right JAR.
            val jarPath = this::class.java.getProtectionDomain().codeSource.location
            println("JAR being used: $jarPath")

            // We have to manually run the test methods instead of using the JUnit runner because it
            // seems impossible to get working with R8.
            val test = ProGuardCompatibilityTest()
            test::class
                .memberFunctions
                .asSequence()
                .filter { function ->
                    function.javaMethod?.isAnnotationPresent(Test::class.java) == true
                }
                .forEach { it.call(test) }
        }
    }

    @Test
    fun proguardRules() {
        val rulesFile =
            javaClass.classLoader.getResourceAsStream("META-INF/proguard/hanzo-kotlin-core.pro")

        assertThat(rulesFile).isNotNull()
    }

    @Test
    fun client() {
        val client = HanzoOkHttpClient.builder().apiKey("My API Key").build()

        assertThat(client).isNotNull()
        assertThat(client.models()).isNotNull()
        assertThat(client.openai()).isNotNull()
        assertThat(client.engines()).isNotNull()
        assertThat(client.chat()).isNotNull()
        assertThat(client.completions()).isNotNull()
        assertThat(client.embeddings()).isNotNull()
        assertThat(client.images()).isNotNull()
        assertThat(client.audio()).isNotNull()
        assertThat(client.assistants()).isNotNull()
        assertThat(client.threads()).isNotNull()
        assertThat(client.moderations()).isNotNull()
        assertThat(client.utils()).isNotNull()
        assertThat(client.model()).isNotNull()
        assertThat(client.modelGroup()).isNotNull()
        assertThat(client.routes()).isNotNull()
        assertThat(client.responses()).isNotNull()
        assertThat(client.batches()).isNotNull()
        assertThat(client.rerank()).isNotNull()
        assertThat(client.fineTuning()).isNotNull()
        assertThat(client.credentials()).isNotNull()
        assertThat(client.vertexAi()).isNotNull()
        assertThat(client.gemini()).isNotNull()
        assertThat(client.cohere()).isNotNull()
        assertThat(client.anthropic()).isNotNull()
        assertThat(client.bedrock()).isNotNull()
        assertThat(client.euAssemblyai()).isNotNull()
        assertThat(client.assemblyai()).isNotNull()
        assertThat(client.azure()).isNotNull()
        assertThat(client.langfuse()).isNotNull()
        assertThat(client.config()).isNotNull()
        assertThat(client.test()).isNotNull()
        assertThat(client.health()).isNotNull()
        assertThat(client.active()).isNotNull()
        assertThat(client.settings()).isNotNull()
        assertThat(client.key()).isNotNull()
        assertThat(client.user()).isNotNull()
        assertThat(client.team()).isNotNull()
        assertThat(client.organization()).isNotNull()
        assertThat(client.customer()).isNotNull()
        assertThat(client.spend()).isNotNull()
        assertThat(client.global()).isNotNull()
        assertThat(client.provider()).isNotNull()
        assertThat(client.cache()).isNotNull()
        assertThat(client.guardrails()).isNotNull()
        assertThat(client.add()).isNotNull()
        assertThat(client.delete()).isNotNull()
        assertThat(client.files()).isNotNull()
        assertThat(client.budget()).isNotNull()
    }

    @Test
    fun utilTokenCounterResponseRoundtrip() {
        val jsonMapper = jsonMapper()
        val utilTokenCounterResponse =
            UtilTokenCounterResponse.builder()
                .modelUsed("model_used")
                .requestModel("request_model")
                .tokenizerType("tokenizer_type")
                .totalTokens(0L)
                .error(true)
                .errorMessage("error_message")
                .originalResponse(
                    UtilTokenCounterResponse.OriginalResponse.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .statusCode(0L)
                .build()

        val roundtrippedUtilTokenCounterResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(utilTokenCounterResponse),
                jacksonTypeRef<UtilTokenCounterResponse>(),
            )

        assertThat(roundtrippedUtilTokenCounterResponse).isEqualTo(utilTokenCounterResponse)
    }

    @Test
    fun userRolesRoundtrip() {
        val jsonMapper = jsonMapper()
        val userRoles = UserRoles.PROXY_ADMIN

        val roundtrippedUserRoles =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(userRoles),
                jacksonTypeRef<UserRoles>(),
            )

        assertThat(roundtrippedUserRoles).isEqualTo(userRoles)
    }
}
