package com.webmania.sdk.model.api2cteissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/cte-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueCtePayload extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("aereo", "alteracao_tomador", "ambiente", "aquaviario", "caracteristica_servico", "caracteristica_transporte", "carga", "cobranca", "contribuicao_tomador", "cte_referenciado", "data_emissao", "destinatario", "detalhes_retirada", "documentos_anteriores", "documentos_fiscais", "dutoviario", "entrega", "expedidor", "ferroviario", "finalidade", "globalizado", "impostos", "indicador_tomador", "informacao_globalizado", "local_inicio_prestacao", "local_termino_prestacao", "modalidade", "modelo", "multimodal", "natureza_operacao", "observacoes_contribuinte", "observacoes_fisco", "observacoes_gerais", "origem", "pagamentos_vinculados", "recebedor", "remetente", "rodoviario", "servico", "tomador", "veiculos_novos", "url_notificacao", "nfe_xml");
 public EmitterIssueCtePayload() { super(FIELDS); }
 public EmitterIssueCtePayload(JsonNode node) { super(node, FIELDS); }
 public EmitterIssueCtePayloadAereo getAereo() { return (field("aereo")).isNull() || (field("aereo")).isMissingNode() ? null : new EmitterIssueCtePayloadAereo(field("aereo")); }
 public EmitterIssueCtePayload setAereo(EmitterIssueCtePayloadAereo value) { put("aereo", value == null ? null : value.toJson()); return this; }
 public EmitterIssueCtePayloadAlteracaoTomador getAlteracaoTomador() { return (field("alteracao_tomador")).isNull() || (field("alteracao_tomador")).isMissingNode() ? null : new EmitterIssueCtePayloadAlteracaoTomador(field("alteracao_tomador")); }
 public EmitterIssueCtePayload setAlteracaoTomador(EmitterIssueCtePayloadAlteracaoTomador value) { put("alteracao_tomador", value == null ? null : value.toJson()); return this; }
 public EmitterIssueCtePayloadAmbiente getAmbiente() { return (field("ambiente")).isNull() || (field("ambiente")).isMissingNode() ? null : new EmitterIssueCtePayloadAmbiente(field("ambiente")); }
 public EmitterIssueCtePayload setAmbiente(EmitterIssueCtePayloadAmbiente value) { put("ambiente", value == null ? null : value.toJson()); return this; }
 public EmitterIssueCtePayloadAquaviario getAquaviario() { return (field("aquaviario")).isNull() || (field("aquaviario")).isMissingNode() ? null : new EmitterIssueCtePayloadAquaviario(field("aquaviario")); }
 public EmitterIssueCtePayload setAquaviario(EmitterIssueCtePayloadAquaviario value) { put("aquaviario", value == null ? null : value.toJson()); return this; }
 public String getCaracteristicaServico() { return stringValue(field("caracteristica_servico")); }
 public EmitterIssueCtePayload setCaracteristicaServico(String value) { put("caracteristica_servico", Json.scalar(value)); return this; }
 public String getCaracteristicaTransporte() { return stringValue(field("caracteristica_transporte")); }
 public EmitterIssueCtePayload setCaracteristicaTransporte(String value) { put("caracteristica_transporte", Json.scalar(value)); return this; }
 public EmitterIssueCtePayloadCarga getCarga() { return (field("carga")).isNull() || (field("carga")).isMissingNode() ? null : new EmitterIssueCtePayloadCarga(field("carga")); }
 public EmitterIssueCtePayload setCarga(EmitterIssueCtePayloadCarga value) { put("carga", value == null ? null : value.toJson()); return this; }
 public EmitterIssueCtePayloadCobranca getCobranca() { return (field("cobranca")).isNull() || (field("cobranca")).isMissingNode() ? null : new EmitterIssueCtePayloadCobranca(field("cobranca")); }
 public EmitterIssueCtePayload setCobranca(EmitterIssueCtePayloadCobranca value) { put("cobranca", value == null ? null : value.toJson()); return this; }
 public EmitterIssueCtePayloadContribuicaoTomador getContribuicaoTomador() { return (field("contribuicao_tomador")).isNull() || (field("contribuicao_tomador")).isMissingNode() ? null : new EmitterIssueCtePayloadContribuicaoTomador(field("contribuicao_tomador")); }
 public EmitterIssueCtePayload setContribuicaoTomador(EmitterIssueCtePayloadContribuicaoTomador value) { put("contribuicao_tomador", value == null ? null : value.toJson()); return this; }
 public String getCteReferenciado() { return stringValue(field("cte_referenciado")); }
 public EmitterIssueCtePayload setCteReferenciado(String value) { put("cte_referenciado", Json.scalar(value)); return this; }
 public EmitterIssueCtePayloadDataEmissao getDataEmissao() { return (field("data_emissao")).isNull() || (field("data_emissao")).isMissingNode() ? null : new EmitterIssueCtePayloadDataEmissao(field("data_emissao")); }
 public EmitterIssueCtePayload setDataEmissao(EmitterIssueCtePayloadDataEmissao value) { put("data_emissao", value == null ? null : value.toJson()); return this; }
 public EmitterIssueCtePayloadDestinatario getDestinatario() { return (field("destinatario")).isNull() || (field("destinatario")).isMissingNode() ? null : new EmitterIssueCtePayloadDestinatario(field("destinatario")); }
 public EmitterIssueCtePayload setDestinatario(EmitterIssueCtePayloadDestinatario value) { put("destinatario", value == null ? null : value.toJson()); return this; }
 public String getDetalhesRetirada() { return stringValue(field("detalhes_retirada")); }
 public EmitterIssueCtePayload setDetalhesRetirada(String value) { put("detalhes_retirada", Json.scalar(value)); return this; }
 public java.util.List<EmitterIssueCtePayloadDocumentosAnterioresItem> getDocumentosAnteriores() { return list(field("documentos_anteriores"), v -> (v).isNull() || (v).isMissingNode() ? null : new EmitterIssueCtePayloadDocumentosAnterioresItem(v)); }
 public EmitterIssueCtePayload setDocumentosAnteriores(java.util.List<EmitterIssueCtePayloadDocumentosAnterioresItem> value) { put("documentos_anteriores", array(value, v -> v == null ? null : v.toJson())); return this; }
 public java.util.List<EmitterIssueCtePayloadDocumentosFiscaisItem> getDocumentosFiscais() { return list(field("documentos_fiscais"), v -> (v).isNull() || (v).isMissingNode() ? null : new EmitterIssueCtePayloadDocumentosFiscaisItem(v)); }
 public EmitterIssueCtePayload setDocumentosFiscais(java.util.List<EmitterIssueCtePayloadDocumentosFiscaisItem> value) { put("documentos_fiscais", array(value, v -> v == null ? null : v.toJson())); return this; }
 public EmitterIssueCtePayloadDutoviario getDutoviario() { return (field("dutoviario")).isNull() || (field("dutoviario")).isMissingNode() ? null : new EmitterIssueCtePayloadDutoviario(field("dutoviario")); }
 public EmitterIssueCtePayload setDutoviario(EmitterIssueCtePayloadDutoviario value) { put("dutoviario", value == null ? null : value.toJson()); return this; }
 public EmitterIssueCtePayloadEntrega getEntrega() { return (field("entrega")).isNull() || (field("entrega")).isMissingNode() ? null : new EmitterIssueCtePayloadEntrega(field("entrega")); }
 public EmitterIssueCtePayload setEntrega(EmitterIssueCtePayloadEntrega value) { put("entrega", value == null ? null : value.toJson()); return this; }
 public EmitterIssueCtePayloadExpedidor getExpedidor() { return (field("expedidor")).isNull() || (field("expedidor")).isMissingNode() ? null : new EmitterIssueCtePayloadExpedidor(field("expedidor")); }
 public EmitterIssueCtePayload setExpedidor(EmitterIssueCtePayloadExpedidor value) { put("expedidor", value == null ? null : value.toJson()); return this; }
 public EmitterIssueCtePayloadFerroviario getFerroviario() { return (field("ferroviario")).isNull() || (field("ferroviario")).isMissingNode() ? null : new EmitterIssueCtePayloadFerroviario(field("ferroviario")); }
 public EmitterIssueCtePayload setFerroviario(EmitterIssueCtePayloadFerroviario value) { put("ferroviario", value == null ? null : value.toJson()); return this; }
 public String getFinalidade() { return stringValue(field("finalidade")); }
 public EmitterIssueCtePayload setFinalidade(String value) { put("finalidade", Json.scalar(value)); return this; }
 public EmitterIssueCtePayloadGlobalizado getGlobalizado() { return (field("globalizado")).isNull() || (field("globalizado")).isMissingNode() ? null : new EmitterIssueCtePayloadGlobalizado(field("globalizado")); }
 public EmitterIssueCtePayload setGlobalizado(EmitterIssueCtePayloadGlobalizado value) { put("globalizado", value == null ? null : value.toJson()); return this; }
 public EmitterIssueCtePayloadImpostos getImpostos() { return (field("impostos")).isNull() || (field("impostos")).isMissingNode() ? null : new EmitterIssueCtePayloadImpostos(field("impostos")); }
 public EmitterIssueCtePayload setImpostos(EmitterIssueCtePayloadImpostos value) { put("impostos", value == null ? null : value.toJson()); return this; }
 public EmitterIssueCtePayloadIndicadorTomador getIndicadorTomador() { return (field("indicador_tomador")).isNull() || (field("indicador_tomador")).isMissingNode() ? null : new EmitterIssueCtePayloadIndicadorTomador(field("indicador_tomador")); }
 public EmitterIssueCtePayload setIndicadorTomador(EmitterIssueCtePayloadIndicadorTomador value) { put("indicador_tomador", value == null ? null : value.toJson()); return this; }
 public String getInformacaoGlobalizado() { return stringValue(field("informacao_globalizado")); }
 public EmitterIssueCtePayload setInformacaoGlobalizado(String value) { put("informacao_globalizado", Json.scalar(value)); return this; }
 public EmitterIssueCtePayloadLocalInicioPrestacao getLocalInicioPrestacao() { return (field("local_inicio_prestacao")).isNull() || (field("local_inicio_prestacao")).isMissingNode() ? null : new EmitterIssueCtePayloadLocalInicioPrestacao(field("local_inicio_prestacao")); }
 public EmitterIssueCtePayload setLocalInicioPrestacao(EmitterIssueCtePayloadLocalInicioPrestacao value) { put("local_inicio_prestacao", value == null ? null : value.toJson()); return this; }
 public EmitterIssueCtePayloadLocalTerminoPrestacao getLocalTerminoPrestacao() { return (field("local_termino_prestacao")).isNull() || (field("local_termino_prestacao")).isMissingNode() ? null : new EmitterIssueCtePayloadLocalTerminoPrestacao(field("local_termino_prestacao")); }
 public EmitterIssueCtePayload setLocalTerminoPrestacao(EmitterIssueCtePayloadLocalTerminoPrestacao value) { put("local_termino_prestacao", value == null ? null : value.toJson()); return this; }
 public EmitterIssueCtePayloadModalidade getModalidade() { return (field("modalidade")).isNull() || (field("modalidade")).isMissingNode() ? null : new EmitterIssueCtePayloadModalidade(field("modalidade")); }
 public EmitterIssueCtePayload setModalidade(EmitterIssueCtePayloadModalidade value) { put("modalidade", value == null ? null : value.toJson()); return this; }
 public String getModelo() { return stringValue(field("modelo")); }
 public EmitterIssueCtePayload setModelo(String value) { put("modelo", Json.scalar(value)); return this; }
 public EmitterIssueCtePayloadMultimodal getMultimodal() { return (field("multimodal")).isNull() || (field("multimodal")).isMissingNode() ? null : new EmitterIssueCtePayloadMultimodal(field("multimodal")); }
 public EmitterIssueCtePayload setMultimodal(EmitterIssueCtePayloadMultimodal value) { put("multimodal", value == null ? null : value.toJson()); return this; }
 public String getNaturezaOperacao() { return stringValue(field("natureza_operacao")); }
 public EmitterIssueCtePayload setNaturezaOperacao(String value) { put("natureza_operacao", Json.scalar(value)); return this; }
 public java.util.List<EmitterIssueCtePayloadObservacoesContribuinteItem> getObservacoesContribuinte() { return list(field("observacoes_contribuinte"), v -> (v).isNull() || (v).isMissingNode() ? null : new EmitterIssueCtePayloadObservacoesContribuinteItem(v)); }
 public EmitterIssueCtePayload setObservacoesContribuinte(java.util.List<EmitterIssueCtePayloadObservacoesContribuinteItem> value) { put("observacoes_contribuinte", array(value, v -> v == null ? null : v.toJson())); return this; }
 public java.util.List<EmitterIssueCtePayloadObservacoesFiscoItem> getObservacoesFisco() { return list(field("observacoes_fisco"), v -> (v).isNull() || (v).isMissingNode() ? null : new EmitterIssueCtePayloadObservacoesFiscoItem(v)); }
 public EmitterIssueCtePayload setObservacoesFisco(java.util.List<EmitterIssueCtePayloadObservacoesFiscoItem> value) { put("observacoes_fisco", array(value, v -> v == null ? null : v.toJson())); return this; }
 public String getObservacoesGerais() { return stringValue(field("observacoes_gerais")); }
 public EmitterIssueCtePayload setObservacoesGerais(String value) { put("observacoes_gerais", Json.scalar(value)); return this; }
 public String getOrigem() { return stringValue(field("origem")); }
 public EmitterIssueCtePayload setOrigem(String value) { put("origem", Json.scalar(value)); return this; }
 public java.util.List<EmitterIssueCtePayloadPagamentosVinculadosItem> getPagamentosVinculados() { return list(field("pagamentos_vinculados"), v -> (v).isNull() || (v).isMissingNode() ? null : new EmitterIssueCtePayloadPagamentosVinculadosItem(v)); }
 public EmitterIssueCtePayload setPagamentosVinculados(java.util.List<EmitterIssueCtePayloadPagamentosVinculadosItem> value) { put("pagamentos_vinculados", array(value, v -> v == null ? null : v.toJson())); return this; }
 public EmitterIssueCtePayloadRecebedor getRecebedor() { return (field("recebedor")).isNull() || (field("recebedor")).isMissingNode() ? null : new EmitterIssueCtePayloadRecebedor(field("recebedor")); }
 public EmitterIssueCtePayload setRecebedor(EmitterIssueCtePayloadRecebedor value) { put("recebedor", value == null ? null : value.toJson()); return this; }
 public EmitterIssueCtePayloadRemetente getRemetente() { return (field("remetente")).isNull() || (field("remetente")).isMissingNode() ? null : new EmitterIssueCtePayloadRemetente(field("remetente")); }
 public EmitterIssueCtePayload setRemetente(EmitterIssueCtePayloadRemetente value) { put("remetente", value == null ? null : value.toJson()); return this; }
 public EmitterIssueCtePayloadRodoviario getRodoviario() { return (field("rodoviario")).isNull() || (field("rodoviario")).isMissingNode() ? null : new EmitterIssueCtePayloadRodoviario(field("rodoviario")); }
 public EmitterIssueCtePayload setRodoviario(EmitterIssueCtePayloadRodoviario value) { put("rodoviario", value == null ? null : value.toJson()); return this; }
 public EmitterIssueCtePayloadServico getServico() { return (field("servico")).isNull() || (field("servico")).isMissingNode() ? null : new EmitterIssueCtePayloadServico(field("servico")); }
 public EmitterIssueCtePayload setServico(EmitterIssueCtePayloadServico value) { put("servico", value == null ? null : value.toJson()); return this; }
 public EmitterIssueCtePayloadTomador getTomador() { return (field("tomador")).isNull() || (field("tomador")).isMissingNode() ? null : new EmitterIssueCtePayloadTomador(field("tomador")); }
 public EmitterIssueCtePayload setTomador(EmitterIssueCtePayloadTomador value) { put("tomador", value == null ? null : value.toJson()); return this; }
 public java.util.List<EmitterIssueCtePayloadVeiculosNovosItem> getVeiculosNovos() { return list(field("veiculos_novos"), v -> (v).isNull() || (v).isMissingNode() ? null : new EmitterIssueCtePayloadVeiculosNovosItem(v)); }
 public EmitterIssueCtePayload setVeiculosNovos(java.util.List<EmitterIssueCtePayloadVeiculosNovosItem> value) { put("veiculos_novos", array(value, v -> v == null ? null : v.toJson())); return this; }
 public String getUrlNotificacao() { return stringValue(field("url_notificacao")); }
 public EmitterIssueCtePayload setUrlNotificacao(String value) { put("url_notificacao", Json.scalar(value)); return this; }
 public String getNfeXml() { return stringValue(field("nfe_xml")); }
 public EmitterIssueCtePayload setNfeXml(String value) { put("nfe_xml", Json.scalar(value)); return this; }
}
