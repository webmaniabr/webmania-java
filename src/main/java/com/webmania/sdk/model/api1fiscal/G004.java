package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G004 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("data_emissao", "data_entrada_saida", "data_previsao_entrega", "data_servico");
 public G004() { super(FIELDS); }
 public G004(JsonNode node) { super(node, FIELDS); }
 public String getDataEmissao() { return stringValue(field("data_emissao")); }
 public G004 setDataEmissao(String value) { put("data_emissao", Json.scalar(value)); return this; }
 public String getDataEntradaSaida() { return stringValue(field("data_entrada_saida")); }
 public G004 setDataEntradaSaida(String value) { put("data_entrada_saida", Json.scalar(value)); return this; }
 public String getDataPrevisaoEntrega() { return stringValue(field("data_previsao_entrega")); }
 public G004 setDataPrevisaoEntrega(String value) { put("data_previsao_entrega", Json.scalar(value)); return this; }
 public String getDataServico() { return stringValue(field("data_servico")); }
 public G004 setDataServico(String value) { put("data_servico", Json.scalar(value)); return this; }
}
