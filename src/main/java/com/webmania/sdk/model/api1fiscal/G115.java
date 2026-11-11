package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G115 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("codigo_cfop", "situacao_tributaria", "bc_icms", "valor_icms", "valor_operacao", "valor_fcp", "aliquota_diferimento", "beneficio_fiscal");
 public G115() { super(FIELDS); }
 public G115(JsonNode node) { super(node, FIELDS); }
 public String getCodigoCfop() { return stringValue(field("codigo_cfop")); }
 public G115 setCodigoCfop(String value) { put("codigo_cfop", Json.scalar(value)); return this; }
 public String getSituacaoTributaria() { return stringValue(field("situacao_tributaria")); }
 public G115 setSituacaoTributaria(String value) { put("situacao_tributaria", Json.scalar(value)); return this; }
 public G115BcIcms getBcIcms() { return (field("bc_icms")).isNull() || (field("bc_icms")).isMissingNode() ? null : new G115BcIcms(field("bc_icms")); }
 public G115 setBcIcms(G115BcIcms value) { put("bc_icms", value == null ? null : value.toJson()); return this; }
 public G115ValorIcms getValorIcms() { return (field("valor_icms")).isNull() || (field("valor_icms")).isMissingNode() ? null : new G115ValorIcms(field("valor_icms")); }
 public G115 setValorIcms(G115ValorIcms value) { put("valor_icms", value == null ? null : value.toJson()); return this; }
 public G115ValorOperacao getValorOperacao() { return (field("valor_operacao")).isNull() || (field("valor_operacao")).isMissingNode() ? null : new G115ValorOperacao(field("valor_operacao")); }
 public G115 setValorOperacao(G115ValorOperacao value) { put("valor_operacao", value == null ? null : value.toJson()); return this; }
 public G115ValorFcp getValorFcp() { return (field("valor_fcp")).isNull() || (field("valor_fcp")).isMissingNode() ? null : new G115ValorFcp(field("valor_fcp")); }
 public G115 setValorFcp(G115ValorFcp value) { put("valor_fcp", value == null ? null : value.toJson()); return this; }
 public G115AliquotaDiferimento getAliquotaDiferimento() { return (field("aliquota_diferimento")).isNull() || (field("aliquota_diferimento")).isMissingNode() ? null : new G115AliquotaDiferimento(field("aliquota_diferimento")); }
 public G115 setAliquotaDiferimento(G115AliquotaDiferimento value) { put("aliquota_diferimento", value == null ? null : value.toJson()); return this; }
 public String getBeneficioFiscal() { return stringValue(field("beneficio_fiscal")); }
 public G115 setBeneficioFiscal(String value) { put("beneficio_fiscal", Json.scalar(value)); return this; }
}
