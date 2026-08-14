<p align="center"><img src=".github/hero.svg" alt="kotlin-sdk" width="880"></p>

# Hanzo Cloud — Kotlin SDK

Kotlin client for the [Hanzo Cloud](https://hanzo.ai) unified API: **2502
operations over 192 API classes and 2461 models**, generated from the
`openapi.yaml` hanzoai/cloud emits from its own routers — so every method here is
a route the subsystem that publishes it registered.

Which release this client is a projection of is a fact about the repo, in
[`.spec-lock`](.spec-lock): the ref, and the digest of the bytes it was cut from.

Nothing under `hanzo-kotlin-cloud/src/main/kotlin/ai/hanzo/cloud` is written by
hand. To change the client, change the code that emits the document.

## Install

<!-- x-release-please-start-version -->

Gradle:

```kotlin
implementation("ai.hanzo:hanzo-kotlin-cloud:0.1.0-alpha.4")
```

Maven:

```xml
<dependency>
  <groupId>ai.hanzo</groupId>
  <artifactId>hanzo-kotlin-cloud</artifactId>
  <version>0.1.0-alpha.4</version>
</dependency>
```

<!-- x-release-please-end -->

Java 8 or newer.

## Authenticate

A bearer token — an IAM-issued JWT or an `hk-` Cloud API key. Some routes (KV,
agents) are org-scoped and also need `X-Org-Id`; the rest take the tenant from
the token's `owner` claim.

[`Hanzo`](hanzo-kotlin-cloud/src/main/kotlin/ai/hanzo/Hanzo.kt) reads the
environment once and builds the transport every API class shares. It is the one
hand-written file in the module, and it is what makes the client authenticated at
all: the document declares no `securitySchemes`, so the generator registers no
credential and a call built any other way goes out bare.

| variable | meaning |
| --- | --- |
| `HANZO_API_KEY` | bearer credential, sent as `Authorization: Bearer …` |
| `HANZO_BASE_URL` | gateway to talk to; default `https://api.hanzo.ai` |
| `HANZO_ORG_ID` | org scope, sent as `X-Org-Id`; the KV and agents routes refuse without it |

Pass them explicitly when one program serves more than one tenant —
`Hanzo(apiKey = "hk-…", orgId = "acme")` — rather than mutating a global.

## Use it

```kotlin
import ai.hanzo.Hanzo
import ai.hanzo.cloud.api.KeysApi

fun main() {
    val keys = Hanzo().api(::KeysApi).getKeys().propertyKeys.orEmpty()
    keys.forEach { println("${it.type} ${it.prefix}") }
}
```

`hanzo.api(::SomeApi)` builds any generated API class against the same base URL
and credentials; every generated class takes the same `(basePath, Call.Factory)`
pair, so that call is the whole of it. The classes are grouped by the document's
tags under `ai.hanzo.cloud.api`, with their request and response types under
`ai.hanzo.cloud.model`.

A 4xx throws `ClientException` and a 5xx throws `ServerException`, both from
`ai.hanzo.cloud.infrastructure`, both carrying `statusCode` and the raw response.

## Examples

The six canonical flows every Hanzo SDK ships, under `examples/<flow>/`. They are
Gradle subprojects compiled by the build, so they cannot rot.

| flow | what it does |
| --- | --- |
| [`hello`](examples/hello) | `GET /v1/keys` — the call that says no, so a 200 proves the key works |
| [`chat`](examples/chat) | `POST /v1/chat/completions` — one completion, OpenAI-compatible |
| [`money`](examples/money) | `GET /v1/billing/balance`, `GET /v1/billing/usage` |
| [`store`](examples/store) | `POST /v1/kv`, `GET`/`DELETE /v1/kv/{name}` — provision, read, drop |
| [`agent`](examples/agent) | `POST /v1/agents`, `.../run`, poll `.../runs` until terminal |
| [`tools`](examples/tools) | `GET /v1/tools` — the tools this key can reach |

```sh
export HANZO_API_KEY=hk-...
export HANZO_ORG_ID=my-org      # store and agent only
./gradlew :examples:hello:run
```

Set `HANZO_MODEL` for `chat` and `agent`: the fallback compiled into them is
`zen-1`, which is not a model the gateway serves, so they fail on the model id
without it. `zen5`, `zen5-coder` and `enso` are real; `curl
https://catalog.hanzo.ai/v1/models` lists the rest.

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

```sh
SPEC=/path/to/openapi.yaml OPENAPI=/path/to/hanzoai/openapi ./scripts/generate.sh
SPEC=… OPENAPI=… ./scripts/generate.sh --check   # non-zero if the tree drifted
```

`scripts/generate.sh` is a call site, not a generator invocation: the invocation
lives once in `hanzoai/openapi/generate.py` and every knob — generator, HTTP
library, coordinates, packages — is data in `sdks.yaml` beside it. Both inputs
arrive as values: `SPEC` is the document, `OPENAPI` is the checkout holding the
driver. CI's client lane sets both, because it holds the one credential that
reads the forge they live on; by hand, point them at checkouts you already have.

ktfmt does not run over the generated sources: they must stay byte-identical to
the generator's output, and that identity is what `--check` diffs.

## Sibling repos

Other languages, same document: `hanzoai/python-sdk`, `hanzoai/java-sdk`,
`hanzo-js/sdk`, `hanzo-go/sdk`, `hanzo-rs/sdk`, `hanzo-cpp/sdk`,
`hanzo-swift/sdk`.

## License

Apache-2.0. See [LICENSE](LICENSE).
