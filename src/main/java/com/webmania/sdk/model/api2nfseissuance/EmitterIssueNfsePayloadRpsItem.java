package com.webmania.sdk.model.api2nfseissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfse-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueNfsePayloadRpsItem extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("condicao_pagamento", "construcao_civil", "destinatario", "natureza_operacao", "outras_informacoes", "regime_especial_tributacao", "servico", "tomador", "atividade_evento");
 public EmitterIssueNfsePayloadRpsItem() { super(FIELDS); }
 public EmitterIssueNfsePayloadRpsItem(JsonNode node) { super(node, FIELDS); }
 public EmitterIssueNfsePayloadRpsItemCondicaoPagamento getCondicaoPagamento() { return (field("condicao_pagamento")).isNull() || (field("condicao_pagamento")).isMissingNode() ? null : new EmitterIssueNfsePayloadRpsItemCondicaoPagamento(field("condicao_pagamento")); }
 public EmitterIssueNfsePayloadRpsItem setCondicaoPagamento(EmitterIssueNfsePayloadRpsItemCondicaoPagamento value) { put("condicao_pagamento", value == null ? null : value.toJson()); return this; }
 public EmitterIssueNfsePayloadRpsItemConstrucaoCivil getConstrucaoCivil() { return (field("construcao_civil")).isNull() || (field("construcao_civil")).isMissingNode() ? null : new EmitterIssueNfsePayloadRpsItemConstrucaoCivil(field("construcao_civil")); }
 public EmitterIssueNfsePayloadRpsItem setConstrucaoCivil(EmitterIssueNfsePayloadRpsItemConstrucaoCivil value) { put("construcao_civil", value == null ? null : value.toJson()); return this; }
 public EmitterIssueNfsePayloadRpsItemDestinatario getDestinatario() { return (field("destinatario")).isNull() || (field("destinatario")).isMissingNode() ? null : new EmitterIssueNfsePayloadRpsItemDestinatario(field("destinatario")); }
 public EmitterIssueNfsePayloadRpsItem setDestinatario(EmitterIssueNfsePayloadRpsItemDestinatario value) { put("destinatario", value == null ? null : value.toJson()); return this; }
 public JsonValue getNaturezaOperacao() { return (field("natureza_operacao")).isNull() || (field("natureza_operacao")).isMissingNode() ? null : new JsonValue(field("natureza_operacao")); }
 public EmitterIssueNfsePayloadRpsItem setNaturezaOperacao(JsonValue value) { put("natureza_operacao", value == null ? null : value.toJson()); return this; }
 public String getOutrasInformacoes() { return stringValue(field("outras_informacoes")); }
 public EmitterIssueNfsePayloadRpsItem setOutrasInformacoes(String value) { put("outras_informacoes", Json.scalar(value)); return this; }
 public JsonValue getRegimeEspecialTributacao() { return (field("regime_especial_tributacao")).isNull() || (field("regime_especial_tributacao")).isMissingNode() ? null : new JsonValue(field("regime_especial_tributacao")); }
 public EmitterIssueNfsePayloadRpsItem setRegimeEspecialTributacao(JsonValue value) { put("regime_especial_tributacao", value == null ? null : value.toJson()); return this; }
 public EmitterIssueNfsePayloadRpsItemServico getServico() { return (field("servico")).isNull() || (field("servico")).isMissingNode() ? null : new EmitterIssueNfsePayloadRpsItemServico(field("servico")); }
 public EmitterIssueNfsePayloadRpsItem setServico(EmitterIssueNfsePayloadRpsItemServico value) { put("servico", value == null ? null : value.toJson()); return this; }
 public EmitterIssueNfsePayloadRpsItemTomador getTomador() { return (field("tomador")).isNull() || (field("tomador")).isMissingNode() ? null : new EmitterIssueNfsePayloadRpsItemTomador(field("tomador")); }
 public EmitterIssueNfsePayloadRpsItem setTomador(EmitterIssueNfsePayloadRpsItemTomador value) { put("tomador", value == null ? null : value.toJson()); return this; }
 public EmitterIssueNfsePayloadRpsItemAtividadeEvento getAtividadeEvento() { return (field("atividade_evento")).isNull() || (field("atividade_evento")).isMissingNode() ? null : new EmitterIssueNfsePayloadRpsItemAtividadeEvento(field("atividade_evento")); }
 public EmitterIssueNfsePayloadRpsItem setAtividadeEvento(EmitterIssueNfsePayloadRpsItemAtividadeEvento value) { put("atividade_evento", value == null ? null : value.toJson()); return this; }
}
