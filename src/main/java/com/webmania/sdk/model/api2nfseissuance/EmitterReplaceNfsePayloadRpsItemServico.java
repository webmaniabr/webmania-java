package com.webmania.sdk.model.api2nfseissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfse-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterReplaceNfsePayloadRpsItemServico extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("cidade_local_prestacao", "classe_imposto", "classificacao_tributaria", "cod_indicador_operacao", "codigo_cnae", "codigo_nbs", "codigo_servico", "codigo_tributacao_municipio", "consumidor_final", "deducao_reducao", "deducoes", "desconto_condicionado", "desconto_incondicionado", "discriminacao", "ente_governamental", "exigibilidade_iss", "imovel", "impostos", "indicador_destinatario", "indicador_zfm_alc", "informacoes_complementares", "intermediario", "iss_retido", "municipio_incidencia", "nfses_referenciadas", "numero_processo", "outras_retencoes", "reembolso_repasse", "responsavel_retencao_iss", "uf_local_prestacao", "valor_servicos");
 public EmitterReplaceNfsePayloadRpsItemServico() { super(FIELDS); }
 public EmitterReplaceNfsePayloadRpsItemServico(JsonNode node) { super(node, FIELDS); }
 public String getCidadeLocalPrestacao() { return stringValue(field("cidade_local_prestacao")); }
 public EmitterReplaceNfsePayloadRpsItemServico setCidadeLocalPrestacao(String value) { put("cidade_local_prestacao", Json.scalar(value)); return this; }
 public String getClasseImposto() { return stringValue(field("classe_imposto")); }
 public EmitterReplaceNfsePayloadRpsItemServico setClasseImposto(String value) { put("classe_imposto", Json.scalar(value)); return this; }
 public EmitterReplaceNfsePayloadRpsItemServicoClassificacaoTributaria getClassificacaoTributaria() { return (field("classificacao_tributaria")).isNull() || (field("classificacao_tributaria")).isMissingNode() ? null : new EmitterReplaceNfsePayloadRpsItemServicoClassificacaoTributaria(field("classificacao_tributaria")); }
 public EmitterReplaceNfsePayloadRpsItemServico setClassificacaoTributaria(EmitterReplaceNfsePayloadRpsItemServicoClassificacaoTributaria value) { put("classificacao_tributaria", value == null ? null : value.toJson()); return this; }
 public EmitterReplaceNfsePayloadRpsItemServicoCodIndicadorOperacao getCodIndicadorOperacao() { return (field("cod_indicador_operacao")).isNull() || (field("cod_indicador_operacao")).isMissingNode() ? null : new EmitterReplaceNfsePayloadRpsItemServicoCodIndicadorOperacao(field("cod_indicador_operacao")); }
 public EmitterReplaceNfsePayloadRpsItemServico setCodIndicadorOperacao(EmitterReplaceNfsePayloadRpsItemServicoCodIndicadorOperacao value) { put("cod_indicador_operacao", value == null ? null : value.toJson()); return this; }
 public String getCodigoCnae() { return stringValue(field("codigo_cnae")); }
 public EmitterReplaceNfsePayloadRpsItemServico setCodigoCnae(String value) { put("codigo_cnae", Json.scalar(value)); return this; }
 public String getCodigoNbs() { return stringValue(field("codigo_nbs")); }
 public EmitterReplaceNfsePayloadRpsItemServico setCodigoNbs(String value) { put("codigo_nbs", Json.scalar(value)); return this; }
 public String getCodigoServico() { return stringValue(field("codigo_servico")); }
 public EmitterReplaceNfsePayloadRpsItemServico setCodigoServico(String value) { put("codigo_servico", Json.scalar(value)); return this; }
 public String getCodigoTributacaoMunicipio() { return stringValue(field("codigo_tributacao_municipio")); }
 public EmitterReplaceNfsePayloadRpsItemServico setCodigoTributacaoMunicipio(String value) { put("codigo_tributacao_municipio", Json.scalar(value)); return this; }
 public JsonValue getConsumidorFinal() { return (field("consumidor_final")).isNull() || (field("consumidor_final")).isMissingNode() ? null : new JsonValue(field("consumidor_final")); }
 public EmitterReplaceNfsePayloadRpsItemServico setConsumidorFinal(JsonValue value) { put("consumidor_final", value == null ? null : value.toJson()); return this; }
 public EmitterReplaceNfsePayloadRpsItemServicoDeducaoReducao getDeducaoReducao() { return (field("deducao_reducao")).isNull() || (field("deducao_reducao")).isMissingNode() ? null : new EmitterReplaceNfsePayloadRpsItemServicoDeducaoReducao(field("deducao_reducao")); }
 public EmitterReplaceNfsePayloadRpsItemServico setDeducaoReducao(EmitterReplaceNfsePayloadRpsItemServicoDeducaoReducao value) { put("deducao_reducao", value == null ? null : value.toJson()); return this; }
 public JsonValue getDeducoes() { return (field("deducoes")).isNull() || (field("deducoes")).isMissingNode() ? null : new JsonValue(field("deducoes")); }
 public EmitterReplaceNfsePayloadRpsItemServico setDeducoes(JsonValue value) { put("deducoes", value == null ? null : value.toJson()); return this; }
 public JsonValue getDescontoCondicionado() { return (field("desconto_condicionado")).isNull() || (field("desconto_condicionado")).isMissingNode() ? null : new JsonValue(field("desconto_condicionado")); }
 public EmitterReplaceNfsePayloadRpsItemServico setDescontoCondicionado(JsonValue value) { put("desconto_condicionado", value == null ? null : value.toJson()); return this; }
 public JsonValue getDescontoIncondicionado() { return (field("desconto_incondicionado")).isNull() || (field("desconto_incondicionado")).isMissingNode() ? null : new JsonValue(field("desconto_incondicionado")); }
 public EmitterReplaceNfsePayloadRpsItemServico setDescontoIncondicionado(JsonValue value) { put("desconto_incondicionado", value == null ? null : value.toJson()); return this; }
 public String getDiscriminacao() { return stringValue(field("discriminacao")); }
 public EmitterReplaceNfsePayloadRpsItemServico setDiscriminacao(String value) { put("discriminacao", Json.scalar(value)); return this; }
 public EmitterReplaceNfsePayloadRpsItemServicoEnteGovernamental getEnteGovernamental() { return (field("ente_governamental")).isNull() || (field("ente_governamental")).isMissingNode() ? null : new EmitterReplaceNfsePayloadRpsItemServicoEnteGovernamental(field("ente_governamental")); }
 public EmitterReplaceNfsePayloadRpsItemServico setEnteGovernamental(EmitterReplaceNfsePayloadRpsItemServicoEnteGovernamental value) { put("ente_governamental", value == null ? null : value.toJson()); return this; }
 public JsonValue getExigibilidadeIss() { return (field("exigibilidade_iss")).isNull() || (field("exigibilidade_iss")).isMissingNode() ? null : new JsonValue(field("exigibilidade_iss")); }
 public EmitterReplaceNfsePayloadRpsItemServico setExigibilidadeIss(JsonValue value) { put("exigibilidade_iss", value == null ? null : value.toJson()); return this; }
 public EmitterReplaceNfsePayloadRpsItemServicoImovel getImovel() { return (field("imovel")).isNull() || (field("imovel")).isMissingNode() ? null : new EmitterReplaceNfsePayloadRpsItemServicoImovel(field("imovel")); }
 public EmitterReplaceNfsePayloadRpsItemServico setImovel(EmitterReplaceNfsePayloadRpsItemServicoImovel value) { put("imovel", value == null ? null : value.toJson()); return this; }
 public EmitterReplaceNfsePayloadRpsItemServicoImpostos getImpostos() { return (field("impostos")).isNull() || (field("impostos")).isMissingNode() ? null : new EmitterReplaceNfsePayloadRpsItemServicoImpostos(field("impostos")); }
 public EmitterReplaceNfsePayloadRpsItemServico setImpostos(EmitterReplaceNfsePayloadRpsItemServicoImpostos value) { put("impostos", value == null ? null : value.toJson()); return this; }
 public JsonValue getIndicadorDestinatario() { return (field("indicador_destinatario")).isNull() || (field("indicador_destinatario")).isMissingNode() ? null : new JsonValue(field("indicador_destinatario")); }
 public EmitterReplaceNfsePayloadRpsItemServico setIndicadorDestinatario(JsonValue value) { put("indicador_destinatario", value == null ? null : value.toJson()); return this; }
 public JsonValue getIndicadorZfmAlc() { return (field("indicador_zfm_alc")).isNull() || (field("indicador_zfm_alc")).isMissingNode() ? null : new JsonValue(field("indicador_zfm_alc")); }
 public EmitterReplaceNfsePayloadRpsItemServico setIndicadorZfmAlc(JsonValue value) { put("indicador_zfm_alc", value == null ? null : value.toJson()); return this; }
 public String getInformacoesComplementares() { return stringValue(field("informacoes_complementares")); }
 public EmitterReplaceNfsePayloadRpsItemServico setInformacoesComplementares(String value) { put("informacoes_complementares", Json.scalar(value)); return this; }
 public EmitterReplaceNfsePayloadRpsItemServicoIntermediario getIntermediario() { return (field("intermediario")).isNull() || (field("intermediario")).isMissingNode() ? null : new EmitterReplaceNfsePayloadRpsItemServicoIntermediario(field("intermediario")); }
 public EmitterReplaceNfsePayloadRpsItemServico setIntermediario(EmitterReplaceNfsePayloadRpsItemServicoIntermediario value) { put("intermediario", value == null ? null : value.toJson()); return this; }
 public JsonValue getIssRetido() { return (field("iss_retido")).isNull() || (field("iss_retido")).isMissingNode() ? null : new JsonValue(field("iss_retido")); }
 public EmitterReplaceNfsePayloadRpsItemServico setIssRetido(JsonValue value) { put("iss_retido", value == null ? null : value.toJson()); return this; }
 public String getMunicipioIncidencia() { return stringValue(field("municipio_incidencia")); }
 public EmitterReplaceNfsePayloadRpsItemServico setMunicipioIncidencia(String value) { put("municipio_incidencia", Json.scalar(value)); return this; }
 public java.util.List<String> getNfsesReferenciadas() { return list(field("nfses_referenciadas"), v -> stringValue(v)); }
 public EmitterReplaceNfsePayloadRpsItemServico setNfsesReferenciadas(java.util.List<String> value) { put("nfses_referenciadas", array(value, v -> Json.scalar(v))); return this; }
 public String getNumeroProcesso() { return stringValue(field("numero_processo")); }
 public EmitterReplaceNfsePayloadRpsItemServico setNumeroProcesso(String value) { put("numero_processo", Json.scalar(value)); return this; }
 public JsonValue getOutrasRetencoes() { return (field("outras_retencoes")).isNull() || (field("outras_retencoes")).isMissingNode() ? null : new JsonValue(field("outras_retencoes")); }
 public EmitterReplaceNfsePayloadRpsItemServico setOutrasRetencoes(JsonValue value) { put("outras_retencoes", value == null ? null : value.toJson()); return this; }
 public EmitterReplaceNfsePayloadRpsItemServicoReembolsoRepasse getReembolsoRepasse() { return (field("reembolso_repasse")).isNull() || (field("reembolso_repasse")).isMissingNode() ? null : new EmitterReplaceNfsePayloadRpsItemServicoReembolsoRepasse(field("reembolso_repasse")); }
 public EmitterReplaceNfsePayloadRpsItemServico setReembolsoRepasse(EmitterReplaceNfsePayloadRpsItemServicoReembolsoRepasse value) { put("reembolso_repasse", value == null ? null : value.toJson()); return this; }
 public JsonValue getResponsavelRetencaoIss() { return (field("responsavel_retencao_iss")).isNull() || (field("responsavel_retencao_iss")).isMissingNode() ? null : new JsonValue(field("responsavel_retencao_iss")); }
 public EmitterReplaceNfsePayloadRpsItemServico setResponsavelRetencaoIss(JsonValue value) { put("responsavel_retencao_iss", value == null ? null : value.toJson()); return this; }
 public String getUfLocalPrestacao() { return stringValue(field("uf_local_prestacao")); }
 public EmitterReplaceNfsePayloadRpsItemServico setUfLocalPrestacao(String value) { put("uf_local_prestacao", Json.scalar(value)); return this; }
 public EmitterReplaceNfsePayloadRpsItemServicoValorServicos getValorServicos() { return (field("valor_servicos")).isNull() || (field("valor_servicos")).isMissingNode() ? null : new EmitterReplaceNfsePayloadRpsItemServicoValorServicos(field("valor_servicos")); }
 public EmitterReplaceNfsePayloadRpsItemServico setValorServicos(EmitterReplaceNfsePayloadRpsItemServicoValorServicos value) { put("valor_servicos", value == null ? null : value.toJson()); return this; }
}
