package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class NfeQueryDocumentResponse extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"anyOf\":[{\"anyOf\":[{\"$ref\":\"#/components/schemas/NfeDocument\"},{\"type\":\"array\",\"items\":{\"$ref\":\"#/components/schemas/NfeDocument\"}}]},{\"$ref\":\"#/components/schemas/Api1Error\"}]}");
 public NfeQueryDocumentResponse(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = SCHEMA.path("anyOf").path(0);
 public static NfeQueryDocumentResponse ofVariant0(NfeQueryDocumentResponseVariant0 value) { return new NfeQueryDocumentResponse(value == null ? null : value.toJson()); }
 public boolean matchesVariant0() { return matchesVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_0); }
 public NfeQueryDocumentResponseVariant0 asVariant0() { JsonNode value = checkedVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_0); return (value).isNull() || (value).isMissingNode() ? null : new NfeQueryDocumentResponseVariant0(value); }
 private static final JsonNode VARIANT_1 = SCHEMA.path("anyOf").path(1);
 public static NfeQueryDocumentResponse ofVariant1(Api1Error value) { return new NfeQueryDocumentResponse(value == null ? null : value.toJson()); }
 public boolean matchesVariant1() { return matchesVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_1); }
 public Api1Error asVariant1() { JsonNode value = checkedVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_1); return (value).isNull() || (value).isMissingNode() ? null : new Api1Error(value); }
}
