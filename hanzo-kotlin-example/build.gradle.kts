plugins {
    id("hanzo.kotlin")
    application
}

dependencies {
    implementation(project(":hanzo-kotlin"))
}

application {
    // Use `./gradlew :hanzo-kotlin-example:run` to run `Main`
    // Use `./gradlew :hanzo-kotlin-example:run -Dexample=Something` to run `SomethingExample`
    mainClass = "ai.hanzo.api.example.${
        if (project.hasProperty("example"))
            "${project.property("example")}ExampleKt"
        else
            "MainKt"
    }"
}
