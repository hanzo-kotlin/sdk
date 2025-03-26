// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.client

import com.google.errorprone.annotations.MustBeClosed
import com.hanzo_ai.api.core.RequestOptions
import com.hanzo_ai.api.core.http.HttpResponseFor
import com.hanzo_ai.api.models.ClientGetHomeParams
import com.hanzo_ai.api.models.ClientGetHomeResponse
import com.hanzo_ai.api.services.async.ActiveServiceAsync
import com.hanzo_ai.api.services.async.AddServiceAsync
import com.hanzo_ai.api.services.async.AnthropicServiceAsync
import com.hanzo_ai.api.services.async.AssemblyaiServiceAsync
import com.hanzo_ai.api.services.async.AssistantServiceAsync
import com.hanzo_ai.api.services.async.AudioServiceAsync
import com.hanzo_ai.api.services.async.AzureServiceAsync
import com.hanzo_ai.api.services.async.BatchServiceAsync
import com.hanzo_ai.api.services.async.BedrockServiceAsync
import com.hanzo_ai.api.services.async.BudgetServiceAsync
import com.hanzo_ai.api.services.async.CacheServiceAsync
import com.hanzo_ai.api.services.async.ChatServiceAsync
import com.hanzo_ai.api.services.async.CohereServiceAsync
import com.hanzo_ai.api.services.async.CompletionServiceAsync
import com.hanzo_ai.api.services.async.ConfigServiceAsync
import com.hanzo_ai.api.services.async.CredentialServiceAsync
import com.hanzo_ai.api.services.async.CustomerServiceAsync
import com.hanzo_ai.api.services.async.DeleteServiceAsync
import com.hanzo_ai.api.services.async.EmbeddingServiceAsync
import com.hanzo_ai.api.services.async.EngineServiceAsync
import com.hanzo_ai.api.services.async.EuAssemblyaiServiceAsync
import com.hanzo_ai.api.services.async.FileServiceAsync
import com.hanzo_ai.api.services.async.FineTuningServiceAsync
import com.hanzo_ai.api.services.async.GeminiServiceAsync
import com.hanzo_ai.api.services.async.GlobalServiceAsync
import com.hanzo_ai.api.services.async.GuardrailServiceAsync
import com.hanzo_ai.api.services.async.HealthServiceAsync
import com.hanzo_ai.api.services.async.ImageServiceAsync
import com.hanzo_ai.api.services.async.KeyServiceAsync
import com.hanzo_ai.api.services.async.LangfuseServiceAsync
import com.hanzo_ai.api.services.async.ModelGroupServiceAsync
import com.hanzo_ai.api.services.async.ModelServiceAsync
import com.hanzo_ai.api.services.async.ModerationServiceAsync
import com.hanzo_ai.api.services.async.OpenAIServiceAsync
import com.hanzo_ai.api.services.async.OrganizationServiceAsync
import com.hanzo_ai.api.services.async.ProviderServiceAsync
import com.hanzo_ai.api.services.async.RerankServiceAsync
import com.hanzo_ai.api.services.async.ResponseServiceAsync
import com.hanzo_ai.api.services.async.RouteServiceAsync
import com.hanzo_ai.api.services.async.SettingServiceAsync
import com.hanzo_ai.api.services.async.SpendServiceAsync
import com.hanzo_ai.api.services.async.TeamServiceAsync
import com.hanzo_ai.api.services.async.TestServiceAsync
import com.hanzo_ai.api.services.async.ThreadServiceAsync
import com.hanzo_ai.api.services.async.UserServiceAsync
import com.hanzo_ai.api.services.async.UtilServiceAsync
import com.hanzo_ai.api.services.async.VertexAiServiceAsync

/**
 * A client for interacting with the Hanzo REST API asynchronously. You can also switch to
 * synchronous execution via the [sync] method.
 *
 * This client performs best when you create a single instance and reuse it for all interactions
 * with the REST API. This is because each client holds its own connection pool and thread pools.
 * Reusing connections and threads reduces latency and saves memory. The client also handles rate
 * limiting per client. This means that creating and using multiple instances at the same time will
 * not respect rate limits.
 *
 * The threads and connections that are held will be released automatically if they remain idle. But
 * if you are writing an application that needs to aggressively release unused resources, then you
 * may call [close].
 */
interface HanzoClientAsync {

    /**
     * Returns a version of this client that uses synchronous execution.
     *
     * The returned client shares its resources, like its connection pool and thread pools, with
     * this client.
     */
    fun sync(): HanzoClient

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun models(): ModelServiceAsync

    fun openai(): OpenAIServiceAsync

    fun engines(): EngineServiceAsync

    fun chat(): ChatServiceAsync

    fun completions(): CompletionServiceAsync

    fun embeddings(): EmbeddingServiceAsync

    fun images(): ImageServiceAsync

    fun audio(): AudioServiceAsync

    fun assistants(): AssistantServiceAsync

    fun threads(): ThreadServiceAsync

    fun moderations(): ModerationServiceAsync

    fun utils(): UtilServiceAsync

    fun model(): ModelServiceAsync

    fun modelGroup(): ModelGroupServiceAsync

    fun routes(): RouteServiceAsync

    fun responses(): ResponseServiceAsync

    fun batches(): BatchServiceAsync

    fun rerank(): RerankServiceAsync

    fun fineTuning(): FineTuningServiceAsync

    fun credentials(): CredentialServiceAsync

    fun vertexAi(): VertexAiServiceAsync

    fun gemini(): GeminiServiceAsync

    fun cohere(): CohereServiceAsync

