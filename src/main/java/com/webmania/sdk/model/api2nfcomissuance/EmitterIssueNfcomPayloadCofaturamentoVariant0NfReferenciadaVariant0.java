package com.webmania.sdk.model.api2nfcomissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfcom-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueNfcomPayloadCofaturamentoVariant0NfReferenciadaVariant0 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("cnpj", "competencia", "hash115", "modelo", "numero", "serie");
 public EmitterIssueNfcomPayloadCofaturamentoVariant0NfReferenciadaVariant0() { super(FIELDS); }
 public EmitterIssueNfcomPayloadCofaturamentoVariant0NfReferenciadaVariant0(JsonNode node) { super(node, FIELDS); }
 public String getCnpj() { return stringValue(field("cnpj")); }
 public EmitterIssueNfcomPayloadCofaturamentoVariant0NfReferenciadaVariant0 setCnpj(String value) { put("cnpj", Json.scalar(value)); return this; }
 public String getCompetencia() { return stringValue(field("competencia")); }
 public EmitterIssueNfcomPayloadCofaturamentoVariant0NfReferenciadaVariant0 setCompetencia(String value) { put("competencia", Json.scalar(value)); return this; }
 public EmitterIssueNfcomPayloadCofaturamentoVariant0NfReferenciadaVariant0Hash115 getHash115() { return (field("hash115")).isNull() || (field("hash115")).isMissingNode() ? null : new EmitterIssueNfcomPayloadCofaturamentoVariant0NfReferenciadaVariant0Hash115(field("hash115")); }
 public EmitterIssueNfcomPayloadCofaturamentoVariant0NfReferenciadaVariant0 setHash115(EmitterIssueNfcomPayloadCofaturamentoVariant0NfReferenciadaVariant0Hash115 value) { put("hash115", value == null ? null : value.toJson()); return this; }
 public String getModelo() { return stringValue(field("modelo")); }
 public EmitterIssueNfcomPayloadCofaturamentoVariant0NfReferenciadaVariant0 setModelo(String value) { put("modelo", Json.scalar(value)); return this; }
 public EmitterIssueNfcomPayloadCofaturamentoVariant0NfReferenciadaVariant0Numero getNumero() { return (field("numero")).isNull() || (field("numero")).isMissingNode() ? null : new EmitterIssueNfcomPayloadCofaturamentoVariant0NfReferenciadaVariant0Numero(field("numero")); }
 public EmitterIssueNfcomPayloadCofaturamentoVariant0NfReferenciadaVariant0 setNumero(EmitterIssueNfcomPayloadCofaturamentoVariant0NfReferenciadaVariant0Numero value) { put("numero", value == null ? null : value.toJson()); return this; }
 public String getSerie() { return stringValue(field("serie")); }
 public EmitterIssueNfcomPayloadCofaturamentoVariant0NfReferenciadaVariant0 setSerie(String value) { put("serie", Json.scalar(value)); return this; }
}
