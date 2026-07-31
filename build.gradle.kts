plugins {
    id("org.jetbrains.dokka") version "2.0.0"
}

repositories {
    mavenCentral()
}

allprojects {
    group = "ai.hanzo.api"
    version = "0.1.0-alpha.4" // x-release-please-version
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

subprojects {
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

// Avoid race conditions between `dokkaHtmlCollector` and `dokkaJavadocJar` tasks
tasks.named("dokkaHtmlCollector").configure {
    subprojects.flatMap { it.tasks }
        .filter { it.project.name != "hanzo-kotlin" && it.name == "dokkaJavadocJar" }
        .forEach { mustRunAfter(it) }
}
