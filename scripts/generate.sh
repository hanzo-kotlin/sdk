#!/usr/bin/env bash
# Regenerate the Hanzo Cloud client from the Hanzo Cloud API document.
#
# A CALL SITE, not a generator invocation. The invocation is logic and lives
# once, in `generate.py`; every per-language knob — generator, library,
# serialization, packages, coordinates, and which path in this repo the
# generator owns — is data in `sdks.yaml` beside it.
#
#   ./scripts/generate.sh          # rewrite hanzo-kotlin-cloud/src/main/kotlin/ai/hanzo/cloud
#   ./scripts/generate.sh --check  # diff only; non-zero if the committed client drifted
#
# BOTH INPUTS ARRIVE AS VALUES. $SPEC is the document, already fetched at a
# pinned ref and digest-checked; $OPENAPI is the checkout holding the driver.
# hanzoai/ci's client lane sets both, because it holds the one credential that
# reads the forge the driver lives on. What stood here instead was a four-deep
# credential chain pointed at github.com, where the driver is not canonical and
# none of those tokens are provisioned. Set OPENAPI by hand to run it by hand.
#
# Requires: java 17+, python3 with PyYAML.
set -euo pipefail
cd "$(dirname "$0")/.."

: "${OPENAPI:?the generator lives in hanzoai/openapi; the ci client lane sets OPENAPI, or point it at a checkout}"

if [ -n "${SPEC:-}" ]; then set -- --spec "$SPEC" "$@"; fi

exec python3 "$OPENAPI/generate.py" kotlin --repo "$PWD" "$@"
