plugins {
    id("org.jetbrains.dokka") version "2.0.0"
}

repositories {
    mavenCentral()
}

allprojects {
    // One artifact line, so one coordinate. `ai.hanzo`, matching the group
    // `sdks.yaml` pins for the generated cloud clients in every language.
    group = "ai.hanzo"
    version = "0.1.0-alpha.5" // x-release-please-version
}

subprojects {
    // These are populated with dependencies by `buildSrc` scripts.
    tasks.register("format") {
        group = "Verification"
        description = "Formats all source files."
    }
    tasks.register("lint") {
        group = "Verification"
        description = "Verifies all source files are formatted."
    }
    apply(plugin = "org.jetbrains.dokka")
}

// The six canonical example flows. They differ only in which routes they call,
// so they are configured once, here, rather than in six identical build files.
configure(subprojects.filter { it.parent?.name == "examples" }) {
    apply(plugin = "hanzo.kotlin")
    apply(plugin = "application")

    dependencies { add("implementation", project(":hanzo-kotlin-cloud")) }

    // Each flow is one `Main.kt` in the default package: `examples/<flow>/`.
    extensions.configure<JavaApplication> { mainClass.set("MainKt") }
}
