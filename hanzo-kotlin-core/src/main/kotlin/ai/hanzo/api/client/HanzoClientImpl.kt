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
import ai.hanzo.api.core.prepare
import ai.hanzo.api.models.ClientGetHomeParams
import ai.hanzo.api.models.ClientGetHomeResponse
import ai.hanzo.api.services.blocking.ActiveService
import ai.hanzo.api.services.blocking.ActiveServiceImpl
import ai.hanzo.api.services.blocking.AddService
import ai.hanzo.api.services.blocking.AddServiceImpl
import ai.hanzo.api.services.blocking.AnthropicService
import ai.hanzo.api.services.blocking.AnthropicServiceImpl
import ai.hanzo.api.services.blocking.AssemblyaiService
import ai.hanzo.api.services.blocking.AssemblyaiServiceImpl
import ai.hanzo.api.services.blocking.AssistantService
import ai.hanzo.api.services.blocking.AssistantServiceImpl
import ai.hanzo.api.services.blocking.AudioService
import ai.hanzo.api.services.blocking.AudioServiceImpl
import ai.hanzo.api.services.blocking.AzureService
import ai.hanzo.api.services.blocking.AzureServiceImpl
import ai.hanzo.api.services.blocking.BatchService
import ai.hanzo.api.services.blocking.BatchServiceImpl
import ai.hanzo.api.services.blocking.BedrockService
import ai.hanzo.api.services.blocking.BedrockServiceImpl
import ai.hanzo.api.services.blocking.BudgetService
import ai.hanzo.api.services.blocking.BudgetServiceImpl
import ai.hanzo.api.services.blocking.CacheService
import ai.hanzo.api.services.blocking.CacheServiceImpl
import ai.hanzo.api.services.blocking.ChatService
import ai.hanzo.api.services.blocking.ChatServiceImpl
import ai.hanzo.api.services.blocking.CohereService
import ai.hanzo.api.services.blocking.CohereServiceImpl
import ai.hanzo.api.services.blocking.CompletionService
import ai.hanzo.api.services.blocking.CompletionServiceImpl
import ai.hanzo.api.services.blocking.ConfigService
import ai.hanzo.api.services.blocking.ConfigServiceImpl
import ai.hanzo.api.services.blocking.CredentialService
import ai.hanzo.api.services.blocking.CredentialServiceImpl
import ai.hanzo.api.services.blocking.CustomerService
import ai.hanzo.api.services.blocking.CustomerServiceImpl
import ai.hanzo.api.services.blocking.DeleteService
import ai.hanzo.api.services.blocking.DeleteServiceImpl
import ai.hanzo.api.services.blocking.EmbeddingService
import ai.hanzo.api.services.blocking.EmbeddingServiceImpl
import ai.hanzo.api.services.blocking.EngineService
import ai.hanzo.api.services.blocking.EngineServiceImpl
import ai.hanzo.api.services.blocking.EuAssemblyaiService
import ai.hanzo.api.services.blocking.EuAssemblyaiServiceImpl
import ai.hanzo.api.services.blocking.FileService
import ai.hanzo.api.services.blocking.FileServiceImpl
import ai.hanzo.api.services.blocking.FineTuningService
import ai.hanzo.api.services.blocking.FineTuningServiceImpl
import ai.hanzo.api.services.blocking.GeminiService
import ai.hanzo.api.services.blocking.GeminiServiceImpl
import ai.hanzo.api.services.blocking.GlobalService
import ai.hanzo.api.services.blocking.GlobalServiceImpl
import ai.hanzo.api.services.blocking.GuardrailService
import ai.hanzo.api.services.blocking.GuardrailServiceImpl
import ai.hanzo.api.services.blocking.HealthService
import ai.hanzo.api.services.blocking.HealthServiceImpl
import ai.hanzo.api.services.blocking.ImageService
import ai.hanzo.api.services.blocking.ImageServiceImpl
import ai.hanzo.api.services.blocking.KeyService
import ai.hanzo.api.services.blocking.KeyServiceImpl
import ai.hanzo.api.services.blocking.LangfuseService
import ai.hanzo.api.services.blocking.LangfuseServiceImpl
import ai.hanzo.api.services.blocking.ModelGroupService
import ai.hanzo.api.services.blocking.ModelGroupServiceImpl
import ai.hanzo.api.services.blocking.ModelService
import ai.hanzo.api.services.blocking.ModelServiceImpl
import ai.hanzo.api.services.blocking.ModerationService
import ai.hanzo.api.services.blocking.ModerationServiceImpl
import ai.hanzo.api.services.blocking.OpenAIService
import ai.hanzo.api.services.blocking.OpenAIServiceImpl
import ai.hanzo.api.services.blocking.OrganizationService
import ai.hanzo.api.services.blocking.OrganizationServiceImpl
import ai.hanzo.api.services.blocking.ProviderService
import ai.hanzo.api.services.blocking.ProviderServiceImpl
import ai.hanzo.api.services.blocking.RerankService
import ai.hanzo.api.services.blocking.RerankServiceImpl
import ai.hanzo.api.services.blocking.ResponseService
import ai.hanzo.api.services.blocking.ResponseServiceImpl
import ai.hanzo.api.services.blocking.RouteService
import ai.hanzo.api.services.blocking.RouteServiceImpl
import ai.hanzo.api.services.blocking.SettingService
import ai.hanzo.api.services.blocking.SettingServiceImpl
import ai.hanzo.api.services.blocking.SpendService
import ai.hanzo.api.services.blocking.SpendServiceImpl
import ai.hanzo.api.services.blocking.TeamService
import ai.hanzo.api.services.blocking.TeamServiceImpl
import ai.hanzo.api.services.blocking.TestService
import ai.hanzo.api.services.blocking.TestServiceImpl
import ai.hanzo.api.services.blocking.ThreadService
import ai.hanzo.api.services.blocking.ThreadServiceImpl
import ai.hanzo.api.services.blocking.UserService
import ai.hanzo.api.services.blocking.UserServiceImpl
import ai.hanzo.api.services.blocking.UtilService
import ai.hanzo.api.services.blocking.UtilServiceImpl
import ai.hanzo.api.services.blocking.VertexAiService
import ai.hanzo.api.services.blocking.VertexAiServiceImpl

