package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class Nfe55IssueRequestNfeReferenciada extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"anyOf\":[{\"type\":\"string\"},{\"type\":\"array\",\"items\":{\"type\":\"string\"}}],\"description\":\"Chave de acesso da NF-e emitida anteriormente. | Pode ser informado mais de uma NF-e referenciada atrav\\u00e9s de um array. | Ao informar tipo_credito = 06 utilize dfe_referenciado por item.\",\"x-documentation-type\":\"string | array\",\"x-documentation-size\":\"44\",\"x-documentation-requirements\":[{\"column\":\"NF-e\",\"markers\":[\"recomendado\",\"svg_required_optional\"]}],\"x-documentation-variants\":[{\"anyOf\":[{\"$ref\":\"#/components/schemas/AccessKey\"},{\"type\":\"array\",\"items\":{\"$ref\":\"#/components/schemas/AccessKey\"},\"minItems\":1}]},{\"anyOf\":[{\"type\":\"string\"},{\"type\":\"array\",\"items\":{\"type\":\"string\"}}],\"description\":\"Chave de acesso da NF-e emitida anteriormente. | Pode ser informado mais de uma NF-e referenciada atrav\\u00e9s de um array. | Ao informar tipo_credito = 06 utilize dfe_referenciado por item.\",\"x-documentation-type\":\"string | array\",\"x-documentation-size\":\"44\",\"x-documentation-requirements\":[{\"column\":\"NF-e\",\"markers\":[\"recomendado\",\"svg_required_optional\"]}]}]}");
 public Nfe55IssueRequestNfeReferenciada(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = SCHEMA.path("anyOf").path(0);
 public static Nfe55IssueRequestNfeReferenciada ofVariant0(String value) { return new Nfe55IssueRequestNfeReferenciada(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_0); }
 public String asVariant0() { JsonNode value = checkedVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_0); return stringValue(value); }
 private static final JsonNode VARIANT_1 = SCHEMA.path("anyOf").path(1);
 public static Nfe55IssueRequestNfeReferenciada ofVariant1(java.util.List<String> value) { return new Nfe55IssueRequestNfeReferenciada(array(value, v -> Json.scalar(v))); }
 public boolean matchesVariant1() { return matchesVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_1); }
 public java.util.List<String> asVariant1() { JsonNode value = checkedVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_1); return list(value, v -> stringValue(v)); }
}
