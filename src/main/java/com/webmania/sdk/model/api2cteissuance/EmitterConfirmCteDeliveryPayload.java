package com.webmania.sdk.model.api2cteissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/cte-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterConfirmCteDeliveryPayload extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("chave", "comprovante", "data_hora", "documento_recebedor", "informacoes", "latitude", "longitude", "nome_recebedor", "notas_fiscais", "uuid");
 public EmitterConfirmCteDeliveryPayload() { super(FIELDS); }
 public EmitterConfirmCteDeliveryPayload(JsonNode node) { super(node, FIELDS); }
 public String getChave() { return stringValue(field("chave")); }
 public EmitterConfirmCteDeliveryPayload setChave(String value) { put("chave", Json.scalar(value)); return this; }
 public String getComprovante() { return stringValue(field("comprovante")); }
 public EmitterConfirmCteDeliveryPayload setComprovante(String value) { put("comprovante", Json.scalar(value)); return this; }
 public String getDataHora() { return stringValue(field("data_hora")); }
 public EmitterConfirmCteDeliveryPayload setDataHora(String value) { put("data_hora", Json.scalar(value)); return this; }
 public String getDocumentoRecebedor() { return stringValue(field("documento_recebedor")); }
 public EmitterConfirmCteDeliveryPayload setDocumentoRecebedor(String value) { put("documento_recebedor", Json.scalar(value)); return this; }
 public String getInformacoes() { return stringValue(field("informacoes")); }
 public EmitterConfirmCteDeliveryPayload setInformacoes(String value) { put("informacoes", Json.scalar(value)); return this; }
 public String getLatitude() { return stringValue(field("latitude")); }
 public EmitterConfirmCteDeliveryPayload setLatitude(String value) { put("latitude", Json.scalar(value)); return this; }
 public String getLongitude() { return stringValue(field("longitude")); }
 public EmitterConfirmCteDeliveryPayload setLongitude(String value) { put("longitude", Json.scalar(value)); return this; }
 public String getNomeRecebedor() { return stringValue(field("nome_recebedor")); }
 public EmitterConfirmCteDeliveryPayload setNomeRecebedor(String value) { put("nome_recebedor", Json.scalar(value)); return this; }
 public java.util.List<String> getNotasFiscais() { return list(field("notas_fiscais"), v -> stringValue(v)); }
 public EmitterConfirmCteDeliveryPayload setNotasFiscais(java.util.List<String> value) { put("notas_fiscais", array(value, v -> Json.scalar(v))); return this; }
 public String getUuid() { return stringValue(field("uuid")); }
 public EmitterConfirmCteDeliveryPayload setUuid(String value) { put("uuid", Json.scalar(value)); return this; }
}
