package com.webmania.sdk.model.api2nfseissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfse-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueNfsePayloadRpsItemServico extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("cfps", "cidade_local_prestacao", "classe_imposto", "classificacao_tributaria", "cod_indicador_operacao", "codigo_cnae", "codigo_interno", "codigo_nbs", "codigo_pais_prestacao", "codigo_servico", "codigo_tributacao_municipio", "consumidor_final", "data_competencia", "deducao_reducao", "deducoes", "desconto_condicionado", "desconto_incondicionado", "discriminacao", "ente_governamental", "exigibilidade_iss", "id_cnae", "imovel", "impostos", "indicador_destinatario", "indicador_zfm_alc", "informacoes_complementares", "intermediario", "iss_retido", "local_incidencia", "municipio_incidencia", "natureza_operacao", "nfses_referenciadas", "numero_processo", "outras_retencoes", "reembolso_repasse", "responsavel_retencao_iss", "situacao_tributaria", "tipo_operacao", "tipo_tributacao", "tributacao", "uf_local_prestacao", "valor_nao_base_calculo", "valor_servicos", "itens", "local_prestacao", "cep_local_prestacao", "justificativa_deducoes", "descricao_impostos", "ie", "regime_recolhimento", "forma_recolhimento", "endereco_local_prestacao", "identificador_beneficio_municipal", "tributacao_iss", "tipo_imunidade", "pis_cofins_retido", "aliquota_tributos_aproximados", "modo_prestacao", "vinculo_prestacao", "tipo_moeda", "valor_servico_moeda", "mecanismo_apoio_comex_prestador", "mecanismo_apoio_comex_tomador", "movimento_temporario_bens", "numero_di", "numero_re", "mdic", "valor_inicial_cobrado", "valor_final_cobrado", "valor_multa", "valor_juros", "valor_ipi", "pagamento_parcelado_antecipado", "ncm", "valor_recebido", "carga_tributaria", "fonte_carga_tributaria", "finalidade", "outras_informacoes", "condicao_pagamento", "destinatario");
 public EmitterIssueNfsePayloadRpsItemServico() { super(FIELDS); }
 public EmitterIssueNfsePayloadRpsItemServico(JsonNode node) { super(node, FIELDS); }
 public JsonValue getCfps() { return (field("cfps")).isNull() || (field("cfps")).isMissingNode() ? null : new JsonValue(field("cfps")); }
 public EmitterIssueNfsePayloadRpsItemServico setCfps(JsonValue value) { put("cfps", value == null ? null : value.toJson()); return this; }
 public String getCidadeLocalPrestacao() { return stringValue(field("cidade_local_prestacao")); }
 public EmitterIssueNfsePayloadRpsItemServico setCidadeLocalPrestacao(String value) { put("cidade_local_prestacao", Json.scalar(value)); return this; }
 public String getClasseImposto() { return stringValue(field("classe_imposto")); }
 public EmitterIssueNfsePayloadRpsItemServico setClasseImposto(String value) { put("classe_imposto", Json.scalar(value)); return this; }
 public EmitterIssueNfsePayloadRpsItemServicoClassificacaoTributaria getClassificacaoTributaria() { return (field("classificacao_tributaria")).isNull() || (field("classificacao_tributaria")).isMissingNode() ? null : new EmitterIssueNfsePayloadRpsItemServicoClassificacaoTributaria(field("classificacao_tributaria")); }
 public EmitterIssueNfsePayloadRpsItemServico setClassificacaoTributaria(EmitterIssueNfsePayloadRpsItemServicoClassificacaoTributaria value) { put("classificacao_tributaria", value == null ? null : value.toJson()); return this; }
 public EmitterIssueNfsePayloadRpsItemServicoCodIndicadorOperacao getCodIndicadorOperacao() { return (field("cod_indicador_operacao")).isNull() || (field("cod_indicador_operacao")).isMissingNode() ? null : new EmitterIssueNfsePayloadRpsItemServicoCodIndicadorOperacao(field("cod_indicador_operacao")); }
 public EmitterIssueNfsePayloadRpsItemServico setCodIndicadorOperacao(EmitterIssueNfsePayloadRpsItemServicoCodIndicadorOperacao value) { put("cod_indicador_operacao", value == null ? null : value.toJson()); return this; }
 public String getCodigoCnae() { return stringValue(field("codigo_cnae")); }
 public EmitterIssueNfsePayloadRpsItemServico setCodigoCnae(String value) { put("codigo_cnae", Json.scalar(value)); return this; }
 public String getCodigoInterno() { return stringValue(field("codigo_interno")); }
 public EmitterIssueNfsePayloadRpsItemServico setCodigoInterno(String value) { put("codigo_interno", Json.scalar(value)); return this; }
 public String getCodigoNbs() { return stringValue(field("codigo_nbs")); }
 public EmitterIssueNfsePayloadRpsItemServico setCodigoNbs(String value) { put("codigo_nbs", Json.scalar(value)); return this; }
 public String getCodigoPaisPrestacao() { return stringValue(field("codigo_pais_prestacao")); }
 public EmitterIssueNfsePayloadRpsItemServico setCodigoPaisPrestacao(String value) { put("codigo_pais_prestacao", Json.scalar(value)); return this; }
 public String getCodigoServico() { return stringValue(field("codigo_servico")); }
 public EmitterIssueNfsePayloadRpsItemServico setCodigoServico(String value) { put("codigo_servico", Json.scalar(value)); return this; }
 public String getCodigoTributacaoMunicipio() { return stringValue(field("codigo_tributacao_municipio")); }
 public EmitterIssueNfsePayloadRpsItemServico setCodigoTributacaoMunicipio(String value) { put("codigo_tributacao_municipio", Json.scalar(value)); return this; }
 public JsonValue getConsumidorFinal() { return (field("consumidor_final")).isNull() || (field("consumidor_final")).isMissingNode() ? null : new JsonValue(field("consumidor_final")); }
 public EmitterIssueNfsePayloadRpsItemServico setConsumidorFinal(JsonValue value) { put("consumidor_final", value == null ? null : value.toJson()); return this; }
 public String getDataCompetencia() { return stringValue(field("data_competencia")); }
 public EmitterIssueNfsePayloadRpsItemServico setDataCompetencia(String value) { put("data_competencia", Json.scalar(value)); return this; }
 public EmitterIssueNfsePayloadRpsItemServicoDeducaoReducao getDeducaoReducao() { return (field("deducao_reducao")).isNull() || (field("deducao_reducao")).isMissingNode() ? null : new EmitterIssueNfsePayloadRpsItemServicoDeducaoReducao(field("deducao_reducao")); }
 public EmitterIssueNfsePayloadRpsItemServico setDeducaoReducao(EmitterIssueNfsePayloadRpsItemServicoDeducaoReducao value) { put("deducao_reducao", value == null ? null : value.toJson()); return this; }
 public JsonValue getDeducoes() { return (field("deducoes")).isNull() || (field("deducoes")).isMissingNode() ? null : new JsonValue(field("deducoes")); }
 public EmitterIssueNfsePayloadRpsItemServico setDeducoes(JsonValue value) { put("deducoes", value == null ? null : value.toJson()); return this; }
 public EmitterIssueNfsePayloadRpsItemServicoDescontoCondicionado getDescontoCondicionado() { return (field("desconto_condicionado")).isNull() || (field("desconto_condicionado")).isMissingNode() ? null : new EmitterIssueNfsePayloadRpsItemServicoDescontoCondicionado(field("desconto_condicionado")); }
 public EmitterIssueNfsePayloadRpsItemServico setDescontoCondicionado(EmitterIssueNfsePayloadRpsItemServicoDescontoCondicionado value) { put("desconto_condicionado", value == null ? null : value.toJson()); return this; }
 public EmitterIssueNfsePayloadRpsItemServicoDescontoIncondicionado getDescontoIncondicionado() { return (field("desconto_incondicionado")).isNull() || (field("desconto_incondicionado")).isMissingNode() ? null : new EmitterIssueNfsePayloadRpsItemServicoDescontoIncondicionado(field("desconto_incondicionado")); }
 public EmitterIssueNfsePayloadRpsItemServico setDescontoIncondicionado(EmitterIssueNfsePayloadRpsItemServicoDescontoIncondicionado value) { put("desconto_incondicionado", value == null ? null : value.toJson()); return this; }
 public String getDiscriminacao() { return stringValue(field("discriminacao")); }
 public EmitterIssueNfsePayloadRpsItemServico setDiscriminacao(String value) { put("discriminacao", Json.scalar(value)); return this; }
 public EmitterIssueNfsePayloadRpsItemServicoEnteGovernamental getEnteGovernamental() { return (field("ente_governamental")).isNull() || (field("ente_governamental")).isMissingNode() ? null : new EmitterIssueNfsePayloadRpsItemServicoEnteGovernamental(field("ente_governamental")); }
 public EmitterIssueNfsePayloadRpsItemServico setEnteGovernamental(EmitterIssueNfsePayloadRpsItemServicoEnteGovernamental value) { put("ente_governamental", value == null ? null : value.toJson()); return this; }
 public JsonValue getExigibilidadeIss() { return (field("exigibilidade_iss")).isNull() || (field("exigibilidade_iss")).isMissingNode() ? null : new JsonValue(field("exigibilidade_iss")); }
 public EmitterIssueNfsePayloadRpsItemServico setExigibilidadeIss(JsonValue value) { put("exigibilidade_iss", value == null ? null : value.toJson()); return this; }
 public String getIdCnae() { return stringValue(field("id_cnae")); }
 public EmitterIssueNfsePayloadRpsItemServico setIdCnae(String value) { put("id_cnae", Json.scalar(value)); return this; }
 public EmitterIssueNfsePayloadRpsItemServicoImovel getImovel() { return (field("imovel")).isNull() || (field("imovel")).isMissingNode() ? null : new EmitterIssueNfsePayloadRpsItemServicoImovel(field("imovel")); }
 public EmitterIssueNfsePayloadRpsItemServico setImovel(EmitterIssueNfsePayloadRpsItemServicoImovel value) { put("imovel", value == null ? null : value.toJson()); return this; }
 public EmitterIssueNfsePayloadRpsItemServicoImpostos getImpostos() { return (field("impostos")).isNull() || (field("impostos")).isMissingNode() ? null : new EmitterIssueNfsePayloadRpsItemServicoImpostos(field("impostos")); }
 public EmitterIssueNfsePayloadRpsItemServico setImpostos(EmitterIssueNfsePayloadRpsItemServicoImpostos value) { put("impostos", value == null ? null : value.toJson()); return this; }
 public JsonValue getIndicadorDestinatario() { return (field("indicador_destinatario")).isNull() || (field("indicador_destinatario")).isMissingNode() ? null : new JsonValue(field("indicador_destinatario")); }
 public EmitterIssueNfsePayloadRpsItemServico setIndicadorDestinatario(JsonValue value) { put("indicador_destinatario", value == null ? null : value.toJson()); return this; }
 public JsonValue getIndicadorZfmAlc() { return (field("indicador_zfm_alc")).isNull() || (field("indicador_zfm_alc")).isMissingNode() ? null : new JsonValue(field("indicador_zfm_alc")); }
 public EmitterIssueNfsePayloadRpsItemServico setIndicadorZfmAlc(JsonValue value) { put("indicador_zfm_alc", value == null ? null : value.toJson()); return this; }
 public String getInformacoesComplementares() { return stringValue(field("informacoes_complementares")); }
 public EmitterIssueNfsePayloadRpsItemServico setInformacoesComplementares(String value) { put("informacoes_complementares", Json.scalar(value)); return this; }
 public EmitterIssueNfsePayloadRpsItemServicoIntermediario getIntermediario() { return (field("intermediario")).isNull() || (field("intermediario")).isMissingNode() ? null : new EmitterIssueNfsePayloadRpsItemServicoIntermediario(field("intermediario")); }
 public EmitterIssueNfsePayloadRpsItemServico setIntermediario(EmitterIssueNfsePayloadRpsItemServicoIntermediario value) { put("intermediario", value == null ? null : value.toJson()); return this; }
 public JsonValue getIssRetido() { return (field("iss_retido")).isNull() || (field("iss_retido")).isMissingNode() ? null : new JsonValue(field("iss_retido")); }
 public EmitterIssueNfsePayloadRpsItemServico setIssRetido(JsonValue value) { put("iss_retido", value == null ? null : value.toJson()); return this; }
 public JsonValue getLocalIncidencia() { return (field("local_incidencia")).isNull() || (field("local_incidencia")).isMissingNode() ? null : new JsonValue(field("local_incidencia")); }
 public EmitterIssueNfsePayloadRpsItemServico setLocalIncidencia(JsonValue value) { put("local_incidencia", value == null ? null : value.toJson()); return this; }
 public String getMunicipioIncidencia() { return stringValue(field("municipio_incidencia")); }
 public EmitterIssueNfsePayloadRpsItemServico setMunicipioIncidencia(String value) { put("municipio_incidencia", Json.scalar(value)); return this; }
 public JsonValue getNaturezaOperacao() { return (field("natureza_operacao")).isNull() || (field("natureza_operacao")).isMissingNode() ? null : new JsonValue(field("natureza_operacao")); }
 public EmitterIssueNfsePayloadRpsItemServico setNaturezaOperacao(JsonValue value) { put("natureza_operacao", value == null ? null : value.toJson()); return this; }
 public java.util.List<String> getNfsesReferenciadas() { return list(field("nfses_referenciadas"), v -> stringValue(v)); }
 public EmitterIssueNfsePayloadRpsItemServico setNfsesReferenciadas(java.util.List<String> value) { put("nfses_referenciadas", array(value, v -> Json.scalar(v))); return this; }
 public String getNumeroProcesso() { return stringValue(field("numero_processo")); }
 public EmitterIssueNfsePayloadRpsItemServico setNumeroProcesso(String value) { put("numero_processo", Json.scalar(value)); return this; }
 public JsonValue getOutrasRetencoes() { return (field("outras_retencoes")).isNull() || (field("outras_retencoes")).isMissingNode() ? null : new JsonValue(field("outras_retencoes")); }
 public EmitterIssueNfsePayloadRpsItemServico setOutrasRetencoes(JsonValue value) { put("outras_retencoes", value == null ? null : value.toJson()); return this; }
 public EmitterIssueNfsePayloadRpsItemServicoReembolsoRepasse getReembolsoRepasse() { return (field("reembolso_repasse")).isNull() || (field("reembolso_repasse")).isMissingNode() ? null : new EmitterIssueNfsePayloadRpsItemServicoReembolsoRepasse(field("reembolso_repasse")); }
 public EmitterIssueNfsePayloadRpsItemServico setReembolsoRepasse(EmitterIssueNfsePayloadRpsItemServicoReembolsoRepasse value) { put("reembolso_repasse", value == null ? null : value.toJson()); return this; }
 public JsonValue getResponsavelRetencaoIss() { return (field("responsavel_retencao_iss")).isNull() || (field("responsavel_retencao_iss")).isMissingNode() ? null : new JsonValue(field("responsavel_retencao_iss")); }
 public EmitterIssueNfsePayloadRpsItemServico setResponsavelRetencaoIss(JsonValue value) { put("responsavel_retencao_iss", value == null ? null : value.toJson()); return this; }
 public JsonValue getSituacaoTributaria() { return (field("situacao_tributaria")).isNull() || (field("situacao_tributaria")).isMissingNode() ? null : new JsonValue(field("situacao_tributaria")); }
 public EmitterIssueNfsePayloadRpsItemServico setSituacaoTributaria(JsonValue value) { put("situacao_tributaria", value == null ? null : value.toJson()); return this; }
 public String getTipoOperacao() { return stringValue(field("tipo_operacao")); }
 public EmitterIssueNfsePayloadRpsItemServico setTipoOperacao(String value) { put("tipo_operacao", Json.scalar(value)); return this; }
 public String getTipoTributacao() { return stringValue(field("tipo_tributacao")); }
 public EmitterIssueNfsePayloadRpsItemServico setTipoTributacao(String value) { put("tipo_tributacao", Json.scalar(value)); return this; }
 public JsonValue getTributacao() { return (field("tributacao")).isNull() || (field("tributacao")).isMissingNode() ? null : new JsonValue(field("tributacao")); }
 public EmitterIssueNfsePayloadRpsItemServico setTributacao(JsonValue value) { put("tributacao", value == null ? null : value.toJson()); return this; }
 public String getUfLocalPrestacao() { return stringValue(field("uf_local_prestacao")); }
 public EmitterIssueNfsePayloadRpsItemServico setUfLocalPrestacao(String value) { put("uf_local_prestacao", Json.scalar(value)); return this; }
 public EmitterIssueNfsePayloadRpsItemServicoValorNaoBaseCalculo getValorNaoBaseCalculo() { return (field("valor_nao_base_calculo")).isNull() || (field("valor_nao_base_calculo")).isMissingNode() ? null : new EmitterIssueNfsePayloadRpsItemServicoValorNaoBaseCalculo(field("valor_nao_base_calculo")); }
 public EmitterIssueNfsePayloadRpsItemServico setValorNaoBaseCalculo(EmitterIssueNfsePayloadRpsItemServicoValorNaoBaseCalculo value) { put("valor_nao_base_calculo", value == null ? null : value.toJson()); return this; }
 public EmitterIssueNfsePayloadRpsItemServicoValorServicos getValorServicos() { return (field("valor_servicos")).isNull() || (field("valor_servicos")).isMissingNode() ? null : new EmitterIssueNfsePayloadRpsItemServicoValorServicos(field("valor_servicos")); }
 public EmitterIssueNfsePayloadRpsItemServico setValorServicos(EmitterIssueNfsePayloadRpsItemServicoValorServicos value) { put("valor_servicos", value == null ? null : value.toJson()); return this; }
 public java.util.List<EmitterIssueNfsePayloadRpsItemServicoItensItem> getItens() { return list(field("itens"), v -> (v).isNull() || (v).isMissingNode() ? null : new EmitterIssueNfsePayloadRpsItemServicoItensItem(v)); }
 public EmitterIssueNfsePayloadRpsItemServico setItens(java.util.List<EmitterIssueNfsePayloadRpsItemServicoItensItem> value) { put("itens", array(value, v -> v == null ? null : v.toJson())); return this; }
 public String getLocalPrestacao() { return stringValue(field("local_prestacao")); }
 public EmitterIssueNfsePayloadRpsItemServico setLocalPrestacao(String value) { put("local_prestacao", Json.scalar(value)); return this; }
 public String getCepLocalPrestacao() { return stringValue(field("cep_local_prestacao")); }
 public EmitterIssueNfsePayloadRpsItemServico setCepLocalPrestacao(String value) { put("cep_local_prestacao", Json.scalar(value)); return this; }
 public String getJustificativaDeducoes() { return stringValue(field("justificativa_deducoes")); }
 public EmitterIssueNfsePayloadRpsItemServico setJustificativaDeducoes(String value) { put("justificativa_deducoes", Json.scalar(value)); return this; }
 public String getDescricaoImpostos() { return stringValue(field("descricao_impostos")); }
 public EmitterIssueNfsePayloadRpsItemServico setDescricaoImpostos(String value) { put("descricao_impostos", Json.scalar(value)); return this; }
 public String getIe() { return stringValue(field("ie")); }
 public EmitterIssueNfsePayloadRpsItemServico setIe(String value) { put("ie", Json.scalar(value)); return this; }
 public String getRegimeRecolhimento() { return stringValue(field("regime_recolhimento")); }
 public EmitterIssueNfsePayloadRpsItemServico setRegimeRecolhimento(String value) { put("regime_recolhimento", Json.scalar(value)); return this; }
 public String getFormaRecolhimento() { return stringValue(field("forma_recolhimento")); }
 public EmitterIssueNfsePayloadRpsItemServico setFormaRecolhimento(String value) { put("forma_recolhimento", Json.scalar(value)); return this; }
 public String getEnderecoLocalPrestacao() { return stringValue(field("endereco_local_prestacao")); }
 public EmitterIssueNfsePayloadRpsItemServico setEnderecoLocalPrestacao(String value) { put("endereco_local_prestacao", Json.scalar(value)); return this; }
 public String getIdentificadorBeneficioMunicipal() { return stringValue(field("identificador_beneficio_municipal")); }
 public EmitterIssueNfsePayloadRpsItemServico setIdentificadorBeneficioMunicipal(String value) { put("identificador_beneficio_municipal", Json.scalar(value)); return this; }
 public EmitterIssueNfsePayloadRpsItemServicoTributacaoIss getTributacaoIss() { return (field("tributacao_iss")).isNull() || (field("tributacao_iss")).isMissingNode() ? null : new EmitterIssueNfsePayloadRpsItemServicoTributacaoIss(field("tributacao_iss")); }
 public EmitterIssueNfsePayloadRpsItemServico setTributacaoIss(EmitterIssueNfsePayloadRpsItemServicoTributacaoIss value) { put("tributacao_iss", value == null ? null : value.toJson()); return this; }
 public EmitterIssueNfsePayloadRpsItemServicoTipoImunidade getTipoImunidade() { return (field("tipo_imunidade")).isNull() || (field("tipo_imunidade")).isMissingNode() ? null : new EmitterIssueNfsePayloadRpsItemServicoTipoImunidade(field("tipo_imunidade")); }
 public EmitterIssueNfsePayloadRpsItemServico setTipoImunidade(EmitterIssueNfsePayloadRpsItemServicoTipoImunidade value) { put("tipo_imunidade", value == null ? null : value.toJson()); return this; }
 public EmitterIssueNfsePayloadRpsItemServicoPisCofinsRetido getPisCofinsRetido() { return (field("pis_cofins_retido")).isNull() || (field("pis_cofins_retido")).isMissingNode() ? null : new EmitterIssueNfsePayloadRpsItemServicoPisCofinsRetido(field("pis_cofins_retido")); }
 public EmitterIssueNfsePayloadRpsItemServico setPisCofinsRetido(EmitterIssueNfsePayloadRpsItemServicoPisCofinsRetido value) { put("pis_cofins_retido", value == null ? null : value.toJson()); return this; }
 public EmitterIssueNfsePayloadRpsItemServicoAliquotaTributosAproximados getAliquotaTributosAproximados() { return (field("aliquota_tributos_aproximados")).isNull() || (field("aliquota_tributos_aproximados")).isMissingNode() ? null : new EmitterIssueNfsePayloadRpsItemServicoAliquotaTributosAproximados(field("aliquota_tributos_aproximados")); }
 public EmitterIssueNfsePayloadRpsItemServico setAliquotaTributosAproximados(EmitterIssueNfsePayloadRpsItemServicoAliquotaTributosAproximados value) { put("aliquota_tributos_aproximados", value == null ? null : value.toJson()); return this; }
 public EmitterIssueNfsePayloadRpsItemServicoModoPrestacao getModoPrestacao() { return (field("modo_prestacao")).isNull() || (field("modo_prestacao")).isMissingNode() ? null : new EmitterIssueNfsePayloadRpsItemServicoModoPrestacao(field("modo_prestacao")); }
 public EmitterIssueNfsePayloadRpsItemServico setModoPrestacao(EmitterIssueNfsePayloadRpsItemServicoModoPrestacao value) { put("modo_prestacao", value == null ? null : value.toJson()); return this; }
 public EmitterIssueNfsePayloadRpsItemServicoVinculoPrestacao getVinculoPrestacao() { return (field("vinculo_prestacao")).isNull() || (field("vinculo_prestacao")).isMissingNode() ? null : new EmitterIssueNfsePayloadRpsItemServicoVinculoPrestacao(field("vinculo_prestacao")); }
 public EmitterIssueNfsePayloadRpsItemServico setVinculoPrestacao(EmitterIssueNfsePayloadRpsItemServicoVinculoPrestacao value) { put("vinculo_prestacao", value == null ? null : value.toJson()); return this; }
 public String getTipoMoeda() { return stringValue(field("tipo_moeda")); }
 public EmitterIssueNfsePayloadRpsItemServico setTipoMoeda(String value) { put("tipo_moeda", Json.scalar(value)); return this; }
 public EmitterIssueNfsePayloadRpsItemServicoValorServicoMoeda getValorServicoMoeda() { return (field("valor_servico_moeda")).isNull() || (field("valor_servico_moeda")).isMissingNode() ? null : new EmitterIssueNfsePayloadRpsItemServicoValorServicoMoeda(field("valor_servico_moeda")); }
 public EmitterIssueNfsePayloadRpsItemServico setValorServicoMoeda(EmitterIssueNfsePayloadRpsItemServicoValorServicoMoeda value) { put("valor_servico_moeda", value == null ? null : value.toJson()); return this; }
 public String getMecanismoApoioComexPrestador() { return stringValue(field("mecanismo_apoio_comex_prestador")); }
 public EmitterIssueNfsePayloadRpsItemServico setMecanismoApoioComexPrestador(String value) { put("mecanismo_apoio_comex_prestador", Json.scalar(value)); return this; }
 public String getMecanismoApoioComexTomador() { return stringValue(field("mecanismo_apoio_comex_tomador")); }
 public EmitterIssueNfsePayloadRpsItemServico setMecanismoApoioComexTomador(String value) { put("mecanismo_apoio_comex_tomador", Json.scalar(value)); return this; }
 public EmitterIssueNfsePayloadRpsItemServicoMovimentoTemporarioBens getMovimentoTemporarioBens() { return (field("movimento_temporario_bens")).isNull() || (field("movimento_temporario_bens")).isMissingNode() ? null : new EmitterIssueNfsePayloadRpsItemServicoMovimentoTemporarioBens(field("movimento_temporario_bens")); }
 public EmitterIssueNfsePayloadRpsItemServico setMovimentoTemporarioBens(EmitterIssueNfsePayloadRpsItemServicoMovimentoTemporarioBens value) { put("movimento_temporario_bens", value == null ? null : value.toJson()); return this; }
 public String getNumeroDi() { return stringValue(field("numero_di")); }
 public EmitterIssueNfsePayloadRpsItemServico setNumeroDi(String value) { put("numero_di", Json.scalar(value)); return this; }
 public String getNumeroRe() { return stringValue(field("numero_re")); }
 public EmitterIssueNfsePayloadRpsItemServico setNumeroRe(String value) { put("numero_re", Json.scalar(value)); return this; }
 public EmitterIssueNfsePayloadRpsItemServicoMdic getMdic() { return (field("mdic")).isNull() || (field("mdic")).isMissingNode() ? null : new EmitterIssueNfsePayloadRpsItemServicoMdic(field("mdic")); }
 public EmitterIssueNfsePayloadRpsItemServico setMdic(EmitterIssueNfsePayloadRpsItemServicoMdic value) { put("mdic", value == null ? null : value.toJson()); return this; }
 public String getValorInicialCobrado() { return stringValue(field("valor_inicial_cobrado")); }
 public EmitterIssueNfsePayloadRpsItemServico setValorInicialCobrado(String value) { put("valor_inicial_cobrado", Json.scalar(value)); return this; }
 public String getValorFinalCobrado() { return stringValue(field("valor_final_cobrado")); }
 public EmitterIssueNfsePayloadRpsItemServico setValorFinalCobrado(String value) { put("valor_final_cobrado", Json.scalar(value)); return this; }
 public String getValorMulta() { return stringValue(field("valor_multa")); }
 public EmitterIssueNfsePayloadRpsItemServico setValorMulta(String value) { put("valor_multa", Json.scalar(value)); return this; }
 public String getValorJuros() { return stringValue(field("valor_juros")); }
 public EmitterIssueNfsePayloadRpsItemServico setValorJuros(String value) { put("valor_juros", Json.scalar(value)); return this; }
 public String getValorIpi() { return stringValue(field("valor_ipi")); }
 public EmitterIssueNfsePayloadRpsItemServico setValorIpi(String value) { put("valor_ipi", Json.scalar(value)); return this; }
 public EmitterIssueNfsePayloadRpsItemServicoPagamentoParceladoAntecipado getPagamentoParceladoAntecipado() { return (field("pagamento_parcelado_antecipado")).isNull() || (field("pagamento_parcelado_antecipado")).isMissingNode() ? null : new EmitterIssueNfsePayloadRpsItemServicoPagamentoParceladoAntecipado(field("pagamento_parcelado_antecipado")); }
 public EmitterIssueNfsePayloadRpsItemServico setPagamentoParceladoAntecipado(EmitterIssueNfsePayloadRpsItemServicoPagamentoParceladoAntecipado value) { put("pagamento_parcelado_antecipado", value == null ? null : value.toJson()); return this; }
 public String getNcm() { return stringValue(field("ncm")); }
 public EmitterIssueNfsePayloadRpsItemServico setNcm(String value) { put("ncm", Json.scalar(value)); return this; }
 public String getValorRecebido() { return stringValue(field("valor_recebido")); }
 public EmitterIssueNfsePayloadRpsItemServico setValorRecebido(String value) { put("valor_recebido", Json.scalar(value)); return this; }
 public String getCargaTributaria() { return stringValue(field("carga_tributaria")); }
 public EmitterIssueNfsePayloadRpsItemServico setCargaTributaria(String value) { put("carga_tributaria", Json.scalar(value)); return this; }
 public String getFonteCargaTributaria() { return stringValue(field("fonte_carga_tributaria")); }
 public EmitterIssueNfsePayloadRpsItemServico setFonteCargaTributaria(String value) { put("fonte_carga_tributaria", Json.scalar(value)); return this; }
 public EmitterIssueNfsePayloadRpsItemServicoFinalidade getFinalidade() { return (field("finalidade")).isNull() || (field("finalidade")).isMissingNode() ? null : new EmitterIssueNfsePayloadRpsItemServicoFinalidade(field("finalidade")); }
 public EmitterIssueNfsePayloadRpsItemServico setFinalidade(EmitterIssueNfsePayloadRpsItemServicoFinalidade value) { put("finalidade", value == null ? null : value.toJson()); return this; }
 public String getOutrasInformacoes() { return stringValue(field("outras_informacoes")); }
 public EmitterIssueNfsePayloadRpsItemServico setOutrasInformacoes(String value) { put("outras_informacoes", Json.scalar(value)); return this; }
 public EmitterIssueNfsePayloadRpsItemServicoCondicaoPagamento getCondicaoPagamento() { return (field("condicao_pagamento")).isNull() || (field("condicao_pagamento")).isMissingNode() ? null : new EmitterIssueNfsePayloadRpsItemServicoCondicaoPagamento(field("condicao_pagamento")); }
 public EmitterIssueNfsePayloadRpsItemServico setCondicaoPagamento(EmitterIssueNfsePayloadRpsItemServicoCondicaoPagamento value) { put("condicao_pagamento", value == null ? null : value.toJson()); return this; }
 public EmitterIssueNfsePayloadRpsItemServicoDestinatario getDestinatario() { return (field("destinatario")).isNull() || (field("destinatario")).isMissingNode() ? null : new EmitterIssueNfsePayloadRpsItemServicoDestinatario(field("destinatario")); }
 public EmitterIssueNfsePayloadRpsItemServico setDestinatario(EmitterIssueNfsePayloadRpsItemServicoDestinatario value) { put("destinatario", value == null ? null : value.toJson()); return this; }
}
