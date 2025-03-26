plugins {
    `maven-publish`
    signing
}

configure<PublishingExtension> {
    publications {
        register<MavenPublication>("maven") {
            from(components["java"])

            pom {
                name.set("Hanzo API")
                description.set("Call 100+ LLMs in the OpenAI format. [**Docs**](https://docs.hanzo.ai/)\n\n👉 [`Hanzo Console`](https://cloud.hanzo.ai). Create, Edit API Keys.\n\n💸 [`LLM Models`](https://models.hanzo.ai/).")
                url.set("https://docs.hanzo.ai")

                licenses {
                    license {
                        name.set("Apache-2.0")
                    }
                }

                developers {
                    developer {
                        name.set("Hanzo")
                        email.set("dev@hanzo.ai")
                    }
                }

                scm {
                    connection.set("scm:git:git://github.com/stainless-sdks/Hanzo-AI-kotlin.git")
                    developerConnection.set("scm:git:git://github.com/stainless-sdks/Hanzo-AI-kotlin.git")
                    url.set("https://github.com/stainless-sdks/Hanzo-AI-kotlin")
                }

                versionMapping {
                    allVariants {
                        fromResolutionResult()
                    }
                }
            }
        }
    }
}

signing {
    val signingKeyId = System.getenv("GPG_SIGNING_KEY_ID")?.ifBlank { null }
    val signingKey = System.getenv("GPG_SIGNING_KEY")?.ifBlank { null }
    val signingPassword = System.getenv("GPG_SIGNING_PASSWORD")?.ifBlank { null }
    if (signingKey != null && signingPassword != null) {
        useInMemoryPgpKeys(
            signingKeyId,
            signingKey,
            signingPassword,
        )
        sign(publishing.publications["maven"])
    }
}

tasks.named("publish") {
    dependsOn(":closeAndReleaseSonatypeStagingRepository")
}
