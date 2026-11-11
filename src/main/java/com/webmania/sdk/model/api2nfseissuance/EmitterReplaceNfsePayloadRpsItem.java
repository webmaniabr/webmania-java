package com.webmania.sdk.model.api2nfseissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfse-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterReplaceNfsePayloadRpsItem extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("condicao_pagamento", "construcao_civil", "destinatario", "natureza_operacao", "outras_informacoes", "regime_especial_tributacao", "servico", "tomador");
 public EmitterReplaceNfsePayloadRpsItem() { super(FIELDS); }
 public EmitterReplaceNfsePayloadRpsItem(JsonNode node) { super(node, FIELDS); }
 public EmitterReplaceNfsePayloadRpsItemCondicaoPagamento getCondicaoPagamento() { return (field("condicao_pagamento")).isNull() || (field("condicao_pagamento")).isMissingNode() ? null : new EmitterReplaceNfsePayloadRpsItemCondicaoPagamento(field("condicao_pagamento")); }
 public EmitterReplaceNfsePayloadRpsItem setCondicaoPagamento(EmitterReplaceNfsePayloadRpsItemCondicaoPagamento value) { put("condicao_pagamento", value == null ? null : value.toJson()); return this; }
 public EmitterReplaceNfsePayloadRpsItemConstrucaoCivil getConstrucaoCivil() { return (field("construcao_civil")).isNull() || (field("construcao_civil")).isMissingNode() ? null : new EmitterReplaceNfsePayloadRpsItemConstrucaoCivil(field("construcao_civil")); }
 public EmitterReplaceNfsePayloadRpsItem setConstrucaoCivil(EmitterReplaceNfsePayloadRpsItemConstrucaoCivil value) { put("construcao_civil", value == null ? null : value.toJson()); return this; }
 public EmitterReplaceNfsePayloadRpsItemDestinatario getDestinatario() { return (field("destinatario")).isNull() || (field("destinatario")).isMissingNode() ? null : new EmitterReplaceNfsePayloadRpsItemDestinatario(field("destinatario")); }
 public EmitterReplaceNfsePayloadRpsItem setDestinatario(EmitterReplaceNfsePayloadRpsItemDestinatario value) { put("destinatario", value == null ? null : value.toJson()); return this; }
 public JsonValue getNaturezaOperacao() { return (field("natureza_operacao")).isNull() || (field("natureza_operacao")).isMissingNode() ? null : new JsonValue(field("natureza_operacao")); }
 public EmitterReplaceNfsePayloadRpsItem setNaturezaOperacao(JsonValue value) { put("natureza_operacao", value == null ? null : value.toJson()); return this; }
 public String getOutrasInformacoes() { return stringValue(field("outras_informacoes")); }
 public EmitterReplaceNfsePayloadRpsItem setOutrasInformacoes(String value) { put("outras_informacoes", Json.scalar(value)); return this; }
 public JsonValue getRegimeEspecialTributacao() { return (field("regime_especial_tributacao")).isNull() || (field("regime_especial_tributacao")).isMissingNode() ? null : new JsonValue(field("regime_especial_tributacao")); }
 public EmitterReplaceNfsePayloadRpsItem setRegimeEspecialTributacao(JsonValue value) { put("regime_especial_tributacao", value == null ? null : value.toJson()); return this; }
 public EmitterReplaceNfsePayloadRpsItemServico getServico() { return (field("servico")).isNull() || (field("servico")).isMissingNode() ? null : new EmitterReplaceNfsePayloadRpsItemServico(field("servico")); }
 public EmitterReplaceNfsePayloadRpsItem setServico(EmitterReplaceNfsePayloadRpsItemServico value) { put("servico", value == null ? null : value.toJson()); return this; }
 public EmitterReplaceNfsePayloadRpsItemTomador getTomador() { return (field("tomador")).isNull() || (field("tomador")).isMissingNode() ? null : new EmitterReplaceNfsePayloadRpsItemTomador(field("tomador")); }
 public EmitterReplaceNfsePayloadRpsItem setTomador(EmitterReplaceNfsePayloadRpsItemTomador value) { put("tomador", value == null ? null : value.toJson()); return this; }
}
