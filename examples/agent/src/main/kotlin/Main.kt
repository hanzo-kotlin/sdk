// agent — create one, run it, read the run back.
//
// `ref` accepts the public id (agent_...) or the org-unique name, so the run
// and the read both use the name just created without waiting for an id. Names
// are org-unique, so this one is minted per run rather than hardcoded.
//
// A run is asynchronous: the last step polls the run list until the run this
// example started reaches a terminal status.
//
// Org-scoped: /v1/agents replies 403 {"error":"X-Org-Id required"} without one,
// which `Hanzo` sends from HANZO_ORG_ID.
//
// Operations: cloud_post_v1_agents            (POST /v1/agents),
//             cloud_post_v1_agents_by_ref_run (POST /v1/agents/{ref}/run),
//             cloud_get_v1_agents_ref_runs    (GET  /v1/agents/{ref}/runs)
//
//   HANZO_API_KEY=hk-... HANZO_ORG_ID=my-org ./gradlew :examples:agent:run
import ai.hanzo.Hanzo
import ai.hanzo.cloud.api.AgentsApi
import ai.hanzo.cloud.model.CloudCreateAgentIn

private val TERMINAL = setOf("succeeded", "failed", "cancelled", "canceled", "error", "timeout")

fun main() {
    val hanzo = Hanzo()
    require(hanzo.orgId != null) {
        "HANZO_ORG_ID is required: /v1/agents answers 403 without X-Org-Id"
    }
    val agents = hanzo.api(::AgentsApi)
    val model = System.getenv("HANZO_MODEL")?.takeIf { it.isNotBlank() } ?: "zen-1"

    val name = "sdk-example-${System.nanoTime().toString(36)}"
    val agent =
        agents.cloudPostV1Agents(
            CloudCreateAgentIn(
                name = name,
                model = model,
                instructions = "You answer in exactly one sentence.",
            )
        )
    println("created  ${agent.name} (${agent.id}) model=${agent.model}")

    // The run endpoint returns no body, so the new run is the one that was not
    // in the list beforehand.
    val before = agents.cloudGetV1AgentsRefRuns(name).runs.orEmpty().map { it.id }.toSet()
    agents.cloudPostV1AgentsByRefRun(name)
    println("started  a run of $name")

    repeat(60) {
        val run =
            agents.cloudGetV1AgentsRefRuns(name).runs.orEmpty().firstOrNull { it.id !in before }
        val status = run?.status?.lowercase().orEmpty()
        if (run != null && status in TERMINAL) {
            println("run      ${run.id} $status in ${run.durationMs}ms")
            println("output   ${run.output ?: run.error}")
            return
        }
        Thread.sleep(1_000)
    }
    println("run      still not terminal after 60s")
}
