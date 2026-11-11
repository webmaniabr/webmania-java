package com.webmania.sdk.model.api2nfcomissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfcom-issuance.openapi.json; see contract-provenance.json. */
public final class NfcomItemGroupImpostosIbsCbsVariant0IbsMunicipal extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("aliquota_diferimento", "valor_devolvido");
 public NfcomItemGroupImpostosIbsCbsVariant0IbsMunicipal() { super(FIELDS); }
 public NfcomItemGroupImpostosIbsCbsVariant0IbsMunicipal(JsonNode node) { super(node, FIELDS); }
 public NfcomItemGroupImpostosIbsCbsVariant0IbsMunicipalAliquotaDiferimento getAliquotaDiferimento() { return (field("aliquota_diferimento")).isNull() || (field("aliquota_diferimento")).isMissingNode() ? null : new NfcomItemGroupImpostosIbsCbsVariant0IbsMunicipalAliquotaDiferimento(field("aliquota_diferimento")); }
 public NfcomItemGroupImpostosIbsCbsVariant0IbsMunicipal setAliquotaDiferimento(NfcomItemGroupImpostosIbsCbsVariant0IbsMunicipalAliquotaDiferimento value) { put("aliquota_diferimento", value == null ? null : value.toJson()); return this; }
 public NfcomItemGroupImpostosIbsCbsVariant0IbsMunicipalValorDevolvido getValorDevolvido() { return (field("valor_devolvido")).isNull() || (field("valor_devolvido")).isMissingNode() ? null : new NfcomItemGroupImpostosIbsCbsVariant0IbsMunicipalValorDevolvido(field("valor_devolvido")); }
 public NfcomItemGroupImpostosIbsCbsVariant0IbsMunicipal setValorDevolvido(NfcomItemGroupImpostosIbsCbsVariant0IbsMunicipalValorDevolvido value) { put("valor_devolvido", value == null ? null : value.toJson()); return this; }
}
