// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.client

import com.google.errorprone.annotations.MustBeClosed
import com.hanzo_ai.api.core.RequestOptions
import com.hanzo_ai.api.core.http.HttpResponseFor
import com.hanzo_ai.api.models.ClientGetHomeParams
import com.hanzo_ai.api.models.ClientGetHomeResponse
import com.hanzo_ai.api.services.blocking.ActiveService
import com.hanzo_ai.api.services.blocking.AddService
import com.hanzo_ai.api.services.blocking.AnthropicService
import com.hanzo_ai.api.services.blocking.AssemblyaiService
import com.hanzo_ai.api.services.blocking.AssistantService
import com.hanzo_ai.api.services.blocking.AudioService
import com.hanzo_ai.api.services.blocking.AzureService
import com.hanzo_ai.api.services.blocking.BatchService
import com.hanzo_ai.api.services.blocking.BedrockService
import com.hanzo_ai.api.services.blocking.BudgetService
import com.hanzo_ai.api.services.blocking.CacheService
import com.hanzo_ai.api.services.blocking.ChatService
import com.hanzo_ai.api.services.blocking.CohereService
import com.hanzo_ai.api.services.blocking.CompletionService
import com.hanzo_ai.api.services.blocking.ConfigService
import com.hanzo_ai.api.services.blocking.CredentialService
import com.hanzo_ai.api.services.blocking.CustomerService
import com.hanzo_ai.api.services.blocking.DeleteService
import com.hanzo_ai.api.services.blocking.EmbeddingService
import com.hanzo_ai.api.services.blocking.EngineService
import com.hanzo_ai.api.services.blocking.EuAssemblyaiService
import com.hanzo_ai.api.services.blocking.FileService
import com.hanzo_ai.api.services.blocking.FineTuningService
import com.hanzo_ai.api.services.blocking.GeminiService
import com.hanzo_ai.api.services.blocking.GlobalService
import com.hanzo_ai.api.services.blocking.GuardrailService
import com.hanzo_ai.api.services.blocking.HealthService
import com.hanzo_ai.api.services.blocking.ImageService
import com.hanzo_ai.api.services.blocking.KeyService
import com.hanzo_ai.api.services.blocking.LangfuseService
import com.hanzo_ai.api.services.blocking.ModelGroupService
import com.hanzo_ai.api.services.blocking.ModelService
import com.hanzo_ai.api.services.blocking.ModerationService
import com.hanzo_ai.api.services.blocking.OpenAIService
import com.hanzo_ai.api.services.blocking.OrganizationService
import com.hanzo_ai.api.services.blocking.ProviderService
import com.hanzo_ai.api.services.blocking.RerankService
import com.hanzo_ai.api.services.blocking.ResponseService
import com.hanzo_ai.api.services.blocking.RouteService
import com.hanzo_ai.api.services.blocking.SettingService
import com.hanzo_ai.api.services.blocking.SpendService
import com.hanzo_ai.api.services.blocking.TeamService
import com.hanzo_ai.api.services.blocking.TestService
import com.hanzo_ai.api.services.blocking.ThreadService
import com.hanzo_ai.api.services.blocking.UserService
import com.hanzo_ai.api.services.blocking.UtilService
import com.hanzo_ai.api.services.blocking.VertexAiService

