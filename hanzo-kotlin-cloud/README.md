# hanzo-kotlin-cloud

The Hanzo Cloud client for the JVM: the whole `/v1` surface of the Hanzo API —
2478 operations over 263 API classes and 2031 models — generated from
[hanzoai/openapi](https://github.com/hanzoai/openapi) `hanzo.yaml`.

Generated, never hand-written. `scripts/generate.sh` owns
`src/main/kotlin/ai/hanzo/cloud`; edit the spec, not the client.

## Install

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

## Auth

`Hanzo` reads the environment once and builds the transport that every API class
shares.

| variable | meaning |
| --- | --- |
| `HANZO_API_KEY` | bearer credential, sent as `Authorization: Bearer …` |
| `HANZO_BASE_URL` | gateway to talk to; default `https://api.hanzo.ai` |
| `HANZO_ORG_ID` | org scope, sent as `X-Org-Id`; the KV and agents routes refuse without it |

Pass them explicitly when one program serves more than one tenant —
`Hanzo(apiKey = "hk-…", orgId = "acme")` — rather than mutating a global.

## Use

```kotlin
import ai.hanzo.Hanzo
import ai.hanzo.cloud.api.AuthApi

fun main() {
    val me = Hanzo().api(::AuthApi).botAuthMe()
    println("${me.handle} <${me.email}>")
}
```

`hanzo.api(::SomeApi)` builds any generated API class against the same base URL
and credentials; the classes are grouped by the spec's tags, under
`ai.hanzo.cloud.api`, with their request and response types under
`ai.hanzo.cloud.model`.

## Examples

The six canonical flows every Hanzo SDK ships live in `examples/` at the repo
root and are compiled by CI, so they cannot rot.

| flow | shows | run |
| --- | --- | --- |
| `hello` | identity, and the call that says no | `./gradlew :examples:hello:run` |
| `chat` | one completion | `./gradlew :examples:chat:run` |
| `money` | balance, then usage | `./gradlew :examples:money:run` |
| `store` | provision a KV store, read it, delete it | `./gradlew :examples:store:run` |
| `agent` | create an agent, run it, poll the run | `./gradlew :examples:agent:run` |
| `tools` | what this key can reach | `./gradlew :examples:tools:run` |

## Regenerating

```sh
./scripts/generate.sh          # rewrite the client from hanzoai/openapi@main
./scripts/generate.sh --check  # non-zero if the committed client drifted
```

The knobs are data in `hanzoai/openapi` `sdks.yaml`; the invocation is
`generate.py` beside it. This repo carries only the call site, so there is
nothing here that can drift on its own — and `--check` runs in CI to keep that
true.
