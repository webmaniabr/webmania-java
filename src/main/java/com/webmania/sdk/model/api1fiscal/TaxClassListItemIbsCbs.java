package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class TaxClassListItemIbsCbs extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"anyOf\":[{\"type\":\"array\",\"items\":{\"$ref\":\"#/components/schemas/TaxClassListIbsCbs\"}},{\"$ref\":\"#/components/schemas/TaxClassListGroupObject\"}]}");
 public TaxClassListItemIbsCbs(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = SCHEMA.path("anyOf").path(0);
 public static TaxClassListItemIbsCbs ofVariant0(java.util.List<TaxClassListIbsCbs> value) { return new TaxClassListItemIbsCbs(array(value, v -> v == null ? null : v.toJson())); }
 public boolean matchesVariant0() { return matchesVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_0); }
 public java.util.List<TaxClassListIbsCbs> asVariant0() { JsonNode value = checkedVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_0); return list(value, v -> (v).isNull() || (v).isMissingNode() ? null : new TaxClassListIbsCbs(v)); }
 private static final JsonNode VARIANT_1 = SCHEMA.path("anyOf").path(1);
 public static TaxClassListItemIbsCbs ofVariant1(TaxClassListGroupObject value) { return new TaxClassListItemIbsCbs(value == null ? null : value.toJson()); }
 public boolean matchesVariant1() { return matchesVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_1); }
 public TaxClassListGroupObject asVariant1() { JsonNode value = checkedVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_1); return (value).isNull() || (value).isMissingNode() ? null : new TaxClassListGroupObject(value); }
}
