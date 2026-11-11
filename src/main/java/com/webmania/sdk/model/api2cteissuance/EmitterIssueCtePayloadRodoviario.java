package com.webmania.sdk.model.api2cteissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/cte-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueCtePayloadRodoviario extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("data_viagem", "ordens_coleta", "registro_estadual_cte_os", "rntrc", "taf_cte_os", "tipo_fretamento", "veiculo");
 public EmitterIssueCtePayloadRodoviario() { super(FIELDS); }
 public EmitterIssueCtePayloadRodoviario(JsonNode node) { super(node, FIELDS); }
 public String getDataViagem() { return stringValue(field("data_viagem")); }
 public EmitterIssueCtePayloadRodoviario setDataViagem(String value) { put("data_viagem", Json.scalar(value)); return this; }
 public java.util.List<EmitterIssueCtePayloadRodoviarioOrdensColetaItem> getOrdensColeta() { return list(field("ordens_coleta"), v -> (v).isNull() || (v).isMissingNode() ? null : new EmitterIssueCtePayloadRodoviarioOrdensColetaItem(v)); }
 public EmitterIssueCtePayloadRodoviario setOrdensColeta(java.util.List<EmitterIssueCtePayloadRodoviarioOrdensColetaItem> value) { put("ordens_coleta", array(value, v -> v == null ? null : v.toJson())); return this; }
 public String getRegistroEstadualCteOs() { return stringValue(field("registro_estadual_cte_os")); }
 public EmitterIssueCtePayloadRodoviario setRegistroEstadualCteOs(String value) { put("registro_estadual_cte_os", Json.scalar(value)); return this; }
 public String getRntrc() { return stringValue(field("rntrc")); }
 public EmitterIssueCtePayloadRodoviario setRntrc(String value) { put("rntrc", Json.scalar(value)); return this; }
 public String getTafCteOs() { return stringValue(field("taf_cte_os")); }
 public EmitterIssueCtePayloadRodoviario setTafCteOs(String value) { put("taf_cte_os", Json.scalar(value)); return this; }
 public String getTipoFretamento() { return stringValue(field("tipo_fretamento")); }
 public EmitterIssueCtePayloadRodoviario setTipoFretamento(String value) { put("tipo_fretamento", Json.scalar(value)); return this; }
 public EmitterIssueCtePayloadRodoviarioVeiculo getVeiculo() { return (field("veiculo")).isNull() || (field("veiculo")).isMissingNode() ? null : new EmitterIssueCtePayloadRodoviarioVeiculo(field("veiculo")); }
 public EmitterIssueCtePayloadRodoviario setVeiculo(EmitterIssueCtePayloadRodoviarioVeiculo value) { put("veiculo", value == null ? null : value.toJson()); return this; }
}
