package com.webmania.sdk.model.api2mdfeissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/mdfe-issuance.openapi.json; see contract-provenance.json. */
public final class MdfeFreightPaymentGroupInformacoesBancarias extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("tipo_informacao_bancaria", "numero_banco", "numero_agencia", "cnpj_ipef", "pix");
 public MdfeFreightPaymentGroupInformacoesBancarias() { super(FIELDS); }
 public MdfeFreightPaymentGroupInformacoesBancarias(JsonNode node) { super(node, FIELDS); }
 public MdfeFreightPaymentGroupInformacoesBancariasTipoInformacaoBancaria getTipoInformacaoBancaria() { return (field("tipo_informacao_bancaria")).isNull() || (field("tipo_informacao_bancaria")).isMissingNode() ? null : new MdfeFreightPaymentGroupInformacoesBancariasTipoInformacaoBancaria(field("tipo_informacao_bancaria")); }
 public MdfeFreightPaymentGroupInformacoesBancarias setTipoInformacaoBancaria(MdfeFreightPaymentGroupInformacoesBancariasTipoInformacaoBancaria value) { put("tipo_informacao_bancaria", value == null ? null : value.toJson()); return this; }
 public String getNumeroBanco() { return stringValue(field("numero_banco")); }
 public MdfeFreightPaymentGroupInformacoesBancarias setNumeroBanco(String value) { put("numero_banco", Json.scalar(value)); return this; }
 public String getNumeroAgencia() { return stringValue(field("numero_agencia")); }
 public MdfeFreightPaymentGroupInformacoesBancarias setNumeroAgencia(String value) { put("numero_agencia", Json.scalar(value)); return this; }
 public String getCnpjIpef() { return stringValue(field("cnpj_ipef")); }
 public MdfeFreightPaymentGroupInformacoesBancarias setCnpjIpef(String value) { put("cnpj_ipef", Json.scalar(value)); return this; }
 public String getPix() { return stringValue(field("pix")); }
 public MdfeFreightPaymentGroupInformacoesBancarias setPix(String value) { put("pix", Json.scalar(value)); return this; }
}
