package com.webmania.sdk.model.api2nfcomissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfcom-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueNfcomPayload extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("ambiente", "assinante", "autorizar_download", "cliente", "cofaturamento", "consumidor_final", "fatura", "faturamento_centralizado", "finalidade", "impostos", "indicador_cessao_meios_rede", "indicador_nota_entrada", "indicador_pre_pago", "informacoes_complementares", "itens", "municipio_fato_gerador", "natureza_operacao", "origem", "pgto_vinc", "presenca_comprador", "previa_danfecom", "processo_emissao", "substituicao", "tipo_faturamento", "tipo_operacao", "url_notificacao", "ID");
 public EmitterIssueNfcomPayload() { super(FIELDS); }
 public EmitterIssueNfcomPayload(JsonNode node) { super(node, FIELDS); }
 public EmitterIssueNfcomPayloadAmbiente getAmbiente() { return (field("ambiente")).isNull() || (field("ambiente")).isMissingNode() ? null : new EmitterIssueNfcomPayloadAmbiente(field("ambiente")); }
 public EmitterIssueNfcomPayload setAmbiente(EmitterIssueNfcomPayloadAmbiente value) { put("ambiente", value == null ? null : value.toJson()); return this; }
 public EmitterIssueNfcomPayloadAssinante getAssinante() { return (field("assinante")).isNull() || (field("assinante")).isMissingNode() ? null : new EmitterIssueNfcomPayloadAssinante(field("assinante")); }
 public EmitterIssueNfcomPayload setAssinante(EmitterIssueNfcomPayloadAssinante value) { put("assinante", value == null ? null : value.toJson()); return this; }
 public EmitterIssueNfcomPayloadAutorizarDownload getAutorizarDownload() { return (field("autorizar_download")).isNull() || (field("autorizar_download")).isMissingNode() ? null : new EmitterIssueNfcomPayloadAutorizarDownload(field("autorizar_download")); }
 public EmitterIssueNfcomPayload setAutorizarDownload(EmitterIssueNfcomPayloadAutorizarDownload value) { put("autorizar_download", value == null ? null : value.toJson()); return this; }
 public EmitterIssueNfcomPayloadCliente getCliente() { return (field("cliente")).isNull() || (field("cliente")).isMissingNode() ? null : new EmitterIssueNfcomPayloadCliente(field("cliente")); }
 public EmitterIssueNfcomPayload setCliente(EmitterIssueNfcomPayloadCliente value) { put("cliente", value == null ? null : value.toJson()); return this; }
 public EmitterIssueNfcomPayloadCofaturamento getCofaturamento() { return (field("cofaturamento")).isNull() || (field("cofaturamento")).isMissingNode() ? null : new EmitterIssueNfcomPayloadCofaturamento(field("cofaturamento")); }
 public EmitterIssueNfcomPayload setCofaturamento(EmitterIssueNfcomPayloadCofaturamento value) { put("cofaturamento", value == null ? null : value.toJson()); return this; }
 public EmitterIssueNfcomPayloadConsumidorFinal getConsumidorFinal() { return (field("consumidor_final")).isNull() || (field("consumidor_final")).isMissingNode() ? null : new EmitterIssueNfcomPayloadConsumidorFinal(field("consumidor_final")); }
 public EmitterIssueNfcomPayload setConsumidorFinal(EmitterIssueNfcomPayloadConsumidorFinal value) { put("consumidor_final", value == null ? null : value.toJson()); return this; }
 public EmitterIssueNfcomPayloadFatura getFatura() { return (field("fatura")).isNull() || (field("fatura")).isMissingNode() ? null : new EmitterIssueNfcomPayloadFatura(field("fatura")); }
 public EmitterIssueNfcomPayload setFatura(EmitterIssueNfcomPayloadFatura value) { put("fatura", value == null ? null : value.toJson()); return this; }
 public EmitterIssueNfcomPayloadFaturamentoCentralizado getFaturamentoCentralizado() { return (field("faturamento_centralizado")).isNull() || (field("faturamento_centralizado")).isMissingNode() ? null : new EmitterIssueNfcomPayloadFaturamentoCentralizado(field("faturamento_centralizado")); }
 public EmitterIssueNfcomPayload setFaturamentoCentralizado(EmitterIssueNfcomPayloadFaturamentoCentralizado value) { put("faturamento_centralizado", value == null ? null : value.toJson()); return this; }
 public EmitterIssueNfcomPayloadFinalidade getFinalidade() { return (field("finalidade")).isNull() || (field("finalidade")).isMissingNode() ? null : new EmitterIssueNfcomPayloadFinalidade(field("finalidade")); }
 public EmitterIssueNfcomPayload setFinalidade(EmitterIssueNfcomPayloadFinalidade value) { put("finalidade", value == null ? null : value.toJson()); return this; }
 public EmitterIssueNfcomPayloadImpostos getImpostos() { return (field("impostos")).isNull() || (field("impostos")).isMissingNode() ? null : new EmitterIssueNfcomPayloadImpostos(field("impostos")); }
 public EmitterIssueNfcomPayload setImpostos(EmitterIssueNfcomPayloadImpostos value) { put("impostos", value == null ? null : value.toJson()); return this; }
 public EmitterIssueNfcomPayloadIndicadorCessaoMeiosRede getIndicadorCessaoMeiosRede() { return (field("indicador_cessao_meios_rede")).isNull() || (field("indicador_cessao_meios_rede")).isMissingNode() ? null : new EmitterIssueNfcomPayloadIndicadorCessaoMeiosRede(field("indicador_cessao_meios_rede")); }
 public EmitterIssueNfcomPayload setIndicadorCessaoMeiosRede(EmitterIssueNfcomPayloadIndicadorCessaoMeiosRede value) { put("indicador_cessao_meios_rede", value == null ? null : value.toJson()); return this; }
 public EmitterIssueNfcomPayloadIndicadorNotaEntrada getIndicadorNotaEntrada() { return (field("indicador_nota_entrada")).isNull() || (field("indicador_nota_entrada")).isMissingNode() ? null : new EmitterIssueNfcomPayloadIndicadorNotaEntrada(field("indicador_nota_entrada")); }
 public EmitterIssueNfcomPayload setIndicadorNotaEntrada(EmitterIssueNfcomPayloadIndicadorNotaEntrada value) { put("indicador_nota_entrada", value == null ? null : value.toJson()); return this; }
 public EmitterIssueNfcomPayloadIndicadorPrePago getIndicadorPrePago() { return (field("indicador_pre_pago")).isNull() || (field("indicador_pre_pago")).isMissingNode() ? null : new EmitterIssueNfcomPayloadIndicadorPrePago(field("indicador_pre_pago")); }
 public EmitterIssueNfcomPayload setIndicadorPrePago(EmitterIssueNfcomPayloadIndicadorPrePago value) { put("indicador_pre_pago", value == null ? null : value.toJson()); return this; }
 public EmitterIssueNfcomPayloadInformacoesComplementares getInformacoesComplementares() { return (field("informacoes_complementares")).isNull() || (field("informacoes_complementares")).isMissingNode() ? null : new EmitterIssueNfcomPayloadInformacoesComplementares(field("informacoes_complementares")); }
 public EmitterIssueNfcomPayload setInformacoesComplementares(EmitterIssueNfcomPayloadInformacoesComplementares value) { put("informacoes_complementares", value == null ? null : value.toJson()); return this; }
 public java.util.List<NfcomItemGroup> getItens() { return list(field("itens"), v -> (v).isNull() || (v).isMissingNode() ? null : new NfcomItemGroup(v)); }
 public EmitterIssueNfcomPayload setItens(java.util.List<NfcomItemGroup> value) { put("itens", array(value, v -> v == null ? null : v.toJson())); return this; }
 public EmitterIssueNfcomPayloadMunicipioFatoGerador getMunicipioFatoGerador() { return (field("municipio_fato_gerador")).isNull() || (field("municipio_fato_gerador")).isMissingNode() ? null : new EmitterIssueNfcomPayloadMunicipioFatoGerador(field("municipio_fato_gerador")); }
 public EmitterIssueNfcomPayload setMunicipioFatoGerador(EmitterIssueNfcomPayloadMunicipioFatoGerador value) { put("municipio_fato_gerador", value == null ? null : value.toJson()); return this; }
 public String getNaturezaOperacao() { return stringValue(field("natureza_operacao")); }
 public EmitterIssueNfcomPayload setNaturezaOperacao(String value) { put("natureza_operacao", Json.scalar(value)); return this; }
 public EmitterIssueNfcomPayloadOrigem getOrigem() { return (field("origem")).isNull() || (field("origem")).isMissingNode() ? null : new EmitterIssueNfcomPayloadOrigem(field("origem")); }
 public EmitterIssueNfcomPayload setOrigem(EmitterIssueNfcomPayloadOrigem value) { put("origem", value == null ? null : value.toJson()); return this; }
 public EmitterIssueNfcomPayloadPgtoVinc getPgtoVinc() { return (field("pgto_vinc")).isNull() || (field("pgto_vinc")).isMissingNode() ? null : new EmitterIssueNfcomPayloadPgtoVinc(field("pgto_vinc")); }
 public EmitterIssueNfcomPayload setPgtoVinc(EmitterIssueNfcomPayloadPgtoVinc value) { put("pgto_vinc", value == null ? null : value.toJson()); return this; }
 public EmitterIssueNfcomPayloadPresencaComprador getPresencaComprador() { return (field("presenca_comprador")).isNull() || (field("presenca_comprador")).isMissingNode() ? null : new EmitterIssueNfcomPayloadPresencaComprador(field("presenca_comprador")); }
 public EmitterIssueNfcomPayload setPresencaComprador(EmitterIssueNfcomPayloadPresencaComprador value) { put("presenca_comprador", value == null ? null : value.toJson()); return this; }
 public EmitterIssueNfcomPayloadPreviaDanfecom getPreviaDanfecom() { return (field("previa_danfecom")).isNull() || (field("previa_danfecom")).isMissingNode() ? null : new EmitterIssueNfcomPayloadPreviaDanfecom(field("previa_danfecom")); }
 public EmitterIssueNfcomPayload setPreviaDanfecom(EmitterIssueNfcomPayloadPreviaDanfecom value) { put("previa_danfecom", value == null ? null : value.toJson()); return this; }
 public EmitterIssueNfcomPayloadProcessoEmissao getProcessoEmissao() { return (field("processo_emissao")).isNull() || (field("processo_emissao")).isMissingNode() ? null : new EmitterIssueNfcomPayloadProcessoEmissao(field("processo_emissao")); }
 public EmitterIssueNfcomPayload setProcessoEmissao(EmitterIssueNfcomPayloadProcessoEmissao value) { put("processo_emissao", value == null ? null : value.toJson()); return this; }
 public EmitterIssueNfcomPayloadSubstituicao getSubstituicao() { return (field("substituicao")).isNull() || (field("substituicao")).isMissingNode() ? null : new EmitterIssueNfcomPayloadSubstituicao(field("substituicao")); }
 public EmitterIssueNfcomPayload setSubstituicao(EmitterIssueNfcomPayloadSubstituicao value) { put("substituicao", value == null ? null : value.toJson()); return this; }
 public EmitterIssueNfcomPayloadTipoFaturamento getTipoFaturamento() { return (field("tipo_faturamento")).isNull() || (field("tipo_faturamento")).isMissingNode() ? null : new EmitterIssueNfcomPayloadTipoFaturamento(field("tipo_faturamento")); }
 public EmitterIssueNfcomPayload setTipoFaturamento(EmitterIssueNfcomPayloadTipoFaturamento value) { put("tipo_faturamento", value == null ? null : value.toJson()); return this; }
 public EmitterIssueNfcomPayloadTipoOperacao getTipoOperacao() { return (field("tipo_operacao")).isNull() || (field("tipo_operacao")).isMissingNode() ? null : new EmitterIssueNfcomPayloadTipoOperacao(field("tipo_operacao")); }
 public EmitterIssueNfcomPayload setTipoOperacao(EmitterIssueNfcomPayloadTipoOperacao value) { put("tipo_operacao", value == null ? null : value.toJson()); return this; }
 public EmitterIssueNfcomPayloadUrlNotificacao getUrlNotificacao() { return (field("url_notificacao")).isNull() || (field("url_notificacao")).isMissingNode() ? null : new EmitterIssueNfcomPayloadUrlNotificacao(field("url_notificacao")); }
 public EmitterIssueNfcomPayload setUrlNotificacao(EmitterIssueNfcomPayloadUrlNotificacao value) { put("url_notificacao", value == null ? null : value.toJson()); return this; }
 public String getID() { return stringValue(field("ID")); }
 public EmitterIssueNfcomPayload setID(String value) { put("ID", Json.scalar(value)); return this; }
}
