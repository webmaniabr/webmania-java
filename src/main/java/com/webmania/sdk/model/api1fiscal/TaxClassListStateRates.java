package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class TaxClassListStateRates extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"description\":\"Per-UF rates of a listed ICMS scenario, returned as stored: normally a list of {estado, aliquota} entries; a class generated from an uploaded XML may hold one entry object, a bare rate or null instead.\",\"anyOf\":[{\"type\":\"array\",\"items\":{\"anyOf\":[{\"$ref\":\"#/components/schemas/TaxClassListStateRate\"},{\"$ref\":\"#/components/schemas/TaxClassListBareRate\"}]}},{\"$ref\":\"#/components/schemas/TaxClassListStateRate\"},{\"$ref\":\"#/components/schemas/TaxClassListBareRate\"},{\"type\":\"null\"}]}");
 public TaxClassListStateRates(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = SCHEMA.path("anyOf").path(0);
 public static TaxClassListStateRates ofVariant0(java.util.List<TaxClassListStateRatesVariant0Item> value) { return new TaxClassListStateRates(array(value, v -> v == null ? null : v.toJson())); }
 public boolean matchesVariant0() { return matchesVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_0); }
 public java.util.List<TaxClassListStateRatesVariant0Item> asVariant0() { JsonNode value = checkedVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_0); return list(value, v -> (v).isNull() || (v).isMissingNode() ? null : new TaxClassListStateRatesVariant0Item(v)); }
 private static final JsonNode VARIANT_1 = SCHEMA.path("anyOf").path(1);
 public static TaxClassListStateRates ofVariant1(TaxClassListStateRate value) { return new TaxClassListStateRates(value == null ? null : value.toJson()); }
 public boolean matchesVariant1() { return matchesVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_1); }
 public TaxClassListStateRate asVariant1() { JsonNode value = checkedVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_1); return (value).isNull() || (value).isMissingNode() ? null : new TaxClassListStateRate(value); }
 private static final JsonNode VARIANT_2 = SCHEMA.path("anyOf").path(2);
 public static TaxClassListStateRates ofVariant2(TaxClassListBareRate value) { return new TaxClassListStateRates(value == null ? null : value.toJson()); }
 public boolean matchesVariant2() { return matchesVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_2); }
 public TaxClassListBareRate asVariant2() { JsonNode value = checkedVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_2); return (value).isNull() || (value).isMissingNode() ? null : new TaxClassListBareRate(value); }
 private static final JsonNode VARIANT_3 = SCHEMA.path("anyOf").path(3);
 public static TaxClassListStateRates ofVariant3(JsonValue value) { return new TaxClassListStateRates(value == null ? null : value.toJson()); }
 public boolean matchesVariant3() { return matchesVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_3); }
 public JsonValue asVariant3() { JsonNode value = checkedVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_3); return (value).isNull() || (value).isMissingNode() ? null : new JsonValue(value); }
}
