import com.vanniktech.maven.publish.JavadocJar
import com.vanniktech.maven.publish.KotlinJvm
import com.vanniktech.maven.publish.MavenPublishBaseExtension
import com.vanniktech.maven.publish.SonatypeHost

plugins {
    id("com.vanniktech.maven.publish")
}

// Written once: the POM names it three times (url, scm.url, both scm
// connections) and a reader who follows any of them has to land in the same
// place. `hanzoai/kotlin-sdk` redirects here; a redirect is not an address.
val home = "https://github.com/hanzo-kotlin/sdk"

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

    // The Central page is what a reader sees before any code, so it names THIS
    // artifact: one language's client for one API. "Hanzo API" / "API
    // documentation for Hanzo" named neither — every language would have
    // published under the same two lines, and neither one is documentation.
    pom {
        name.set("Hanzo Cloud Kotlin SDK")
        description.set(
            "Kotlin client for the Hanzo Cloud API, generated from the OpenAPI document " +
                "hanzoai/cloud emits from its own routers."
        )
        // A coordinate on Central has to name a URL a stranger can open.
        // git.hanzo.ai is where development happens and answers 303 to anyone
        // not signed in, so the public mirror is the home; docs.hanzo.ai is the
        // route reference and is linked from it.
        url.set(home)

        licenses {
            license {
                name.set("Apache-2.0")
                url.set("https://www.apache.org/licenses/LICENSE-2.0.txt")
                distribution.set("repo")
            }
        }

        developers {
            developer {
                id.set("hanzo")
                name.set("Hanzo")
                email.set("dev@hanzo.ai")
                url.set("https://hanzo.ai")
            }
        }

        scm {
            connection.set("scm:git:$home.git")
            developerConnection.set("scm:git:$home.git")
            url.set(home)
        }
    }
}

tasks.withType<Zip>().configureEach {
    isZip64 = true
}