/**
 * A client for interacting with the Hanzo REST API synchronously. You can also switch to
 * asynchronous execution via the [async] method.
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
interface HanzoClient {

    /**
     * Returns a version of this client that uses asynchronous execution.
     *
     * The returned client shares its resources, like its connection pool and thread pools, with
     * this client.
     */
    fun async(): HanzoClientAsync

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun models(): ModelService

    fun openai(): OpenAIService

    fun engines(): EngineService

    fun chat(): ChatService

    fun completions(): CompletionService

    fun embeddings(): EmbeddingService

    fun images(): ImageService

    fun audio(): AudioService

    fun assistants(): AssistantService

    fun threads(): ThreadService

    fun moderations(): ModerationService

    fun utils(): UtilService

    fun model(): ModelService

    fun modelGroup(): ModelGroupService

    fun routes(): RouteService

    fun responses(): ResponseService

    fun batches(): BatchService

    fun rerank(): RerankService

    fun fineTuning(): FineTuningService

    fun credentials(): CredentialService

    fun vertexAi(): VertexAiService

    fun gemini(): GeminiService

    fun cohere(): CohereService

    fun anthropic(): AnthropicService

    fun bedrock(): BedrockService

    fun euAssemblyai(): EuAssemblyaiService

    fun assemblyai(): AssemblyaiService

    fun azure(): AzureService

    fun langfuse(): LangfuseService

    fun config(): ConfigService

    fun test(): TestService

    fun health(): HealthService

    fun active(): ActiveService

    fun settings(): SettingService

    fun key(): KeyService

    fun user(): UserService

    fun team(): TeamService

    fun organization(): OrganizationService

    fun customer(): CustomerService

    fun spend(): SpendService

    fun global(): GlobalService

    fun provider(): ProviderService

    fun cache(): CacheService

    fun guardrails(): GuardrailService

    fun add(): AddService

    fun delete(): DeleteService

    fun files(): FileService

    fun budget(): BudgetService

    /** Home */
    fun getHome(
        params: ClientGetHomeParams = ClientGetHomeParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ClientGetHomeResponse

    /** @see [getHome] */
    fun getHome(requestOptions: RequestOptions): ClientGetHomeResponse =
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

    /** A view of [HanzoClient] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        fun models(): ModelService.WithRawResponse

        fun openai(): OpenAIService.WithRawResponse

        fun engines(): EngineService.WithRawResponse

        fun chat(): ChatService.WithRawResponse

        fun completions(): CompletionService.WithRawResponse

        fun embeddings(): EmbeddingService.WithRawResponse

        fun images(): ImageService.WithRawResponse

        fun audio(): AudioService.WithRawResponse

        fun assistants(): AssistantService.WithRawResponse

        fun threads(): ThreadService.WithRawResponse

        fun moderations(): ModerationService.WithRawResponse

        fun utils(): UtilService.WithRawResponse

        fun model(): ModelService.WithRawResponse

        fun modelGroup(): ModelGroupService.WithRawResponse

        fun routes(): RouteService.WithRawResponse

        fun responses(): ResponseService.WithRawResponse

        fun batches(): BatchService.WithRawResponse

        fun rerank(): RerankService.WithRawResponse

        fun fineTuning(): FineTuningService.WithRawResponse

        fun credentials(): CredentialService.WithRawResponse

        fun vertexAi(): VertexAiService.WithRawResponse

        fun gemini(): GeminiService.WithRawResponse

        fun cohere(): CohereService.WithRawResponse

        fun anthropic(): AnthropicService.WithRawResponse

        fun bedrock(): BedrockService.WithRawResponse

        fun euAssemblyai(): EuAssemblyaiService.WithRawResponse

        fun assemblyai(): AssemblyaiService.WithRawResponse

        fun azure(): AzureService.WithRawResponse

        fun langfuse(): LangfuseService.WithRawResponse

        fun config(): ConfigService.WithRawResponse

        fun test(): TestService.WithRawResponse

        fun health(): HealthService.WithRawResponse

        fun active(): ActiveService.WithRawResponse

        fun settings(): SettingService.WithRawResponse

        fun key(): KeyService.WithRawResponse

        fun user(): UserService.WithRawResponse

        fun team(): TeamService.WithRawResponse

        fun organization(): OrganizationService.WithRawResponse

        fun customer(): CustomerService.WithRawResponse

        fun spend(): SpendService.WithRawResponse

        fun global(): GlobalService.WithRawResponse

        fun provider(): ProviderService.WithRawResponse

        fun cache(): CacheService.WithRawResponse

        fun guardrails(): GuardrailService.WithRawResponse

        fun add(): AddService.WithRawResponse

        fun delete(): DeleteService.WithRawResponse

        fun files(): FileService.WithRawResponse

        fun budget(): BudgetService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /`, but is otherwise the same as
         * [HanzoClient.getHome].
         */
        @MustBeClosed
        fun getHome(
            params: ClientGetHomeParams = ClientGetHomeParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ClientGetHomeResponse>

        /** @see [getHome] */
        @MustBeClosed
        fun getHome(requestOptions: RequestOptions): HttpResponseFor<ClientGetHomeResponse> =
            getHome(ClientGetHomeParams.none(), requestOptions)
    }
}
