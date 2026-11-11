package com.webmania.sdk.model.api2cteissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/cte-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueCtePayloadDocumentosFiscaisItem extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("base_calculo", "base_calculo_st", "cfop", "chave", "data_emissao", "descricao", "icms", "icms_st", "modelo", "numero", "numero_pedido", "numero_romaneio", "peso", "pin", "previsao_entrega", "serie", "tipo", "unidades_carga", "unidades_transporte", "valor_produtos", "valor_total", "CFOP", "subserie");
 public EmitterIssueCtePayloadDocumentosFiscaisItem() { super(FIELDS); }
 public EmitterIssueCtePayloadDocumentosFiscaisItem(JsonNode node) { super(node, FIELDS); }
 public EmitterIssueCtePayloadDocumentosFiscaisItemBaseCalculo getBaseCalculo() { return (field("base_calculo")).isNull() || (field("base_calculo")).isMissingNode() ? null : new EmitterIssueCtePayloadDocumentosFiscaisItemBaseCalculo(field("base_calculo")); }
 public EmitterIssueCtePayloadDocumentosFiscaisItem setBaseCalculo(EmitterIssueCtePayloadDocumentosFiscaisItemBaseCalculo value) { put("base_calculo", value == null ? null : value.toJson()); return this; }
 public EmitterIssueCtePayloadDocumentosFiscaisItemBaseCalculoSt getBaseCalculoSt() { return (field("base_calculo_st")).isNull() || (field("base_calculo_st")).isMissingNode() ? null : new EmitterIssueCtePayloadDocumentosFiscaisItemBaseCalculoSt(field("base_calculo_st")); }
 public EmitterIssueCtePayloadDocumentosFiscaisItem setBaseCalculoSt(EmitterIssueCtePayloadDocumentosFiscaisItemBaseCalculoSt value) { put("base_calculo_st", value == null ? null : value.toJson()); return this; }
 public String getCfop() { return stringValue(field("cfop")); }
 public EmitterIssueCtePayloadDocumentosFiscaisItem setCfop(String value) { put("cfop", Json.scalar(value)); return this; }
 public String getChave() { return stringValue(field("chave")); }
 public EmitterIssueCtePayloadDocumentosFiscaisItem setChave(String value) { put("chave", Json.scalar(value)); return this; }
 public String getDataEmissao() { return stringValue(field("data_emissao")); }
 public EmitterIssueCtePayloadDocumentosFiscaisItem setDataEmissao(String value) { put("data_emissao", Json.scalar(value)); return this; }
 public String getDescricao() { return stringValue(field("descricao")); }
 public EmitterIssueCtePayloadDocumentosFiscaisItem setDescricao(String value) { put("descricao", Json.scalar(value)); return this; }
 public EmitterIssueCtePayloadDocumentosFiscaisItemIcms getIcms() { return (field("icms")).isNull() || (field("icms")).isMissingNode() ? null : new EmitterIssueCtePayloadDocumentosFiscaisItemIcms(field("icms")); }
 public EmitterIssueCtePayloadDocumentosFiscaisItem setIcms(EmitterIssueCtePayloadDocumentosFiscaisItemIcms value) { put("icms", value == null ? null : value.toJson()); return this; }
 public EmitterIssueCtePayloadDocumentosFiscaisItemIcmsSt getIcmsSt() { return (field("icms_st")).isNull() || (field("icms_st")).isMissingNode() ? null : new EmitterIssueCtePayloadDocumentosFiscaisItemIcmsSt(field("icms_st")); }
 public EmitterIssueCtePayloadDocumentosFiscaisItem setIcmsSt(EmitterIssueCtePayloadDocumentosFiscaisItemIcmsSt value) { put("icms_st", value == null ? null : value.toJson()); return this; }
 public String getModelo() { return stringValue(field("modelo")); }
 public EmitterIssueCtePayloadDocumentosFiscaisItem setModelo(String value) { put("modelo", Json.scalar(value)); return this; }
 public String getNumero() { return stringValue(field("numero")); }
 public EmitterIssueCtePayloadDocumentosFiscaisItem setNumero(String value) { put("numero", Json.scalar(value)); return this; }
 public String getNumeroPedido() { return stringValue(field("numero_pedido")); }
 public EmitterIssueCtePayloadDocumentosFiscaisItem setNumeroPedido(String value) { put("numero_pedido", Json.scalar(value)); return this; }
 public String getNumeroRomaneio() { return stringValue(field("numero_romaneio")); }
 public EmitterIssueCtePayloadDocumentosFiscaisItem setNumeroRomaneio(String value) { put("numero_romaneio", Json.scalar(value)); return this; }
 public EmitterIssueCtePayloadDocumentosFiscaisItemPeso getPeso() { return (field("peso")).isNull() || (field("peso")).isMissingNode() ? null : new EmitterIssueCtePayloadDocumentosFiscaisItemPeso(field("peso")); }
 public EmitterIssueCtePayloadDocumentosFiscaisItem setPeso(EmitterIssueCtePayloadDocumentosFiscaisItemPeso value) { put("peso", value == null ? null : value.toJson()); return this; }
 public String getPin() { return stringValue(field("pin")); }
 public EmitterIssueCtePayloadDocumentosFiscaisItem setPin(String value) { put("pin", Json.scalar(value)); return this; }
 public String getPrevisaoEntrega() { return stringValue(field("previsao_entrega")); }
 public EmitterIssueCtePayloadDocumentosFiscaisItem setPrevisaoEntrega(String value) { put("previsao_entrega", Json.scalar(value)); return this; }
 public String getSerie() { return stringValue(field("serie")); }
 public EmitterIssueCtePayloadDocumentosFiscaisItem setSerie(String value) { put("serie", Json.scalar(value)); return this; }
 public String getTipo() { return stringValue(field("tipo")); }
 public EmitterIssueCtePayloadDocumentosFiscaisItem setTipo(String value) { put("tipo", Json.scalar(value)); return this; }
 public java.util.List<EmitterIssueCtePayloadDocumentosFiscaisItemUnidadesCargaItem> getUnidadesCarga() { return list(field("unidades_carga"), v -> (v).isNull() || (v).isMissingNode() ? null : new EmitterIssueCtePayloadDocumentosFiscaisItemUnidadesCargaItem(v)); }
 public EmitterIssueCtePayloadDocumentosFiscaisItem setUnidadesCarga(java.util.List<EmitterIssueCtePayloadDocumentosFiscaisItemUnidadesCargaItem> value) { put("unidades_carga", array(value, v -> v == null ? null : v.toJson())); return this; }
 public java.util.List<EmitterIssueCtePayloadDocumentosFiscaisItemUnidadesTransporteItem> getUnidadesTransporte() { return list(field("unidades_transporte"), v -> (v).isNull() || (v).isMissingNode() ? null : new EmitterIssueCtePayloadDocumentosFiscaisItemUnidadesTransporteItem(v)); }
 public EmitterIssueCtePayloadDocumentosFiscaisItem setUnidadesTransporte(java.util.List<EmitterIssueCtePayloadDocumentosFiscaisItemUnidadesTransporteItem> value) { put("unidades_transporte", array(value, v -> v == null ? null : v.toJson())); return this; }
 public EmitterIssueCtePayloadDocumentosFiscaisItemValorProdutos getValorProdutos() { return (field("valor_produtos")).isNull() || (field("valor_produtos")).isMissingNode() ? null : new EmitterIssueCtePayloadDocumentosFiscaisItemValorProdutos(field("valor_produtos")); }
 public EmitterIssueCtePayloadDocumentosFiscaisItem setValorProdutos(EmitterIssueCtePayloadDocumentosFiscaisItemValorProdutos value) { put("valor_produtos", value == null ? null : value.toJson()); return this; }
 public EmitterIssueCtePayloadDocumentosFiscaisItemValorTotal getValorTotal() { return (field("valor_total")).isNull() || (field("valor_total")).isMissingNode() ? null : new EmitterIssueCtePayloadDocumentosFiscaisItemValorTotal(field("valor_total")); }
 public EmitterIssueCtePayloadDocumentosFiscaisItem setValorTotal(EmitterIssueCtePayloadDocumentosFiscaisItemValorTotal value) { put("valor_total", value == null ? null : value.toJson()); return this; }
 public String getCFOP() { return stringValue(field("CFOP")); }
 public EmitterIssueCtePayloadDocumentosFiscaisItem setCFOP(String value) { put("CFOP", Json.scalar(value)); return this; }
 public String getSubserie() { return stringValue(field("subserie")); }
 public EmitterIssueCtePayloadDocumentosFiscaisItem setSubserie(String value) { put("subserie", Json.scalar(value)); return this; }
}
