package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G012 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("drawback", "reg_exportacao", "nfe_exportacao", "qtd_exportacao");
 public G012() { super(FIELDS); }
 public G012(JsonNode node) { super(node, FIELDS); }
 public String getDrawback() { return stringValue(field("drawback")); }
 public G012 setDrawback(String value) { put("drawback", Json.scalar(value)); return this; }
 public String getRegExportacao() { return stringValue(field("reg_exportacao")); }
 public G012 setRegExportacao(String value) { put("reg_exportacao", Json.scalar(value)); return this; }
 public String getNfeExportacao() { return stringValue(field("nfe_exportacao")); }
 public G012 setNfeExportacao(String value) { put("nfe_exportacao", Json.scalar(value)); return this; }
 public G012QtdExportacao getQtdExportacao() { return (field("qtd_exportacao")).isNull() || (field("qtd_exportacao")).isMissingNode() ? null : new G012QtdExportacao(field("qtd_exportacao")); }
 public G012 setQtdExportacao(G012QtdExportacao value) { put("qtd_exportacao", value == null ? null : value.toJson()); return this; }
}
