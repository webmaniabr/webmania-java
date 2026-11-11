package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class NfseServiceTaxClass extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"anyOf\":[{\"$ref\":\"#/components/schemas/NfseTaxClassProvider55\"},{\"$ref\":\"#/components/schemas/NfseTaxClassProvider56\"},{\"$ref\":\"#/components/schemas/NfseTaxClassProvider57\"},{\"$ref\":\"#/components/schemas/NfseTaxClassProvider58\"},{\"$ref\":\"#/components/schemas/NfseTaxClassProvider60\"},{\"$ref\":\"#/components/schemas/NfseTaxClassProvider61\"},{\"$ref\":\"#/components/schemas/NfseTaxClassProvider63\"},{\"$ref\":\"#/components/schemas/NfseTaxClassProvider64\"},{\"$ref\":\"#/components/schemas/NfseTaxClassProvider66\"}],\"description\":\"Provider-specific NFS-e class fields. Select only the branch supported by the issuer municipality; the provider is determined by company setup, not invented request routing.\"}");
 public NfseServiceTaxClass(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = SCHEMA.path("anyOf").path(0);
 public static NfseServiceTaxClass ofVariant0(NfseTaxClassProvider55 value) { return new NfseServiceTaxClass(value == null ? null : value.toJson()); }
 public boolean matchesVariant0() { return matchesVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_0); }
 public NfseTaxClassProvider55 asVariant0() { JsonNode value = checkedVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_0); return (value).isNull() || (value).isMissingNode() ? null : new NfseTaxClassProvider55(value); }
 private static final JsonNode VARIANT_1 = SCHEMA.path("anyOf").path(1);
 public static NfseServiceTaxClass ofVariant1(NfseTaxClassProvider56 value) { return new NfseServiceTaxClass(value == null ? null : value.toJson()); }
 public boolean matchesVariant1() { return matchesVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_1); }
 public NfseTaxClassProvider56 asVariant1() { JsonNode value = checkedVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_1); return (value).isNull() || (value).isMissingNode() ? null : new NfseTaxClassProvider56(value); }
 private static final JsonNode VARIANT_2 = SCHEMA.path("anyOf").path(2);
 public static NfseServiceTaxClass ofVariant2(NfseTaxClassProvider57 value) { return new NfseServiceTaxClass(value == null ? null : value.toJson()); }
 public boolean matchesVariant2() { return matchesVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_2); }
 public NfseTaxClassProvider57 asVariant2() { JsonNode value = checkedVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_2); return (value).isNull() || (value).isMissingNode() ? null : new NfseTaxClassProvider57(value); }
 private static final JsonNode VARIANT_3 = SCHEMA.path("anyOf").path(3);
 public static NfseServiceTaxClass ofVariant3(NfseTaxClassProvider58 value) { return new NfseServiceTaxClass(value == null ? null : value.toJson()); }
 public boolean matchesVariant3() { return matchesVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_3); }
 public NfseTaxClassProvider58 asVariant3() { JsonNode value = checkedVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_3); return (value).isNull() || (value).isMissingNode() ? null : new NfseTaxClassProvider58(value); }
 private static final JsonNode VARIANT_4 = SCHEMA.path("anyOf").path(4);
 public static NfseServiceTaxClass ofVariant4(NfseTaxClassProvider60 value) { return new NfseServiceTaxClass(value == null ? null : value.toJson()); }
 public boolean matchesVariant4() { return matchesVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_4); }
 public NfseTaxClassProvider60 asVariant4() { JsonNode value = checkedVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_4); return (value).isNull() || (value).isMissingNode() ? null : new NfseTaxClassProvider60(value); }
 private static final JsonNode VARIANT_5 = SCHEMA.path("anyOf").path(5);
 public static NfseServiceTaxClass ofVariant5(NfseTaxClassProvider61 value) { return new NfseServiceTaxClass(value == null ? null : value.toJson()); }
 public boolean matchesVariant5() { return matchesVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_5); }
 public NfseTaxClassProvider61 asVariant5() { JsonNode value = checkedVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_5); return (value).isNull() || (value).isMissingNode() ? null : new NfseTaxClassProvider61(value); }
 private static final JsonNode VARIANT_6 = SCHEMA.path("anyOf").path(6);
 public static NfseServiceTaxClass ofVariant6(NfseTaxClassProvider63 value) { return new NfseServiceTaxClass(value == null ? null : value.toJson()); }
 public boolean matchesVariant6() { return matchesVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_6); }
 public NfseTaxClassProvider63 asVariant6() { JsonNode value = checkedVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_6); return (value).isNull() || (value).isMissingNode() ? null : new NfseTaxClassProvider63(value); }
 private static final JsonNode VARIANT_7 = SCHEMA.path("anyOf").path(7);
 public static NfseServiceTaxClass ofVariant7(NfseTaxClassProvider64 value) { return new NfseServiceTaxClass(value == null ? null : value.toJson()); }
 public boolean matchesVariant7() { return matchesVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_7); }
 public NfseTaxClassProvider64 asVariant7() { JsonNode value = checkedVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_7); return (value).isNull() || (value).isMissingNode() ? null : new NfseTaxClassProvider64(value); }
 private static final JsonNode VARIANT_8 = SCHEMA.path("anyOf").path(8);
 public static NfseServiceTaxClass ofVariant8(NfseTaxClassProvider66 value) { return new NfseServiceTaxClass(value == null ? null : value.toJson()); }
 public boolean matchesVariant8() { return matchesVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_8); }
 public NfseTaxClassProvider66 asVariant8() { JsonNode value = checkedVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_8); return (value).isNull() || (value).isMissingNode() ? null : new NfseTaxClassProvider66(value); }
}
