package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G118 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("codigo_cfop", "exigibilidade", "item_servico", "incentivo_fiscal", "bc_issqn", "valor_issqn");
 public G118() { super(FIELDS); }
 public G118(JsonNode node) { super(node, FIELDS); }
 public String getCodigoCfop() { return stringValue(field("codigo_cfop")); }
 public G118 setCodigoCfop(String value) { put("codigo_cfop", Json.scalar(value)); return this; }
 public java.math.BigInteger getExigibilidade() { return integerValue(field("exigibilidade")); }
 public G118 setExigibilidade(java.math.BigInteger value) { put("exigibilidade", Json.scalar(value)); return this; }
 public String getItemServico() { return stringValue(field("item_servico")); }
 public G118 setItemServico(String value) { put("item_servico", Json.scalar(value)); return this; }
 public String getIncentivoFiscal() { return stringValue(field("incentivo_fiscal")); }
 public G118 setIncentivoFiscal(String value) { put("incentivo_fiscal", Json.scalar(value)); return this; }
 public G118BcIssqn getBcIssqn() { return (field("bc_issqn")).isNull() || (field("bc_issqn")).isMissingNode() ? null : new G118BcIssqn(field("bc_issqn")); }
 public G118 setBcIssqn(G118BcIssqn value) { put("bc_issqn", value == null ? null : value.toJson()); return this; }
 public G118ValorIssqn getValorIssqn() { return (field("valor_issqn")).isNull() || (field("valor_issqn")).isMissingNode() ? null : new G118ValorIssqn(field("valor_issqn")); }
 public G118 setValorIssqn(G118ValorIssqn value) { put("valor_issqn", value == null ? null : value.toJson()); return this; }
}
