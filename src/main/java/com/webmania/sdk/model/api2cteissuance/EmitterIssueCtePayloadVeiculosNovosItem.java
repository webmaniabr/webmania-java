package com.webmania.sdk.model.api2cteissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/cte-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueCtePayloadVeiculosNovosItem extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("chassi", "cor", "cor_descricao", "marca_modelo", "valor_frete_unitario", "valor_unitario");
 public EmitterIssueCtePayloadVeiculosNovosItem() { super(FIELDS); }
 public EmitterIssueCtePayloadVeiculosNovosItem(JsonNode node) { super(node, FIELDS); }
 public String getChassi() { return stringValue(field("chassi")); }
 public EmitterIssueCtePayloadVeiculosNovosItem setChassi(String value) { put("chassi", Json.scalar(value)); return this; }
 public String getCor() { return stringValue(field("cor")); }
 public EmitterIssueCtePayloadVeiculosNovosItem setCor(String value) { put("cor", Json.scalar(value)); return this; }
 public String getCorDescricao() { return stringValue(field("cor_descricao")); }
 public EmitterIssueCtePayloadVeiculosNovosItem setCorDescricao(String value) { put("cor_descricao", Json.scalar(value)); return this; }
 public String getMarcaModelo() { return stringValue(field("marca_modelo")); }
 public EmitterIssueCtePayloadVeiculosNovosItem setMarcaModelo(String value) { put("marca_modelo", Json.scalar(value)); return this; }
 public EmitterIssueCtePayloadVeiculosNovosItemValorFreteUnitario getValorFreteUnitario() { return (field("valor_frete_unitario")).isNull() || (field("valor_frete_unitario")).isMissingNode() ? null : new EmitterIssueCtePayloadVeiculosNovosItemValorFreteUnitario(field("valor_frete_unitario")); }
 public EmitterIssueCtePayloadVeiculosNovosItem setValorFreteUnitario(EmitterIssueCtePayloadVeiculosNovosItemValorFreteUnitario value) { put("valor_frete_unitario", value == null ? null : value.toJson()); return this; }
 public EmitterIssueCtePayloadVeiculosNovosItemValorUnitario getValorUnitario() { return (field("valor_unitario")).isNull() || (field("valor_unitario")).isMissingNode() ? null : new EmitterIssueCtePayloadVeiculosNovosItemValorUnitario(field("valor_unitario")); }
 public EmitterIssueCtePayloadVeiculosNovosItem setValorUnitario(EmitterIssueCtePayloadVeiculosNovosItemValorUnitario value) { put("valor_unitario", value == null ? null : value.toJson()); return this; }
}
