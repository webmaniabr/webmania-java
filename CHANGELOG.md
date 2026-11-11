# Changes

## Unreleased

- README rewritten for integrators: requirements, installation, credentials from environment variables, homologation examples that issue, consult and cancel an NF-e and an NFS-e, and the method list per product. The technical details that were in the README moved unchanged to `docs/INTEGRATION.md`, `docs/TESTING.md`, `docs/OPERATIONS.md` and `examples/homologacao/README.md`. Documentation only.
- README: the SDK is presented as available from the public GitHub repository and installed from a clone (`git clone https://github.com/webmaniabr/webmania-java.git`); it is still not published to a package registry. Documentation only: code and contract are unchanged.
- Homologation example: `WEBMANIA_LIVE_ALLOWED_HOSTS` is required (absent or empty, the example exits 77 before any request), and a payload is accepted only when its top-level `ambiente` is the JSON integer `2` (the text `"2"` is refused).
- Homologation example: after an NFS-e cancellation the example keeps consulting while the document is in `processando_cancelamento`; only `cancelado` counts as success. `HomologationExampleTest` compiles the example and checks offline, against a loopback TLS fixture, the host allow-list, the `ambiente` guard, the ledgering of an unknown cancellation, the post-cancellation consult (also with scope `nfse` alone), the cancellation of a document approved after the issue call and that a refused document is never cancelled; the JAR is unchanged.
- Contracts regenerated from the current public OpenAPI: tax-class list items (`nfeListTaxClasses`) are read with dedicated schemas that accept every value a saved class returns (ICMS `nao_contribuinte` as a boolean or `"0"`/`"1"`, a `null` rate when none is stored, one object instead of a list for NFCom and NFS-e groups, `type` always present); the tax-class save request (`nfeSaveTaxClasses`) follows the rules the save enforces (per-UF ICMS rates are `{estado, aliquota}` instead of `{estado, valor}`, `icms`, `ipi`, `pis` and `cofins` need at least one scenario, IBS/CBS `credito_presumido` is one object, `aliquota_carga_efetiva` is no longer published).
- Contracts regenerated from the current public OpenAPI: tax-class list totals (`tributos_federais`, `tributos_estaduais`) accept an empty string for an unset value; tax-class `situacao_tributaria` has 2 digits for IPI, PIS and COFINS and 2 to 3 for ICMS; NFS-e `impostos.reducao` and `impostos.cp` accept text or a JSON number.
- Homologation example: the issued document is consulted until a terminal status and cancelled once a consult shows `aprovado`, whether the issue call approved it or it was approved later; a refused document gets no other mutation, and one without a terminal status within the bound is ledgered as `unknown` (never resent); the refused NF-e status is `reprovado`; decimal numbers of the payload files are read exactly (`BigDecimal`), as the SDK refuses binary floating point.
- Contracts regenerated from the current public OpenAPI (14 modules, 103 operations, 102 enabled), pinned by `contract_digest` and per-module SHA-256 instead of a commit. Internal reconciliation metadata is no longer embedded in the bundled contracts or the JAR.
- Request-body models of the API 2.0 CT-e, DC-e, MDF-e, NFCom and NFS-e issuance operations are named after their operations (`<OperationId>Payload`, for example `EmitterIssueNfsePayload`); fields and serialization are unchanged.
- New `fiscalDownloadReportV2` (`GET /relatorios/{uuid}` on the API 2.0 origin) and `fiscalReportDownload(url)`, which downloads the `url` of a completed report only from the configured report origin and `/relatorios/` prefix, never follows redirects and attaches credentials only to that origin.
- Legacy `fiscalDownloadReport` accepts CSV and XLSX labeled `text/xml`, identified by the bytes; XML, HTML and JSON bodies are refused, and no other file operation gains this tolerance.
- HTTP 200 responses of the B2B and emitter read operations may carry a functional error; a body with `error` is still reported as an API failure.
- `nfeGetDocument` accepts a UUID with surrounding whitespace, as the service compares the trimmed value.
- `nfeDownloadIbsCbsEventXml` is not available in this release; the call fails without sending a request.
- New optional homologation example in `examples/homologacao`.
- Jackson `jackson-databind` 2.21.7 (with `jackson-core` 2.21.7 and `jackson-annotations` 2.21), which fixes the published advisories of the 2.20 line.
- `nfeDeleteTaxClasses` keeps the per-reference results of an HTTP 200 array when one item carries an error; a root error is still a failure.
- `Credentials.company`/`reseller` reject a null part with `IllegalArgumentException`.
- DNS resolution falls back to a bounded in-process resolver when the SDK is not loaded from a plain JAR or directory (for example a nested JAR), keeping the call deadline and cancellation; at most 16 such lookups run at once, so a hanging DNS cannot accumulate threads.
- Package version stays `0.1.0-preview.9`.

## 0.1.0-preview.9

- Retain possible quota effects for the public fiscal report GET after request dispatch; preserve no replay, credential separation and capability recovery protection.
- Keep complete report JSON 4xx rejection known, without changing other operation policies or business-200 uncertainty.

## 0.1.0-preview.8

- Reject isolated UTF-16 surrogate units in native JSON strings before UTF-8 conversion, in parsed/emitted JSON values and object keys, in typed scalar/extension construction and before selector URL encoding.
- Preserve valid U+FFFD and astral text, native numeric writer/read limits, exact numbers, one actual custom serialization, and prior transport/privacy/cancellation/file behavior.
- Distinguish fixed cause-free argument errors during construction from operation-aware VALIDATION during a call and sanitized PROTOCOL for malformed response JSON.


## 0.1.0-preview.7

- Observe Location across informational/final headers and trailers before projecting diagnostics; omit recovery/correlation metadata when observation is incomplete, reject duplicate Location, and preserve safe complete-header body-limit references.
- Preserve native future cancellation with typed private context. Reap request-owned DNS helper processes and close raw transport before public completion; mark HTTP dispatch after DNS/connect/TLS.
- Reject dot origin segments, percent-encoded dots and explicit ports outside 1–65535, including empty/IPv6 ports.
- Require coherent physical classic PDF xref/Root/Catalog/Pages and XLSX parent/linked-part structure. Repeated relationships may share the same worksheet part.
- Keep fiscal models, codecs, exact-number/schema/getter rules, interval-union privacy and existing quotas unchanged.

Preview release; the public API may still change before a stable version.
