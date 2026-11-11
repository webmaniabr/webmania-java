package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G057 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("codigo_servico", "tipo_tributacao", "iss_retido", "responsavel_retencao", "codigo_cnae");
 public G057() { super(FIELDS); }
 public G057(JsonNode node) { super(node, FIELDS); }
 public String getCodigoServico() { return stringValue(field("codigo_servico")); }
 public G057 setCodigoServico(String value) { put("codigo_servico", Json.scalar(value)); return this; }
 public String getTipoTributacao() { return stringValue(field("tipo_tributacao")); }
 public G057 setTipoTributacao(String value) { put("tipo_tributacao", Json.scalar(value)); return this; }
 public String getIssRetido() { return stringValue(field("iss_retido")); }
 public G057 setIssRetido(String value) { put("iss_retido", Json.scalar(value)); return this; }
 public String getResponsavelRetencao() { return stringValue(field("responsavel_retencao")); }
 public G057 setResponsavelRetencao(String value) { put("responsavel_retencao", Json.scalar(value)); return this; }
 public String getCodigoCnae() { return stringValue(field("codigo_cnae")); }
 public G057 setCodigoCnae(String value) { put("codigo_cnae", Json.scalar(value)); return this; }
}
