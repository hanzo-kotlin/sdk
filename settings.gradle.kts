rootProject.name = "kotlin-sdk"

// hanzo-kotlin-cloud is the client. It is named here rather than discovered by
// scanning the root for directories, because a scan answers "what happens to be
// on disk" when the question is "what does this repo publish".
include("hanzo-kotlin-cloud")

// The six canonical example flows (hanzoai/openapi `flows.yaml`), built by the
// same `./scripts/build` that builds the client. An example that does not
// compile is worse than no example.
listOf("hello", "chat", "money", "store", "agent", "tools").forEach { include("examples:$it") }
