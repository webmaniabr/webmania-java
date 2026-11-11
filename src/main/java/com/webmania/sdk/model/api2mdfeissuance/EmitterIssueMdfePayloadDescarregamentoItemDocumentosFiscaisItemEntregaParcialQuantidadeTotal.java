package com.webmania.sdk.model.api2mdfeissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/mdfe-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueMdfePayloadDescarregamentoItemDocumentosFiscaisItemEntregaParcialQuantidadeTotal extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"type\":[\"string\",\"number\"],\"x-sdk-size-semantics\":\"text-length\",\"x-sdk-non-string-size-validation\":\"Server representation length remains unresolved for numeric JSON input; this is not a numeric magnitude limit. Preserve the number and do not coerce decimal text.\",\"maxLength\":16,\"x-conditional-rules\":[\"required_with:descarregamento.*.documentos_fiscais.*.entrega_parcial\"]}");
 public EmitterIssueMdfePayloadDescarregamentoItemDocumentosFiscaisItemEntregaParcialQuantidadeTotal(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = Json.parse("{\"type\":\"string\",\"x-sdk-size-semantics\":\"text-length\",\"x-sdk-non-string-size-validation\":\"Server representation length remains unresolved for numeric JSON input; this is not a numeric magnitude limit. Preserve the number and do not coerce decimal text.\",\"maxLength\":16,\"x-conditional-rules\":[\"required_with:descarregamento.*.documentos_fiscais.*.entrega_parcial\"]}");
 public static EmitterIssueMdfePayloadDescarregamentoItemDocumentosFiscaisItemEntregaParcialQuantidadeTotal ofVariant0(String value) { return new EmitterIssueMdfePayloadDescarregamentoItemDocumentosFiscaisItemEntregaParcialQuantidadeTotal(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api2/mdfe-issuance.openapi.json", SCHEMA, VARIANT_0); }
 public String asVariant0() { JsonNode value = checkedVariant("api2/mdfe-issuance.openapi.json", SCHEMA, VARIANT_0); return stringValue(value); }
 private static final JsonNode VARIANT_1 = Json.parse("{\"type\":\"number\",\"x-sdk-size-semantics\":\"text-length\",\"x-sdk-non-string-size-validation\":\"Server representation length remains unresolved for numeric JSON input; this is not a numeric magnitude limit. Preserve the number and do not coerce decimal text.\",\"maxLength\":16,\"x-conditional-rules\":[\"required_with:descarregamento.*.documentos_fiscais.*.entrega_parcial\"]}");
 public static EmitterIssueMdfePayloadDescarregamentoItemDocumentosFiscaisItemEntregaParcialQuantidadeTotal ofVariant1(java.math.BigDecimal value) { return new EmitterIssueMdfePayloadDescarregamentoItemDocumentosFiscaisItemEntregaParcialQuantidadeTotal(Json.scalar(value)); }
 public boolean matchesVariant1() { return matchesVariant("api2/mdfe-issuance.openapi.json", SCHEMA, VARIANT_1); }
 public java.math.BigDecimal asVariant1() { JsonNode value = checkedVariant("api2/mdfe-issuance.openapi.json", SCHEMA, VARIANT_1); return decimalValue(value); }
}
