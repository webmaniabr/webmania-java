package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G119 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("ndoc_importacao", "ddoc_importacao", "uf_desembaraco", "local_desembaraco", "data_desembaraco", "via_transporte", "intermediacao", "fabricante", "adicao", "seq_adicao", "afrmm");
 public G119() { super(FIELDS); }
 public G119(JsonNode node) { super(node, FIELDS); }
 public String getNdocImportacao() { return stringValue(field("ndoc_importacao")); }
 public G119 setNdocImportacao(String value) { put("ndoc_importacao", Json.scalar(value)); return this; }
 public String getDdocImportacao() { return stringValue(field("ddoc_importacao")); }
 public G119 setDdocImportacao(String value) { put("ddoc_importacao", Json.scalar(value)); return this; }
 public String getUfDesembaraco() { return stringValue(field("uf_desembaraco")); }
 public G119 setUfDesembaraco(String value) { put("uf_desembaraco", Json.scalar(value)); return this; }
 public String getLocalDesembaraco() { return stringValue(field("local_desembaraco")); }
 public G119 setLocalDesembaraco(String value) { put("local_desembaraco", Json.scalar(value)); return this; }
 public String getDataDesembaraco() { return stringValue(field("data_desembaraco")); }
 public G119 setDataDesembaraco(String value) { put("data_desembaraco", Json.scalar(value)); return this; }
 public String getViaTransporte() { return stringValue(field("via_transporte")); }
 public G119 setViaTransporte(String value) { put("via_transporte", Json.scalar(value)); return this; }
 public String getIntermediacao() { return stringValue(field("intermediacao")); }
 public G119 setIntermediacao(String value) { put("intermediacao", Json.scalar(value)); return this; }
 public String getFabricante() { return stringValue(field("fabricante")); }
 public G119 setFabricante(String value) { put("fabricante", Json.scalar(value)); return this; }
 public String getAdicao() { return stringValue(field("adicao")); }
 public G119 setAdicao(String value) { put("adicao", Json.scalar(value)); return this; }
 public String getSeqAdicao() { return stringValue(field("seq_adicao")); }
 public G119 setSeqAdicao(String value) { put("seq_adicao", Json.scalar(value)); return this; }
 public String getAfrmm() { return stringValue(field("afrmm")); }
 public G119 setAfrmm(String value) { put("afrmm", Json.scalar(value)); return this; }
}
