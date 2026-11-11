package com.webmania.sdk.model.api2nfcomissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfcom-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueNfcomPayloadPgtoVincVariant0PagamentosItem extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("cnpj_base_psp", "cnpj_receb", "id_transacao", "n_pag", "tp_meio_pgto");
 public EmitterIssueNfcomPayloadPgtoVincVariant0PagamentosItem() { super(FIELDS); }
 public EmitterIssueNfcomPayloadPgtoVincVariant0PagamentosItem(JsonNode node) { super(node, FIELDS); }
 public String getCnpjBasePsp() { return stringValue(field("cnpj_base_psp")); }
 public EmitterIssueNfcomPayloadPgtoVincVariant0PagamentosItem setCnpjBasePsp(String value) { put("cnpj_base_psp", Json.scalar(value)); return this; }
 public String getCnpjReceb() { return stringValue(field("cnpj_receb")); }
 public EmitterIssueNfcomPayloadPgtoVincVariant0PagamentosItem setCnpjReceb(String value) { put("cnpj_receb", Json.scalar(value)); return this; }
 public String getIdTransacao() { return stringValue(field("id_transacao")); }
 public EmitterIssueNfcomPayloadPgtoVincVariant0PagamentosItem setIdTransacao(String value) { put("id_transacao", Json.scalar(value)); return this; }
 public EmitterIssueNfcomPayloadPgtoVincVariant0PagamentosItemNPag getNPag() { return (field("n_pag")).isNull() || (field("n_pag")).isMissingNode() ? null : new EmitterIssueNfcomPayloadPgtoVincVariant0PagamentosItemNPag(field("n_pag")); }
 public EmitterIssueNfcomPayloadPgtoVincVariant0PagamentosItem setNPag(EmitterIssueNfcomPayloadPgtoVincVariant0PagamentosItemNPag value) { put("n_pag", value == null ? null : value.toJson()); return this; }
 public String getTpMeioPgto() { return stringValue(field("tp_meio_pgto")); }
 public EmitterIssueNfcomPayloadPgtoVincVariant0PagamentosItem setTpMeioPgto(String value) { put("tp_meio_pgto", Json.scalar(value)); return this; }
}
