// chat — one completion.
//
// Non-streaming on purpose: streaming is SSE, a different transport that a
// generated client hands back as an opaque body, so showing it here would teach
// the wrong shape.
//
// Operation: post_chat_completions (POST /v1/chat/completions)
//
// THE ROUTE IS UNTYPED AT THE SOURCE, so the generated method takes no argument
// and returns Unit: there is no request schema to carry a prompt and no
// response schema to read a reply from. That is a hanzoai/cloud gap — the route
// is not a zip.Get[In, Out] yet, so its emitter has no shape to publish — and
// the one thing this example must not do is invent one. A request hand-rolled
// inside a generated client is the second authority these SDKs exist to remove:
// it would compile, look right, and be an opinion about the API rather than a
// projection of it. Same reason `money` prints a status. So the flow calls the
// operation the document declares and prints what the route answered; when the
// shapes land, a regeneration prints the completion.
//
//   HANZO_API_KEY=sk-... ./gradlew :examples:chat:run
import ai.hanzo.Hanzo
import ai.hanzo.cloud.api.ChatApi

fun main() {
    val chat = Hanzo().api(::ChatApi)

    println("completion  HTTP ${chat.postChatCompletionsWithHttpInfo().statusCode}")
}