class HanzoClientImpl(private val clientOptions: ClientOptions) : HanzoClient {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Kotlin ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val async: HanzoClientAsync by lazy { HanzoClientAsyncImpl(clientOptions) }

    private val withRawResponse: HanzoClient.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val models: ModelService by lazy { ModelServiceImpl(clientOptionsWithUserAgent) }

    private val openai: OpenAIService by lazy { OpenAIServiceImpl(clientOptionsWithUserAgent) }

    private val engines: EngineService by lazy { EngineServiceImpl(clientOptionsWithUserAgent) }

    private val chat: ChatService by lazy { ChatServiceImpl(clientOptionsWithUserAgent) }

    private val completions: CompletionService by lazy {
        CompletionServiceImpl(clientOptionsWithUserAgent)
    }

    private val embeddings: EmbeddingService by lazy {
        EmbeddingServiceImpl(clientOptionsWithUserAgent)
    }

    private val images: ImageService by lazy { ImageServiceImpl(clientOptionsWithUserAgent) }

    private val audio: AudioService by lazy { AudioServiceImpl(clientOptionsWithUserAgent) }

    private val assistants: AssistantService by lazy {
        AssistantServiceImpl(clientOptionsWithUserAgent)
    }

    private val threads: ThreadService by lazy { ThreadServiceImpl(clientOptionsWithUserAgent) }

    private val moderations: ModerationService by lazy {
        ModerationServiceImpl(clientOptionsWithUserAgent)
    }

    private val utils: UtilService by lazy { UtilServiceImpl(clientOptionsWithUserAgent) }

    private val model: ModelService by lazy { ModelServiceImpl(clientOptionsWithUserAgent) }

    private val modelGroup: ModelGroupService by lazy {
        ModelGroupServiceImpl(clientOptionsWithUserAgent)
    }

    private val routes: RouteService by lazy { RouteServiceImpl(clientOptionsWithUserAgent) }

    private val responses: ResponseService by lazy {
        ResponseServiceImpl(clientOptionsWithUserAgent)
    }

    private val batches: BatchService by lazy { BatchServiceImpl(clientOptionsWithUserAgent) }

    private val rerank: RerankService by lazy { RerankServiceImpl(clientOptionsWithUserAgent) }

    private val fineTuning: FineTuningService by lazy {
        FineTuningServiceImpl(clientOptionsWithUserAgent)
    }

