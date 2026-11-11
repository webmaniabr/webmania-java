package com.webmania.sdk.model.api2mdfeissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/mdfe-issuance.openapi.json; see contract-provenance.json. */
public final class MdfeFreightPaymentGroupInformacoesBancariasTipoInformacaoBancaria extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"type\":[\"integer\",\"string\"],\"enum\":[1,2,3,\"1\",\"2\",\"3\"]}");
 public MdfeFreightPaymentGroupInformacoesBancariasTipoInformacaoBancaria(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = Json.parse("{\"type\":\"integer\",\"enum\":[1,2,3,\"1\",\"2\",\"3\"]}");
 public static MdfeFreightPaymentGroupInformacoesBancariasTipoInformacaoBancaria ofVariant0(java.math.BigInteger value) { return new MdfeFreightPaymentGroupInformacoesBancariasTipoInformacaoBancaria(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api2/mdfe-issuance.openapi.json", SCHEMA, VARIANT_0); }
 public java.math.BigInteger asVariant0() { JsonNode value = checkedVariant("api2/mdfe-issuance.openapi.json", SCHEMA, VARIANT_0); return integerValue(value); }
 private static final JsonNode VARIANT_1 = Json.parse("{\"type\":\"string\",\"enum\":[1,2,3,\"1\",\"2\",\"3\"]}");
 public static MdfeFreightPaymentGroupInformacoesBancariasTipoInformacaoBancaria ofVariant1(String value) { return new MdfeFreightPaymentGroupInformacoesBancariasTipoInformacaoBancaria(Json.scalar(value)); }
 public boolean matchesVariant1() { return matchesVariant("api2/mdfe-issuance.openapi.json", SCHEMA, VARIANT_1); }
 public String asVariant1() { JsonNode value = checkedVariant("api2/mdfe-issuance.openapi.json", SCHEMA, VARIANT_1); return stringValue(value); }
}
