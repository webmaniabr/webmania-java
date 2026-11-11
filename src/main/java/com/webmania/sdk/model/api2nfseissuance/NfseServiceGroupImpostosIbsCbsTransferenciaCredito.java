package com.webmania.sdk.model.api2nfseissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfse-issuance.openapi.json; see contract-provenance.json. */
public final class NfseServiceGroupImpostosIbsCbsTransferenciaCredito extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("valor_ibs", "valor_cbs");
 public NfseServiceGroupImpostosIbsCbsTransferenciaCredito() { super(FIELDS); }
 public NfseServiceGroupImpostosIbsCbsTransferenciaCredito(JsonNode node) { super(node, FIELDS); }
 public String getValorIbs() { return stringValue(field("valor_ibs")); }
 public NfseServiceGroupImpostosIbsCbsTransferenciaCredito setValorIbs(String value) { put("valor_ibs", Json.scalar(value)); return this; }
 public String getValorCbs() { return stringValue(field("valor_cbs")); }
 public NfseServiceGroupImpostosIbsCbsTransferenciaCredito setValorCbs(String value) { put("valor_cbs", Json.scalar(value)); return this; }
}
