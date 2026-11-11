package com.webmania.sdk.model.api1files;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/files.openapi.json; see contract-provenance.json. */
public final class NfeDownloadCorrectionPdfSequenceRequestIdentifier extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"anyOf\":[{\"$ref\":\"#/components/schemas/Uuid\"},{\"$ref\":\"#/components/schemas/AccessKey\"}]}");
 public NfeDownloadCorrectionPdfSequenceRequestIdentifier(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = SCHEMA.path("anyOf").path(0);
 public static NfeDownloadCorrectionPdfSequenceRequestIdentifier ofVariant0(Uuid value) { return new NfeDownloadCorrectionPdfSequenceRequestIdentifier(value == null ? null : value.toJson()); }
 public boolean matchesVariant0() { return matchesVariant("api1/files.openapi.json", SCHEMA, VARIANT_0); }
 public Uuid asVariant0() { JsonNode value = checkedVariant("api1/files.openapi.json", SCHEMA, VARIANT_0); return (value).isNull() || (value).isMissingNode() ? null : new Uuid(value); }
 private static final JsonNode VARIANT_1 = SCHEMA.path("anyOf").path(1);
 public static NfeDownloadCorrectionPdfSequenceRequestIdentifier ofVariant1(AccessKey value) { return new NfeDownloadCorrectionPdfSequenceRequestIdentifier(value == null ? null : value.toJson()); }
 public boolean matchesVariant1() { return matchesVariant("api1/files.openapi.json", SCHEMA, VARIANT_1); }
 public AccessKey asVariant1() { JsonNode value = checkedVariant("api1/files.openapi.json", SCHEMA, VARIANT_1); return (value).isNull() || (value).isMissingNode() ? null : new AccessKey(value); }
}
