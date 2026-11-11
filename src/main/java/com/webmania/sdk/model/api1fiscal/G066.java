package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G066 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("codigo_servico", "tributacao", "iss_retido", "responsavel_retencao");
 public G066() { super(FIELDS); }
 public G066(JsonNode node) { super(node, FIELDS); }
 public String getCodigoServico() { return stringValue(field("codigo_servico")); }
 public G066 setCodigoServico(String value) { put("codigo_servico", Json.scalar(value)); return this; }
 public java.math.BigInteger getTributacao() { return integerValue(field("tributacao")); }
 public G066 setTributacao(java.math.BigInteger value) { put("tributacao", Json.scalar(value)); return this; }
 public String getIssRetido() { return stringValue(field("iss_retido")); }
 public G066 setIssRetido(String value) { put("iss_retido", Json.scalar(value)); return this; }
 public String getResponsavelRetencao() { return stringValue(field("responsavel_retencao")); }
 public G066 setResponsavelRetencao(String value) { put("responsavel_retencao", Json.scalar(value)); return this; }
}
