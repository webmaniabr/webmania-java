package com.webmania.sdk.model.api2nfseissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfse-issuance.openapi.json; see contract-provenance.json. */
public final class NfseServiceGroupImpostosIbsCbsCreditoPresumido extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("classificacao", "aliquota_ibs", "aliquota_cbs");
 public NfseServiceGroupImpostosIbsCbsCreditoPresumido() { super(FIELDS); }
 public NfseServiceGroupImpostosIbsCbsCreditoPresumido(JsonNode node) { super(node, FIELDS); }
 public String getClassificacao() { return stringValue(field("classificacao")); }
 public NfseServiceGroupImpostosIbsCbsCreditoPresumido setClassificacao(String value) { put("classificacao", Json.scalar(value)); return this; }
 public String getAliquotaIbs() { return stringValue(field("aliquota_ibs")); }
 public NfseServiceGroupImpostosIbsCbsCreditoPresumido setAliquotaIbs(String value) { put("aliquota_ibs", Json.scalar(value)); return this; }
 public String getAliquotaCbs() { return stringValue(field("aliquota_cbs")); }
 public NfseServiceGroupImpostosIbsCbsCreditoPresumido setAliquotaCbs(String value) { put("aliquota_cbs", Json.scalar(value)); return this; }
}
