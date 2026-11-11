package com.webmania.sdk.model.api2nfseissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfse-issuance.openapi.json; see contract-provenance.json. */
public final class NfseDocumentedGroup6216MotivoRejeicao extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"type\":[\"number\",\"string\"],\"description\":\"Motivo da rejei\\u00e7\\u00e3o da participa\\u00e7\\u00e3o na NFS-e. Obrigat\\u00f3rio para o evento de rejei\\u00e7\\u00e3o. 1 - NFS-e em duplicidade 2 - NFS-e j\\u00e1 emitida pelo tomador 3 - N\\u00e3o ocorr\\u00eancia do fato gerador 4 - Erro quanto a responsabilidade tribut\\u00e1ria 5 - Erro quanto ao valor do servi\\u00e7o, valor das dedu\\u00e7\\u00f5es ou servi\\u00e7o prestado ou data do fato gerador 9 - Outros\",\"x-documented-size\":\"1\"}");
 public NfseDocumentedGroup6216MotivoRejeicao(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = Json.parse("{\"type\":\"number\",\"description\":\"Motivo da rejei\\u00e7\\u00e3o da participa\\u00e7\\u00e3o na NFS-e. Obrigat\\u00f3rio para o evento de rejei\\u00e7\\u00e3o. 1 - NFS-e em duplicidade 2 - NFS-e j\\u00e1 emitida pelo tomador 3 - N\\u00e3o ocorr\\u00eancia do fato gerador 4 - Erro quanto a responsabilidade tribut\\u00e1ria 5 - Erro quanto ao valor do servi\\u00e7o, valor das dedu\\u00e7\\u00f5es ou servi\\u00e7o prestado ou data do fato gerador 9 - Outros\",\"x-documented-size\":\"1\"}");
 public static NfseDocumentedGroup6216MotivoRejeicao ofVariant0(java.math.BigDecimal value) { return new NfseDocumentedGroup6216MotivoRejeicao(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api2/nfse-issuance.openapi.json", SCHEMA, VARIANT_0); }
 public java.math.BigDecimal asVariant0() { JsonNode value = checkedVariant("api2/nfse-issuance.openapi.json", SCHEMA, VARIANT_0); return decimalValue(value); }
 private static final JsonNode VARIANT_1 = Json.parse("{\"type\":\"string\",\"description\":\"Motivo da rejei\\u00e7\\u00e3o da participa\\u00e7\\u00e3o na NFS-e. Obrigat\\u00f3rio para o evento de rejei\\u00e7\\u00e3o. 1 - NFS-e em duplicidade 2 - NFS-e j\\u00e1 emitida pelo tomador 3 - N\\u00e3o ocorr\\u00eancia do fato gerador 4 - Erro quanto a responsabilidade tribut\\u00e1ria 5 - Erro quanto ao valor do servi\\u00e7o, valor das dedu\\u00e7\\u00f5es ou servi\\u00e7o prestado ou data do fato gerador 9 - Outros\",\"x-documented-size\":\"1\"}");
 public static NfseDocumentedGroup6216MotivoRejeicao ofVariant1(String value) { return new NfseDocumentedGroup6216MotivoRejeicao(Json.scalar(value)); }
 public boolean matchesVariant1() { return matchesVariant("api2/nfse-issuance.openapi.json", SCHEMA, VARIANT_1); }
 public String asVariant1() { JsonNode value = checkedVariant("api2/nfse-issuance.openapi.json", SCHEMA, VARIANT_1); return stringValue(value); }
}
