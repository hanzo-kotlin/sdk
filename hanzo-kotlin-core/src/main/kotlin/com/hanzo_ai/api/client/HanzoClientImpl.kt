// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.client

import com.hanzo_ai.api.core.ClientOptions
import com.hanzo_ai.api.core.JsonValue
import com.hanzo_ai.api.core.RequestOptions
import com.hanzo_ai.api.core.getPackageVersion
import com.hanzo_ai.api.core.handlers.errorHandler
import com.hanzo_ai.api.core.handlers.jsonHandler
import com.hanzo_ai.api.core.handlers.withErrorHandler
import com.hanzo_ai.api.core.http.HttpMethod
import com.hanzo_ai.api.core.http.HttpRequest
import com.hanzo_ai.api.core.http.HttpResponse.Handler
import com.hanzo_ai.api.core.http.HttpResponseFor
import com.hanzo_ai.api.core.http.parseable
import com.hanzo_ai.api.core.prepare
import com.hanzo_ai.api.models.ClientGetHomeParams
import com.hanzo_ai.api.models.ClientGetHomeResponse
import com.hanzo_ai.api.services.blocking.ActiveService
import com.hanzo_ai.api.services.blocking.ActiveServiceImpl
import com.hanzo_ai.api.services.blocking.AddService
import com.hanzo_ai.api.services.blocking.AddServiceImpl
import com.hanzo_ai.api.services.blocking.AnthropicService
import com.hanzo_ai.api.services.blocking.AnthropicServiceImpl
import com.hanzo_ai.api.services.blocking.AssemblyaiService
import com.hanzo_ai.api.services.blocking.AssemblyaiServiceImpl
import com.hanzo_ai.api.services.blocking.AssistantService
import com.hanzo_ai.api.services.blocking.AssistantServiceImpl
import com.hanzo_ai.api.services.blocking.AudioService
import com.hanzo_ai.api.services.blocking.AudioServiceImpl
import com.hanzo_ai.api.services.blocking.AzureService
import com.hanzo_ai.api.services.blocking.AzureServiceImpl
import com.hanzo_ai.api.services.blocking.BatchService
import com.hanzo_ai.api.services.blocking.BatchServiceImpl
import com.hanzo_ai.api.services.blocking.BedrockService
import com.hanzo_ai.api.services.blocking.BedrockServiceImpl
import com.hanzo_ai.api.services.blocking.BudgetService
import com.hanzo_ai.api.services.blocking.BudgetServiceImpl
import com.hanzo_ai.api.services.blocking.CacheService
import com.hanzo_ai.api.services.blocking.CacheServiceImpl
import com.hanzo_ai.api.services.blocking.ChatService
import com.hanzo_ai.api.services.blocking.ChatServiceImpl
import com.hanzo_ai.api.services.blocking.CohereService
import com.hanzo_ai.api.services.blocking.CohereServiceImpl
import com.hanzo_ai.api.services.blocking.CompletionService
import com.hanzo_ai.api.services.blocking.CompletionServiceImpl
import com.hanzo_ai.api.services.blocking.ConfigService
import com.hanzo_ai.api.services.blocking.ConfigServiceImpl
import com.hanzo_ai.api.services.blocking.CredentialService
import com.hanzo_ai.api.services.blocking.CredentialServiceImpl
import com.hanzo_ai.api.services.blocking.CustomerService
import com.hanzo_ai.api.services.blocking.CustomerServiceImpl
import com.hanzo_ai.api.services.blocking.DeleteService
import com.hanzo_ai.api.services.blocking.DeleteServiceImpl
import com.hanzo_ai.api.services.blocking.EmbeddingService
import com.hanzo_ai.api.services.blocking.EmbeddingServiceImpl
import com.hanzo_ai.api.services.blocking.EngineService
import com.hanzo_ai.api.services.blocking.EngineServiceImpl
import com.hanzo_ai.api.services.blocking.EuAssemblyaiService
import com.hanzo_ai.api.services.blocking.EuAssemblyaiServiceImpl
import com.hanzo_ai.api.services.blocking.FileService
import com.hanzo_ai.api.services.blocking.FileServiceImpl
import com.hanzo_ai.api.services.blocking.FineTuningService
import com.hanzo_ai.api.services.blocking.FineTuningServiceImpl
import com.hanzo_ai.api.services.blocking.GeminiService
import com.hanzo_ai.api.services.blocking.GeminiServiceImpl
import com.hanzo_ai.api.services.blocking.GlobalService
import com.hanzo_ai.api.services.blocking.GlobalServiceImpl
import com.hanzo_ai.api.services.blocking.GuardrailService
import com.hanzo_ai.api.services.blocking.GuardrailServiceImpl
import com.hanzo_ai.api.services.blocking.HealthService
import com.hanzo_ai.api.services.blocking.HealthServiceImpl
import com.hanzo_ai.api.services.blocking.ImageService
import com.hanzo_ai.api.services.blocking.ImageServiceImpl
import com.hanzo_ai.api.services.blocking.KeyService
import com.hanzo_ai.api.services.blocking.KeyServiceImpl
import com.hanzo_ai.api.services.blocking.LangfuseService
import com.hanzo_ai.api.services.blocking.LangfuseServiceImpl
import com.hanzo_ai.api.services.blocking.ModelGroupService
import com.hanzo_ai.api.services.blocking.ModelGroupServiceImpl
import com.hanzo_ai.api.services.blocking.ModelService
import com.hanzo_ai.api.services.blocking.ModelServiceImpl
import com.hanzo_ai.api.services.blocking.ModerationService
import com.hanzo_ai.api.services.blocking.ModerationServiceImpl
import com.hanzo_ai.api.services.blocking.OpenAIService
import com.hanzo_ai.api.services.blocking.OpenAIServiceImpl
import com.hanzo_ai.api.services.blocking.OrganizationService
import com.hanzo_ai.api.services.blocking.OrganizationServiceImpl
import com.hanzo_ai.api.services.blocking.ProviderService
import com.hanzo_ai.api.services.blocking.ProviderServiceImpl
import com.hanzo_ai.api.services.blocking.RerankService
import com.hanzo_ai.api.services.blocking.RerankServiceImpl
import com.hanzo_ai.api.services.blocking.ResponseService
import com.hanzo_ai.api.services.blocking.ResponseServiceImpl
import com.hanzo_ai.api.services.blocking.RouteService
import com.hanzo_ai.api.services.blocking.RouteServiceImpl
import com.hanzo_ai.api.services.blocking.SettingService
import com.hanzo_ai.api.services.blocking.SettingServiceImpl
import com.hanzo_ai.api.services.blocking.SpendService
import com.hanzo_ai.api.services.blocking.SpendServiceImpl
import com.hanzo_ai.api.services.blocking.TeamService
import com.hanzo_ai.api.services.blocking.TeamServiceImpl
import com.hanzo_ai.api.services.blocking.TestService
import com.hanzo_ai.api.services.blocking.TestServiceImpl
import com.hanzo_ai.api.services.blocking.ThreadService
import com.hanzo_ai.api.services.blocking.ThreadServiceImpl
import com.hanzo_ai.api.services.blocking.UserService
import com.hanzo_ai.api.services.blocking.UserServiceImpl
import com.hanzo_ai.api.services.blocking.UtilService
import com.hanzo_ai.api.services.blocking.UtilServiceImpl
import com.hanzo_ai.api.services.blocking.VertexAiService
import com.hanzo_ai.api.services.blocking.VertexAiServiceImpl

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
