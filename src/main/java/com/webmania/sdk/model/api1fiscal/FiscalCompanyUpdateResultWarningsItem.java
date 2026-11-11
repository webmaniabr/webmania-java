package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class FiscalCompanyUpdateResultWarningsItem extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("code", "message");
 public FiscalCompanyUpdateResultWarningsItem() { super(FIELDS); }
 public FiscalCompanyUpdateResultWarningsItem(JsonNode node) { super(node, FIELDS); }
 public String getCode() { return stringValue(field("code")); }
 public FiscalCompanyUpdateResultWarningsItem setCode(String value) { put("code", Json.scalar(value)); return this; }
 public String getMessage() { return stringValue(field("message")); }
 public FiscalCompanyUpdateResultWarningsItem setMessage(String value) { put("message", Json.scalar(value)); return this; }
}
