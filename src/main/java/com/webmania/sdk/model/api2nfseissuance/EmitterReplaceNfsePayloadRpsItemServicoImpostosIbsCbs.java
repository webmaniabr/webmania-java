package com.webmania.sdk.model.api2nfseissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfse-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterReplaceNfsePayloadRpsItemServicoImpostosIbsCbs extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("codigo_localidade_incidencia", "pRedutor", "p_redutor");
 public EmitterReplaceNfsePayloadRpsItemServicoImpostosIbsCbs() { super(FIELDS); }
 public EmitterReplaceNfsePayloadRpsItemServicoImpostosIbsCbs(JsonNode node) { super(node, FIELDS); }
 public String getCodigoLocalidadeIncidencia() { return stringValue(field("codigo_localidade_incidencia")); }
 public EmitterReplaceNfsePayloadRpsItemServicoImpostosIbsCbs setCodigoLocalidadeIncidencia(String value) { put("codigo_localidade_incidencia", Json.scalar(value)); return this; }
 public EmitterReplaceNfsePayloadRpsItemServicoImpostosIbsCbsPRedutor getPRedutor() { return (field("pRedutor")).isNull() || (field("pRedutor")).isMissingNode() ? null : new EmitterReplaceNfsePayloadRpsItemServicoImpostosIbsCbsPRedutor(field("pRedutor")); }
 public EmitterReplaceNfsePayloadRpsItemServicoImpostosIbsCbs setPRedutor(EmitterReplaceNfsePayloadRpsItemServicoImpostosIbsCbsPRedutor value) { put("pRedutor", value == null ? null : value.toJson()); return this; }
 public EmitterReplaceNfsePayloadRpsItemServicoImpostosIbsCbsPRedutor194675 getPRedutor194675() { return (field("p_redutor")).isNull() || (field("p_redutor")).isMissingNode() ? null : new EmitterReplaceNfsePayloadRpsItemServicoImpostosIbsCbsPRedutor194675(field("p_redutor")); }
 public EmitterReplaceNfsePayloadRpsItemServicoImpostosIbsCbs setPRedutor194675(EmitterReplaceNfsePayloadRpsItemServicoImpostosIbsCbsPRedutor194675 value) { put("p_redutor", value == null ? null : value.toJson()); return this; }
}
