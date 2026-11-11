package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G063 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("codigo_servico", "iss_retido", "responsavel_retencao");
 public G063() { super(FIELDS); }
 public G063(JsonNode node) { super(node, FIELDS); }
 public String getCodigoServico() { return stringValue(field("codigo_servico")); }
 public G063 setCodigoServico(String value) { put("codigo_servico", Json.scalar(value)); return this; }
 public String getIssRetido() { return stringValue(field("iss_retido")); }
 public G063 setIssRetido(String value) { put("iss_retido", Json.scalar(value)); return this; }
 public String getResponsavelRetencao() { return stringValue(field("responsavel_retencao")); }
 public G063 setResponsavelRetencao(String value) { put("responsavel_retencao", Json.scalar(value)); return this; }
}
