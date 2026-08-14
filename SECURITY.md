# Security Policy

## Reporting a vulnerability

Email **dev@hanzo.ai**. Please do not open a public issue for a security report.

Give us a reasonable window to investigate and ship a fix before disclosing
publicly.

## Where a flaw actually lives

`hanzo-kotlin-cloud/` is generated from the `openapi.yaml` hanzoai/cloud emits
from its own routers. A flaw in the API surface itself belongs upstream in
hanzoai/cloud rather than in this client — say so in the report and we will route
it. A flaw in the client's shape is a fix to the generator in hanzoai/openapi,
which every language's client then picks up.

`ai/hanzo/Hanzo.kt` is the exception: it is the one hand-written file, it holds
the credential, and a fix there is a change to this repo.
