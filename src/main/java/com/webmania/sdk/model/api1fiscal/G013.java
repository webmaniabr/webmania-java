package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G013 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("subtotal", "total", "ndoc_importacao", "ddoc_importacao", "local_desembaraco", "uf_desembaraco", "data_desembaraco", "via_transporte", "intermediacao", "adicao", "seq_adicao", "fabricante", "desc_di", "afrmm", "cnpj_terceiro", "cpf_terceiro", "uf_terceiro", "cod_exportador", "nfci");
 public G013() { super(FIELDS); }
 public G013(JsonNode node) { super(node, FIELDS); }
 public G013Subtotal getSubtotal() { return (field("subtotal")).isNull() || (field("subtotal")).isMissingNode() ? null : new G013Subtotal(field("subtotal")); }
 public G013 setSubtotal(G013Subtotal value) { put("subtotal", value == null ? null : value.toJson()); return this; }
 public G013Total getTotal() { return (field("total")).isNull() || (field("total")).isMissingNode() ? null : new G013Total(field("total")); }
 public G013 setTotal(G013Total value) { put("total", value == null ? null : value.toJson()); return this; }
 public String getNdocImportacao() { return stringValue(field("ndoc_importacao")); }
 public G013 setNdocImportacao(String value) { put("ndoc_importacao", Json.scalar(value)); return this; }
 public String getDdocImportacao() { return stringValue(field("ddoc_importacao")); }
 public G013 setDdocImportacao(String value) { put("ddoc_importacao", Json.scalar(value)); return this; }
 public String getLocalDesembaraco() { return stringValue(field("local_desembaraco")); }
 public G013 setLocalDesembaraco(String value) { put("local_desembaraco", Json.scalar(value)); return this; }
 public String getUfDesembaraco() { return stringValue(field("uf_desembaraco")); }
 public G013 setUfDesembaraco(String value) { put("uf_desembaraco", Json.scalar(value)); return this; }
 public String getDataDesembaraco() { return stringValue(field("data_desembaraco")); }
 public G013 setDataDesembaraco(String value) { put("data_desembaraco", Json.scalar(value)); return this; }
 public String getViaTransporte() { return stringValue(field("via_transporte")); }
 public G013 setViaTransporte(String value) { put("via_transporte", Json.scalar(value)); return this; }
 public String getIntermediacao() { return stringValue(field("intermediacao")); }
 public G013 setIntermediacao(String value) { put("intermediacao", Json.scalar(value)); return this; }
 public String getAdicao() { return stringValue(field("adicao")); }
 public G013 setAdicao(String value) { put("adicao", Json.scalar(value)); return this; }
 public String getSeqAdicao() { return stringValue(field("seq_adicao")); }
 public G013 setSeqAdicao(String value) { put("seq_adicao", Json.scalar(value)); return this; }
 public String getFabricante() { return stringValue(field("fabricante")); }
 public G013 setFabricante(String value) { put("fabricante", Json.scalar(value)); return this; }
 public G013DescDi getDescDi() { return (field("desc_di")).isNull() || (field("desc_di")).isMissingNode() ? null : new G013DescDi(field("desc_di")); }
 public G013 setDescDi(G013DescDi value) { put("desc_di", value == null ? null : value.toJson()); return this; }
 public G013Afrmm getAfrmm() { return (field("afrmm")).isNull() || (field("afrmm")).isMissingNode() ? null : new G013Afrmm(field("afrmm")); }
 public G013 setAfrmm(G013Afrmm value) { put("afrmm", value == null ? null : value.toJson()); return this; }
 public String getCnpjTerceiro() { return stringValue(field("cnpj_terceiro")); }
 public G013 setCnpjTerceiro(String value) { put("cnpj_terceiro", Json.scalar(value)); return this; }
 public String getCpfTerceiro() { return stringValue(field("cpf_terceiro")); }
 public G013 setCpfTerceiro(String value) { put("cpf_terceiro", Json.scalar(value)); return this; }
 public String getUfTerceiro() { return stringValue(field("uf_terceiro")); }
 public G013 setUfTerceiro(String value) { put("uf_terceiro", Json.scalar(value)); return this; }
 public String getCodExportador() { return stringValue(field("cod_exportador")); }
 public G013 setCodExportador(String value) { put("cod_exportador", Json.scalar(value)); return this; }
 public String getNfci() { return stringValue(field("nfci")); }
 public G013 setNfci(String value) { put("nfci", Json.scalar(value)); return this; }
}
