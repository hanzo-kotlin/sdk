// tools — what can this key call?
//
// POST /v1/mcp is the fleet's one MCP door: JSON-RPC 2.0 over the typed product
// operations composed with the external MCP servers the caller's org has
// enabled. `tools/list` is the discovery call; the same operation with
// `tools/call` runs one.
//
// JSON-RPC reports failure INSIDE a 200, through two channels, so both are read
// before the result is: `error` when the call itself failed, then
// `result.isError` when a tool ran and reported failure.
//
// Operation: mcp_rpc (POST /v1/mcp)
//
//   HANZO_API_KEY=hk-... ./gradlew :examples:tools:run
import ai.hanzo.Hanzo
import ai.hanzo.cloud.api.MCPApi
import ai.hanzo.cloud.model.McpRequest

fun main() {
    val response =
        Hanzo()
            .api(::MCPApi)
            .mcpRpc(
                // No `id`. hanzo.yaml types it `oneOf: [integer, string]`, and
                // openapi-generator projects a scalar oneOf as an empty class —
                // `McpRequestId()` has no members and would serialize as `{}`,
                // which is not a legal JSON-RPC id. Omitting it is the only
                // thing the generated client can say that is still correct.
                McpRequest(
                    jsonrpc = McpRequest.Jsonrpc._2Period0,
                    method = McpRequest.Method.toolsSlashList,
                )
            )

    // Channel one: the call did not run.
    response.error?.let { error("tools/list: ${it.code} ${it.message}") }
    val result = response.result ?: error("tools/list: neither result nor error")
    // Channel two: it ran and reported failure.
    check(result.isError != true) { "tools/list: ${result.content?.mapNotNull { it.text }}" }

    val tools = result.tools.orEmpty()
    check(tools.isNotEmpty()) { "no tools are reachable for this key" }

    println("tools    ${tools.size}")
    tools.take(3).forEach { tool ->
        // Descriptions are prose and run to paragraphs; a listing wants the
        // first line of one.
        val summary = tool.description?.lineSequence()?.firstOrNull()?.take(64).orEmpty()
        println("  ${tool.name.padEnd(28)} $summary")
    }
}
