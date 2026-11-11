package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class NfeOrderUfEstabelecimentoPag extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"anyOf\":[{\"type\":\"string\",\"description\":\"*Obrigat\\u00f3rio se cnpj_transacional_pag estiver definida | UF do estabelecimento. UF do CNPJ do estabelecimento onde o pagamento foi processado, transacionado e/ou recebido.\"},{\"type\":\"array\",\"items\":{\"type\":\"string\",\"description\":\"*Obrigat\\u00f3rio se cnpj_transacional_pag estiver definida | UF do estabelecimento. UF do CNPJ do estabelecimento onde o pagamento foi processado, transacionado e/ou recebido.\"},\"minItems\":1}]}");
 public NfeOrderUfEstabelecimentoPag(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = SCHEMA.path("anyOf").path(0);
 public static NfeOrderUfEstabelecimentoPag ofVariant0(String value) { return new NfeOrderUfEstabelecimentoPag(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_0); }
 public String asVariant0() { JsonNode value = checkedVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_0); return stringValue(value); }
 private static final JsonNode VARIANT_1 = SCHEMA.path("anyOf").path(1);
 public static NfeOrderUfEstabelecimentoPag ofVariant1(java.util.List<String> value) { return new NfeOrderUfEstabelecimentoPag(array(value, v -> Json.scalar(v))); }
 public boolean matchesVariant1() { return matchesVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_1); }
 public java.util.List<String> asVariant1() { JsonNode value = checkedVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_1); return list(value, v -> stringValue(v)); }
}
