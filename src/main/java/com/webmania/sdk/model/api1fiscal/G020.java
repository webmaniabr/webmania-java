package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G020 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("tipo_operacao", "chassi", "cor", "cor_descricao", "cv", "cilindrada", "peso_liquido", "peso_bruto", "serie", "tipo_combustivel", "numero_motor", "cmt", "dist", "ano_modelo", "ano_fabricacao", "tipo_pintura", "tipo_veiculo", "especie_veiculo", "vin", "condicao_veiculo", "marca_modelo", "cor_denatran", "lotacao", "restricao");
 public G020() { super(FIELDS); }
 public G020(JsonNode node) { super(node, FIELDS); }
 public java.math.BigInteger getTipoOperacao() { return integerValue(field("tipo_operacao")); }
 public G020 setTipoOperacao(java.math.BigInteger value) { put("tipo_operacao", Json.scalar(value)); return this; }
 public String getChassi() { return stringValue(field("chassi")); }
 public G020 setChassi(String value) { put("chassi", Json.scalar(value)); return this; }
 public String getCor() { return stringValue(field("cor")); }
 public G020 setCor(String value) { put("cor", Json.scalar(value)); return this; }
 public String getCorDescricao() { return stringValue(field("cor_descricao")); }
 public G020 setCorDescricao(String value) { put("cor_descricao", Json.scalar(value)); return this; }
 public String getCv() { return stringValue(field("cv")); }
 public G020 setCv(String value) { put("cv", Json.scalar(value)); return this; }
 public String getCilindrada() { return stringValue(field("cilindrada")); }
 public G020 setCilindrada(String value) { put("cilindrada", Json.scalar(value)); return this; }
 public java.math.BigInteger getPesoLiquido() { return integerValue(field("peso_liquido")); }
 public G020 setPesoLiquido(java.math.BigInteger value) { put("peso_liquido", Json.scalar(value)); return this; }
 public java.math.BigInteger getPesoBruto() { return integerValue(field("peso_bruto")); }
 public G020 setPesoBruto(java.math.BigInteger value) { put("peso_bruto", Json.scalar(value)); return this; }
 public String getSerie() { return stringValue(field("serie")); }
 public G020 setSerie(String value) { put("serie", Json.scalar(value)); return this; }
 public java.math.BigInteger getTipoCombustivel() { return integerValue(field("tipo_combustivel")); }
 public G020 setTipoCombustivel(java.math.BigInteger value) { put("tipo_combustivel", Json.scalar(value)); return this; }
 public String getNumeroMotor() { return stringValue(field("numero_motor")); }
 public G020 setNumeroMotor(String value) { put("numero_motor", Json.scalar(value)); return this; }
 public G020Cmt getCmt() { return (field("cmt")).isNull() || (field("cmt")).isMissingNode() ? null : new G020Cmt(field("cmt")); }
 public G020 setCmt(G020Cmt value) { put("cmt", value == null ? null : value.toJson()); return this; }
 public String getDist() { return stringValue(field("dist")); }
 public G020 setDist(String value) { put("dist", Json.scalar(value)); return this; }
 public String getAnoModelo() { return stringValue(field("ano_modelo")); }
 public G020 setAnoModelo(String value) { put("ano_modelo", Json.scalar(value)); return this; }
 public String getAnoFabricacao() { return stringValue(field("ano_fabricacao")); }
 public G020 setAnoFabricacao(String value) { put("ano_fabricacao", Json.scalar(value)); return this; }
 public String getTipoPintura() { return stringValue(field("tipo_pintura")); }
 public G020 setTipoPintura(String value) { put("tipo_pintura", Json.scalar(value)); return this; }
 public java.math.BigInteger getTipoVeiculo() { return integerValue(field("tipo_veiculo")); }
 public G020 setTipoVeiculo(java.math.BigInteger value) { put("tipo_veiculo", Json.scalar(value)); return this; }
 public java.math.BigInteger getEspecieVeiculo() { return integerValue(field("especie_veiculo")); }
 public G020 setEspecieVeiculo(java.math.BigInteger value) { put("especie_veiculo", Json.scalar(value)); return this; }
 public String getVin() { return stringValue(field("vin")); }
 public G020 setVin(String value) { put("vin", Json.scalar(value)); return this; }
 public java.math.BigInteger getCondicaoVeiculo() { return integerValue(field("condicao_veiculo")); }
 public G020 setCondicaoVeiculo(java.math.BigInteger value) { put("condicao_veiculo", Json.scalar(value)); return this; }
 public String getMarcaModelo() { return stringValue(field("marca_modelo")); }
 public G020 setMarcaModelo(String value) { put("marca_modelo", Json.scalar(value)); return this; }
 public java.math.BigInteger getCorDenatran() { return integerValue(field("cor_denatran")); }
 public G020 setCorDenatran(java.math.BigInteger value) { put("cor_denatran", Json.scalar(value)); return this; }
 public java.math.BigInteger getLotacao() { return integerValue(field("lotacao")); }
 public G020 setLotacao(java.math.BigInteger value) { put("lotacao", Json.scalar(value)); return this; }
 public java.math.BigInteger getRestricao() { return integerValue(field("restricao")); }
 public G020 setRestricao(java.math.BigInteger value) { put("restricao", Json.scalar(value)); return this; }
}
