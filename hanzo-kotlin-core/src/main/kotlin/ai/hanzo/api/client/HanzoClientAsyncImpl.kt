// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.client

import ai.hanzo.api.core.ClientOptions
import ai.hanzo.api.core.JsonValue
import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.getPackageVersion
import ai.hanzo.api.core.handlers.errorHandler
import ai.hanzo.api.core.handlers.jsonHandler
import ai.hanzo.api.core.handlers.withErrorHandler
import ai.hanzo.api.core.http.HttpMethod
import ai.hanzo.api.core.http.HttpRequest
import ai.hanzo.api.core.http.HttpResponse.Handler
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.core.http.parseable
import ai.hanzo.api.core.prepareAsync
import ai.hanzo.api.models.ClientGetHomeParams
import ai.hanzo.api.models.ClientGetHomeResponse
import ai.hanzo.api.services.async.ActiveServiceAsync
import ai.hanzo.api.services.async.ActiveServiceAsyncImpl
import ai.hanzo.api.services.async.AddServiceAsync
import ai.hanzo.api.services.async.AddServiceAsyncImpl
import ai.hanzo.api.services.async.AnthropicServiceAsync
import ai.hanzo.api.services.async.AnthropicServiceAsyncImpl
import ai.hanzo.api.services.async.AssemblyaiServiceAsync
import ai.hanzo.api.services.async.AssemblyaiServiceAsyncImpl
import ai.hanzo.api.services.async.AssistantServiceAsync
import ai.hanzo.api.services.async.AssistantServiceAsyncImpl
import ai.hanzo.api.services.async.AudioServiceAsync
import ai.hanzo.api.services.async.AudioServiceAsyncImpl
import ai.hanzo.api.services.async.AzureServiceAsync
import ai.hanzo.api.services.async.AzureServiceAsyncImpl
import ai.hanzo.api.services.async.BatchServiceAsync
import ai.hanzo.api.services.async.BatchServiceAsyncImpl
import ai.hanzo.api.services.async.BedrockServiceAsync
import ai.hanzo.api.services.async.BedrockServiceAsyncImpl
import ai.hanzo.api.services.async.BudgetServiceAsync
import ai.hanzo.api.services.async.BudgetServiceAsyncImpl
import ai.hanzo.api.services.async.CacheServiceAsync
import ai.hanzo.api.services.async.CacheServiceAsyncImpl
import ai.hanzo.api.services.async.ChatServiceAsync
import ai.hanzo.api.services.async.ChatServiceAsyncImpl
import ai.hanzo.api.services.async.CohereServiceAsync
import ai.hanzo.api.services.async.CohereServiceAsyncImpl
import ai.hanzo.api.services.async.CompletionServiceAsync
import ai.hanzo.api.services.async.CompletionServiceAsyncImpl
import ai.hanzo.api.services.async.ConfigServiceAsync
import ai.hanzo.api.services.async.ConfigServiceAsyncImpl
import ai.hanzo.api.services.async.CredentialServiceAsync
import ai.hanzo.api.services.async.CredentialServiceAsyncImpl
import ai.hanzo.api.services.async.CustomerServiceAsync
import ai.hanzo.api.services.async.CustomerServiceAsyncImpl
import ai.hanzo.api.services.async.DeleteServiceAsync
import ai.hanzo.api.services.async.DeleteServiceAsyncImpl
import ai.hanzo.api.services.async.EmbeddingServiceAsync
import ai.hanzo.api.services.async.EmbeddingServiceAsyncImpl
import ai.hanzo.api.services.async.EngineServiceAsync
import ai.hanzo.api.services.async.EngineServiceAsyncImpl
import ai.hanzo.api.services.async.EuAssemblyaiServiceAsync
import ai.hanzo.api.services.async.EuAssemblyaiServiceAsyncImpl
import ai.hanzo.api.services.async.FileServiceAsync
import ai.hanzo.api.services.async.FileServiceAsyncImpl
import ai.hanzo.api.services.async.FineTuningServiceAsync
import ai.hanzo.api.services.async.FineTuningServiceAsyncImpl
import ai.hanzo.api.services.async.GeminiServiceAsync
import ai.hanzo.api.services.async.GeminiServiceAsyncImpl
import ai.hanzo.api.services.async.GlobalServiceAsync
import ai.hanzo.api.services.async.GlobalServiceAsyncImpl
import ai.hanzo.api.services.async.GuardrailServiceAsync
import ai.hanzo.api.services.async.GuardrailServiceAsyncImpl
import ai.hanzo.api.services.async.HealthServiceAsync
import ai.hanzo.api.services.async.HealthServiceAsyncImpl
import ai.hanzo.api.services.async.ImageServiceAsync
import ai.hanzo.api.services.async.ImageServiceAsyncImpl
import ai.hanzo.api.services.async.KeyServiceAsync
import ai.hanzo.api.services.async.KeyServiceAsyncImpl
import ai.hanzo.api.services.async.LangfuseServiceAsync
import ai.hanzo.api.services.async.LangfuseServiceAsyncImpl
import ai.hanzo.api.services.async.ModelGroupServiceAsync
import ai.hanzo.api.services.async.ModelGroupServiceAsyncImpl
import ai.hanzo.api.services.async.ModelServiceAsync
import ai.hanzo.api.services.async.ModelServiceAsyncImpl
import ai.hanzo.api.services.async.ModerationServiceAsync
import ai.hanzo.api.services.async.ModerationServiceAsyncImpl
import ai.hanzo.api.services.async.OpenAIServiceAsync
import ai.hanzo.api.services.async.OpenAIServiceAsyncImpl
import ai.hanzo.api.services.async.OrganizationServiceAsync
import ai.hanzo.api.services.async.OrganizationServiceAsyncImpl
import ai.hanzo.api.services.async.ProviderServiceAsync
import ai.hanzo.api.services.async.ProviderServiceAsyncImpl
import ai.hanzo.api.services.async.RerankServiceAsync
import ai.hanzo.api.services.async.RerankServiceAsyncImpl
import ai.hanzo.api.services.async.ResponseServiceAsync
import ai.hanzo.api.services.async.ResponseServiceAsyncImpl
import ai.hanzo.api.services.async.RouteServiceAsync
import ai.hanzo.api.services.async.RouteServiceAsyncImpl
import ai.hanzo.api.services.async.SettingServiceAsync
import ai.hanzo.api.services.async.SettingServiceAsyncImpl
import ai.hanzo.api.services.async.SpendServiceAsync
import ai.hanzo.api.services.async.SpendServiceAsyncImpl
import ai.hanzo.api.services.async.TeamServiceAsync
import ai.hanzo.api.services.async.TeamServiceAsyncImpl
import ai.hanzo.api.services.async.TestServiceAsync
import ai.hanzo.api.services.async.TestServiceAsyncImpl
import ai.hanzo.api.services.async.ThreadServiceAsync
import ai.hanzo.api.services.async.ThreadServiceAsyncImpl
import ai.hanzo.api.services.async.UserServiceAsync
import ai.hanzo.api.services.async.UserServiceAsyncImpl
import ai.hanzo.api.services.async.UtilServiceAsync
import ai.hanzo.api.services.async.UtilServiceAsyncImpl
import ai.hanzo.api.services.async.VertexAiServiceAsync
import ai.hanzo.api.services.async.VertexAiServiceAsyncImpl

