package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G016 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("codigo_anp", "descricao_anp", "uf_consumo", "percentual_glp", "percentual_gnn", "percentual_gni", "percentual_biodiesel", "partida", "codif", "qtd_temperatura", "bc_cide", "valor_cide", "bico", "bomba", "tanque", "encerrante_inicio", "encerrante_final", "origem");
 public G016() { super(FIELDS); }
 public G016(JsonNode node) { super(node, FIELDS); }
 public String getCodigoAnp() { return stringValue(field("codigo_anp")); }
 public G016 setCodigoAnp(String value) { put("codigo_anp", Json.scalar(value)); return this; }
 public String getDescricaoAnp() { return stringValue(field("descricao_anp")); }
 public G016 setDescricaoAnp(String value) { put("descricao_anp", Json.scalar(value)); return this; }
 public String getUfConsumo() { return stringValue(field("uf_consumo")); }
 public G016 setUfConsumo(String value) { put("uf_consumo", Json.scalar(value)); return this; }
 public G016PercentualGlp getPercentualGlp() { return (field("percentual_glp")).isNull() || (field("percentual_glp")).isMissingNode() ? null : new G016PercentualGlp(field("percentual_glp")); }
 public G016 setPercentualGlp(G016PercentualGlp value) { put("percentual_glp", value == null ? null : value.toJson()); return this; }
 public G016PercentualGnn getPercentualGnn() { return (field("percentual_gnn")).isNull() || (field("percentual_gnn")).isMissingNode() ? null : new G016PercentualGnn(field("percentual_gnn")); }
 public G016 setPercentualGnn(G016PercentualGnn value) { put("percentual_gnn", value == null ? null : value.toJson()); return this; }
 public G016PercentualGni getPercentualGni() { return (field("percentual_gni")).isNull() || (field("percentual_gni")).isMissingNode() ? null : new G016PercentualGni(field("percentual_gni")); }
 public G016 setPercentualGni(G016PercentualGni value) { put("percentual_gni", value == null ? null : value.toJson()); return this; }
 public G016PercentualBiodiesel getPercentualBiodiesel() { return (field("percentual_biodiesel")).isNull() || (field("percentual_biodiesel")).isMissingNode() ? null : new G016PercentualBiodiesel(field("percentual_biodiesel")); }
 public G016 setPercentualBiodiesel(G016PercentualBiodiesel value) { put("percentual_biodiesel", value == null ? null : value.toJson()); return this; }
 public G016Partida getPartida() { return (field("partida")).isNull() || (field("partida")).isMissingNode() ? null : new G016Partida(field("partida")); }
 public G016 setPartida(G016Partida value) { put("partida", value == null ? null : value.toJson()); return this; }
 public String getCodif() { return stringValue(field("codif")); }
 public G016 setCodif(String value) { put("codif", Json.scalar(value)); return this; }
 public G016QtdTemperatura getQtdTemperatura() { return (field("qtd_temperatura")).isNull() || (field("qtd_temperatura")).isMissingNode() ? null : new G016QtdTemperatura(field("qtd_temperatura")); }
 public G016 setQtdTemperatura(G016QtdTemperatura value) { put("qtd_temperatura", value == null ? null : value.toJson()); return this; }
 public G016BcCide getBcCide() { return (field("bc_cide")).isNull() || (field("bc_cide")).isMissingNode() ? null : new G016BcCide(field("bc_cide")); }
 public G016 setBcCide(G016BcCide value) { put("bc_cide", value == null ? null : value.toJson()); return this; }
 public G016ValorCide getValorCide() { return (field("valor_cide")).isNull() || (field("valor_cide")).isMissingNode() ? null : new G016ValorCide(field("valor_cide")); }
 public G016 setValorCide(G016ValorCide value) { put("valor_cide", value == null ? null : value.toJson()); return this; }
 public java.math.BigInteger getBico() { return integerValue(field("bico")); }
 public G016 setBico(java.math.BigInteger value) { put("bico", Json.scalar(value)); return this; }
 public java.math.BigInteger getBomba() { return integerValue(field("bomba")); }
 public G016 setBomba(java.math.BigInteger value) { put("bomba", Json.scalar(value)); return this; }
 public java.math.BigInteger getTanque() { return integerValue(field("tanque")); }
 public G016 setTanque(java.math.BigInteger value) { put("tanque", Json.scalar(value)); return this; }
 public java.math.BigInteger getEncerranteInicio() { return integerValue(field("encerrante_inicio")); }
 public G016 setEncerranteInicio(java.math.BigInteger value) { put("encerrante_inicio", Json.scalar(value)); return this; }
 public java.math.BigInteger getEncerranteFinal() { return integerValue(field("encerrante_final")); }
 public G016 setEncerranteFinal(java.math.BigInteger value) { put("encerrante_final", Json.scalar(value)); return this; }
 public java.util.List<G017> getOrigem() { return list(field("origem"), v -> (v).isNull() || (v).isMissingNode() ? null : new G017(v)); }
 public G016 setOrigem(java.util.List<G017> value) { put("origem", array(value, v -> v == null ? null : v.toJson())); return this; }
}
