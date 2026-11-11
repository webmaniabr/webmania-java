package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class FiscalTaxClassRequestVariant3Item extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"anyOf\":[{\"$ref\":\"#/components/schemas/NfeProductTaxClass\"},{\"$ref\":\"#/components/schemas/NfseServiceTaxClass\"},{\"$ref\":\"#/components/schemas/NfcomCommunicationTaxClass\"}]}");
 public FiscalTaxClassRequestVariant3Item(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = SCHEMA.path("anyOf").path(0);
 public static FiscalTaxClassRequestVariant3Item ofVariant0(NfeProductTaxClass value) { return new FiscalTaxClassRequestVariant3Item(value == null ? null : value.toJson()); }
 public boolean matchesVariant0() { return matchesVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_0); }
 public NfeProductTaxClass asVariant0() { JsonNode value = checkedVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_0); return (value).isNull() || (value).isMissingNode() ? null : new NfeProductTaxClass(value); }
 private static final JsonNode VARIANT_1 = SCHEMA.path("anyOf").path(1);
 public static FiscalTaxClassRequestVariant3Item ofVariant1(NfseServiceTaxClass value) { return new FiscalTaxClassRequestVariant3Item(value == null ? null : value.toJson()); }
 public boolean matchesVariant1() { return matchesVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_1); }
 public NfseServiceTaxClass asVariant1() { JsonNode value = checkedVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_1); return (value).isNull() || (value).isMissingNode() ? null : new NfseServiceTaxClass(value); }
 private static final JsonNode VARIANT_2 = SCHEMA.path("anyOf").path(2);
 public static FiscalTaxClassRequestVariant3Item ofVariant2(NfcomCommunicationTaxClass value) { return new FiscalTaxClassRequestVariant3Item(value == null ? null : value.toJson()); }
 public boolean matchesVariant2() { return matchesVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_2); }
 public NfcomCommunicationTaxClass asVariant2() { JsonNode value = checkedVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_2); return (value).isNull() || (value).isMissingNode() ? null : new NfcomCommunicationTaxClass(value); }
}
