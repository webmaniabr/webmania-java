package com.webmania.sdk.model.api2monitordocuments;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-documents.openapi.json; see contract-provenance.json. */
public final class MonitorAvailableMunicipality extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("municipio", "uf", "codigo_ibge", "nativo", "im", "certificado", "login_senha", "cadastro_prefeitura", "domicilio_fiscal_municipio", "multiplos_servicos", "download_emitidas", "download_recebidas", "guia_cadastro_prefeitura");
 public MonitorAvailableMunicipality() { super(FIELDS); }
 public MonitorAvailableMunicipality(JsonNode node) { super(node, FIELDS); }
 public String getMunicipio() { return stringValue(field("municipio")); }
 public MonitorAvailableMunicipality setMunicipio(String value) { put("municipio", Json.scalar(value)); return this; }
 public String getUf() { return stringValue(field("uf")); }
 public MonitorAvailableMunicipality setUf(String value) { put("uf", Json.scalar(value)); return this; }
 public String getCodigoIbge() { return stringValue(field("codigo_ibge")); }
 public MonitorAvailableMunicipality setCodigoIbge(String value) { put("codigo_ibge", Json.scalar(value)); return this; }
 public Boolean getNativo() { return booleanValue(field("nativo")); }
 public MonitorAvailableMunicipality setNativo(Boolean value) { put("nativo", Json.scalar(value)); return this; }
 public Boolean getIm() { return booleanValue(field("im")); }
 public MonitorAvailableMunicipality setIm(Boolean value) { put("im", Json.scalar(value)); return this; }
 public Boolean getCertificado() { return booleanValue(field("certificado")); }
 public MonitorAvailableMunicipality setCertificado(Boolean value) { put("certificado", Json.scalar(value)); return this; }
 public Boolean getLoginSenha() { return booleanValue(field("login_senha")); }
 public MonitorAvailableMunicipality setLoginSenha(Boolean value) { put("login_senha", Json.scalar(value)); return this; }
 public Boolean getCadastroPrefeitura() { return booleanValue(field("cadastro_prefeitura")); }
 public MonitorAvailableMunicipality setCadastroPrefeitura(Boolean value) { put("cadastro_prefeitura", Json.scalar(value)); return this; }
 public Boolean getDomicilioFiscalMunicipio() { return booleanValue(field("domicilio_fiscal_municipio")); }
 public MonitorAvailableMunicipality setDomicilioFiscalMunicipio(Boolean value) { put("domicilio_fiscal_municipio", Json.scalar(value)); return this; }
 public Boolean getMultiplosServicos() { return booleanValue(field("multiplos_servicos")); }
 public MonitorAvailableMunicipality setMultiplosServicos(Boolean value) { put("multiplos_servicos", Json.scalar(value)); return this; }
 public Boolean getDownloadEmitidas() { return booleanValue(field("download_emitidas")); }
 public MonitorAvailableMunicipality setDownloadEmitidas(Boolean value) { put("download_emitidas", Json.scalar(value)); return this; }
 public Boolean getDownloadRecebidas() { return booleanValue(field("download_recebidas")); }
 public MonitorAvailableMunicipality setDownloadRecebidas(Boolean value) { put("download_recebidas", Json.scalar(value)); return this; }
 public String getGuiaCadastroPrefeitura() { return stringValue(field("guia_cadastro_prefeitura")); }
 public MonitorAvailableMunicipality setGuiaCadastroPrefeitura(String value) { put("guia_cadastro_prefeitura", Json.scalar(value)); return this; }
}
