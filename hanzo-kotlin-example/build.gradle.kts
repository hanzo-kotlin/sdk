plugins {
    id("hanzo.kotlin")
    application
}

dependencies {
    implementation(project(":hanzo-kotlin-core"))
    implementation(project(":hanzo-kotlin-client-okhttp"))
}

application {
    // Use `./gradlew :hanzo-kotlin-example:run` to run `Main`
    // Use `./gradlew :hanzo-kotlin-example:run -Pexample=Something` to run `SomethingExample`
    mainClass = "ai.hanzo.api.example.${
        if (project.hasProperty("example"))
            "${project.property("example")}ExampleKt"
        else
            "MainKt"
    }"
}
