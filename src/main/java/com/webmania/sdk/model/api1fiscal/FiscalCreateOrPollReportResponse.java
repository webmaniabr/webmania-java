package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class FiscalCreateOrPollReportResponse extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"anyOf\":[{\"$ref\":\"#/components/schemas/FiscalReportResult\"},{\"$ref\":\"#/components/schemas/Api1Error\"}]}");
 public FiscalCreateOrPollReportResponse(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = SCHEMA.path("anyOf").path(0);
 public static FiscalCreateOrPollReportResponse ofVariant0(FiscalReportResult value) { return new FiscalCreateOrPollReportResponse(value == null ? null : value.toJson()); }
 public boolean matchesVariant0() { return matchesVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_0); }
 public FiscalReportResult asVariant0() { JsonNode value = checkedVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_0); return (value).isNull() || (value).isMissingNode() ? null : new FiscalReportResult(value); }
 private static final JsonNode VARIANT_1 = SCHEMA.path("anyOf").path(1);
 public static FiscalCreateOrPollReportResponse ofVariant1(Api1Error value) { return new FiscalCreateOrPollReportResponse(value == null ? null : value.toJson()); }
 public boolean matchesVariant1() { return matchesVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_1); }
 public Api1Error asVariant1() { JsonNode value = checkedVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_1); return (value).isNull() || (value).isMissingNode() ? null : new Api1Error(value); }
}
