#!/usr/bin/env bash
# Regenerate the Hanzo Cloud client from the unified OpenAPI spec.
#
# This is a CALL SITE, not a generator invocation. The invocation is logic and
# lives once, in hanzoai/openapi `generate.py`; every per-language knob —
# generator, library, serialization, packages, coordinates, and which path in
# this repo the generator owns — is data in `sdks.yaml` beside it. Nothing here
# repeats them, so there is nothing in this repo that can drift on its own.
#
#   ./scripts/generate.sh          # rewrite hanzo-kotlin-cloud/src/main/kotlin/ai/hanzo/cloud
#   ./scripts/generate.sh --check  # diff only; non-zero if the committed client drifted
#
#   OPENAPI=~/work/hanzo/openapi ./scripts/generate.sh   # reuse a checkout you have
#
# Without OPENAPI this clones hanzoai/openapi. That repo is PRIVATE, and GitHub
# 404s a private path rather than 403ing it, so an unauthenticated fetch looks
# like a missing file — hence the token, and hence the explicit message below
# rather than a confusing 404.
#
# Requires: git, java 17+, python3 with PyYAML.
set -euo pipefail
cd "$(dirname "$0")/.."

SPEC_REPO="${SPEC_REPO:-hanzoai/openapi}"
SPEC_REF="${SPEC_REF:-main}"
OPENAPI="${OPENAPI:-}"

if [ -z "$OPENAPI" ]; then
  TOKEN="${SPEC_TOKEN:-${GH_TOKEN:-${GITHUB_TOKEN:-}}}"
  : "${TOKEN:?$SPEC_REPO is private: set SPEC_TOKEN (or GH_TOKEN/GITHUB_TOKEN), or point OPENAPI at a checkout}"
  OPENAPI="$(mktemp -d)"
  trap 'rm -rf "$OPENAPI"' EXIT
  echo "==> cloning $SPEC_REPO@$SPEC_REF (private repo — authenticated clone)"
  git clone --quiet --depth 1 --branch "$SPEC_REF" \
    "https://x-access-token:${TOKEN}@github.com/${SPEC_REPO}.git" "$OPENAPI"
fi

echo "==> $(git -C "$OPENAPI" rev-parse HEAD) $SPEC_REPO"
python3 "$OPENAPI/generate.py" kotlin --repo "$PWD" "$@"
