// chat — one completion.
//
// Non-streaming on purpose: streaming is SSE, a different transport that a
// generated client hands back as an opaque body, so showing it here would teach
// the wrong shape.
//
// Operation: ai_createChatCompletion (POST /v1/chat/completions)
//
//   HANZO_API_KEY=hk-... ./gradlew :examples:chat:run
import ai.hanzo.Hanzo
import ai.hanzo.cloud.api.OpenAICompatibleApi
import ai.hanzo.cloud.model.AiChatCompletionRequest
import ai.hanzo.cloud.model.AiChatMessage

fun main() {
    val model = System.getenv("HANZO_MODEL")?.takeIf { it.isNotBlank() } ?: "zen-1"

    val completion =
        Hanzo()
            .api(::OpenAICompatibleApi)
            .aiCreateChatCompletion(
                AiChatCompletionRequest(
                    model = model,
                    messages =
                        listOf(
                            AiChatMessage(
                                role = AiChatMessage.Role.user,
                                content = "In one sentence: what is Hanzo?",
                            )
                        ),
                )
            )

    // `content` is a string for a plain reply and an array of parts for a
    // multimodal one, so the document leaves it open and the generator types it
    // `Any?`.
    println(completion.choices?.firstOrNull()?.message?.content)

    completion.usage?.let {
        println()
        println("tokens: ${it.promptTokens} prompt + ${it.completionTokens} completion")
    }
}
