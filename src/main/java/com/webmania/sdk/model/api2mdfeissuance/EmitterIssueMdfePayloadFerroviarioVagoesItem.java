package com.webmania.sdk.model.api2mdfeissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/mdfe-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueMdfePayloadFerroviarioVagoesItem extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("numero", "peso_bc", "peso_real", "sequencia_vagao", "serie", "tipo_vagao", "tonelada_util");
 public EmitterIssueMdfePayloadFerroviarioVagoesItem() { super(FIELDS); }
 public EmitterIssueMdfePayloadFerroviarioVagoesItem(JsonNode node) { super(node, FIELDS); }
 public String getNumero() { return stringValue(field("numero")); }
 public EmitterIssueMdfePayloadFerroviarioVagoesItem setNumero(String value) { put("numero", Json.scalar(value)); return this; }
 public String getPesoBc() { return stringValue(field("peso_bc")); }
 public EmitterIssueMdfePayloadFerroviarioVagoesItem setPesoBc(String value) { put("peso_bc", Json.scalar(value)); return this; }
 public String getPesoReal() { return stringValue(field("peso_real")); }
 public EmitterIssueMdfePayloadFerroviarioVagoesItem setPesoReal(String value) { put("peso_real", Json.scalar(value)); return this; }
 public String getSequenciaVagao() { return stringValue(field("sequencia_vagao")); }
 public EmitterIssueMdfePayloadFerroviarioVagoesItem setSequenciaVagao(String value) { put("sequencia_vagao", Json.scalar(value)); return this; }
 public String getSerie() { return stringValue(field("serie")); }
 public EmitterIssueMdfePayloadFerroviarioVagoesItem setSerie(String value) { put("serie", Json.scalar(value)); return this; }
 public String getTipoVagao() { return stringValue(field("tipo_vagao")); }
 public EmitterIssueMdfePayloadFerroviarioVagoesItem setTipoVagao(String value) { put("tipo_vagao", Json.scalar(value)); return this; }
 public String getToneladaUtil() { return stringValue(field("tonelada_util")); }
 public EmitterIssueMdfePayloadFerroviarioVagoesItem setToneladaUtil(String value) { put("tonelada_util", Json.scalar(value)); return this; }
}
