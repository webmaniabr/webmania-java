package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G005 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("nfe_referenciada", "cte_referenciada", "ecf_referenciada", "nf_rural_referenciada");
 public G005() { super(FIELDS); }
 public G005(JsonNode node) { super(node, FIELDS); }
 public G005NfeReferenciada getNfeReferenciada() { return (field("nfe_referenciada")).isNull() || (field("nfe_referenciada")).isMissingNode() ? null : new G005NfeReferenciada(field("nfe_referenciada")); }
 public G005 setNfeReferenciada(G005NfeReferenciada value) { put("nfe_referenciada", value == null ? null : value.toJson()); return this; }
 public G005CteReferenciada getCteReferenciada() { return (field("cte_referenciada")).isNull() || (field("cte_referenciada")).isMissingNode() ? null : new G005CteReferenciada(field("cte_referenciada")); }
 public G005 setCteReferenciada(G005CteReferenciada value) { put("cte_referenciada", value == null ? null : value.toJson()); return this; }
 public G005EcfReferenciada getEcfReferenciada() { return (field("ecf_referenciada")).isNull() || (field("ecf_referenciada")).isMissingNode() ? null : new G005EcfReferenciada(field("ecf_referenciada")); }
 public G005 setEcfReferenciada(G005EcfReferenciada value) { put("ecf_referenciada", value == null ? null : value.toJson()); return this; }
 public G005NfRuralReferenciada getNfRuralReferenciada() { return (field("nf_rural_referenciada")).isNull() || (field("nf_rural_referenciada")).isMissingNode() ? null : new G005NfRuralReferenciada(field("nf_rural_referenciada")); }
 public G005 setNfRuralReferenciada(G005NfRuralReferenciada value) { put("nf_rural_referenciada", value == null ? null : value.toJson()); return this; }
}
