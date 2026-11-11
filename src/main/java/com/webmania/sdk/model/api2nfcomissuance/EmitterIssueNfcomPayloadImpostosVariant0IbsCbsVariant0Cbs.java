package com.webmania.sdk.model.api2nfcomissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfcom-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueNfcomPayloadImpostosVariant0IbsCbsVariant0Cbs extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("aliquota_diferimento", "valor_devolvido");
 public EmitterIssueNfcomPayloadImpostosVariant0IbsCbsVariant0Cbs() { super(FIELDS); }
 public EmitterIssueNfcomPayloadImpostosVariant0IbsCbsVariant0Cbs(JsonNode node) { super(node, FIELDS); }
 public EmitterIssueNfcomPayloadImpostosVariant0IbsCbsVariant0CbsAliquotaDiferimento getAliquotaDiferimento() { return (field("aliquota_diferimento")).isNull() || (field("aliquota_diferimento")).isMissingNode() ? null : new EmitterIssueNfcomPayloadImpostosVariant0IbsCbsVariant0CbsAliquotaDiferimento(field("aliquota_diferimento")); }
 public EmitterIssueNfcomPayloadImpostosVariant0IbsCbsVariant0Cbs setAliquotaDiferimento(EmitterIssueNfcomPayloadImpostosVariant0IbsCbsVariant0CbsAliquotaDiferimento value) { put("aliquota_diferimento", value == null ? null : value.toJson()); return this; }
 public EmitterIssueNfcomPayloadImpostosVariant0IbsCbsVariant0CbsValorDevolvido getValorDevolvido() { return (field("valor_devolvido")).isNull() || (field("valor_devolvido")).isMissingNode() ? null : new EmitterIssueNfcomPayloadImpostosVariant0IbsCbsVariant0CbsValorDevolvido(field("valor_devolvido")); }
 public EmitterIssueNfcomPayloadImpostosVariant0IbsCbsVariant0Cbs setValorDevolvido(EmitterIssueNfcomPayloadImpostosVariant0IbsCbsVariant0CbsValorDevolvido value) { put("valor_devolvido", value == null ? null : value.toJson()); return this; }
}
