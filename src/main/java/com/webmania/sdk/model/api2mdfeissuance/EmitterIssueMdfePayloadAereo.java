package com.webmania.sdk.model.api2mdfeissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/mdfe-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueMdfePayloadAereo extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("aerodromo_destino", "aerodromo_embarque", "data_voo", "matricula_aeronave", "nacionalidade_aeronave", "numero_voo");
 public EmitterIssueMdfePayloadAereo() { super(FIELDS); }
 public EmitterIssueMdfePayloadAereo(JsonNode node) { super(node, FIELDS); }
 public String getAerodromoDestino() { return stringValue(field("aerodromo_destino")); }
 public EmitterIssueMdfePayloadAereo setAerodromoDestino(String value) { put("aerodromo_destino", Json.scalar(value)); return this; }
 public String getAerodromoEmbarque() { return stringValue(field("aerodromo_embarque")); }
 public EmitterIssueMdfePayloadAereo setAerodromoEmbarque(String value) { put("aerodromo_embarque", Json.scalar(value)); return this; }
 public String getDataVoo() { return stringValue(field("data_voo")); }
 public EmitterIssueMdfePayloadAereo setDataVoo(String value) { put("data_voo", Json.scalar(value)); return this; }
 public String getMatriculaAeronave() { return stringValue(field("matricula_aeronave")); }
 public EmitterIssueMdfePayloadAereo setMatriculaAeronave(String value) { put("matricula_aeronave", Json.scalar(value)); return this; }
 public String getNacionalidadeAeronave() { return stringValue(field("nacionalidade_aeronave")); }
 public EmitterIssueMdfePayloadAereo setNacionalidadeAeronave(String value) { put("nacionalidade_aeronave", Json.scalar(value)); return this; }
 public String getNumeroVoo() { return stringValue(field("numero_voo")); }
 public EmitterIssueMdfePayloadAereo setNumeroVoo(String value) { put("numero_voo", Json.scalar(value)); return this; }
}
