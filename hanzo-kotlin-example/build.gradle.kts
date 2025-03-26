plugins {
    id("hanzo.kotlin")
    application
}

dependencies {
    implementation(project(":hanzo-kotlin"))
}

application {
    mainClass = "ai.hanzo.api.example.MainKt"
}
