package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class NfcomClassContribution extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("aliquota");
 public NfcomClassContribution() { super(FIELDS); }
 public NfcomClassContribution(JsonNode node) { super(node, FIELDS); }
 public NfcomClassContributionAliquota getAliquota() { return (field("aliquota")).isNull() || (field("aliquota")).isMissingNode() ? null : new NfcomClassContributionAliquota(field("aliquota")); }
 public NfcomClassContribution setAliquota(NfcomClassContributionAliquota value) { put("aliquota", value == null ? null : value.toJson()); return this; }
}
