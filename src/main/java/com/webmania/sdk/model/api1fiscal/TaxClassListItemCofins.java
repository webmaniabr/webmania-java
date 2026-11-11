package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class TaxClassListItemCofins extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"anyOf\":[{\"type\":\"array\",\"items\":{\"$ref\":\"#/components/schemas/TaxClassListCofins\"}},{\"$ref\":\"#/components/schemas/TaxClassListGroupObject\"},{\"type\":\"number\"}],\"description\":\"Product classes return COFINS scenarios as a list, NFCom classes as one object and NFS-e classes return the stored COFINS rate as a number.\"}");
 public TaxClassListItemCofins(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = SCHEMA.path("anyOf").path(0);
 public static TaxClassListItemCofins ofVariant0(java.util.List<TaxClassListCofins> value) { return new TaxClassListItemCofins(array(value, v -> v == null ? null : v.toJson())); }
 public boolean matchesVariant0() { return matchesVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_0); }
 public java.util.List<TaxClassListCofins> asVariant0() { JsonNode value = checkedVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_0); return list(value, v -> (v).isNull() || (v).isMissingNode() ? null : new TaxClassListCofins(v)); }
 private static final JsonNode VARIANT_1 = SCHEMA.path("anyOf").path(1);
 public static TaxClassListItemCofins ofVariant1(TaxClassListGroupObject value) { return new TaxClassListItemCofins(value == null ? null : value.toJson()); }
 public boolean matchesVariant1() { return matchesVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_1); }
 public TaxClassListGroupObject asVariant1() { JsonNode value = checkedVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_1); return (value).isNull() || (value).isMissingNode() ? null : new TaxClassListGroupObject(value); }
 private static final JsonNode VARIANT_2 = SCHEMA.path("anyOf").path(2);
 public static TaxClassListItemCofins ofVariant2(java.math.BigDecimal value) { return new TaxClassListItemCofins(Json.scalar(value)); }
 public boolean matchesVariant2() { return matchesVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_2); }
 public java.math.BigDecimal asVariant2() { JsonNode value = checkedVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_2); return decimalValue(value); }
}
