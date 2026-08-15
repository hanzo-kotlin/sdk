# kotlin-sdk

**Org:** hanzoai  ·  **Ecosystem:** hanzo
**Origin:** https://git.hanzo.ai/hanzoai/kotlin-sdk.git  ·  **Public mirror:** https://github.com/hanzo-kotlin/sdk

## Discovery

This file (`CLAUDE.md`) is the canonical agent-facing readme; `LLM.md` is a symlink to it. Update either name and both stay in sync.

## One client

`hanzo-kotlin-cloud`, coordinates `ai.hanzo:hanzo-kotlin-cloud`. Every `/v1`
route of the Hanzo API, generated from the `openapi.yaml` hanzoai/cloud emits
from its own routers. `.spec-lock` names the release this tree is a projection
of, and its digest. `sdks.yaml` in
[hanzoai/openapi](https://github.com/hanzoai/openapi) is the registry that names
this repo (`kotlin-sdk`) and every generator knob; this repo carries only a call
site.

The shape, measured — the document at `.spec-lock`, and the tree it produced:

| | |
| --- | --- |
| paths / operations in the document | 1,814 / 2,479 |
| API classes (`ai.hanzo.cloud.api`) | 192, one per tag |
| models (`ai.hanzo.cloud.model`) | 2,461 |
| infrastructure | 13 |
| methods across the API classes | 2,502 — 23 operations carry two tags, so they land in two classes |

Nothing is on Maven Central: `ai.hanzo` is not a group there
(`repo1.maven.org/maven2/ai/hanzo/` answers 404), and the four `v0.1.0-alpha.*`
tags predate this client. Until a release lands, a consumer builds it —
`./gradlew -PpublishLocal :hanzo-kotlin-cloud:publishToMavenLocal`, then
`mavenLocal()`. The `-PpublishLocal` property is what turns off signing; without
it the publish stops at `signMavenPublication` with no signatory.

Two things have to exist before a tag can put it there, and neither is code:

1. **The namespace.** Central accepts `ai.hanzo` only once the namespace is
   verified against hanzo.ai, which is a DNS TXT record and a Portal account.
   hanzo.ai carries no such record today, so the namespace has never been
   claimed.
2. **The credential**, sealed in KMS at org `hanzo`, env `prod`, path `maven`:
   `MAVEN_CENTRAL_USERNAME`, `MAVEN_CENTRAL_PASSWORD` (the two halves of a
   Central Portal user token) and `GPG_SIGNING_KEY`, `GPG_SIGNING_KEY_ID`,
   `GPG_SIGNING_PASSWORD` (an armoured private key, its long id, its
   passphrase). `GET /v1/kms/secrets/maven/MAVEN_CENTRAL_USERNAME?env=prod`
   answers `404 secret not found`; `NPM_TOKEN` and `PYPI_TOKEN` are sealed for
   the sibling SDKs, this pair is not. The path is `maven`, not `kotlin-sdk`,
   because one namespace and one signing key serve every JVM client — sealing
   it twice is a second thing to rotate.

With both in place the release is a tag: `.hanzo/workflows/publish-maven.yml`
reads those five keys and runs `publishAndReleaseToMavenCentral`. It refuses
rather than skipping, so a tag can never report success over an empty registry.

There was a second, hand-shaped client here — `hanzo-kotlin-core` plus its
okhttp transport, umbrella, example and proguard modules. It is gone. Two
clients for one API is two answers to one question, and the generated one is the
one that tracks the document. Anything that used to import `ai.hanzo.api.*`
belongs on `ai.hanzo.cloud.*`.

## Regenerating

```sh
SPEC=…/openapi.yaml OPENAPI=…/hanzoai/openapi ./scripts/generate.sh
SPEC=…/openapi.yaml OPENAPI=…/hanzoai/openapi ./scripts/generate.sh --check
```

The invocation lives once, in `generate.py` in hanzoai/openapi; the per-language
knobs are data in `sdks.yaml` beside it. Nothing here repeats them, so nothing
here can drift on its own. Both inputs arrive as VALUES — the document and the
checkout holding the driver — because hanzoai/ci's client lane holds the one
credential that reads the forge they live on, and it regenerates this tree on
every build before `test:` compiles it. A document change that produces a client
which does not build therefore goes red here, which is the gate.

`sdks.yaml` gives the generator `hanzo-kotlin-cloud/src/main/kotlin/ai/hanzo/cloud`
outright: `generate.sh` replaces that directory wholesale. **Never hand-edit
anything under it** — edit the spec. Everything else in the module is the
repo's, including `ai/hanzo/Hanzo.kt`, the hand-written seam that resolves
`HANZO_API_KEY` / `HANZO_BASE_URL` / `HANZO_ORG_ID` and builds the shared
authenticated transport. It sits beside `cloud/` rather than inside it precisely
because inside it would be deleted.

ktfmt is switched off for this module: its sources must stay byte-identical to
the generator's output, and that identity is what `--check` diffs.

## The credential

The document declares one `securityScheme` — `bearer`, HTTP — and a top-level
`security: [bearer]`, so the generator emits credential code it did not emit
before: `ApiClient.updateAuthParams` fills `Authorization: Bearer <token>` from
`ApiClient.accessToken`, and every generated request config carries
`requiresAuthentication`. That flag is TRUE on 2,498 of the 2,502 methods and
false on the four operations the document exempts with `security: []` —
`get_models`, `get_models_providers`, `get_commands`, `get_openapi.json`.

`Hanzo.kt` still carries the token itself, and the reason is worth keeping:
`ApiClient.accessToken` is on the generated COMPANION, one per process, while
`ApiClient` takes only `(baseUrl, client)` and offers no per-instance slot. A
client that read the companion would hand one tenant's token to another's call
— `FlowsTest` demonstrated exactly that, two tests in one JVM, before the seam
went back to the transport. So the interceptor sets `Authorization` when there
is a key and REMOVES it when there is not, which also stops a token parked on
the process-wide field from riding out on a call meant to be anonymous.

A bearer is a Cloud API key (`sk-`/`pk-`) or an IAM access token from
`POST https://hanzo.id/v1/iam/oauth/token` with `grant_type=client_credentials`.
Both are the same header; the API distinguishes them.

## Examples

`examples/<flow>/` — the six canonical flows every Hanzo SDK ships, defined as
data in hanzoai/openapi `flows.yaml`: `hello`, `chat`, `money`, `store`,
`agent`, `tools`. They are Gradle subprojects compiled by `./scripts/build`, so
they cannot rot. Configured in one place, the `examples` block in
`build.gradle.kts`. `hello` is also where the error path is shown: a 4xx is
`ClientException`, a 5xx is `ServerException`, both from
`ai.hanzo.cloud.infrastructure` and both carrying `statusCode`.

`hello` opens on `get_models`, which the document declares open, so
`./gradlew :examples:hello:run` reaches api.hanzo.ai and prints a 200 with no
credential at all — an unreachable gateway and a rejected credential otherwise
end in the same "no". flows.yaml carries that as the flow's first operation, so
every language's `hello` gets the same opening.

```sh
HANZO_API_KEY=sk-… ./gradlew :examples:hello:run
```

A key is `sk-` (secret) or `pk-` (publishable) — the two classes `POST /v1/keys`
mints and `GET /v1/keys` lists. The operationIds each example names in its header
are read off the document, never derived: the default version left the id, so
`get_v1_keys` is now `get_keys`, and a path parameter shows as `by_`
(`get_kv_by_name`). Method names on the client are those ids camel-cased, and
the only way to know one is to read it.

## Gates

`hanzo.yml` is read by hanzoai/ci: regenerate, then build the client and the six
examples, lint, run the flow tests, and produce the jar, which a tag attaches to
the release. `.hanzo/workflows/cicd.yml` is the call into `hanzoai/ci`;
`.hanzo/workflows/publish-maven.yml` beside it is the registry lane, and the two
have no overlap — one attaches a jar to a release, the other uploads to Central.

## Sibling repos

The same API in other languages: `hanzoai/python-sdk`, `hanzoai/java-sdk`,
`hanzo-js/sdk`, `hanzo-go/sdk`, `hanzo-cpp/sdk`, `hanzo-swift/sdk`. Only python,
typescript, java and kotlin are rows in `sdks.yaml`; the rest carry their own
call site.
