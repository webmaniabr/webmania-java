package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G106 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("classificacao", "bc", "aliquota_ibs", "aliquota_cbs");
 public G106() { super(FIELDS); }
 public G106(JsonNode node) { super(node, FIELDS); }
 public String getClassificacao() { return stringValue(field("classificacao")); }
 public G106 setClassificacao(String value) { put("classificacao", Json.scalar(value)); return this; }
 public G106Bc getBc() { return (field("bc")).isNull() || (field("bc")).isMissingNode() ? null : new G106Bc(field("bc")); }
 public G106 setBc(G106Bc value) { put("bc", value == null ? null : value.toJson()); return this; }
 public G106AliquotaIbs getAliquotaIbs() { return (field("aliquota_ibs")).isNull() || (field("aliquota_ibs")).isMissingNode() ? null : new G106AliquotaIbs(field("aliquota_ibs")); }
 public G106 setAliquotaIbs(G106AliquotaIbs value) { put("aliquota_ibs", value == null ? null : value.toJson()); return this; }
 public G106AliquotaCbs getAliquotaCbs() { return (field("aliquota_cbs")).isNull() || (field("aliquota_cbs")).isMissingNode() ? null : new G106AliquotaCbs(field("aliquota_cbs")); }
 public G106 setAliquotaCbs(G106AliquotaCbs value) { put("aliquota_cbs", value == null ? null : value.toJson()); return this; }
}
