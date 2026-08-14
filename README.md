<p align="center"><img src=".github/hero.svg" alt="kotlin-sdk" width="880"></p>

# Hanzo Cloud — Kotlin SDK

Kotlin client for the [Hanzo Cloud](https://hanzo.ai) API, generated from the
`openapi.yaml` hanzoai/cloud emits from its own routers — so every method here is
a route the subsystem that publishes it registered. The document declares **2,479
operations over 1,814 paths**; the client is **192 API classes and 2,461 models**
under `ai.hanzo.cloud`.

Which release of the document this tree is a projection of is a fact about the
repo, in [`.spec-lock`](.spec-lock): the ref, and the digest of the bytes.

## Install

Nothing is on Maven Central yet — `ai.hanzo` is not a group there. Build it and
take it from your local Maven repo:

```sh
git clone https://github.com/hanzo-kotlin/sdk hanzo-kotlin-sdk
cd hanzo-kotlin-sdk
./gradlew -PpublishLocal :hanzo-kotlin-cloud:publishToMavenLocal
```

<!-- x-release-please-start-version -->

That installs `ai.hanzo:hanzo-kotlin-cloud:0.1.0-alpha.4` into `~/.m2`. Then, in
the project that wants it:

```kotlin
repositories { mavenLocal() }

dependencies { implementation("ai.hanzo:hanzo-kotlin-cloud:0.1.0-alpha.4") }
```

<!-- x-release-please-end -->

`-PpublishLocal` is the part that skips GPG signing; without it the publish stops
at `signMavenPublication` with no configured signatory. Building wants a JDK 21
toolchain. The jar it produces is Java 8 bytecode, so anything from Java 8 up can
consume it.

## Quickstart

```kotlin
import ai.hanzo.Hanzo
import ai.hanzo.cloud.api.KeysApi

fun main() {
    val keys = Hanzo().api(::KeysApi).getKeys().propertyKeys.orEmpty()
    println("${keys.size} keys")
    keys.forEach { println("${it.type} ${it.prefix}") }
}
```

```sh
export HANZO_API_KEY=sk-...
./gradlew :examples:hello:run    # the same call, in this repo
```

With a key that prints the caller's own keys. With none, the API answers 403:
this route refuses rather than pretending, which is what makes it a credential
check. [`examples/hello`](examples/hello) catches that — see [Errors](#errors).

`Hanzo()` resolves the endpoint and credentials; `hanzo.api(::SomeApi)` builds any
of the 192 generated API classes against them. The classes follow the document's
tags under `ai.hanzo.cloud.api`, with their request and response types under
`ai.hanzo.cloud.model`. `propertyKeys` rather than `keys` is the generator
renaming a wire field a Kotlin data class cannot carry — `@SerializedName` still
sends the original. Read method and field names off the client; do not guess
them.

## Authenticate

`HANZO_API_KEY` goes out as `Authorization: Bearer …` on every request. A Cloud
API key is one of the two classes `GET /v1/keys` mints: `sk-` (secret, belongs on
a server) or `pk-` (publishable, org-identifying, safe in a browser bundle). A
few OIDC-gated routes want an IAM-issued JWT instead and answer 401 to an API
key.

| variable | meaning |
| --- | --- |
| `HANZO_API_KEY` | bearer credential |
| `HANZO_BASE_URL` | gateway to talk to; default `https://api.hanzo.ai` |
| `HANZO_ORG_ID` | org scope, sent as `X-Org-Id`; the KV and agents routes refuse without it |

Pass them explicitly when one program serves more than one tenant —
`Hanzo(apiKey = "sk-…", orgId = "acme")` — rather than mutating a global.

[`Hanzo`](hanzo-kotlin-cloud/src/main/kotlin/ai/hanzo/Hanzo.kt) is the one
hand-written file in the module, and it is what makes the client authenticated at
all: the document declares no `securitySchemes`, so the generator registers no
credential and a call built any other way goes out bare.

## Errors

A 4xx throws `ClientException` and a 5xx throws `ServerException`, both from
`ai.hanzo.cloud.infrastructure`, both carrying `statusCode` and the raw
`response`.

```kotlin
import ai.hanzo.cloud.infrastructure.ClientException

try {
    Hanzo().api(::KeysApi).getKeys()
} catch (e: ClientException) {
    println("refused ${e.statusCode}") // 403 with no key: this route says no
}
```

## Examples

The six canonical flows every Hanzo SDK ships, under `examples/<flow>/`. They are
Gradle subprojects compiled by the build, so they cannot rot.

| flow | operations | what it does |
| --- | --- | --- |
| [`hello`](examples/hello) | `get_keys` | the call that says no, so a 200 proves the key works — and the refusal it catches |
| [`chat`](examples/chat) | `post_chat_completions` | one completion — the route carries no schema in the document, so the flow prints the status it got rather than inventing a request |
| [`money`](examples/money) | `get_billing_balance`, `get_billing_usage` | the balance and the usage that moved it, same shape and same reason |
| [`store`](examples/store) | `post_kv`, `get_kv_by_name`, `delete_kv_by_name` | provision a KV store, read it back, drop it |
| [`agent`](examples/agent) | `post_agents`, `post_agents_by_ref_run`, `get_agents_by_ref_runs` | create an agent, run it, poll until the run is terminal |
| [`tools`](examples/tools) | `get_tools` | the tools this key can reach, and which are activated |

```sh
export HANZO_API_KEY=sk-...
export HANZO_ORG_ID=my-org      # store and agent only
./gradlew :examples:hello:run
```

`agent` runs on `zen5` and reads `HANZO_MODEL` to pick another;
`curl https://catalog.hanzo.ai/v1/models` lists the other 499.

Route reference: [docs.hanzo.ai](https://docs.hanzo.ai).

## Build

```sh
./scripts/build                          # client + examples
./gradlew :hanzo-kotlin-cloud:assemble   # the jar
./gradlew :hanzo-kotlin-cloud:test       # the flow tests
```

The examples are the gate. The build compiles the client and all six flows
against it, so a document change that renames or drops an operation goes red here
instead of in someone's app. `FlowsTest` pins each flow to the route
hanzoai/openapi `flows.yaml` names and asserts the client actually sends the
bearer token and the org header — the whole contract of a generated client.

## Regenerate

Nothing under `hanzo-kotlin-cloud/src/main/kotlin/ai/hanzo/cloud` is written by
hand. To change the client, change the code that emits the document.

```sh
SPEC=/path/to/openapi.yaml OPENAPI=/path/to/hanzoai/openapi ./scripts/generate.sh
SPEC=… OPENAPI=… ./scripts/generate.sh --check   # non-zero if the tree drifted
```

`scripts/generate.sh` is a call site: the invocation lives once in
`hanzoai/openapi/generate.py`, and every knob — generator, HTTP library,
coordinates, packages — is data in `sdks.yaml` beside it. Both inputs arrive as
values: `SPEC` is the document, `OPENAPI` is the checkout holding the driver. CI
sets both; by hand, point them at checkouts you already have. `CLAUDE.md` has the
rest.

## Sibling repos

The same API in other languages: `hanzoai/python-sdk`, `hanzoai/java-sdk`,
`hanzo-js/sdk`, `hanzo-go/sdk`, `hanzo-cpp/sdk`, `hanzo-swift/sdk`.

## License

Apache-2.0. See [LICENSE](LICENSE).
