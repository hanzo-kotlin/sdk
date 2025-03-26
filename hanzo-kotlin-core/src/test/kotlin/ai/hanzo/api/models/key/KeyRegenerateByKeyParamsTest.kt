// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.key

import ai.hanzo.api.core.JsonValue
import ai.hanzo.api.core.http.Headers
import ai.hanzo.api.models.key.regenerate.RegenerateKeyRequest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class KeyRegenerateByKeyParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
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
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun pathParams() {
        val params = KeyRegenerateByKeyParams.builder().pathKey("key").build()

        assertThat(params._pathParam(0)).isEqualTo("key")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun headers() {
        val params =
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

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(Headers.builder().put("llm-changed-by", "llm-changed-by").build())
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun headersWithoutOptionalFields() {
        val params = KeyRegenerateByKeyParams.builder().pathKey("key").build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body)
            .isEqualTo(
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
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun bodyWithoutOptionalFields() {
        val params = KeyRegenerateByKeyParams.builder().pathKey("key").build()

        val body = params._body()
    }
}
