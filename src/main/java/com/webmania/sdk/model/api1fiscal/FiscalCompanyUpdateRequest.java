package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class FiscalCompanyUpdateRequest extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("tipo_tributacao", "regime_tributario", "cnpj", "razao_social", "cpf", "nome_completo", "nome_fantasia", "ie", "im", "unidade_empresa", "email", "telefone", "conta_bancaria_banco", "conta_bancaria_agencia", "conta_bancaria_numero", "conta_bancaria_digito", "contabilidade", "url_notificacao", "logomarca", "cep", "endereco", "numero", "complemento", "bairro", "cidade", "uf", "nfe_serie", "nfe_numero", "nfe_numero_dev", "informacoes_fisco", "cnae_issqn", "nfce_serie", "nfce_numero", "nfce_id_csc", "nfce_codigo_csc", "nfce_numero_dev", "nfce_id_csc_dev", "nfce_codigo_csc_dev", "cte_serie", "cte_number", "cte_number_dev", "cte_os_serie", "cte_os_number", "cte_os_number_dev", "taf_cte_os", "registro_estadual_cte_os", "dce_serie", "dce_numero", "dce_numero_dev", "tipo_emissor_dce", "numero_site_autorizador", "site_marketplace", "nfse_rps_serie", "nfse_rps_numero", "cnae", "nfse_login", "nfse_password", "nfse_token", "regime_apuracao_sn", "regime_especial_nacional", "regime_especial_municipal", "nfse_lote_rps_numero", "nfse_rps_numero_dev", "certificado", "certificado_senha", "partilha_icms_contribuinte", "partilha_icms_isento", "orientacao_danfe", "microcervejaria", "icms_ref_sp", "refeicoes_sp", "icms_ref_df", "exclusao_icms_pis_cofins", "exclusao_difal_pis_cofins", "deduzir_desconto_ipi", "base_calculo_ipi_sem_frete", "email_automatico_nfse", "ativar_epec", "ocultar_total_etiqueta", "validar_setup_completo");
 public FiscalCompanyUpdateRequest() { super(FIELDS); }
 public FiscalCompanyUpdateRequest(JsonNode node) { super(node, FIELDS); }
 public String getTipoTributacao() { return stringValue(field("tipo_tributacao")); }
 public FiscalCompanyUpdateRequest setTipoTributacao(String value) { put("tipo_tributacao", Json.scalar(value)); return this; }
 public String getRegimeTributario() { return stringValue(field("regime_tributario")); }
 public FiscalCompanyUpdateRequest setRegimeTributario(String value) { put("regime_tributario", Json.scalar(value)); return this; }
 public String getCnpj() { return stringValue(field("cnpj")); }
 public FiscalCompanyUpdateRequest setCnpj(String value) { put("cnpj", Json.scalar(value)); return this; }
 public String getRazaoSocial() { return stringValue(field("razao_social")); }
 public FiscalCompanyUpdateRequest setRazaoSocial(String value) { put("razao_social", Json.scalar(value)); return this; }
 public String getCpf() { return stringValue(field("cpf")); }
 public FiscalCompanyUpdateRequest setCpf(String value) { put("cpf", Json.scalar(value)); return this; }
 public String getNomeCompleto() { return stringValue(field("nome_completo")); }
 public FiscalCompanyUpdateRequest setNomeCompleto(String value) { put("nome_completo", Json.scalar(value)); return this; }
 public String getNomeFantasia() { return stringValue(field("nome_fantasia")); }
 public FiscalCompanyUpdateRequest setNomeFantasia(String value) { put("nome_fantasia", Json.scalar(value)); return this; }
 public String getIe() { return stringValue(field("ie")); }
 public FiscalCompanyUpdateRequest setIe(String value) { put("ie", Json.scalar(value)); return this; }
 public String getIm() { return stringValue(field("im")); }
 public FiscalCompanyUpdateRequest setIm(String value) { put("im", Json.scalar(value)); return this; }
 public String getUnidadeEmpresa() { return stringValue(field("unidade_empresa")); }
 public FiscalCompanyUpdateRequest setUnidadeEmpresa(String value) { put("unidade_empresa", Json.scalar(value)); return this; }
 public String getEmail() { return stringValue(field("email")); }
 public FiscalCompanyUpdateRequest setEmail(String value) { put("email", Json.scalar(value)); return this; }
 public String getTelefone() { return stringValue(field("telefone")); }
 public FiscalCompanyUpdateRequest setTelefone(String value) { put("telefone", Json.scalar(value)); return this; }
 public String getContaBancariaBanco() { return stringValue(field("conta_bancaria_banco")); }
 public FiscalCompanyUpdateRequest setContaBancariaBanco(String value) { put("conta_bancaria_banco", Json.scalar(value)); return this; }
 public String getContaBancariaAgencia() { return stringValue(field("conta_bancaria_agencia")); }
 public FiscalCompanyUpdateRequest setContaBancariaAgencia(String value) { put("conta_bancaria_agencia", Json.scalar(value)); return this; }
 public String getContaBancariaNumero() { return stringValue(field("conta_bancaria_numero")); }
 public FiscalCompanyUpdateRequest setContaBancariaNumero(String value) { put("conta_bancaria_numero", Json.scalar(value)); return this; }
 public String getContaBancariaDigito() { return stringValue(field("conta_bancaria_digito")); }
 public FiscalCompanyUpdateRequest setContaBancariaDigito(String value) { put("conta_bancaria_digito", Json.scalar(value)); return this; }
 public FiscalCompanyUpdateRequestContabilidade getContabilidade() { return (field("contabilidade")).isNull() || (field("contabilidade")).isMissingNode() ? null : new FiscalCompanyUpdateRequestContabilidade(field("contabilidade")); }
 public FiscalCompanyUpdateRequest setContabilidade(FiscalCompanyUpdateRequestContabilidade value) { put("contabilidade", value == null ? null : value.toJson()); return this; }
 public String getUrlNotificacao() { return stringValue(field("url_notificacao")); }
 public FiscalCompanyUpdateRequest setUrlNotificacao(String value) { put("url_notificacao", Json.scalar(value)); return this; }
 public String getLogomarca() { return stringValue(field("logomarca")); }
 public FiscalCompanyUpdateRequest setLogomarca(String value) { put("logomarca", Json.scalar(value)); return this; }
 public String getCep() { return stringValue(field("cep")); }
 public FiscalCompanyUpdateRequest setCep(String value) { put("cep", Json.scalar(value)); return this; }
 public String getEndereco() { return stringValue(field("endereco")); }
 public FiscalCompanyUpdateRequest setEndereco(String value) { put("endereco", Json.scalar(value)); return this; }
 public String getNumero() { return stringValue(field("numero")); }
 public FiscalCompanyUpdateRequest setNumero(String value) { put("numero", Json.scalar(value)); return this; }
 public String getComplemento() { return stringValue(field("complemento")); }
 public FiscalCompanyUpdateRequest setComplemento(String value) { put("complemento", Json.scalar(value)); return this; }
 public String getBairro() { return stringValue(field("bairro")); }
 public FiscalCompanyUpdateRequest setBairro(String value) { put("bairro", Json.scalar(value)); return this; }
 public String getCidade() { return stringValue(field("cidade")); }
 public FiscalCompanyUpdateRequest setCidade(String value) { put("cidade", Json.scalar(value)); return this; }
 public String getUf() { return stringValue(field("uf")); }
 public FiscalCompanyUpdateRequest setUf(String value) { put("uf", Json.scalar(value)); return this; }
 public java.math.BigInteger getNfeSerie() { return integerValue(field("nfe_serie")); }
 public FiscalCompanyUpdateRequest setNfeSerie(java.math.BigInteger value) { put("nfe_serie", Json.scalar(value)); return this; }
 public java.math.BigInteger getNfeNumero() { return integerValue(field("nfe_numero")); }
 public FiscalCompanyUpdateRequest setNfeNumero(java.math.BigInteger value) { put("nfe_numero", Json.scalar(value)); return this; }
 public java.math.BigInteger getNfeNumeroDev() { return integerValue(field("nfe_numero_dev")); }
 public FiscalCompanyUpdateRequest setNfeNumeroDev(java.math.BigInteger value) { put("nfe_numero_dev", Json.scalar(value)); return this; }
 public String getInformacoesFisco() { return stringValue(field("informacoes_fisco")); }
 public FiscalCompanyUpdateRequest setInformacoesFisco(String value) { put("informacoes_fisco", Json.scalar(value)); return this; }
 public String getCnaeIssqn() { return stringValue(field("cnae_issqn")); }
 public FiscalCompanyUpdateRequest setCnaeIssqn(String value) { put("cnae_issqn", Json.scalar(value)); return this; }
 public java.math.BigInteger getNfceSerie() { return integerValue(field("nfce_serie")); }
 public FiscalCompanyUpdateRequest setNfceSerie(java.math.BigInteger value) { put("nfce_serie", Json.scalar(value)); return this; }
 public java.math.BigInteger getNfceNumero() { return integerValue(field("nfce_numero")); }
 public FiscalCompanyUpdateRequest setNfceNumero(java.math.BigInteger value) { put("nfce_numero", Json.scalar(value)); return this; }
 public String getNfceIdCsc() { return stringValue(field("nfce_id_csc")); }
 public FiscalCompanyUpdateRequest setNfceIdCsc(String value) { put("nfce_id_csc", Json.scalar(value)); return this; }
 public String getNfceCodigoCsc() { return stringValue(field("nfce_codigo_csc")); }
 public FiscalCompanyUpdateRequest setNfceCodigoCsc(String value) { put("nfce_codigo_csc", Json.scalar(value)); return this; }
 public java.math.BigInteger getNfceNumeroDev() { return integerValue(field("nfce_numero_dev")); }
 public FiscalCompanyUpdateRequest setNfceNumeroDev(java.math.BigInteger value) { put("nfce_numero_dev", Json.scalar(value)); return this; }
 public String getNfceIdCscDev() { return stringValue(field("nfce_id_csc_dev")); }
 public FiscalCompanyUpdateRequest setNfceIdCscDev(String value) { put("nfce_id_csc_dev", Json.scalar(value)); return this; }
 public String getNfceCodigoCscDev() { return stringValue(field("nfce_codigo_csc_dev")); }
 public FiscalCompanyUpdateRequest setNfceCodigoCscDev(String value) { put("nfce_codigo_csc_dev", Json.scalar(value)); return this; }
 public java.math.BigInteger getCteSerie() { return integerValue(field("cte_serie")); }
 public FiscalCompanyUpdateRequest setCteSerie(java.math.BigInteger value) { put("cte_serie", Json.scalar(value)); return this; }
 public java.math.BigInteger getCteNumber() { return integerValue(field("cte_number")); }
 public FiscalCompanyUpdateRequest setCteNumber(java.math.BigInteger value) { put("cte_number", Json.scalar(value)); return this; }
 public java.math.BigInteger getCteNumberDev() { return integerValue(field("cte_number_dev")); }
 public FiscalCompanyUpdateRequest setCteNumberDev(java.math.BigInteger value) { put("cte_number_dev", Json.scalar(value)); return this; }
 public java.math.BigInteger getCteOsSerie() { return integerValue(field("cte_os_serie")); }
 public FiscalCompanyUpdateRequest setCteOsSerie(java.math.BigInteger value) { put("cte_os_serie", Json.scalar(value)); return this; }
 public java.math.BigInteger getCteOsNumber() { return integerValue(field("cte_os_number")); }
 public FiscalCompanyUpdateRequest setCteOsNumber(java.math.BigInteger value) { put("cte_os_number", Json.scalar(value)); return this; }
 public java.math.BigInteger getCteOsNumberDev() { return integerValue(field("cte_os_number_dev")); }
 public FiscalCompanyUpdateRequest setCteOsNumberDev(java.math.BigInteger value) { put("cte_os_number_dev", Json.scalar(value)); return this; }
 public String getTafCteOs() { return stringValue(field("taf_cte_os")); }
 public FiscalCompanyUpdateRequest setTafCteOs(String value) { put("taf_cte_os", Json.scalar(value)); return this; }
 public String getRegistroEstadualCteOs() { return stringValue(field("registro_estadual_cte_os")); }
 public FiscalCompanyUpdateRequest setRegistroEstadualCteOs(String value) { put("registro_estadual_cte_os", Json.scalar(value)); return this; }
 public java.math.BigInteger getDceSerie() { return integerValue(field("dce_serie")); }
 public FiscalCompanyUpdateRequest setDceSerie(java.math.BigInteger value) { put("dce_serie", Json.scalar(value)); return this; }
 public java.math.BigInteger getDceNumero() { return integerValue(field("dce_numero")); }
 public FiscalCompanyUpdateRequest setDceNumero(java.math.BigInteger value) { put("dce_numero", Json.scalar(value)); return this; }
 public java.math.BigInteger getDceNumeroDev() { return integerValue(field("dce_numero_dev")); }
 public FiscalCompanyUpdateRequest setDceNumeroDev(java.math.BigInteger value) { put("dce_numero_dev", Json.scalar(value)); return this; }
 public java.math.BigInteger getTipoEmissorDce() { return integerValue(field("tipo_emissor_dce")); }
 public FiscalCompanyUpdateRequest setTipoEmissorDce(java.math.BigInteger value) { put("tipo_emissor_dce", Json.scalar(value)); return this; }
 public java.math.BigInteger getNumeroSiteAutorizador() { return integerValue(field("numero_site_autorizador")); }
 public FiscalCompanyUpdateRequest setNumeroSiteAutorizador(java.math.BigInteger value) { put("numero_site_autorizador", Json.scalar(value)); return this; }
 public String getSiteMarketplace() { return stringValue(field("site_marketplace")); }
 public FiscalCompanyUpdateRequest setSiteMarketplace(String value) { put("site_marketplace", Json.scalar(value)); return this; }
 public String getNfseRpsSerie() { return stringValue(field("nfse_rps_serie")); }
 public FiscalCompanyUpdateRequest setNfseRpsSerie(String value) { put("nfse_rps_serie", Json.scalar(value)); return this; }
 public java.math.BigInteger getNfseRpsNumero() { return integerValue(field("nfse_rps_numero")); }
 public FiscalCompanyUpdateRequest setNfseRpsNumero(java.math.BigInteger value) { put("nfse_rps_numero", Json.scalar(value)); return this; }
 public FiscalCompanyUpdateRequestCnae getCnae() { return (field("cnae")).isNull() || (field("cnae")).isMissingNode() ? null : new FiscalCompanyUpdateRequestCnae(field("cnae")); }
 public FiscalCompanyUpdateRequest setCnae(FiscalCompanyUpdateRequestCnae value) { put("cnae", value == null ? null : value.toJson()); return this; }
 public String getNfseLogin() { return stringValue(field("nfse_login")); }
 public FiscalCompanyUpdateRequest setNfseLogin(String value) { put("nfse_login", Json.scalar(value)); return this; }
 public String getNfsePassword() { return stringValue(field("nfse_password")); }
 public FiscalCompanyUpdateRequest setNfsePassword(String value) { put("nfse_password", Json.scalar(value)); return this; }
 public String getNfseToken() { return stringValue(field("nfse_token")); }
 public FiscalCompanyUpdateRequest setNfseToken(String value) { put("nfse_token", Json.scalar(value)); return this; }
 public String getRegimeApuracaoSn() { return stringValue(field("regime_apuracao_sn")); }
 public FiscalCompanyUpdateRequest setRegimeApuracaoSn(String value) { put("regime_apuracao_sn", Json.scalar(value)); return this; }
 public String getRegimeEspecialNacional() { return stringValue(field("regime_especial_nacional")); }
 public FiscalCompanyUpdateRequest setRegimeEspecialNacional(String value) { put("regime_especial_nacional", Json.scalar(value)); return this; }
 public String getRegimeEspecialMunicipal() { return stringValue(field("regime_especial_municipal")); }
 public FiscalCompanyUpdateRequest setRegimeEspecialMunicipal(String value) { put("regime_especial_municipal", Json.scalar(value)); return this; }
 public java.math.BigInteger getNfseLoteRpsNumero() { return integerValue(field("nfse_lote_rps_numero")); }
 public FiscalCompanyUpdateRequest setNfseLoteRpsNumero(java.math.BigInteger value) { put("nfse_lote_rps_numero", Json.scalar(value)); return this; }
 public java.math.BigInteger getNfseRpsNumeroDev() { return integerValue(field("nfse_rps_numero_dev")); }
 public FiscalCompanyUpdateRequest setNfseRpsNumeroDev(java.math.BigInteger value) { put("nfse_rps_numero_dev", Json.scalar(value)); return this; }
 public String getCertificado() { return stringValue(field("certificado")); }
 public FiscalCompanyUpdateRequest setCertificado(String value) { put("certificado", Json.scalar(value)); return this; }
 public String getCertificadoSenha() { return stringValue(field("certificado_senha")); }
 public FiscalCompanyUpdateRequest setCertificadoSenha(String value) { put("certificado_senha", Json.scalar(value)); return this; }
 public Boolean getPartilhaIcmsContribuinte() { return booleanValue(field("partilha_icms_contribuinte")); }
 public FiscalCompanyUpdateRequest setPartilhaIcmsContribuinte(Boolean value) { put("partilha_icms_contribuinte", Json.scalar(value)); return this; }
 public Boolean getPartilhaIcmsIsento() { return booleanValue(field("partilha_icms_isento")); }
 public FiscalCompanyUpdateRequest setPartilhaIcmsIsento(Boolean value) { put("partilha_icms_isento", Json.scalar(value)); return this; }
 public String getOrientacaoDanfe() { return stringValue(field("orientacao_danfe")); }
 public FiscalCompanyUpdateRequest setOrientacaoDanfe(String value) { put("orientacao_danfe", Json.scalar(value)); return this; }
 public Boolean getMicrocervejaria() { return booleanValue(field("microcervejaria")); }
 public FiscalCompanyUpdateRequest setMicrocervejaria(Boolean value) { put("microcervejaria", Json.scalar(value)); return this; }
 public Boolean getIcmsRefSp() { return booleanValue(field("icms_ref_sp")); }
 public FiscalCompanyUpdateRequest setIcmsRefSp(Boolean value) { put("icms_ref_sp", Json.scalar(value)); return this; }
 public Boolean getRefeicoesSp() { return booleanValue(field("refeicoes_sp")); }
 public FiscalCompanyUpdateRequest setRefeicoesSp(Boolean value) { put("refeicoes_sp", Json.scalar(value)); return this; }
 public Boolean getIcmsRefDf() { return booleanValue(field("icms_ref_df")); }
 public FiscalCompanyUpdateRequest setIcmsRefDf(Boolean value) { put("icms_ref_df", Json.scalar(value)); return this; }
 public Boolean getExclusaoIcmsPisCofins() { return booleanValue(field("exclusao_icms_pis_cofins")); }
 public FiscalCompanyUpdateRequest setExclusaoIcmsPisCofins(Boolean value) { put("exclusao_icms_pis_cofins", Json.scalar(value)); return this; }
 public Boolean getExclusaoDifalPisCofins() { return booleanValue(field("exclusao_difal_pis_cofins")); }
 public FiscalCompanyUpdateRequest setExclusaoDifalPisCofins(Boolean value) { put("exclusao_difal_pis_cofins", Json.scalar(value)); return this; }
 public Boolean getDeduzirDescontoIpi() { return booleanValue(field("deduzir_desconto_ipi")); }
 public FiscalCompanyUpdateRequest setDeduzirDescontoIpi(Boolean value) { put("deduzir_desconto_ipi", Json.scalar(value)); return this; }
 public Boolean getBaseCalculoIpiSemFrete() { return booleanValue(field("base_calculo_ipi_sem_frete")); }
 public FiscalCompanyUpdateRequest setBaseCalculoIpiSemFrete(Boolean value) { put("base_calculo_ipi_sem_frete", Json.scalar(value)); return this; }
 public Boolean getEmailAutomaticoNfse() { return booleanValue(field("email_automatico_nfse")); }
 public FiscalCompanyUpdateRequest setEmailAutomaticoNfse(Boolean value) { put("email_automatico_nfse", Json.scalar(value)); return this; }
 public String getAtivarEpec() { return stringValue(field("ativar_epec")); }
 public FiscalCompanyUpdateRequest setAtivarEpec(String value) { put("ativar_epec", Json.scalar(value)); return this; }
 public String getOcultarTotalEtiqueta() { return stringValue(field("ocultar_total_etiqueta")); }
 public FiscalCompanyUpdateRequest setOcultarTotalEtiqueta(String value) { put("ocultar_total_etiqueta", Json.scalar(value)); return this; }
 public Boolean getValidarSetupCompleto() { return booleanValue(field("validar_setup_completo")); }
 public FiscalCompanyUpdateRequest setValidarSetupCompleto(Boolean value) { put("validar_setup_completo", Json.scalar(value)); return this; }
}
