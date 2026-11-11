package com.webmania.sdk.model.api2cteissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/cte-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueCtePayloadImpostosIbsCbsCompraGovernamentalVariant0ReferenciasDfe extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"anyOf\":[{\"type\":\"array\",\"items\":{\"type\":\"string\",\"minLength\":44,\"maxLength\":44,\"pattern\":\"^([0-9]{44}|[0-9]{6}[A-Z0-9]{12}[0-9]{26})$\",\"x-conditional-rules\":[\"A server-side conditional or current catalog constraint also applies; this draft does not replace it.\"]},\"maxItems\":99},{\"type\":\"null\"}],\"description\":\"Chaves de acesso de DFe anteriores referenciadas. Aceita tanto o formato num\\u00e9rico (44 d\\u00edgitos) quanto o formato alfanum\\u00e9rico RTC [0-9]{6}[A-Z0-9]{12}[0-9]{26}. Obrigat\\u00f3rio quando tipo_operacao \\u00e9 2 ou 3; vedado quando 1 ou 4.\",\"x-documented-condition\":\"Chaves de acesso de DFe anteriores referenciadas. Aceita tanto o formato num\\u00e9rico (44 d\\u00edgitos) quanto o formato alfanum\\u00e9rico RTC [0-9]{6}[A-Z0-9]{12}[0-9]{26}. Obrigat\\u00f3rio quando tipo_operacao \\u00e9 2 ou 3; vedado quando 1 ou 4.\",\"x-documented-size\":\"0-99\"}");
 public EmitterIssueCtePayloadImpostosIbsCbsCompraGovernamentalVariant0ReferenciasDfe(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = SCHEMA.path("anyOf").path(0);
 public static EmitterIssueCtePayloadImpostosIbsCbsCompraGovernamentalVariant0ReferenciasDfe ofVariant0(java.util.List<String> value) { return new EmitterIssueCtePayloadImpostosIbsCbsCompraGovernamentalVariant0ReferenciasDfe(array(value, v -> Json.scalar(v))); }
 public boolean matchesVariant0() { return matchesVariant("api2/cte-issuance.openapi.json", SCHEMA, VARIANT_0); }
 public java.util.List<String> asVariant0() { JsonNode value = checkedVariant("api2/cte-issuance.openapi.json", SCHEMA, VARIANT_0); return list(value, v -> stringValue(v)); }
 private static final JsonNode VARIANT_1 = SCHEMA.path("anyOf").path(1);
 public static EmitterIssueCtePayloadImpostosIbsCbsCompraGovernamentalVariant0ReferenciasDfe ofVariant1(JsonValue value) { return new EmitterIssueCtePayloadImpostosIbsCbsCompraGovernamentalVariant0ReferenciasDfe(value == null ? null : value.toJson()); }
 public boolean matchesVariant1() { return matchesVariant("api2/cte-issuance.openapi.json", SCHEMA, VARIANT_1); }
 public JsonValue asVariant1() { JsonNode value = checkedVariant("api2/cte-issuance.openapi.json", SCHEMA, VARIANT_1); return (value).isNull() || (value).isMissingNode() ? null : new JsonValue(value); }
}
