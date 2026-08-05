# Security Policy

## Reporting a vulnerability

Email **dev@hanzo.ai**. Please do not open a public issue for a security report.

Give us a reasonable window to investigate and ship a fix before disclosing
publicly.

## Where a flaw actually lives

`hanzo-kotlin-cloud/` is generated from `hanzo.yaml` in `hanzoai/openapi`, which
is derived from hanzoai/cloud's emitted API document. A flaw in the API surface
itself belongs upstream in hanzoai/cloud rather than in this client — say so in
the report and we will route it.

`ai.hanzo.api:hanzo-kotlin`, the curated client, is no longer regenerated: the
generator that produced it was retired on 2026-07-04. A fix there is a hand
change to committed code.
