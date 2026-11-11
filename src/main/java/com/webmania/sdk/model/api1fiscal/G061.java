package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G061 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("codigo_servico", "iss_retido", "responsavel_retencao", "codigo_cnae", "codigo_tributacao_municipio", "tributacao");
 public G061() { super(FIELDS); }
 public G061(JsonNode node) { super(node, FIELDS); }
 public String getCodigoServico() { return stringValue(field("codigo_servico")); }
 public G061 setCodigoServico(String value) { put("codigo_servico", Json.scalar(value)); return this; }
 public String getIssRetido() { return stringValue(field("iss_retido")); }
 public G061 setIssRetido(String value) { put("iss_retido", Json.scalar(value)); return this; }
 public String getResponsavelRetencao() { return stringValue(field("responsavel_retencao")); }
 public G061 setResponsavelRetencao(String value) { put("responsavel_retencao", Json.scalar(value)); return this; }
 public String getCodigoCnae() { return stringValue(field("codigo_cnae")); }
 public G061 setCodigoCnae(String value) { put("codigo_cnae", Json.scalar(value)); return this; }
 public String getCodigoTributacaoMunicipio() { return stringValue(field("codigo_tributacao_municipio")); }
 public G061 setCodigoTributacaoMunicipio(String value) { put("codigo_tributacao_municipio", Json.scalar(value)); return this; }
 public java.util.List<G062> getTributacao() { return list(field("tributacao"), v -> (v).isNull() || (v).isMissingNode() ? null : new G062(v)); }
 public G061 setTributacao(java.util.List<G062> value) { put("tributacao", array(value, v -> v == null ? null : v.toJson())); return this; }
}