    private val credentials: CredentialService by lazy {
        CredentialServiceImpl(clientOptionsWithUserAgent)
    }

    private val vertexAi: VertexAiService by lazy {
        VertexAiServiceImpl(clientOptionsWithUserAgent)
    }

    private val gemini: GeminiService by lazy { GeminiServiceImpl(clientOptionsWithUserAgent) }

    private val cohere: CohereService by lazy { CohereServiceImpl(clientOptionsWithUserAgent) }

    private val anthropic: AnthropicService by lazy {
        AnthropicServiceImpl(clientOptionsWithUserAgent)
    }

    private val bedrock: BedrockService by lazy { BedrockServiceImpl(clientOptionsWithUserAgent) }

    private val euAssemblyai: EuAssemblyaiService by lazy {
        EuAssemblyaiServiceImpl(clientOptionsWithUserAgent)
    }

    private val assemblyai: AssemblyaiService by lazy {
        AssemblyaiServiceImpl(clientOptionsWithUserAgent)
    }

    private val azure: AzureService by lazy { AzureServiceImpl(clientOptionsWithUserAgent) }

    private val langfuse: LangfuseService by lazy {
        LangfuseServiceImpl(clientOptionsWithUserAgent)
    }

    private val config: ConfigService by lazy { ConfigServiceImpl(clientOptionsWithUserAgent) }

    private val test: TestService by lazy { TestServiceImpl(clientOptionsWithUserAgent) }

    private val health: HealthService by lazy { HealthServiceImpl(clientOptionsWithUserAgent) }

    private val active: ActiveService by lazy { ActiveServiceImpl(clientOptionsWithUserAgent) }

    private val settings: SettingService by lazy { SettingServiceImpl(clientOptionsWithUserAgent) }

    private val key: KeyService by lazy { KeyServiceImpl(clientOptionsWithUserAgent) }

    private val user: UserService by lazy { UserServiceImpl(clientOptionsWithUserAgent) }

    private val team: TeamService by lazy { TeamServiceImpl(clientOptionsWithUserAgent) }

    private val organization: OrganizationService by lazy {
        OrganizationServiceImpl(clientOptionsWithUserAgent)
    }

    private val customer: CustomerService by lazy {
        CustomerServiceImpl(clientOptionsWithUserAgent)
    }

    private val spend: SpendService by lazy { SpendServiceImpl(clientOptionsWithUserAgent) }

    private val global: GlobalService by lazy { GlobalServiceImpl(clientOptionsWithUserAgent) }

    private val provider: ProviderService by lazy {
        ProviderServiceImpl(clientOptionsWithUserAgent)
    }

    private val cache: CacheService by lazy { CacheServiceImpl(clientOptionsWithUserAgent) }

    private val guardrails: GuardrailService by lazy {
        GuardrailServiceImpl(clientOptionsWithUserAgent)
    }

    private val add: AddService by lazy { AddServiceImpl(clientOptionsWithUserAgent) }

    private val delete: DeleteService by lazy { DeleteServiceImpl(clientOptionsWithUserAgent) }

    private val files: FileService by lazy { FileServiceImpl(clientOptionsWithUserAgent) }

    private val budget: BudgetService by lazy { BudgetServiceImpl(clientOptionsWithUserAgent) }

    override fun async(): HanzoClientAsync = async

    override fun withRawResponse(): HanzoClient.WithRawResponse = withRawResponse

    override fun models(): ModelService = models

    override fun openai(): OpenAIService = openai

    override fun engines(): EngineService = engines

    override fun chat(): ChatService = chat

    override fun completions(): CompletionService = completions

    override fun embeddings(): EmbeddingService = embeddings

    override fun images(): ImageService = images

    override fun audio(): AudioService = audio

    override fun assistants(): AssistantService = assistants

    override fun threads(): ThreadService = threads

    override fun moderations(): ModerationService = moderations

    override fun utils(): UtilService = utils

    override fun model(): ModelService = model

    override fun modelGroup(): ModelGroupService = modelGroup

    override fun routes(): RouteService = routes

    override fun responses(): ResponseService = responses

    override fun batches(): BatchService = batches

    override fun rerank(): RerankService = rerank

    override fun fineTuning(): FineTuningService = fineTuning

