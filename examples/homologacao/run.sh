#!/bin/sh
# Optional homologation example (ambiente 2). Builds this SDK into a temporary directory and runs
# Homologacao.java. Nothing is compiled or sent unless WEBMANIA_LIVE=1. Configuration comes only from
# the WEBMANIA_* environment documented in the README.
set -eu
if [ "${WEBMANIA_LIVE:-}" != "1" ]; then
  printf '%s\n' '{"result":"blocked"}'
  exit 77
fi
here=$(cd "$(dirname "$0")" && pwd)
root=$(cd "$here/../.." && pwd)
work=$(mktemp -d "${TMPDIR:-/tmp}/webmania-homologacao.XXXXXX")
trap 'rm -rf "$work"' EXIT INT TERM
# A prepared offline Maven repository is used when present (container images); otherwise the
# user's default local repository.
repo="${HOME:-/tmp}/.m2/repository"
if [ -d /opt/m2-seed ]; then cp -R /opt/m2-seed "$work/m2"; repo="$work/m2"; fi
mkdir -p "$work/sdk"
(cd "$root" && tar -cf - --exclude ./target --exclude ./.maven-local --exclude ./.git .) | (cd "$work/sdk" && tar -xf -)
# Build in a subshell so relative WEBMANIA_LIVE_* paths keep resolving against the caller's directory.
(cd "$work/sdk" && mvn -o -q -B -ntp -Dmaven.repo.local="$repo" -DskipTests package dependency:build-classpath -Dmdep.outputFile="$work/classpath.txt" >&2)
jar=$(ls "$work"/sdk/target/webmania-sdk-*.jar | grep -v -- '-sources.jar' | head -n 1)
classpath="$jar:$(cat "$work/classpath.txt")"
mkdir -p "$work/classes"
javac -encoding UTF-8 -d "$work/classes" -cp "$classpath" "$here/Homologacao.java" >&2
java -cp "$work/classes:$classpath" Homologacao
