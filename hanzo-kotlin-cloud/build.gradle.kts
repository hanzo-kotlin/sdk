// The generated Hanzo Cloud client: the whole `/v1` surface of hanzoai/openapi
// `hanzo.yaml`, as one API class per tag over okhttp.
//
// `src/main/kotlin/ai/hanzo/cloud` belongs to the generator — sdks.yaml maps it
// there, `scripts/generate.sh` replaces it wholesale, and `--check` fails if it
// drifted. Everything else in this module, this file included, is the repo's.
plugins {
    id("hanzo.kotlin")
    id("hanzo.publish")
}

// `ai.hanzo`, not the root's `ai.hanzo.api`: sdks.yaml pins the coordinate for
// the generated cloud clients, and they are a different artifact line from the
// hand-written `ai.hanzo.api:hanzo-kotlin-*` modules beside them.
group = "ai.hanzo"

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
// formatting them would rewrite 2307 files and make the drift gate fail on
// every run.
tasks.named("formatKotlin") { enabled = false }

tasks.named("lintKotlin") { enabled = false }