class HanzoClientAsyncImpl(private val clientOptions: ClientOptions) : HanzoClientAsync {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Kotlin ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val sync: HanzoClient by lazy { HanzoClientImpl(clientOptions) }

    private val withRawResponse: HanzoClientAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val models: ModelServiceAsync by lazy {
        ModelServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val openai: OpenAIServiceAsync by lazy {
        OpenAIServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val engines: EngineServiceAsync by lazy {
        EngineServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val chat: ChatServiceAsync by lazy { ChatServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val completions: CompletionServiceAsync by lazy {
        CompletionServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val embeddings: EmbeddingServiceAsync by lazy {
        EmbeddingServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val images: ImageServiceAsync by lazy {
        ImageServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val audio: AudioServiceAsync by lazy {
        AudioServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val assistants: AssistantServiceAsync by lazy {
        AssistantServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val threads: ThreadServiceAsync by lazy {
        ThreadServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val moderations: ModerationServiceAsync by lazy {
        ModerationServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val utils: UtilServiceAsync by lazy { UtilServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val model: ModelServiceAsync by lazy {
        ModelServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val modelGroup: ModelGroupServiceAsync by lazy {
        ModelGroupServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val routes: RouteServiceAsync by lazy {
        RouteServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val responses: ResponseServiceAsync by lazy {
        ResponseServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val batches: BatchServiceAsync by lazy {
        BatchServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val rerank: RerankServiceAsync by lazy {
        RerankServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val fineTuning: FineTuningServiceAsync by lazy {
        FineTuningServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val credentials: CredentialServiceAsync by lazy {
        CredentialServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val vertexAi: VertexAiServiceAsync by lazy {
        VertexAiServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val gemini: GeminiServiceAsync by lazy {
        GeminiServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val cohere: CohereServiceAsync by lazy {
        CohereServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val anthropic: AnthropicServiceAsync by lazy {
        AnthropicServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val bedrock: BedrockServiceAsync by lazy {
        BedrockServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val euAssemblyai: EuAssemblyaiServiceAsync by lazy {
        EuAssemblyaiServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val assemblyai: AssemblyaiServiceAsync by lazy {
        AssemblyaiServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val azure: AzureServiceAsync by lazy {
        AzureServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val langfuse: LangfuseServiceAsync by lazy {
        LangfuseServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val config: ConfigServiceAsync by lazy {
        ConfigServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val test: TestServiceAsync by lazy { TestServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val health: HealthServiceAsync by lazy {
        HealthServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val active: ActiveServiceAsync by lazy {
        ActiveServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val settings: SettingServiceAsync by lazy {
        SettingServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val key: KeyServiceAsync by lazy { KeyServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val user: UserServiceAsync by lazy { UserServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val team: TeamServiceAsync by lazy { TeamServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val organization: OrganizationServiceAsync by lazy {
        OrganizationServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val customer: CustomerServiceAsync by lazy {
        CustomerServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val spend: SpendServiceAsync by lazy {
        SpendServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val global: GlobalServiceAsync by lazy {
        GlobalServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val provider: ProviderServiceAsync by lazy {
        ProviderServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val cache: CacheServiceAsync by lazy {
        CacheServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val guardrails: GuardrailServiceAsync by lazy {
        GuardrailServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val add: AddServiceAsync by lazy { AddServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val delete: DeleteServiceAsync by lazy {
        DeleteServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val files: FileServiceAsync by lazy { FileServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val budget: BudgetServiceAsync by lazy {
        BudgetServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    override fun sync(): HanzoClient = sync

    override fun withRawResponse(): HanzoClientAsync.WithRawResponse = withRawResponse

    override fun models(): ModelServiceAsync = models

    override fun openai(): OpenAIServiceAsync = openai

    override fun engines(): EngineServiceAsync = engines

    override fun chat(): ChatServiceAsync = chat

    override fun completions(): CompletionServiceAsync = completions

    override fun embeddings(): EmbeddingServiceAsync = embeddings

    override fun images(): ImageServiceAsync = images

    override fun audio(): AudioServiceAsync = audio

    override fun assistants(): AssistantServiceAsync = assistants

    override fun threads(): ThreadServiceAsync = threads

    override fun moderations(): ModerationServiceAsync = moderations

    override fun utils(): UtilServiceAsync = utils

    override fun model(): ModelServiceAsync = model

    override fun modelGroup(): ModelGroupServiceAsync = modelGroup

    override fun routes(): RouteServiceAsync = routes

    override fun responses(): ResponseServiceAsync = responses

    override fun batches(): BatchServiceAsync = batches

    override fun rerank(): RerankServiceAsync = rerank

    override fun fineTuning(): FineTuningServiceAsync = fineTuning

    override fun credentials(): CredentialServiceAsync = credentials

    override fun vertexAi(): VertexAiServiceAsync = vertexAi

    override fun gemini(): GeminiServiceAsync = gemini

    override fun cohere(): CohereServiceAsync = cohere

    override fun anthropic(): AnthropicServiceAsync = anthropic

    override fun bedrock(): BedrockServiceAsync = bedrock

    override fun euAssemblyai(): EuAssemblyaiServiceAsync = euAssemblyai

    override fun assemblyai(): AssemblyaiServiceAsync = assemblyai

    override fun azure(): AzureServiceAsync = azure

    override fun langfuse(): LangfuseServiceAsync = langfuse

    override fun config(): ConfigServiceAsync = config

    override fun test(): TestServiceAsync = test

    override fun health(): HealthServiceAsync = health

    override fun active(): ActiveServiceAsync = active

    override fun settings(): SettingServiceAsync = settings

    override fun key(): KeyServiceAsync = key

    override fun user(): UserServiceAsync = user

    override fun team(): TeamServiceAsync = team

    override fun organization(): OrganizationServiceAsync = organization

    override fun customer(): CustomerServiceAsync = customer

    override fun spend(): SpendServiceAsync = spend

    override fun global(): GlobalServiceAsync = global

    override fun provider(): ProviderServiceAsync = provider

    override fun cache(): CacheServiceAsync = cache

    override fun guardrails(): GuardrailServiceAsync = guardrails

    override fun add(): AddServiceAsync = add

    override fun delete(): DeleteServiceAsync = delete

    override fun files(): FileServiceAsync = files

    override fun budget(): BudgetServiceAsync = budget

    override suspend fun getHome(
        params: ClientGetHomeParams,
        requestOptions: RequestOptions,
    ): ClientGetHomeResponse =
        // get /
        withRawResponse().getHome(params, requestOptions).parse()

    override fun close() = clientOptions.httpClient.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        HanzoClientAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val models: ModelServiceAsync.WithRawResponse by lazy {
            ModelServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val openai: OpenAIServiceAsync.WithRawResponse by lazy {
            OpenAIServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val engines: EngineServiceAsync.WithRawResponse by lazy {
            EngineServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val chat: ChatServiceAsync.WithRawResponse by lazy {
            ChatServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val completions: CompletionServiceAsync.WithRawResponse by lazy {
            CompletionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val embeddings: EmbeddingServiceAsync.WithRawResponse by lazy {
            EmbeddingServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val images: ImageServiceAsync.WithRawResponse by lazy {
            ImageServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val audio: AudioServiceAsync.WithRawResponse by lazy {
            AudioServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val assistants: AssistantServiceAsync.WithRawResponse by lazy {
            AssistantServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val threads: ThreadServiceAsync.WithRawResponse by lazy {
            ThreadServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val moderations: ModerationServiceAsync.WithRawResponse by lazy {
            ModerationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val utils: UtilServiceAsync.WithRawResponse by lazy {
            UtilServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val model: ModelServiceAsync.WithRawResponse by lazy {
            ModelServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val modelGroup: ModelGroupServiceAsync.WithRawResponse by lazy {
            ModelGroupServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val routes: RouteServiceAsync.WithRawResponse by lazy {
            RouteServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val responses: ResponseServiceAsync.WithRawResponse by lazy {
            ResponseServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val batches: BatchServiceAsync.WithRawResponse by lazy {
            BatchServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val rerank: RerankServiceAsync.WithRawResponse by lazy {
            RerankServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val fineTuning: FineTuningServiceAsync.WithRawResponse by lazy {
            FineTuningServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val credentials: CredentialServiceAsync.WithRawResponse by lazy {
            CredentialServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val vertexAi: VertexAiServiceAsync.WithRawResponse by lazy {
            VertexAiServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val gemini: GeminiServiceAsync.WithRawResponse by lazy {
            GeminiServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val cohere: CohereServiceAsync.WithRawResponse by lazy {
            CohereServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val anthropic: AnthropicServiceAsync.WithRawResponse by lazy {
            AnthropicServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val bedrock: BedrockServiceAsync.WithRawResponse by lazy {
            BedrockServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val euAssemblyai: EuAssemblyaiServiceAsync.WithRawResponse by lazy {
            EuAssemblyaiServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val assemblyai: AssemblyaiServiceAsync.WithRawResponse by lazy {
            AssemblyaiServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val azure: AzureServiceAsync.WithRawResponse by lazy {
            AzureServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val langfuse: LangfuseServiceAsync.WithRawResponse by lazy {
            LangfuseServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val config: ConfigServiceAsync.WithRawResponse by lazy {
            ConfigServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val test: TestServiceAsync.WithRawResponse by lazy {
            TestServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val health: HealthServiceAsync.WithRawResponse by lazy {
            HealthServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val active: ActiveServiceAsync.WithRawResponse by lazy {
            ActiveServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val settings: SettingServiceAsync.WithRawResponse by lazy {
            SettingServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val key: KeyServiceAsync.WithRawResponse by lazy {
            KeyServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val user: UserServiceAsync.WithRawResponse by lazy {
            UserServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val team: TeamServiceAsync.WithRawResponse by lazy {
            TeamServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val organization: OrganizationServiceAsync.WithRawResponse by lazy {
            OrganizationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val customer: CustomerServiceAsync.WithRawResponse by lazy {
            CustomerServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val spend: SpendServiceAsync.WithRawResponse by lazy {
            SpendServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val global: GlobalServiceAsync.WithRawResponse by lazy {
            GlobalServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val provider: ProviderServiceAsync.WithRawResponse by lazy {
            ProviderServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val cache: CacheServiceAsync.WithRawResponse by lazy {
            CacheServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val guardrails: GuardrailServiceAsync.WithRawResponse by lazy {
            GuardrailServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val add: AddServiceAsync.WithRawResponse by lazy {
            AddServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val delete: DeleteServiceAsync.WithRawResponse by lazy {
            DeleteServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val files: FileServiceAsync.WithRawResponse by lazy {
            FileServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val budget: BudgetServiceAsync.WithRawResponse by lazy {
            BudgetServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun models(): ModelServiceAsync.WithRawResponse = models

        override fun openai(): OpenAIServiceAsync.WithRawResponse = openai

        override fun engines(): EngineServiceAsync.WithRawResponse = engines

        override fun chat(): ChatServiceAsync.WithRawResponse = chat

        override fun completions(): CompletionServiceAsync.WithRawResponse = completions

        override fun embeddings(): EmbeddingServiceAsync.WithRawResponse = embeddings

        override fun images(): ImageServiceAsync.WithRawResponse = images

        override fun audio(): AudioServiceAsync.WithRawResponse = audio

        override fun assistants(): AssistantServiceAsync.WithRawResponse = assistants

        override fun threads(): ThreadServiceAsync.WithRawResponse = threads

        override fun moderations(): ModerationServiceAsync.WithRawResponse = moderations

        override fun utils(): UtilServiceAsync.WithRawResponse = utils

        override fun model(): ModelServiceAsync.WithRawResponse = model

        override fun modelGroup(): ModelGroupServiceAsync.WithRawResponse = modelGroup

        override fun routes(): RouteServiceAsync.WithRawResponse = routes

        override fun responses(): ResponseServiceAsync.WithRawResponse = responses

        override fun batches(): BatchServiceAsync.WithRawResponse = batches

        override fun rerank(): RerankServiceAsync.WithRawResponse = rerank

        override fun fineTuning(): FineTuningServiceAsync.WithRawResponse = fineTuning

        override fun credentials(): CredentialServiceAsync.WithRawResponse = credentials

        override fun vertexAi(): VertexAiServiceAsync.WithRawResponse = vertexAi

        override fun gemini(): GeminiServiceAsync.WithRawResponse = gemini

        override fun cohere(): CohereServiceAsync.WithRawResponse = cohere

        override fun anthropic(): AnthropicServiceAsync.WithRawResponse = anthropic

        override fun bedrock(): BedrockServiceAsync.WithRawResponse = bedrock

        override fun euAssemblyai(): EuAssemblyaiServiceAsync.WithRawResponse = euAssemblyai

        override fun assemblyai(): AssemblyaiServiceAsync.WithRawResponse = assemblyai

        override fun azure(): AzureServiceAsync.WithRawResponse = azure

        override fun langfuse(): LangfuseServiceAsync.WithRawResponse = langfuse

        override fun config(): ConfigServiceAsync.WithRawResponse = config

        override fun test(): TestServiceAsync.WithRawResponse = test

        override fun health(): HealthServiceAsync.WithRawResponse = health

        override fun active(): ActiveServiceAsync.WithRawResponse = active

        override fun settings(): SettingServiceAsync.WithRawResponse = settings

        override fun key(): KeyServiceAsync.WithRawResponse = key

        override fun user(): UserServiceAsync.WithRawResponse = user

        override fun team(): TeamServiceAsync.WithRawResponse = team

        override fun organization(): OrganizationServiceAsync.WithRawResponse = organization

        override fun customer(): CustomerServiceAsync.WithRawResponse = customer

        override fun spend(): SpendServiceAsync.WithRawResponse = spend

        override fun global(): GlobalServiceAsync.WithRawResponse = global

        override fun provider(): ProviderServiceAsync.WithRawResponse = provider

        override fun cache(): CacheServiceAsync.WithRawResponse = cache

        override fun guardrails(): GuardrailServiceAsync.WithRawResponse = guardrails

        override fun add(): AddServiceAsync.WithRawResponse = add

        override fun delete(): DeleteServiceAsync.WithRawResponse = delete

        override fun files(): FileServiceAsync.WithRawResponse = files

        override fun budget(): BudgetServiceAsync.WithRawResponse = budget

        private val getHomeHandler: Handler<ClientGetHomeResponse> =
            jsonHandler<ClientGetHomeResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun getHome(
            params: ClientGetHomeParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ClientGetHomeResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { getHomeHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
