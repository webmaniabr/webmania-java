These fixtures are synthetic schema and socket test input. They do not contain API execution attestations or usable credentials/certificates.

`schema-cases.json` derives from the pinned OpenAPI repository's API1 semantic cases, API2 cases, B2B cases and text-size cases. `numeric-annotations.json` identifies all 259 pinned decimal limit annotations and their exact boundaries. `operation-fixtures.json` contains synthetic schema-valid requests/responses prepared from the same source cases and shared fixture preparation, then independently exercised by the Java implementation. Contact/name fields use inert example values and reserved `.invalid` addresses.

Local socket TLS keys are generated in a temporary directory at test runtime and removed. The JAR consumer resolves the installed candidate through Maven and verifies its SHA-256. None of these checks contacts Webmania or authorizes fiscal operations.
