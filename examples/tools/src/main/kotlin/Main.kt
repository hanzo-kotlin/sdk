// tools — what can this key call?
//
// The catalogue is per-key: it composes the typed product operations with the
// external servers the caller's org has enabled, so two keys in two orgs see
// different lists. `activated` says which of them this key may actually
// dispatch, and `source` says where each one comes from — printing both is the
// difference between a catalogue and a menu.
//
// Operation: get_tools (GET /v1/tools)
//
// POST /v1/mcp is the JSON-RPC door onto the same catalogue, but the document
// declares only /v1/mcp/servers, so there is no generated method for it. GET
// /v1/tools is the REST view that there is.
//
//   HANZO_API_KEY=sk-... ./gradlew :examples:tools:run
import ai.hanzo.Hanzo
import ai.hanzo.cloud.api.ToolsApi

fun main() {
    val tools = Hanzo().api(::ToolsApi).getTools().tools.orEmpty()
    check(tools.isNotEmpty()) { "no tools are reachable for this key" }

    println("tools    ${tools.size}")
    tools.forEach { tool ->
        val state = if (tool.activated == true) "activated" else "available"
        println("  ${tool.name.orEmpty().padEnd(32)} ${tool.source.orEmpty().padEnd(12)} $state")
    }
}
