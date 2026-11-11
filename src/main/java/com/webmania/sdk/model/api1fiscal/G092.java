package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G092 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("situacao_tributaria", "codigo_enquadramento", "aliquota", "percentual_devolvido", "ipi_devolvido", "codigo_selo", "qtd_selo", "bc_ipi");
 public G092() { super(FIELDS); }
 public G092(JsonNode node) { super(node, FIELDS); }
 public String getSituacaoTributaria() { return stringValue(field("situacao_tributaria")); }
 public G092 setSituacaoTributaria(String value) { put("situacao_tributaria", Json.scalar(value)); return this; }
 public G092CodigoEnquadramento getCodigoEnquadramento() { return (field("codigo_enquadramento")).isNull() || (field("codigo_enquadramento")).isMissingNode() ? null : new G092CodigoEnquadramento(field("codigo_enquadramento")); }
 public G092 setCodigoEnquadramento(G092CodigoEnquadramento value) { put("codigo_enquadramento", value == null ? null : value.toJson()); return this; }
 public G092Aliquota getAliquota() { return (field("aliquota")).isNull() || (field("aliquota")).isMissingNode() ? null : new G092Aliquota(field("aliquota")); }
 public G092 setAliquota(G092Aliquota value) { put("aliquota", value == null ? null : value.toJson()); return this; }
 public G092PercentualDevolvido getPercentualDevolvido() { return (field("percentual_devolvido")).isNull() || (field("percentual_devolvido")).isMissingNode() ? null : new G092PercentualDevolvido(field("percentual_devolvido")); }
 public G092 setPercentualDevolvido(G092PercentualDevolvido value) { put("percentual_devolvido", value == null ? null : value.toJson()); return this; }
 public G092IpiDevolvido getIpiDevolvido() { return (field("ipi_devolvido")).isNull() || (field("ipi_devolvido")).isMissingNode() ? null : new G092IpiDevolvido(field("ipi_devolvido")); }
 public G092 setIpiDevolvido(G092IpiDevolvido value) { put("ipi_devolvido", value == null ? null : value.toJson()); return this; }
 public String getCodigoSelo() { return stringValue(field("codigo_selo")); }
 public G092 setCodigoSelo(String value) { put("codigo_selo", Json.scalar(value)); return this; }
 public String getQtdSelo() { return stringValue(field("qtd_selo")); }
 public G092 setQtdSelo(String value) { put("qtd_selo", Json.scalar(value)); return this; }
 public G092BcIpi getBcIpi() { return (field("bc_ipi")).isNull() || (field("bc_ipi")).isMissingNode() ? null : new G092BcIpi(field("bc_ipi")); }
 public G092 setBcIpi(G092BcIpi value) { put("bc_ipi", value == null ? null : value.toJson()); return this; }
}
