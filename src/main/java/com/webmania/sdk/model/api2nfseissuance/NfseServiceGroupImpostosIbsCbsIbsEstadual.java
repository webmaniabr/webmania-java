package com.webmania.sdk.model.api2nfseissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfse-issuance.openapi.json; see contract-provenance.json. */
public final class NfseServiceGroupImpostosIbsCbsIbsEstadual extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("aliquota_diferimento", "valor_devolvido");
 public NfseServiceGroupImpostosIbsCbsIbsEstadual() { super(FIELDS); }
 public NfseServiceGroupImpostosIbsCbsIbsEstadual(JsonNode node) { super(node, FIELDS); }
 public NfseServiceGroupImpostosIbsCbsIbsEstadualAliquotaDiferimento getAliquotaDiferimento() { return (field("aliquota_diferimento")).isNull() || (field("aliquota_diferimento")).isMissingNode() ? null : new NfseServiceGroupImpostosIbsCbsIbsEstadualAliquotaDiferimento(field("aliquota_diferimento")); }
 public NfseServiceGroupImpostosIbsCbsIbsEstadual setAliquotaDiferimento(NfseServiceGroupImpostosIbsCbsIbsEstadualAliquotaDiferimento value) { put("aliquota_diferimento", value == null ? null : value.toJson()); return this; }
 public String getValorDevolvido() { return stringValue(field("valor_devolvido")); }
 public NfseServiceGroupImpostosIbsCbsIbsEstadual setValorDevolvido(String value) { put("valor_devolvido", Json.scalar(value)); return this; }
}
