plugins {
    id("hanzo.kotlin")
    application
}

dependencies {
    implementation(project(":hanzo-kotlin"))
}

application {
    mainClass = "com.hanzo_ai.api.example.MainKt"
}