    override fun credentials(): CredentialService = credentials

    override fun vertexAi(): VertexAiService = vertexAi

    override fun gemini(): GeminiService = gemini

    override fun cohere(): CohereService = cohere

    override fun anthropic(): AnthropicService = anthropic

    override fun bedrock(): BedrockService = bedrock

    override fun euAssemblyai(): EuAssemblyaiService = euAssemblyai

    override fun assemblyai(): AssemblyaiService = assemblyai

    override fun azure(): AzureService = azure

    override fun langfuse(): LangfuseService = langfuse

    override fun config(): ConfigService = config

    override fun test(): TestService = test

    override fun health(): HealthService = health

    override fun active(): ActiveService = active

    override fun settings(): SettingService = settings

    override fun key(): KeyService = key

    override fun user(): UserService = user

    override fun team(): TeamService = team

    override fun organization(): OrganizationService = organization

    override fun customer(): CustomerService = customer

    override fun spend(): SpendService = spend

    override fun global(): GlobalService = global

    override fun provider(): ProviderService = provider

    override fun cache(): CacheService = cache

    override fun guardrails(): GuardrailService = guardrails

    override fun add(): AddService = add

    override fun delete(): DeleteService = delete

    override fun files(): FileService = files

    override fun budget(): BudgetService = budget

    override fun getHome(
        params: ClientGetHomeParams,
        requestOptions: RequestOptions,
    ): ClientGetHomeResponse =
        // get /
        withRawResponse().getHome(params, requestOptions).parse()

