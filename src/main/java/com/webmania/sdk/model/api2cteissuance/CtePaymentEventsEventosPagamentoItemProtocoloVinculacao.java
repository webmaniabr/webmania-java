package com.webmania.sdk.model.api2cteissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/cte-issuance.openapi.json; see contract-provenance.json. */
public final class CtePaymentEventsEventosPagamentoItemProtocoloVinculacao extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"type\":[\"string\",\"number\",\"null\"]}");
 public CtePaymentEventsEventosPagamentoItemProtocoloVinculacao(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = Json.parse("{\"type\":\"string\"}");
 public static CtePaymentEventsEventosPagamentoItemProtocoloVinculacao ofVariant0(String value) { return new CtePaymentEventsEventosPagamentoItemProtocoloVinculacao(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api2/cte-issuance.openapi.json", SCHEMA, VARIANT_0); }
 public String asVariant0() { JsonNode value = checkedVariant("api2/cte-issuance.openapi.json", SCHEMA, VARIANT_0); return stringValue(value); }
 private static final JsonNode VARIANT_1 = Json.parse("{\"type\":\"number\"}");
 public static CtePaymentEventsEventosPagamentoItemProtocoloVinculacao ofVariant1(java.math.BigDecimal value) { return new CtePaymentEventsEventosPagamentoItemProtocoloVinculacao(Json.scalar(value)); }
 public boolean matchesVariant1() { return matchesVariant("api2/cte-issuance.openapi.json", SCHEMA, VARIANT_1); }
 public java.math.BigDecimal asVariant1() { JsonNode value = checkedVariant("api2/cte-issuance.openapi.json", SCHEMA, VARIANT_1); return decimalValue(value); }
 private static final JsonNode VARIANT_2 = Json.parse("{\"type\":\"null\"}");
 public static CtePaymentEventsEventosPagamentoItemProtocoloVinculacao ofVariant2(JsonValue value) { return new CtePaymentEventsEventosPagamentoItemProtocoloVinculacao(value == null ? null : value.toJson()); }
 public boolean matchesVariant2() { return matchesVariant("api2/cte-issuance.openapi.json", SCHEMA, VARIANT_2); }
 public JsonValue asVariant2() { JsonNode value = checkedVariant("api2/cte-issuance.openapi.json", SCHEMA, VARIANT_2); return (value).isNull() || (value).isMissingNode() ? null : new JsonValue(value); }
}
