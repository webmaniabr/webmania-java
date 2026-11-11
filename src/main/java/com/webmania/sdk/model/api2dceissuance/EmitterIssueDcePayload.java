package com.webmania.sdk.model.api2dceissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/dce-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueDcePayload extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("ID", "ambiente", "informacoes_adicionais", "informacoes_adicionais_emitente", "itens", "observacoes", "observacoes_emitente", "origem", "solicitacao", "url_notificacao", "cliente", "emitente", "transporte");
 public EmitterIssueDcePayload() { super(FIELDS); }
 public EmitterIssueDcePayload(JsonNode node) { super(node, FIELDS); }
 public EmitterIssueDcePayloadID getID() { return (field("ID")).isNull() || (field("ID")).isMissingNode() ? null : new EmitterIssueDcePayloadID(field("ID")); }
 public EmitterIssueDcePayload setID(EmitterIssueDcePayloadID value) { put("ID", value == null ? null : value.toJson()); return this; }
 public EmitterIssueDcePayloadAmbiente getAmbiente() { return (field("ambiente")).isNull() || (field("ambiente")).isMissingNode() ? null : new EmitterIssueDcePayloadAmbiente(field("ambiente")); }
 public EmitterIssueDcePayload setAmbiente(EmitterIssueDcePayloadAmbiente value) { put("ambiente", value == null ? null : value.toJson()); return this; }
 public EmitterIssueDcePayloadInformacoesAdicionais getInformacoesAdicionais() { return (field("informacoes_adicionais")).isNull() || (field("informacoes_adicionais")).isMissingNode() ? null : new EmitterIssueDcePayloadInformacoesAdicionais(field("informacoes_adicionais")); }
 public EmitterIssueDcePayload setInformacoesAdicionais(EmitterIssueDcePayloadInformacoesAdicionais value) { put("informacoes_adicionais", value == null ? null : value.toJson()); return this; }
 public EmitterIssueDcePayloadInformacoesAdicionaisEmitente getInformacoesAdicionaisEmitente() { return (field("informacoes_adicionais_emitente")).isNull() || (field("informacoes_adicionais_emitente")).isMissingNode() ? null : new EmitterIssueDcePayloadInformacoesAdicionaisEmitente(field("informacoes_adicionais_emitente")); }
 public EmitterIssueDcePayload setInformacoesAdicionaisEmitente(EmitterIssueDcePayloadInformacoesAdicionaisEmitente value) { put("informacoes_adicionais_emitente", value == null ? null : value.toJson()); return this; }
 public java.util.List<EmitterIssueDcePayloadItensItem> getItens() { return list(field("itens"), v -> (v).isNull() || (v).isMissingNode() ? null : new EmitterIssueDcePayloadItensItem(v)); }
 public EmitterIssueDcePayload setItens(java.util.List<EmitterIssueDcePayloadItensItem> value) { put("itens", array(value, v -> v == null ? null : v.toJson())); return this; }
 public EmitterIssueDcePayloadObservacoes getObservacoes() { return (field("observacoes")).isNull() || (field("observacoes")).isMissingNode() ? null : new EmitterIssueDcePayloadObservacoes(field("observacoes")); }
 public EmitterIssueDcePayload setObservacoes(EmitterIssueDcePayloadObservacoes value) { put("observacoes", value == null ? null : value.toJson()); return this; }
 public EmitterIssueDcePayloadObservacoesEmitente getObservacoesEmitente() { return (field("observacoes_emitente")).isNull() || (field("observacoes_emitente")).isMissingNode() ? null : new EmitterIssueDcePayloadObservacoesEmitente(field("observacoes_emitente")); }
 public EmitterIssueDcePayload setObservacoesEmitente(EmitterIssueDcePayloadObservacoesEmitente value) { put("observacoes_emitente", value == null ? null : value.toJson()); return this; }
 public EmitterIssueDcePayloadOrigem getOrigem() { return (field("origem")).isNull() || (field("origem")).isMissingNode() ? null : new EmitterIssueDcePayloadOrigem(field("origem")); }
 public EmitterIssueDcePayload setOrigem(EmitterIssueDcePayloadOrigem value) { put("origem", value == null ? null : value.toJson()); return this; }
 public EmitterIssueDcePayloadSolicitacao getSolicitacao() { return (field("solicitacao")).isNull() || (field("solicitacao")).isMissingNode() ? null : new EmitterIssueDcePayloadSolicitacao(field("solicitacao")); }
 public EmitterIssueDcePayload setSolicitacao(EmitterIssueDcePayloadSolicitacao value) { put("solicitacao", value == null ? null : value.toJson()); return this; }
 public EmitterIssueDcePayloadUrlNotificacao getUrlNotificacao() { return (field("url_notificacao")).isNull() || (field("url_notificacao")).isMissingNode() ? null : new EmitterIssueDcePayloadUrlNotificacao(field("url_notificacao")); }
 public EmitterIssueDcePayload setUrlNotificacao(EmitterIssueDcePayloadUrlNotificacao value) { put("url_notificacao", value == null ? null : value.toJson()); return this; }
 public EmitterIssueDcePayloadCliente getCliente() { return (field("cliente")).isNull() || (field("cliente")).isMissingNode() ? null : new EmitterIssueDcePayloadCliente(field("cliente")); }
 public EmitterIssueDcePayload setCliente(EmitterIssueDcePayloadCliente value) { put("cliente", value == null ? null : value.toJson()); return this; }
 public EmitterIssueDcePayloadEmitente getEmitente() { return (field("emitente")).isNull() || (field("emitente")).isMissingNode() ? null : new EmitterIssueDcePayloadEmitente(field("emitente")); }
 public EmitterIssueDcePayload setEmitente(EmitterIssueDcePayloadEmitente value) { put("emitente", value == null ? null : value.toJson()); return this; }
 public EmitterIssueDcePayloadTransporte getTransporte() { return (field("transporte")).isNull() || (field("transporte")).isMissingNode() ? null : new EmitterIssueDcePayloadTransporte(field("transporte")); }
 public EmitterIssueDcePayload setTransporte(EmitterIssueDcePayloadTransporte value) { put("transporte", value == null ? null : value.toJson()); return this; }
}
