package com.webmania.sdk.model.api2nfcomissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfcom-issuance.openapi.json; see contract-provenance.json. */
public final class NfcomItemGroupImpostosIbsCbsVariant0Cbs extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("aliquota_diferimento", "valor_devolvido");
 public NfcomItemGroupImpostosIbsCbsVariant0Cbs() { super(FIELDS); }
 public NfcomItemGroupImpostosIbsCbsVariant0Cbs(JsonNode node) { super(node, FIELDS); }
 public NfcomItemGroupImpostosIbsCbsVariant0CbsAliquotaDiferimento getAliquotaDiferimento() { return (field("aliquota_diferimento")).isNull() || (field("aliquota_diferimento")).isMissingNode() ? null : new NfcomItemGroupImpostosIbsCbsVariant0CbsAliquotaDiferimento(field("aliquota_diferimento")); }
 public NfcomItemGroupImpostosIbsCbsVariant0Cbs setAliquotaDiferimento(NfcomItemGroupImpostosIbsCbsVariant0CbsAliquotaDiferimento value) { put("aliquota_diferimento", value == null ? null : value.toJson()); return this; }
 public NfcomItemGroupImpostosIbsCbsVariant0CbsValorDevolvido getValorDevolvido() { return (field("valor_devolvido")).isNull() || (field("valor_devolvido")).isMissingNode() ? null : new NfcomItemGroupImpostosIbsCbsVariant0CbsValorDevolvido(field("valor_devolvido")); }
 public NfcomItemGroupImpostosIbsCbsVariant0Cbs setValorDevolvido(NfcomItemGroupImpostosIbsCbsVariant0CbsValorDevolvido value) { put("valor_devolvido", value == null ? null : value.toJson()); return this; }
}
