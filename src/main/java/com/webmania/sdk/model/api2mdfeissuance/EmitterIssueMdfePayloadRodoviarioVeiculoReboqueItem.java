package com.webmania.sdk.model.api2mdfeissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/mdfe-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueMdfePayloadRodoviarioVeiculoReboqueItem extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("capacidade_kg", "capacidade_m3", "codigo_agendamento_porto", "codigo_interno", "placa", "proprietario", "renavam", "tara", "tipo_carroceria", "uf_licenciamento");
 public EmitterIssueMdfePayloadRodoviarioVeiculoReboqueItem() { super(FIELDS); }
 public EmitterIssueMdfePayloadRodoviarioVeiculoReboqueItem(JsonNode node) { super(node, FIELDS); }
 public String getCapacidadeKg() { return stringValue(field("capacidade_kg")); }
 public EmitterIssueMdfePayloadRodoviarioVeiculoReboqueItem setCapacidadeKg(String value) { put("capacidade_kg", Json.scalar(value)); return this; }
 public String getCapacidadeM3() { return stringValue(field("capacidade_m3")); }
 public EmitterIssueMdfePayloadRodoviarioVeiculoReboqueItem setCapacidadeM3(String value) { put("capacidade_m3", Json.scalar(value)); return this; }
 public String getCodigoAgendamentoPorto() { return stringValue(field("codigo_agendamento_porto")); }
 public EmitterIssueMdfePayloadRodoviarioVeiculoReboqueItem setCodigoAgendamentoPorto(String value) { put("codigo_agendamento_porto", Json.scalar(value)); return this; }
 public String getCodigoInterno() { return stringValue(field("codigo_interno")); }
 public EmitterIssueMdfePayloadRodoviarioVeiculoReboqueItem setCodigoInterno(String value) { put("codigo_interno", Json.scalar(value)); return this; }
 public String getPlaca() { return stringValue(field("placa")); }
 public EmitterIssueMdfePayloadRodoviarioVeiculoReboqueItem setPlaca(String value) { put("placa", Json.scalar(value)); return this; }
 public EmitterIssueMdfePayloadRodoviarioVeiculoReboqueItemProprietario getProprietario() { return (field("proprietario")).isNull() || (field("proprietario")).isMissingNode() ? null : new EmitterIssueMdfePayloadRodoviarioVeiculoReboqueItemProprietario(field("proprietario")); }
 public EmitterIssueMdfePayloadRodoviarioVeiculoReboqueItem setProprietario(EmitterIssueMdfePayloadRodoviarioVeiculoReboqueItemProprietario value) { put("proprietario", value == null ? null : value.toJson()); return this; }
 public String getRenavam() { return stringValue(field("renavam")); }
 public EmitterIssueMdfePayloadRodoviarioVeiculoReboqueItem setRenavam(String value) { put("renavam", Json.scalar(value)); return this; }
 public String getTara() { return stringValue(field("tara")); }
 public EmitterIssueMdfePayloadRodoviarioVeiculoReboqueItem setTara(String value) { put("tara", Json.scalar(value)); return this; }
 public JsonValue getTipoCarroceria() { return (field("tipo_carroceria")).isNull() || (field("tipo_carroceria")).isMissingNode() ? null : new JsonValue(field("tipo_carroceria")); }
 public EmitterIssueMdfePayloadRodoviarioVeiculoReboqueItem setTipoCarroceria(JsonValue value) { put("tipo_carroceria", value == null ? null : value.toJson()); return this; }
 public String getUfLicenciamento() { return stringValue(field("uf_licenciamento")); }
 public EmitterIssueMdfePayloadRodoviarioVeiculoReboqueItem setUfLicenciamento(String value) { put("uf_licenciamento", Json.scalar(value)); return this; }
}
