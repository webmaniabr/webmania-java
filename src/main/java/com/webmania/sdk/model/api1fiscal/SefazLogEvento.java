package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class SefazLogEvento extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"anyOf\":[{\"type\":\"object\",\"properties\":{\"cStat\":{\"anyOf\":[{\"type\":\"string\"},{\"type\":\"integer\"}]},\"xMotivo\":{\"type\":\"string\"},\"nProt\":{\"type\":\"string\"}},\"additionalProperties\":true},{\"type\":\"array\",\"items\":{\"type\":\"object\",\"properties\":{\"cStat\":{\"anyOf\":[{\"type\":\"string\"},{\"type\":\"integer\"}]},\"xMotivo\":{\"type\":\"string\"},\"nProt\":{\"type\":\"string\"}},\"additionalProperties\":true}}]}");
 public SefazLogEvento(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = SCHEMA.path("anyOf").path(0);
 public static SefazLogEvento ofVariant0(SefazLogEventoVariant0 value) { return new SefazLogEvento(value == null ? null : value.toJson()); }
 public boolean matchesVariant0() { return matchesVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_0); }
 public SefazLogEventoVariant0 asVariant0() { JsonNode value = checkedVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_0); return (value).isNull() || (value).isMissingNode() ? null : new SefazLogEventoVariant0(value); }
 private static final JsonNode VARIANT_1 = SCHEMA.path("anyOf").path(1);
 public static SefazLogEvento ofVariant1(java.util.List<SefazLogEventoVariant1Item> value) { return new SefazLogEvento(array(value, v -> v == null ? null : v.toJson())); }
 public boolean matchesVariant1() { return matchesVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_1); }
 public java.util.List<SefazLogEventoVariant1Item> asVariant1() { JsonNode value = checkedVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_1); return list(value, v -> (v).isNull() || (v).isMissingNode() ? null : new SefazLogEventoVariant1Item(v)); }
}
