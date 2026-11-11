package com.webmania.sdk.model.api2nfseissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfse-issuance.openapi.json; see contract-provenance.json. */
public final class NfseServiceGroup extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("cfps", "cidade_local_prestacao", "classe_imposto", "classificacao_tributaria", "cod_indicador_operacao", "codigo_cnae", "codigo_interno", "codigo_nbs", "codigo_pais_prestacao", "codigo_servico", "codigo_tributacao_municipio", "consumidor_final", "data_competencia", "deducao_reducao", "deducoes", "desconto_condicionado", "desconto_incondicionado", "discriminacao", "ente_governamental", "exigibilidade_iss", "id_cnae", "imovel", "impostos", "indicador_destinatario", "indicador_zfm_alc", "informacoes_complementares", "intermediario", "iss_retido", "local_incidencia", "municipio_incidencia", "natureza_operacao", "nfses_referenciadas", "numero_processo", "outras_retencoes", "reembolso_repasse", "responsavel_retencao_iss", "situacao_tributaria", "tipo_operacao", "tipo_tributacao", "tributacao", "uf_local_prestacao", "valor_nao_base_calculo", "valor_servicos", "itens", "local_prestacao", "cep_local_prestacao", "justificativa_deducoes", "descricao_impostos", "ie", "regime_recolhimento", "forma_recolhimento", "endereco_local_prestacao", "identificador_beneficio_municipal", "tributacao_iss", "tipo_imunidade", "pis_cofins_retido", "aliquota_tributos_aproximados", "modo_prestacao", "vinculo_prestacao", "tipo_moeda", "valor_servico_moeda", "mecanismo_apoio_comex_prestador", "mecanismo_apoio_comex_tomador", "movimento_temporario_bens", "numero_di", "numero_re", "mdic", "valor_inicial_cobrado", "valor_final_cobrado", "valor_multa", "valor_juros", "valor_ipi", "pagamento_parcelado_antecipado", "ncm", "valor_recebido", "carga_tributaria", "fonte_carga_tributaria", "finalidade", "outras_informacoes", "condicao_pagamento", "destinatario");
 public NfseServiceGroup() { super(FIELDS); }
 public NfseServiceGroup(JsonNode node) { super(node, FIELDS); }
 public JsonValue getCfps() { return (field("cfps")).isNull() || (field("cfps")).isMissingNode() ? null : new JsonValue(field("cfps")); }
 public NfseServiceGroup setCfps(JsonValue value) { put("cfps", value == null ? null : value.toJson()); return this; }
 public String getCidadeLocalPrestacao() { return stringValue(field("cidade_local_prestacao")); }
 public NfseServiceGroup setCidadeLocalPrestacao(String value) { put("cidade_local_prestacao", Json.scalar(value)); return this; }
 public String getClasseImposto() { return stringValue(field("classe_imposto")); }
 public NfseServiceGroup setClasseImposto(String value) { put("classe_imposto", Json.scalar(value)); return this; }
 public NfseServiceGroupClassificacaoTributaria getClassificacaoTributaria() { return (field("classificacao_tributaria")).isNull() || (field("classificacao_tributaria")).isMissingNode() ? null : new NfseServiceGroupClassificacaoTributaria(field("classificacao_tributaria")); }
 public NfseServiceGroup setClassificacaoTributaria(NfseServiceGroupClassificacaoTributaria value) { put("classificacao_tributaria", value == null ? null : value.toJson()); return this; }
 public NfseServiceGroupCodIndicadorOperacao getCodIndicadorOperacao() { return (field("cod_indicador_operacao")).isNull() || (field("cod_indicador_operacao")).isMissingNode() ? null : new NfseServiceGroupCodIndicadorOperacao(field("cod_indicador_operacao")); }
 public NfseServiceGroup setCodIndicadorOperacao(NfseServiceGroupCodIndicadorOperacao value) { put("cod_indicador_operacao", value == null ? null : value.toJson()); return this; }
 public String getCodigoCnae() { return stringValue(field("codigo_cnae")); }
 public NfseServiceGroup setCodigoCnae(String value) { put("codigo_cnae", Json.scalar(value)); return this; }
 public String getCodigoInterno() { return stringValue(field("codigo_interno")); }
 public NfseServiceGroup setCodigoInterno(String value) { put("codigo_interno", Json.scalar(value)); return this; }
 public String getCodigoNbs() { return stringValue(field("codigo_nbs")); }
 public NfseServiceGroup setCodigoNbs(String value) { put("codigo_nbs", Json.scalar(value)); return this; }
 public String getCodigoPaisPrestacao() { return stringValue(field("codigo_pais_prestacao")); }
 public NfseServiceGroup setCodigoPaisPrestacao(String value) { put("codigo_pais_prestacao", Json.scalar(value)); return this; }
 public String getCodigoServico() { return stringValue(field("codigo_servico")); }
 public NfseServiceGroup setCodigoServico(String value) { put("codigo_servico", Json.scalar(value)); return this; }
 public String getCodigoTributacaoMunicipio() { return stringValue(field("codigo_tributacao_municipio")); }
 public NfseServiceGroup setCodigoTributacaoMunicipio(String value) { put("codigo_tributacao_municipio", Json.scalar(value)); return this; }
 public JsonValue getConsumidorFinal() { return (field("consumidor_final")).isNull() || (field("consumidor_final")).isMissingNode() ? null : new JsonValue(field("consumidor_final")); }
 public NfseServiceGroup setConsumidorFinal(JsonValue value) { put("consumidor_final", value == null ? null : value.toJson()); return this; }
 public String getDataCompetencia() { return stringValue(field("data_competencia")); }
 public NfseServiceGroup setDataCompetencia(String value) { put("data_competencia", Json.scalar(value)); return this; }
 public NfseServiceGroupDeducaoReducao getDeducaoReducao() { return (field("deducao_reducao")).isNull() || (field("deducao_reducao")).isMissingNode() ? null : new NfseServiceGroupDeducaoReducao(field("deducao_reducao")); }
 public NfseServiceGroup setDeducaoReducao(NfseServiceGroupDeducaoReducao value) { put("deducao_reducao", value == null ? null : value.toJson()); return this; }
 public JsonValue getDeducoes() { return (field("deducoes")).isNull() || (field("deducoes")).isMissingNode() ? null : new JsonValue(field("deducoes")); }
 public NfseServiceGroup setDeducoes(JsonValue value) { put("deducoes", value == null ? null : value.toJson()); return this; }
 public NfseServiceGroupDescontoCondicionado getDescontoCondicionado() { return (field("desconto_condicionado")).isNull() || (field("desconto_condicionado")).isMissingNode() ? null : new NfseServiceGroupDescontoCondicionado(field("desconto_condicionado")); }
 public NfseServiceGroup setDescontoCondicionado(NfseServiceGroupDescontoCondicionado value) { put("desconto_condicionado", value == null ? null : value.toJson()); return this; }
 public NfseServiceGroupDescontoIncondicionado getDescontoIncondicionado() { return (field("desconto_incondicionado")).isNull() || (field("desconto_incondicionado")).isMissingNode() ? null : new NfseServiceGroupDescontoIncondicionado(field("desconto_incondicionado")); }
 public NfseServiceGroup setDescontoIncondicionado(NfseServiceGroupDescontoIncondicionado value) { put("desconto_incondicionado", value == null ? null : value.toJson()); return this; }
 public String getDiscriminacao() { return stringValue(field("discriminacao")); }
 public NfseServiceGroup setDiscriminacao(String value) { put("discriminacao", Json.scalar(value)); return this; }
 public NfseServiceGroupEnteGovernamental getEnteGovernamental() { return (field("ente_governamental")).isNull() || (field("ente_governamental")).isMissingNode() ? null : new NfseServiceGroupEnteGovernamental(field("ente_governamental")); }
 public NfseServiceGroup setEnteGovernamental(NfseServiceGroupEnteGovernamental value) { put("ente_governamental", value == null ? null : value.toJson()); return this; }
 public JsonValue getExigibilidadeIss() { return (field("exigibilidade_iss")).isNull() || (field("exigibilidade_iss")).isMissingNode() ? null : new JsonValue(field("exigibilidade_iss")); }
 public NfseServiceGroup setExigibilidadeIss(JsonValue value) { put("exigibilidade_iss", value == null ? null : value.toJson()); return this; }
 public String getIdCnae() { return stringValue(field("id_cnae")); }
 public NfseServiceGroup setIdCnae(String value) { put("id_cnae", Json.scalar(value)); return this; }
 public NfseServiceGroupImovel getImovel() { return (field("imovel")).isNull() || (field("imovel")).isMissingNode() ? null : new NfseServiceGroupImovel(field("imovel")); }
 public NfseServiceGroup setImovel(NfseServiceGroupImovel value) { put("imovel", value == null ? null : value.toJson()); return this; }
 public NfseServiceGroupImpostos getImpostos() { return (field("impostos")).isNull() || (field("impostos")).isMissingNode() ? null : new NfseServiceGroupImpostos(field("impostos")); }
 public NfseServiceGroup setImpostos(NfseServiceGroupImpostos value) { put("impostos", value == null ? null : value.toJson()); return this; }
 public JsonValue getIndicadorDestinatario() { return (field("indicador_destinatario")).isNull() || (field("indicador_destinatario")).isMissingNode() ? null : new JsonValue(field("indicador_destinatario")); }
 public NfseServiceGroup setIndicadorDestinatario(JsonValue value) { put("indicador_destinatario", value == null ? null : value.toJson()); return this; }
 public JsonValue getIndicadorZfmAlc() { return (field("indicador_zfm_alc")).isNull() || (field("indicador_zfm_alc")).isMissingNode() ? null : new JsonValue(field("indicador_zfm_alc")); }
 public NfseServiceGroup setIndicadorZfmAlc(JsonValue value) { put("indicador_zfm_alc", value == null ? null : value.toJson()); return this; }
 public String getInformacoesComplementares() { return stringValue(field("informacoes_complementares")); }
 public NfseServiceGroup setInformacoesComplementares(String value) { put("informacoes_complementares", Json.scalar(value)); return this; }
 public NfseServiceGroupIntermediario getIntermediario() { return (field("intermediario")).isNull() || (field("intermediario")).isMissingNode() ? null : new NfseServiceGroupIntermediario(field("intermediario")); }
 public NfseServiceGroup setIntermediario(NfseServiceGroupIntermediario value) { put("intermediario", value == null ? null : value.toJson()); return this; }
 public JsonValue getIssRetido() { return (field("iss_retido")).isNull() || (field("iss_retido")).isMissingNode() ? null : new JsonValue(field("iss_retido")); }
 public NfseServiceGroup setIssRetido(JsonValue value) { put("iss_retido", value == null ? null : value.toJson()); return this; }
 public JsonValue getLocalIncidencia() { return (field("local_incidencia")).isNull() || (field("local_incidencia")).isMissingNode() ? null : new JsonValue(field("local_incidencia")); }
 public NfseServiceGroup setLocalIncidencia(JsonValue value) { put("local_incidencia", value == null ? null : value.toJson()); return this; }
 public String getMunicipioIncidencia() { return stringValue(field("municipio_incidencia")); }
 public NfseServiceGroup setMunicipioIncidencia(String value) { put("municipio_incidencia", Json.scalar(value)); return this; }
 public JsonValue getNaturezaOperacao() { return (field("natureza_operacao")).isNull() || (field("natureza_operacao")).isMissingNode() ? null : new JsonValue(field("natureza_operacao")); }
 public NfseServiceGroup setNaturezaOperacao(JsonValue value) { put("natureza_operacao", value == null ? null : value.toJson()); return this; }
 public java.util.List<String> getNfsesReferenciadas() { return list(field("nfses_referenciadas"), v -> stringValue(v)); }
 public NfseServiceGroup setNfsesReferenciadas(java.util.List<String> value) { put("nfses_referenciadas", array(value, v -> Json.scalar(v))); return this; }
 public String getNumeroProcesso() { return stringValue(field("numero_processo")); }
 public NfseServiceGroup setNumeroProcesso(String value) { put("numero_processo", Json.scalar(value)); return this; }
 public JsonValue getOutrasRetencoes() { return (field("outras_retencoes")).isNull() || (field("outras_retencoes")).isMissingNode() ? null : new JsonValue(field("outras_retencoes")); }
 public NfseServiceGroup setOutrasRetencoes(JsonValue value) { put("outras_retencoes", value == null ? null : value.toJson()); return this; }
 public NfseServiceGroupReembolsoRepasse getReembolsoRepasse() { return (field("reembolso_repasse")).isNull() || (field("reembolso_repasse")).isMissingNode() ? null : new NfseServiceGroupReembolsoRepasse(field("reembolso_repasse")); }
 public NfseServiceGroup setReembolsoRepasse(NfseServiceGroupReembolsoRepasse value) { put("reembolso_repasse", value == null ? null : value.toJson()); return this; }
 public JsonValue getResponsavelRetencaoIss() { return (field("responsavel_retencao_iss")).isNull() || (field("responsavel_retencao_iss")).isMissingNode() ? null : new JsonValue(field("responsavel_retencao_iss")); }
 public NfseServiceGroup setResponsavelRetencaoIss(JsonValue value) { put("responsavel_retencao_iss", value == null ? null : value.toJson()); return this; }
 public JsonValue getSituacaoTributaria() { return (field("situacao_tributaria")).isNull() || (field("situacao_tributaria")).isMissingNode() ? null : new JsonValue(field("situacao_tributaria")); }
 public NfseServiceGroup setSituacaoTributaria(JsonValue value) { put("situacao_tributaria", value == null ? null : value.toJson()); return this; }
 public String getTipoOperacao() { return stringValue(field("tipo_operacao")); }
 public NfseServiceGroup setTipoOperacao(String value) { put("tipo_operacao", Json.scalar(value)); return this; }
 public String getTipoTributacao() { return stringValue(field("tipo_tributacao")); }
 public NfseServiceGroup setTipoTributacao(String value) { put("tipo_tributacao", Json.scalar(value)); return this; }
 public JsonValue getTributacao() { return (field("tributacao")).isNull() || (field("tributacao")).isMissingNode() ? null : new JsonValue(field("tributacao")); }
 public NfseServiceGroup setTributacao(JsonValue value) { put("tributacao", value == null ? null : value.toJson()); return this; }
 public String getUfLocalPrestacao() { return stringValue(field("uf_local_prestacao")); }
 public NfseServiceGroup setUfLocalPrestacao(String value) { put("uf_local_prestacao", Json.scalar(value)); return this; }
 public NfseServiceGroupValorNaoBaseCalculo getValorNaoBaseCalculo() { return (field("valor_nao_base_calculo")).isNull() || (field("valor_nao_base_calculo")).isMissingNode() ? null : new NfseServiceGroupValorNaoBaseCalculo(field("valor_nao_base_calculo")); }
 public NfseServiceGroup setValorNaoBaseCalculo(NfseServiceGroupValorNaoBaseCalculo value) { put("valor_nao_base_calculo", value == null ? null : value.toJson()); return this; }
 public NfseServiceGroupValorServicos getValorServicos() { return (field("valor_servicos")).isNull() || (field("valor_servicos")).isMissingNode() ? null : new NfseServiceGroupValorServicos(field("valor_servicos")); }
 public NfseServiceGroup setValorServicos(NfseServiceGroupValorServicos value) { put("valor_servicos", value == null ? null : value.toJson()); return this; }
 public java.util.List<NfseServiceGroupItensItem> getItens() { return list(field("itens"), v -> (v).isNull() || (v).isMissingNode() ? null : new NfseServiceGroupItensItem(v)); }
 public NfseServiceGroup setItens(java.util.List<NfseServiceGroupItensItem> value) { put("itens", array(value, v -> v == null ? null : v.toJson())); return this; }
 public String getLocalPrestacao() { return stringValue(field("local_prestacao")); }
 public NfseServiceGroup setLocalPrestacao(String value) { put("local_prestacao", Json.scalar(value)); return this; }
 public String getCepLocalPrestacao() { return stringValue(field("cep_local_prestacao")); }
 public NfseServiceGroup setCepLocalPrestacao(String value) { put("cep_local_prestacao", Json.scalar(value)); return this; }
 public String getJustificativaDeducoes() { return stringValue(field("justificativa_deducoes")); }
 public NfseServiceGroup setJustificativaDeducoes(String value) { put("justificativa_deducoes", Json.scalar(value)); return this; }
 public String getDescricaoImpostos() { return stringValue(field("descricao_impostos")); }
 public NfseServiceGroup setDescricaoImpostos(String value) { put("descricao_impostos", Json.scalar(value)); return this; }
 public String getIe() { return stringValue(field("ie")); }
 public NfseServiceGroup setIe(String value) { put("ie", Json.scalar(value)); return this; }
 public String getRegimeRecolhimento() { return stringValue(field("regime_recolhimento")); }
 public NfseServiceGroup setRegimeRecolhimento(String value) { put("regime_recolhimento", Json.scalar(value)); return this; }
 public String getFormaRecolhimento() { return stringValue(field("forma_recolhimento")); }
 public NfseServiceGroup setFormaRecolhimento(String value) { put("forma_recolhimento", Json.scalar(value)); return this; }
 public String getEnderecoLocalPrestacao() { return stringValue(field("endereco_local_prestacao")); }
 public NfseServiceGroup setEnderecoLocalPrestacao(String value) { put("endereco_local_prestacao", Json.scalar(value)); return this; }
 public String getIdentificadorBeneficioMunicipal() { return stringValue(field("identificador_beneficio_municipal")); }
 public NfseServiceGroup setIdentificadorBeneficioMunicipal(String value) { put("identificador_beneficio_municipal", Json.scalar(value)); return this; }
 public NfseServiceGroupTributacaoIss getTributacaoIss() { return (field("tributacao_iss")).isNull() || (field("tributacao_iss")).isMissingNode() ? null : new NfseServiceGroupTributacaoIss(field("tributacao_iss")); }
 public NfseServiceGroup setTributacaoIss(NfseServiceGroupTributacaoIss value) { put("tributacao_iss", value == null ? null : value.toJson()); return this; }
 public NfseServiceGroupTipoImunidade getTipoImunidade() { return (field("tipo_imunidade")).isNull() || (field("tipo_imunidade")).isMissingNode() ? null : new NfseServiceGroupTipoImunidade(field("tipo_imunidade")); }
 public NfseServiceGroup setTipoImunidade(NfseServiceGroupTipoImunidade value) { put("tipo_imunidade", value == null ? null : value.toJson()); return this; }
 public NfseServiceGroupPisCofinsRetido getPisCofinsRetido() { return (field("pis_cofins_retido")).isNull() || (field("pis_cofins_retido")).isMissingNode() ? null : new NfseServiceGroupPisCofinsRetido(field("pis_cofins_retido")); }
 public NfseServiceGroup setPisCofinsRetido(NfseServiceGroupPisCofinsRetido value) { put("pis_cofins_retido", value == null ? null : value.toJson()); return this; }
 public NfseServiceGroupAliquotaTributosAproximados getAliquotaTributosAproximados() { return (field("aliquota_tributos_aproximados")).isNull() || (field("aliquota_tributos_aproximados")).isMissingNode() ? null : new NfseServiceGroupAliquotaTributosAproximados(field("aliquota_tributos_aproximados")); }
 public NfseServiceGroup setAliquotaTributosAproximados(NfseServiceGroupAliquotaTributosAproximados value) { put("aliquota_tributos_aproximados", value == null ? null : value.toJson()); return this; }
 public NfseServiceGroupModoPrestacao getModoPrestacao() { return (field("modo_prestacao")).isNull() || (field("modo_prestacao")).isMissingNode() ? null : new NfseServiceGroupModoPrestacao(field("modo_prestacao")); }
 public NfseServiceGroup setModoPrestacao(NfseServiceGroupModoPrestacao value) { put("modo_prestacao", value == null ? null : value.toJson()); return this; }
 public NfseServiceGroupVinculoPrestacao getVinculoPrestacao() { return (field("vinculo_prestacao")).isNull() || (field("vinculo_prestacao")).isMissingNode() ? null : new NfseServiceGroupVinculoPrestacao(field("vinculo_prestacao")); }
 public NfseServiceGroup setVinculoPrestacao(NfseServiceGroupVinculoPrestacao value) { put("vinculo_prestacao", value == null ? null : value.toJson()); return this; }
 public String getTipoMoeda() { return stringValue(field("tipo_moeda")); }
 public NfseServiceGroup setTipoMoeda(String value) { put("tipo_moeda", Json.scalar(value)); return this; }
 public NfseServiceGroupValorServicoMoeda getValorServicoMoeda() { return (field("valor_servico_moeda")).isNull() || (field("valor_servico_moeda")).isMissingNode() ? null : new NfseServiceGroupValorServicoMoeda(field("valor_servico_moeda")); }
 public NfseServiceGroup setValorServicoMoeda(NfseServiceGroupValorServicoMoeda value) { put("valor_servico_moeda", value == null ? null : value.toJson()); return this; }
 public String getMecanismoApoioComexPrestador() { return stringValue(field("mecanismo_apoio_comex_prestador")); }
 public NfseServiceGroup setMecanismoApoioComexPrestador(String value) { put("mecanismo_apoio_comex_prestador", Json.scalar(value)); return this; }
 public String getMecanismoApoioComexTomador() { return stringValue(field("mecanismo_apoio_comex_tomador")); }
 public NfseServiceGroup setMecanismoApoioComexTomador(String value) { put("mecanismo_apoio_comex_tomador", Json.scalar(value)); return this; }
 public NfseServiceGroupMovimentoTemporarioBens getMovimentoTemporarioBens() { return (field("movimento_temporario_bens")).isNull() || (field("movimento_temporario_bens")).isMissingNode() ? null : new NfseServiceGroupMovimentoTemporarioBens(field("movimento_temporario_bens")); }
 public NfseServiceGroup setMovimentoTemporarioBens(NfseServiceGroupMovimentoTemporarioBens value) { put("movimento_temporario_bens", value == null ? null : value.toJson()); return this; }
 public String getNumeroDi() { return stringValue(field("numero_di")); }
 public NfseServiceGroup setNumeroDi(String value) { put("numero_di", Json.scalar(value)); return this; }
 public String getNumeroRe() { return stringValue(field("numero_re")); }
 public NfseServiceGroup setNumeroRe(String value) { put("numero_re", Json.scalar(value)); return this; }
 public NfseServiceGroupMdic getMdic() { return (field("mdic")).isNull() || (field("mdic")).isMissingNode() ? null : new NfseServiceGroupMdic(field("mdic")); }
 public NfseServiceGroup setMdic(NfseServiceGroupMdic value) { put("mdic", value == null ? null : value.toJson()); return this; }
 public String getValorInicialCobrado() { return stringValue(field("valor_inicial_cobrado")); }
 public NfseServiceGroup setValorInicialCobrado(String value) { put("valor_inicial_cobrado", Json.scalar(value)); return this; }
 public String getValorFinalCobrado() { return stringValue(field("valor_final_cobrado")); }
 public NfseServiceGroup setValorFinalCobrado(String value) { put("valor_final_cobrado", Json.scalar(value)); return this; }
 public String getValorMulta() { return stringValue(field("valor_multa")); }
 public NfseServiceGroup setValorMulta(String value) { put("valor_multa", Json.scalar(value)); return this; }
 public String getValorJuros() { return stringValue(field("valor_juros")); }
 public NfseServiceGroup setValorJuros(String value) { put("valor_juros", Json.scalar(value)); return this; }
 public String getValorIpi() { return stringValue(field("valor_ipi")); }
 public NfseServiceGroup setValorIpi(String value) { put("valor_ipi", Json.scalar(value)); return this; }
 public NfseServiceGroupPagamentoParceladoAntecipado getPagamentoParceladoAntecipado() { return (field("pagamento_parcelado_antecipado")).isNull() || (field("pagamento_parcelado_antecipado")).isMissingNode() ? null : new NfseServiceGroupPagamentoParceladoAntecipado(field("pagamento_parcelado_antecipado")); }
 public NfseServiceGroup setPagamentoParceladoAntecipado(NfseServiceGroupPagamentoParceladoAntecipado value) { put("pagamento_parcelado_antecipado", value == null ? null : value.toJson()); return this; }
 public String getNcm() { return stringValue(field("ncm")); }
 public NfseServiceGroup setNcm(String value) { put("ncm", Json.scalar(value)); return this; }
 public String getValorRecebido() { return stringValue(field("valor_recebido")); }
 public NfseServiceGroup setValorRecebido(String value) { put("valor_recebido", Json.scalar(value)); return this; }
 public String getCargaTributaria() { return stringValue(field("carga_tributaria")); }
 public NfseServiceGroup setCargaTributaria(String value) { put("carga_tributaria", Json.scalar(value)); return this; }
 public String getFonteCargaTributaria() { return stringValue(field("fonte_carga_tributaria")); }
 public NfseServiceGroup setFonteCargaTributaria(String value) { put("fonte_carga_tributaria", Json.scalar(value)); return this; }
 public NfseServiceGroupFinalidade getFinalidade() { return (field("finalidade")).isNull() || (field("finalidade")).isMissingNode() ? null : new NfseServiceGroupFinalidade(field("finalidade")); }
 public NfseServiceGroup setFinalidade(NfseServiceGroupFinalidade value) { put("finalidade", value == null ? null : value.toJson()); return this; }
 public String getOutrasInformacoes() { return stringValue(field("outras_informacoes")); }
 public NfseServiceGroup setOutrasInformacoes(String value) { put("outras_informacoes", Json.scalar(value)); return this; }
 public NfseServiceGroupCondicaoPagamento getCondicaoPagamento() { return (field("condicao_pagamento")).isNull() || (field("condicao_pagamento")).isMissingNode() ? null : new NfseServiceGroupCondicaoPagamento(field("condicao_pagamento")); }
 public NfseServiceGroup setCondicaoPagamento(NfseServiceGroupCondicaoPagamento value) { put("condicao_pagamento", value == null ? null : value.toJson()); return this; }
 public NfseServiceGroupDestinatario getDestinatario() { return (field("destinatario")).isNull() || (field("destinatario")).isMissingNode() ? null : new NfseServiceGroupDestinatario(field("destinatario")); }
 public NfseServiceGroup setDestinatario(NfseServiceGroupDestinatario value) { put("destinatario", value == null ? null : value.toJson()); return this; }
}
