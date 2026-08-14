// The Hanzo Cloud client: the whole `/v1` surface of the `openapi.yaml`
// hanzoai/cloud emits, as one API class per tag over okhttp.
//
// `src/main/kotlin/ai/hanzo/cloud` belongs to the generator — sdks.yaml maps it
// there, `scripts/generate.sh` replaces it wholesale, and `--check` fails if it
// drifted. Everything else in this module, this file included, is the repo's.
plugins {
    id("hanzo.kotlin")
    id("hanzo.publish")
}

dependencies {
    // `api`, not `implementation`: okhttp and gson are in the generated client's
    // public signatures — every generated class takes a `Call.Factory` and
    // `Serializer` hands back a `Gson` — so a consumer cannot call this without
    // them on the compile classpath.
    api("com.squareup.okhttp3:okhttp:4.12.0")
    api("com.google.code.gson:gson:2.10.1")

    testImplementation("com.squareup.okhttp3:mockwebserver:4.12.0")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.9.3")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.9.3")
}

// ktfmt does not run here. The generated sources have to stay byte-identical to
// the generator's output — that identity is exactly what `--check` diffs — so
// formatting them would rewrite all 2666 files and make the drift gate fail on
// every run.
tasks.named("formatKotlin") { enabled = false }

tasks.named("lintKotlin") { enabled = false }
