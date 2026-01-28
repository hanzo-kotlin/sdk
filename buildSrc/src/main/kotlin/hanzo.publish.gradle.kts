import com.vanniktech.maven.publish.JavadocJar
import com.vanniktech.maven.publish.KotlinJvm
import com.vanniktech.maven.publish.MavenPublishBaseExtension
import com.vanniktech.maven.publish.SonatypeHost

plugins {
    id("com.vanniktech.maven.publish")
}

publishing {
  repositories {
      if (project.hasProperty("publishLocal")) {
          maven {
              name = "LocalFileSystem"
              url = uri("${rootProject.layout.buildDirectory.get()}/local-maven-repo")
          }
      }
  }
}

repositories {
    gradlePluginPortal()
    mavenCentral()
}

extra["signingInMemoryKey"] = System.getenv("GPG_SIGNING_KEY")
extra["signingInMemoryKeyId"] = System.getenv("GPG_SIGNING_KEY_ID")
extra["signingInMemoryKeyPassword"] = System.getenv("GPG_SIGNING_PASSWORD")

configure<MavenPublishBaseExtension> {
    if (!project.hasProperty("publishLocal")) {
        signAllPublications()
        publishToMavenCentral(SonatypeHost.CENTRAL_PORTAL)
    }

    coordinates(project.group.toString(), project.name, project.version.toString())
    configure(
        KotlinJvm(
            javadocJar = JavadocJar.Dokka("dokkaHtml"),
            sourcesJar = true,
        )
    )

    pom {
        name.set("LiteLLM API")
        description.set("Proxy Server to call 100+ LLMs in the OpenAI format.\n[**Customize Swagger Docs**](https://docs.litellm.ai/docs/proxy/enterprise#swagger-docs---custom-routes--branding)\n\n👉 [`LiteLLM Admin Panel on /ui`](/ui). Create, Edit Keys with SSO. Having\nissues? Try [`Fallback Login`](/fallback/login)\n\n💸 [`LiteLLM Model Cost Map`](https://models.litellm.ai/).\n\n🔎 [`LiteLLM Model Hub`](/ui/model_hub_table). See available models on the\nproxy. [**Docs**](https://docs.litellm.ai/docs/proxy/ai_hub)")
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
            connection.set("scm:git:git://github.com/hanzoai/kotlin-sdk.git")
            developerConnection.set("scm:git:git://github.com/hanzoai/kotlin-sdk.git")
            url.set("https://github.com/hanzoai/kotlin-sdk")
        }
    }
}

tasks.withType<Zip>().configureEach {
    isZip64 = true
}
