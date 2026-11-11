package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class FiscalTaxClassRequest extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"anyOf\":[{\"$ref\":\"#/components/schemas/NfeProductTaxClass\"},{\"$ref\":\"#/components/schemas/NfseServiceTaxClass\"},{\"$ref\":\"#/components/schemas/NfcomCommunicationTaxClass\"},{\"type\":\"array\",\"items\":{\"anyOf\":[{\"$ref\":\"#/components/schemas/NfeProductTaxClass\"},{\"$ref\":\"#/components/schemas/NfseServiceTaxClass\"},{\"$ref\":\"#/components/schemas/NfcomCommunicationTaxClass\"}]},\"minItems\":1}]}");
 public FiscalTaxClassRequest(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = SCHEMA.path("anyOf").path(0);
 public static FiscalTaxClassRequest ofVariant0(NfeProductTaxClass value) { return new FiscalTaxClassRequest(value == null ? null : value.toJson()); }
 public boolean matchesVariant0() { return matchesVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_0); }
 public NfeProductTaxClass asVariant0() { JsonNode value = checkedVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_0); return (value).isNull() || (value).isMissingNode() ? null : new NfeProductTaxClass(value); }
 private static final JsonNode VARIANT_1 = SCHEMA.path("anyOf").path(1);
 public static FiscalTaxClassRequest ofVariant1(NfseServiceTaxClass value) { return new FiscalTaxClassRequest(value == null ? null : value.toJson()); }
 public boolean matchesVariant1() { return matchesVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_1); }
 public NfseServiceTaxClass asVariant1() { JsonNode value = checkedVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_1); return (value).isNull() || (value).isMissingNode() ? null : new NfseServiceTaxClass(value); }
 private static final JsonNode VARIANT_2 = SCHEMA.path("anyOf").path(2);
 public static FiscalTaxClassRequest ofVariant2(NfcomCommunicationTaxClass value) { return new FiscalTaxClassRequest(value == null ? null : value.toJson()); }
 public boolean matchesVariant2() { return matchesVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_2); }
 public NfcomCommunicationTaxClass asVariant2() { JsonNode value = checkedVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_2); return (value).isNull() || (value).isMissingNode() ? null : new NfcomCommunicationTaxClass(value); }
 private static final JsonNode VARIANT_3 = SCHEMA.path("anyOf").path(3);
 public static FiscalTaxClassRequest ofVariant3(java.util.List<FiscalTaxClassRequestVariant3Item> value) { return new FiscalTaxClassRequest(array(value, v -> v == null ? null : v.toJson())); }
 public boolean matchesVariant3() { return matchesVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_3); }
 public java.util.List<FiscalTaxClassRequestVariant3Item> asVariant3() { JsonNode value = checkedVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_3); return list(value, v -> (v).isNull() || (v).isMissingNode() ? null : new FiscalTaxClassRequestVariant3Item(v)); }
}
