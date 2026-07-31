rootProject.name = "hanzo-kotlin-root"

val projectNames = rootDir.listFiles()
    ?.asSequence()
    .orEmpty()
    .filter { file ->
        file.isDirectory &&
        file.name.startsWith("hanzo-kotlin") &&
        file.listFiles()?.asSequence().orEmpty().any { it.name == "build.gradle.kts" }
    }
    .map { it.name }
    .toList()
println("projects: $projectNames")
projectNames.forEach { include(it) }

// The six canonical example flows (hanzoai/openapi `flows.yaml`), built by the
// same `./scripts/build` that builds the client. An example that does not
// compile is worse than no example.
listOf("hello", "chat", "money", "store", "agent", "tools").forEach { include("examples:$it") }
