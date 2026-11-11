package com.webmania.sdk.model.api2nfcomissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfcom-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueNfcomPayloadFaturamentoCentralizadoVariant0 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("cnpj", "codigo_uf");
 public EmitterIssueNfcomPayloadFaturamentoCentralizadoVariant0() { super(FIELDS); }
 public EmitterIssueNfcomPayloadFaturamentoCentralizadoVariant0(JsonNode node) { super(node, FIELDS); }
 public String getCnpj() { return stringValue(field("cnpj")); }
 public EmitterIssueNfcomPayloadFaturamentoCentralizadoVariant0 setCnpj(String value) { put("cnpj", Json.scalar(value)); return this; }
 public String getCodigoUf() { return stringValue(field("codigo_uf")); }
 public EmitterIssueNfcomPayloadFaturamentoCentralizadoVariant0 setCodigoUf(String value) { put("codigo_uf", Json.scalar(value)); return this; }
}
