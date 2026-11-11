package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G055 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("codigo_servico", "natureza_operacao", "exigibilidade_iss", "iss_retido", "responsavel_retencao", "codigo_cnae", "codigo_tributacao_municipio");
 public G055() { super(FIELDS); }
 public G055(JsonNode node) { super(node, FIELDS); }
 public String getCodigoServico() { return stringValue(field("codigo_servico")); }
 public G055 setCodigoServico(String value) { put("codigo_servico", Json.scalar(value)); return this; }
 public String getNaturezaOperacao() { return stringValue(field("natureza_operacao")); }
 public G055 setNaturezaOperacao(String value) { put("natureza_operacao", Json.scalar(value)); return this; }
 public String getExigibilidadeIss() { return stringValue(field("exigibilidade_iss")); }
 public G055 setExigibilidadeIss(String value) { put("exigibilidade_iss", Json.scalar(value)); return this; }
 public String getIssRetido() { return stringValue(field("iss_retido")); }
 public G055 setIssRetido(String value) { put("iss_retido", Json.scalar(value)); return this; }
 public String getResponsavelRetencao() { return stringValue(field("responsavel_retencao")); }
 public G055 setResponsavelRetencao(String value) { put("responsavel_retencao", Json.scalar(value)); return this; }
 public String getCodigoCnae() { return stringValue(field("codigo_cnae")); }
 public G055 setCodigoCnae(String value) { put("codigo_cnae", Json.scalar(value)); return this; }
 public String getCodigoTributacaoMunicipio() { return stringValue(field("codigo_tributacao_municipio")); }
 public G055 setCodigoTributacaoMunicipio(String value) { put("codigo_tributacao_municipio", Json.scalar(value)); return this; }
}
