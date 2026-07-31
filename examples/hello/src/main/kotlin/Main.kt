// hello — who does this key belong to?
//
// The smallest complete round trip, and the one that has to be able to say no:
// with no key, or a bogus one, GET /v1/bot/auth/me answers
// 403 {"error":"no validated principal"}. That refusal is half of what the flow
// demonstrates, so it is printed rather than thrown.
//
// Operation: bot_authMe (GET /v1/bot/auth/me)
//
//   HANZO_API_KEY=hk-... ./gradlew :examples:hello:run
import ai.hanzo.Hanzo
import ai.hanzo.cloud.api.AuthApi
import ai.hanzo.cloud.infrastructure.ClientException

fun main() {
    val me =
        try {
            Hanzo().api(::AuthApi).botAuthMe()
        } catch (refused: ClientException) {
            println("refused  ${refused.message}")
            return
        }

    // hanzo.yaml types this response as bot_User, whose identity fields are
    // `handle` and `displayName`; the document has no `owner`.
    println("id       ${me.id}")
    println("handle   ${me.handle}")
    println("name     ${me.displayName}")
    println("email    ${me.email}")
}
