package com.webmania.sdk.model.api2cteissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/cte-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueCtePayloadPagamentosVinculadosItem extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("cnpj_base_psp", "cnpj_recebedor", "id_transacao", "n_pag", "tp_meio_pagamento");
 public EmitterIssueCtePayloadPagamentosVinculadosItem() { super(FIELDS); }
 public EmitterIssueCtePayloadPagamentosVinculadosItem(JsonNode node) { super(node, FIELDS); }
 public String getCnpjBasePsp() { return stringValue(field("cnpj_base_psp")); }
 public EmitterIssueCtePayloadPagamentosVinculadosItem setCnpjBasePsp(String value) { put("cnpj_base_psp", Json.scalar(value)); return this; }
 public String getCnpjRecebedor() { return stringValue(field("cnpj_recebedor")); }
 public EmitterIssueCtePayloadPagamentosVinculadosItem setCnpjRecebedor(String value) { put("cnpj_recebedor", Json.scalar(value)); return this; }
 public String getIdTransacao() { return stringValue(field("id_transacao")); }
 public EmitterIssueCtePayloadPagamentosVinculadosItem setIdTransacao(String value) { put("id_transacao", Json.scalar(value)); return this; }
 public EmitterIssueCtePayloadPagamentosVinculadosItemNPag getNPag() { return (field("n_pag")).isNull() || (field("n_pag")).isMissingNode() ? null : new EmitterIssueCtePayloadPagamentosVinculadosItemNPag(field("n_pag")); }
 public EmitterIssueCtePayloadPagamentosVinculadosItem setNPag(EmitterIssueCtePayloadPagamentosVinculadosItemNPag value) { put("n_pag", value == null ? null : value.toJson()); return this; }
 public String getTpMeioPagamento() { return stringValue(field("tp_meio_pagamento")); }
 public EmitterIssueCtePayloadPagamentosVinculadosItem setTpMeioPagamento(String value) { put("tp_meio_pagamento", Json.scalar(value)); return this; }
}
