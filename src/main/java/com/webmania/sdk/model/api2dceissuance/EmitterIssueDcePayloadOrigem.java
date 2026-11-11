package com.webmania.sdk.model.api2dceissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/dce-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueDcePayloadOrigem extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"anyOf\":[{\"type\":\"string\",\"enum\":[\"api\",\"webmaniabr\",\"woocommerce\",\"prestashop\",\"opencart\",\"magento\"]},{\"type\":\"null\"}]}");
 public EmitterIssueDcePayloadOrigem(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = SCHEMA.path("anyOf").path(0);
 public static EmitterIssueDcePayloadOrigem ofVariant0(String value) { return new EmitterIssueDcePayloadOrigem(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api2/dce-issuance.openapi.json", SCHEMA, VARIANT_0); }
 public String asVariant0() { JsonNode value = checkedVariant("api2/dce-issuance.openapi.json", SCHEMA, VARIANT_0); return stringValue(value); }
 private static final JsonNode VARIANT_1 = SCHEMA.path("anyOf").path(1);
 public static EmitterIssueDcePayloadOrigem ofVariant1(JsonValue value) { return new EmitterIssueDcePayloadOrigem(value == null ? null : value.toJson()); }
 public boolean matchesVariant1() { return matchesVariant("api2/dce-issuance.openapi.json", SCHEMA, VARIANT_1); }
 public JsonValue asVariant1() { JsonNode value = checkedVariant("api2/dce-issuance.openapi.json", SCHEMA, VARIANT_1); return (value).isNull() || (value).isMissingNode() ? null : new JsonValue(value); }
}
