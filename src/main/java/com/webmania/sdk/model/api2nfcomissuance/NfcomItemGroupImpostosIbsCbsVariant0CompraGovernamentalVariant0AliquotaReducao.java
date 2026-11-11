package com.webmania.sdk.model.api2nfcomissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfcom-issuance.openapi.json; see contract-provenance.json. */
public final class NfcomItemGroupImpostosIbsCbsVariant0CompraGovernamentalVariant0AliquotaReducao extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"type\":[\"number\",\"string\"],\"pattern\":\"^-?(?:\\\\d+\\\\.?\\\\d*|\\\\.\\\\d+)(?:[eE][+-]?\\\\d+)?$\",\"x-conditional-rules\":[\"required_with:itens.*.impostos.ibs_cbs.compra_governamental\"],\"description\":\"Percentual de redu\\u00e7\\u00e3o da al\\u00edquota aplicado ao ente governamental (0.0000 a 1.0000).\",\"x-documented-condition\":\"Percentual de redu\\u00e7\\u00e3o da al\\u00edquota aplicado ao ente governamental (0.0000 a 1.0000).\",\"x-documented-size\":\"5,4\"}");
 public NfcomItemGroupImpostosIbsCbsVariant0CompraGovernamentalVariant0AliquotaReducao(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = Json.parse("{\"type\":\"number\",\"pattern\":\"^-?(?:\\\\d+\\\\.?\\\\d*|\\\\.\\\\d+)(?:[eE][+-]?\\\\d+)?$\",\"x-conditional-rules\":[\"required_with:itens.*.impostos.ibs_cbs.compra_governamental\"],\"description\":\"Percentual de redu\\u00e7\\u00e3o da al\\u00edquota aplicado ao ente governamental (0.0000 a 1.0000).\",\"x-documented-condition\":\"Percentual de redu\\u00e7\\u00e3o da al\\u00edquota aplicado ao ente governamental (0.0000 a 1.0000).\",\"x-documented-size\":\"5,4\"}");
 public static NfcomItemGroupImpostosIbsCbsVariant0CompraGovernamentalVariant0AliquotaReducao ofVariant0(java.math.BigDecimal value) { return new NfcomItemGroupImpostosIbsCbsVariant0CompraGovernamentalVariant0AliquotaReducao(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_0); }
 public java.math.BigDecimal asVariant0() { JsonNode value = checkedVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_0); return decimalValue(value); }
 private static final JsonNode VARIANT_1 = Json.parse("{\"type\":\"string\",\"pattern\":\"^-?(?:\\\\d+\\\\.?\\\\d*|\\\\.\\\\d+)(?:[eE][+-]?\\\\d+)?$\",\"x-conditional-rules\":[\"required_with:itens.*.impostos.ibs_cbs.compra_governamental\"],\"description\":\"Percentual de redu\\u00e7\\u00e3o da al\\u00edquota aplicado ao ente governamental (0.0000 a 1.0000).\",\"x-documented-condition\":\"Percentual de redu\\u00e7\\u00e3o da al\\u00edquota aplicado ao ente governamental (0.0000 a 1.0000).\",\"x-documented-size\":\"5,4\"}");
 public static NfcomItemGroupImpostosIbsCbsVariant0CompraGovernamentalVariant0AliquotaReducao ofVariant1(String value) { return new NfcomItemGroupImpostosIbsCbsVariant0CompraGovernamentalVariant0AliquotaReducao(Json.scalar(value)); }
 public boolean matchesVariant1() { return matchesVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_1); }
 public String asVariant1() { JsonNode value = checkedVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_1); return stringValue(value); }
}
