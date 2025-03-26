// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.TestServerExtension
import ai.hanzo.api.client.okhttp.HanzoOkHttpClientAsync
import ai.hanzo.api.core.JsonValue
import ai.hanzo.api.models.key.BlockKeyRequest
import ai.hanzo.api.models.key.KeyBlockParams
import ai.hanzo.api.models.key.KeyDeleteParams
import ai.hanzo.api.models.key.KeyGenerateParams
import ai.hanzo.api.models.key.KeyListParams
import ai.hanzo.api.models.key.KeyRegenerateByKeyParams
import ai.hanzo.api.models.key.KeyRetrieveInfoParams
import ai.hanzo.api.models.key.KeyUnblockParams
import ai.hanzo.api.models.key.KeyUpdateParams
import ai.hanzo.api.models.key.regenerate.RegenerateKeyRequest
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class KeyServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun update() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val keyServiceAsync = client.key()

        val key =
            keyServiceAsync.update(
                KeyUpdateParams.builder()
                    .llmChangedBy("llm-changed-by")
                    .key("key")
                    .aliases(JsonValue.from(mapOf<String, Any>()))
                    .addAllowedCacheControl(JsonValue.from(mapOf<String, Any>()))
                    .blocked(true)
                    .budgetDuration("budget_duration")
                    .budgetId("budget_id")
                    .config(JsonValue.from(mapOf<String, Any>()))
                    .duration("duration")
                    .addEnforcedParam("string")
                    .addGuardrail("string")
                    .keyAlias("key_alias")
                    .maxBudget(0.0)
                    .maxParallelRequests(0L)
                    .metadata(JsonValue.from(mapOf<String, Any>()))
                    .modelMaxBudget(JsonValue.from(mapOf<String, Any>()))
                    .modelRpmLimit(JsonValue.from(mapOf<String, Any>()))
                    .modelTpmLimit(JsonValue.from(mapOf<String, Any>()))
                    .addModel(JsonValue.from(mapOf<String, Any>()))
                    .permissions(JsonValue.from(mapOf<String, Any>()))
                    .rpmLimit(0L)
                    .spend(0.0)
                    .addTag("string")
                    .teamId("team_id")
                    .tempBudgetExpiry(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .tempBudgetIncrease(0.0)
                    .tpmLimit(0L)
                    .userId("user_id")
                    .build()
            )

        key.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun list() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val keyServiceAsync = client.key()

        val key =
            keyServiceAsync.list(
                KeyListParams.builder()
                    .includeTeamKeys(true)
                    .keyAlias("key_alias")
                    .organizationId("organization_id")
                    .page(1L)
                    .returnFullObject(true)
                    .size(1L)
                    .teamId("team_id")
                    .userId("user_id")
                    .build()
            )

        key.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun delete() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val keyServiceAsync = client.key()

        val key =
            keyServiceAsync.delete(
                KeyDeleteParams.builder()
                    .llmChangedBy("llm-changed-by")
                    .addKeyAlias("string")
                    .addKey("string")
                    .build()
            )

        key.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun block() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val keyServiceAsync = client.key()

        val response =
            keyServiceAsync.block(
                KeyBlockParams.builder()
                    .llmChangedBy("llm-changed-by")
                    .blockKeyRequest(BlockKeyRequest.builder().key("key").build())
                    .build()
            )

        response?.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun checkHealth() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val keyServiceAsync = client.key()

        val response = keyServiceAsync.checkHealth()

        response.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun generate() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val keyServiceAsync = client.key()

        val generateKeyResponse =
            keyServiceAsync.generate(
                KeyGenerateParams.builder()
                    .llmChangedBy("llm-changed-by")
                    .aliases(JsonValue.from(mapOf<String, Any>()))
                    .addAllowedCacheControl(JsonValue.from(mapOf<String, Any>()))
                    .blocked(true)
                    .budgetDuration("budget_duration")
                    .budgetId("budget_id")
                    .config(JsonValue.from(mapOf<String, Any>()))
                    .duration("duration")
                    .addEnforcedParam("string")
                    .addGuardrail("string")
                    .key("key")
                    .keyAlias("key_alias")
                    .maxBudget(0.0)
                    .maxParallelRequests(0L)
                    .metadata(JsonValue.from(mapOf<String, Any>()))
                    .modelMaxBudget(JsonValue.from(mapOf<String, Any>()))
                    .modelRpmLimit(JsonValue.from(mapOf<String, Any>()))
                    .modelTpmLimit(JsonValue.from(mapOf<String, Any>()))
                    .addModel(JsonValue.from(mapOf<String, Any>()))
                    .permissions(JsonValue.from(mapOf<String, Any>()))
                    .rpmLimit(0L)
                    .sendInviteEmail(true)
                    .softBudget(0.0)
                    .spend(0.0)
                    .addTag("string")
                    .teamId("team_id")
                    .tpmLimit(0L)
                    .userId("user_id")
                    .build()
            )

        generateKeyResponse.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun regenerateByKey() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val keyServiceAsync = client.key()

        val generateKeyResponse =
            keyServiceAsync.regenerateByKey(
                KeyRegenerateByKeyParams.builder()
                    .pathKey("key")
                    .llmChangedBy("llm-changed-by")
                    .regenerateKeyRequest(
                        RegenerateKeyRequest.builder()
                            .aliases(JsonValue.from(mapOf<String, Any>()))
                            .addAllowedCacheControl(JsonValue.from(mapOf<String, Any>()))
                            .blocked(true)
                            .budgetDuration("budget_duration")
                            .budgetId("budget_id")
                            .config(JsonValue.from(mapOf<String, Any>()))
                            .duration("duration")
                            .addEnforcedParam("string")
                            .addGuardrail("string")
                            .key("key")
                            .keyAlias("key_alias")
                            .maxBudget(0.0)
                            .maxParallelRequests(0L)
                            .metadata(JsonValue.from(mapOf<String, Any>()))
                            .modelMaxBudget(JsonValue.from(mapOf<String, Any>()))
                            .modelRpmLimit(JsonValue.from(mapOf<String, Any>()))
                            .modelTpmLimit(JsonValue.from(mapOf<String, Any>()))
                            .addModel(JsonValue.from(mapOf<String, Any>()))
                            .newMasterKey("new_master_key")
                            .permissions(JsonValue.from(mapOf<String, Any>()))
                            .rpmLimit(0L)
                            .sendInviteEmail(true)
                            .softBudget(0.0)
                            .spend(0.0)
                            .addTag("string")
                            .teamId("team_id")
                            .tpmLimit(0L)
                            .userId("user_id")
                            .build()
                    )
                    .build()
            )

        generateKeyResponse?.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun retrieveInfo() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val keyServiceAsync = client.key()

        val response =
            keyServiceAsync.retrieveInfo(KeyRetrieveInfoParams.builder().key("key").build())

        response.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun unblock() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val keyServiceAsync = client.key()

        val response =
            keyServiceAsync.unblock(
                KeyUnblockParams.builder()
                    .llmChangedBy("llm-changed-by")
                    .blockKeyRequest(BlockKeyRequest.builder().key("key").build())
                    .build()
            )

        response.validate()
    }
}
