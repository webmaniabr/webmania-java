package com.webmania.sdk.model.api2monitordocuments;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-documents.openapi.json; see contract-provenance.json. */
public final class MonitorDocument extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"anyOf\":[{\"$ref\":\"#/components/schemas/MonitorDocumentNfe\"},{\"$ref\":\"#/components/schemas/MonitorDocumentNfse\"},{\"$ref\":\"#/components/schemas/MonitorDocumentMdfe\"},{\"$ref\":\"#/components/schemas/MonitorDocumentCte\"},{\"$ref\":\"#/components/schemas/MonitorDocumentCteOs\"}]}");
 public MonitorDocument(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = SCHEMA.path("anyOf").path(0);
 public static MonitorDocument ofVariant0(MonitorDocumentNfe value) { return new MonitorDocument(value == null ? null : value.toJson()); }
 public boolean matchesVariant0() { return matchesVariant("api2/monitor-documents.openapi.json", SCHEMA, VARIANT_0); }
 public MonitorDocumentNfe asVariant0() { JsonNode value = checkedVariant("api2/monitor-documents.openapi.json", SCHEMA, VARIANT_0); return (value).isNull() || (value).isMissingNode() ? null : new MonitorDocumentNfe(value); }
 private static final JsonNode VARIANT_1 = SCHEMA.path("anyOf").path(1);
 public static MonitorDocument ofVariant1(MonitorDocumentNfse value) { return new MonitorDocument(value == null ? null : value.toJson()); }
 public boolean matchesVariant1() { return matchesVariant("api2/monitor-documents.openapi.json", SCHEMA, VARIANT_1); }
 public MonitorDocumentNfse asVariant1() { JsonNode value = checkedVariant("api2/monitor-documents.openapi.json", SCHEMA, VARIANT_1); return (value).isNull() || (value).isMissingNode() ? null : new MonitorDocumentNfse(value); }
 private static final JsonNode VARIANT_2 = SCHEMA.path("anyOf").path(2);
 public static MonitorDocument ofVariant2(MonitorDocumentMdfe value) { return new MonitorDocument(value == null ? null : value.toJson()); }
 public boolean matchesVariant2() { return matchesVariant("api2/monitor-documents.openapi.json", SCHEMA, VARIANT_2); }
 public MonitorDocumentMdfe asVariant2() { JsonNode value = checkedVariant("api2/monitor-documents.openapi.json", SCHEMA, VARIANT_2); return (value).isNull() || (value).isMissingNode() ? null : new MonitorDocumentMdfe(value); }
 private static final JsonNode VARIANT_3 = SCHEMA.path("anyOf").path(3);
 public static MonitorDocument ofVariant3(MonitorDocumentCte value) { return new MonitorDocument(value == null ? null : value.toJson()); }
 public boolean matchesVariant3() { return matchesVariant("api2/monitor-documents.openapi.json", SCHEMA, VARIANT_3); }
 public MonitorDocumentCte asVariant3() { JsonNode value = checkedVariant("api2/monitor-documents.openapi.json", SCHEMA, VARIANT_3); return (value).isNull() || (value).isMissingNode() ? null : new MonitorDocumentCte(value); }
 private static final JsonNode VARIANT_4 = SCHEMA.path("anyOf").path(4);
 public static MonitorDocument ofVariant4(MonitorDocumentCteOs value) { return new MonitorDocument(value == null ? null : value.toJson()); }
 public boolean matchesVariant4() { return matchesVariant("api2/monitor-documents.openapi.json", SCHEMA, VARIANT_4); }
 public MonitorDocumentCteOs asVariant4() { JsonNode value = checkedVariant("api2/monitor-documents.openapi.json", SCHEMA, VARIANT_4); return (value).isNull() || (value).isMissingNode() ? null : new MonitorDocumentCteOs(value); }
}
