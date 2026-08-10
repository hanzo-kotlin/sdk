# kotlin-sdk

**Org:** hanzo-kotlin  ·  **Ecosystem:** hanzo
**Origin:** https://github.com/hanzo-kotlin/sdk.git

## Discovery

This file (`CLAUDE.md`) is the canonical agent-facing readme; `LLM.md` is a symlink to it. Update either name and both stay in sync.

## Two clients live here

**`hanzo-kotlin*`** — the curated client. 188 endpoints, hand-shaped ergonomics,
generated with Stainless, published as `ai.hanzo.api:hanzo-kotlin`. `.stats.yml`
records the Stainless spec it was cut from. Do not hand-edit; it is regenerated
upstream.

**`hanzo-kotlin-cloud`** — the **full** cloud client, published as
`ai.hanzo:hanzo-kotlin-cloud`. Every `/v1` route of the Hanzo API: 2468
operations over 190 API classes and 2439 models, generated from the
`openapi.yaml` hanzoai/cloud emits from its own routers. `.spec-lock` names the
release this tree is a projection of, and its digest. `sdks.yaml` in
[hanzoai/openapi](https://github.com/hanzoai/openapi) is the registry that names
this repo (`kotlin-sdk`) and every generator knob; this repo carries only a call
site.

The two are independent artifact lines and do not share code.

## Regenerating the cloud client

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

## Examples

`examples/<flow>/` — the six canonical flows every Hanzo SDK ships, defined as
data in hanzoai/openapi `flows.yaml`: `hello`, `chat`, `money`, `store`,
`agent`, `tools`. They are Gradle subprojects compiled by `./scripts/build`, so
they cannot rot. Configured in one place, the `examples` block in
`build.gradle.kts`.

```sh
HANZO_API_KEY=hk-… ./gradlew :examples:hello:run
```

## Gates

`hanzo.yml` is read by hanzoai/ci: regenerate, then build the client and the six
examples, lint, run the flow tests, and produce the jar. `.hanzo/workflows` is
the call into `hanzoai/ci`.

## Sibling repos

Other languages, same spec: `hanzoai/python-sdk`, `hanzo-js/sdk`,
`hanzo-go/sdk`, `hanzo-rs/sdk`, `hanzo-cpp/sdk`, `hanzo-swift/sdk`.