    override fun close() = clientOptions.httpClient.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        HanzoClient.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val models: ModelService.WithRawResponse by lazy {
            ModelServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val openai: OpenAIService.WithRawResponse by lazy {
            OpenAIServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val engines: EngineService.WithRawResponse by lazy {
            EngineServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val chat: ChatService.WithRawResponse by lazy {
            ChatServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val completions: CompletionService.WithRawResponse by lazy {
            CompletionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val embeddings: EmbeddingService.WithRawResponse by lazy {
            EmbeddingServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val images: ImageService.WithRawResponse by lazy {
            ImageServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val audio: AudioService.WithRawResponse by lazy {
            AudioServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val assistants: AssistantService.WithRawResponse by lazy {
            AssistantServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val threads: ThreadService.WithRawResponse by lazy {
            ThreadServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val moderations: ModerationService.WithRawResponse by lazy {
            ModerationServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val utils: UtilService.WithRawResponse by lazy {
            UtilServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val model: ModelService.WithRawResponse by lazy {
            ModelServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val modelGroup: ModelGroupService.WithRawResponse by lazy {
            ModelGroupServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val routes: RouteService.WithRawResponse by lazy {
            RouteServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val responses: ResponseService.WithRawResponse by lazy {
            ResponseServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val batches: BatchService.WithRawResponse by lazy {
            BatchServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val rerank: RerankService.WithRawResponse by lazy {
            RerankServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val fineTuning: FineTuningService.WithRawResponse by lazy {
            FineTuningServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val credentials: CredentialService.WithRawResponse by lazy {
            CredentialServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val vertexAi: VertexAiService.WithRawResponse by lazy {
            VertexAiServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val gemini: GeminiService.WithRawResponse by lazy {
            GeminiServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val cohere: CohereService.WithRawResponse by lazy {
            CohereServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val anthropic: AnthropicService.WithRawResponse by lazy {
            AnthropicServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val bedrock: BedrockService.WithRawResponse by lazy {
            BedrockServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val euAssemblyai: EuAssemblyaiService.WithRawResponse by lazy {
            EuAssemblyaiServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val assemblyai: AssemblyaiService.WithRawResponse by lazy {
            AssemblyaiServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val azure: AzureService.WithRawResponse by lazy {
            AzureServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val langfuse: LangfuseService.WithRawResponse by lazy {
            LangfuseServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val config: ConfigService.WithRawResponse by lazy {
            ConfigServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val test: TestService.WithRawResponse by lazy {
            TestServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val health: HealthService.WithRawResponse by lazy {
            HealthServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val active: ActiveService.WithRawResponse by lazy {
            ActiveServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val settings: SettingService.WithRawResponse by lazy {
            SettingServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val key: KeyService.WithRawResponse by lazy {
            KeyServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val user: UserService.WithRawResponse by lazy {
            UserServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val team: TeamService.WithRawResponse by lazy {
            TeamServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val organization: OrganizationService.WithRawResponse by lazy {
            OrganizationServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val customer: CustomerService.WithRawResponse by lazy {
            CustomerServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val spend: SpendService.WithRawResponse by lazy {
            SpendServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val global: GlobalService.WithRawResponse by lazy {
            GlobalServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val provider: ProviderService.WithRawResponse by lazy {
            ProviderServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val cache: CacheService.WithRawResponse by lazy {
            CacheServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val guardrails: GuardrailService.WithRawResponse by lazy {
            GuardrailServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val add: AddService.WithRawResponse by lazy {
            AddServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val delete: DeleteService.WithRawResponse by lazy {
            DeleteServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val files: FileService.WithRawResponse by lazy {
            FileServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val budget: BudgetService.WithRawResponse by lazy {
            BudgetServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun models(): ModelService.WithRawResponse = models

        override fun openai(): OpenAIService.WithRawResponse = openai

        override fun engines(): EngineService.WithRawResponse = engines

        override fun chat(): ChatService.WithRawResponse = chat

        override fun completions(): CompletionService.WithRawResponse = completions

        override fun embeddings(): EmbeddingService.WithRawResponse = embeddings

        override fun images(): ImageService.WithRawResponse = images

        override fun audio(): AudioService.WithRawResponse = audio

        override fun assistants(): AssistantService.WithRawResponse = assistants

        override fun threads(): ThreadService.WithRawResponse = threads

        override fun moderations(): ModerationService.WithRawResponse = moderations

        override fun utils(): UtilService.WithRawResponse = utils

        override fun model(): ModelService.WithRawResponse = model

        override fun modelGroup(): ModelGroupService.WithRawResponse = modelGroup

        override fun routes(): RouteService.WithRawResponse = routes

        override fun responses(): ResponseService.WithRawResponse = responses

        override fun batches(): BatchService.WithRawResponse = batches

        override fun rerank(): RerankService.WithRawResponse = rerank

        override fun fineTuning(): FineTuningService.WithRawResponse = fineTuning

        override fun credentials(): CredentialService.WithRawResponse = credentials

        override fun vertexAi(): VertexAiService.WithRawResponse = vertexAi

        override fun gemini(): GeminiService.WithRawResponse = gemini

        override fun cohere(): CohereService.WithRawResponse = cohere

        override fun anthropic(): AnthropicService.WithRawResponse = anthropic

        override fun bedrock(): BedrockService.WithRawResponse = bedrock

        override fun euAssemblyai(): EuAssemblyaiService.WithRawResponse = euAssemblyai

        override fun assemblyai(): AssemblyaiService.WithRawResponse = assemblyai

        override fun azure(): AzureService.WithRawResponse = azure

        override fun langfuse(): LangfuseService.WithRawResponse = langfuse

        override fun config(): ConfigService.WithRawResponse = config

        override fun test(): TestService.WithRawResponse = test

        override fun health(): HealthService.WithRawResponse = health

        override fun active(): ActiveService.WithRawResponse = active

        override fun settings(): SettingService.WithRawResponse = settings

        override fun key(): KeyService.WithRawResponse = key

        override fun user(): UserService.WithRawResponse = user

        override fun team(): TeamService.WithRawResponse = team

        override fun organization(): OrganizationService.WithRawResponse = organization

        override fun customer(): CustomerService.WithRawResponse = customer

        override fun spend(): SpendService.WithRawResponse = spend

        override fun global(): GlobalService.WithRawResponse = global

        override fun provider(): ProviderService.WithRawResponse = provider

        override fun cache(): CacheService.WithRawResponse = cache

        override fun guardrails(): GuardrailService.WithRawResponse = guardrails

        override fun add(): AddService.WithRawResponse = add

        override fun delete(): DeleteService.WithRawResponse = delete

        override fun files(): FileService.WithRawResponse = files

        override fun budget(): BudgetService.WithRawResponse = budget

        private val getHomeHandler: Handler<ClientGetHomeResponse> =
            jsonHandler<ClientGetHomeResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun getHome(
            params: ClientGetHomeParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ClientGetHomeResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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