    fun anthropic(): AnthropicServiceAsync

    fun bedrock(): BedrockServiceAsync

    fun euAssemblyai(): EuAssemblyaiServiceAsync

    fun assemblyai(): AssemblyaiServiceAsync

    fun azure(): AzureServiceAsync

    fun langfuse(): LangfuseServiceAsync

    fun config(): ConfigServiceAsync

    fun test(): TestServiceAsync

    fun health(): HealthServiceAsync

    fun active(): ActiveServiceAsync

    fun settings(): SettingServiceAsync

    fun key(): KeyServiceAsync

    fun user(): UserServiceAsync

    fun team(): TeamServiceAsync

    fun organization(): OrganizationServiceAsync

    fun customer(): CustomerServiceAsync

    fun spend(): SpendServiceAsync

    fun global(): GlobalServiceAsync

    fun provider(): ProviderServiceAsync

    fun cache(): CacheServiceAsync

    fun guardrails(): GuardrailServiceAsync

    fun add(): AddServiceAsync

    fun delete(): DeleteServiceAsync

    fun files(): FileServiceAsync

    fun budget(): BudgetServiceAsync

    /** Home */
    suspend fun getHome(
        params: ClientGetHomeParams = ClientGetHomeParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ClientGetHomeResponse

    /** @see [getHome] */
    suspend fun getHome(requestOptions: RequestOptions): ClientGetHomeResponse =
        getHome(ClientGetHomeParams.none(), requestOptions)

    /**
     * Closes this client, relinquishing any underlying resources.
     *
     * This is purposefully not inherited from [AutoCloseable] because the client is long-lived and
     * usually should not be synchronously closed via try-with-resources.
     *
     * It's also usually not necessary to call this method at all. the default HTTP client
     * automatically releases threads and connections if they remain idle, but if you are writing an
     * application that needs to aggressively release unused resources, then you may call this
     * method.
     */
    fun close()

    /** A view of [HanzoClientAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        fun models(): ModelServiceAsync.WithRawResponse

        fun openai(): OpenAIServiceAsync.WithRawResponse

        fun engines(): EngineServiceAsync.WithRawResponse

        fun chat(): ChatServiceAsync.WithRawResponse

        fun completions(): CompletionServiceAsync.WithRawResponse

        fun embeddings(): EmbeddingServiceAsync.WithRawResponse

        fun images(): ImageServiceAsync.WithRawResponse

        fun audio(): AudioServiceAsync.WithRawResponse

        fun assistants(): AssistantServiceAsync.WithRawResponse

        fun threads(): ThreadServiceAsync.WithRawResponse

        fun moderations(): ModerationServiceAsync.WithRawResponse

        fun utils(): UtilServiceAsync.WithRawResponse

        fun model(): ModelServiceAsync.WithRawResponse

        fun modelGroup(): ModelGroupServiceAsync.WithRawResponse

        fun routes(): RouteServiceAsync.WithRawResponse

        fun responses(): ResponseServiceAsync.WithRawResponse

        fun batches(): BatchServiceAsync.WithRawResponse

        fun rerank(): RerankServiceAsync.WithRawResponse

        fun fineTuning(): FineTuningServiceAsync.WithRawResponse

        fun credentials(): CredentialServiceAsync.WithRawResponse

        fun vertexAi(): VertexAiServiceAsync.WithRawResponse

        fun gemini(): GeminiServiceAsync.WithRawResponse

        fun cohere(): CohereServiceAsync.WithRawResponse

        fun anthropic(): AnthropicServiceAsync.WithRawResponse

        fun bedrock(): BedrockServiceAsync.WithRawResponse

        fun euAssemblyai(): EuAssemblyaiServiceAsync.WithRawResponse

        fun assemblyai(): AssemblyaiServiceAsync.WithRawResponse

        fun azure(): AzureServiceAsync.WithRawResponse

        fun langfuse(): LangfuseServiceAsync.WithRawResponse

        fun config(): ConfigServiceAsync.WithRawResponse

        fun test(): TestServiceAsync.WithRawResponse

        fun health(): HealthServiceAsync.WithRawResponse

        fun active(): ActiveServiceAsync.WithRawResponse

        fun settings(): SettingServiceAsync.WithRawResponse

        fun key(): KeyServiceAsync.WithRawResponse

        fun user(): UserServiceAsync.WithRawResponse

        fun team(): TeamServiceAsync.WithRawResponse

        fun organization(): OrganizationServiceAsync.WithRawResponse

        fun customer(): CustomerServiceAsync.WithRawResponse

        fun spend(): SpendServiceAsync.WithRawResponse

        fun global(): GlobalServiceAsync.WithRawResponse

        fun provider(): ProviderServiceAsync.WithRawResponse

        fun cache(): CacheServiceAsync.WithRawResponse

        fun guardrails(): GuardrailServiceAsync.WithRawResponse

        fun add(): AddServiceAsync.WithRawResponse

        fun delete(): DeleteServiceAsync.WithRawResponse

        fun files(): FileServiceAsync.WithRawResponse

        fun budget(): BudgetServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /`, but is otherwise the same as
         * [HanzoClientAsync.getHome].
         */
        @MustBeClosed
        suspend fun getHome(
            params: ClientGetHomeParams = ClientGetHomeParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ClientGetHomeResponse>

        /** @see [getHome] */
        @MustBeClosed
        suspend fun getHome(
            requestOptions: RequestOptions
        ): HttpResponseFor<ClientGetHomeResponse> =
            getHome(ClientGetHomeParams.none(), requestOptions)
    }
}
