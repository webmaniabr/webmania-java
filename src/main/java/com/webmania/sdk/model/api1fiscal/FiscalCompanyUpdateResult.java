package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class FiscalCompanyUpdateResult extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("success", "alerts", "warnings", "bearer_access_token_status", "bearer_access_token_pending", "credenciais");
 public FiscalCompanyUpdateResult() { super(FIELDS); }
 public FiscalCompanyUpdateResult(JsonNode node) { super(node, FIELDS); }
 public String getSuccess() { return stringValue(field("success")); }
 public FiscalCompanyUpdateResult setSuccess(String value) { put("success", Json.scalar(value)); return this; }
 public java.util.List<String> getAlerts() { return list(field("alerts"), v -> stringValue(v)); }
 public FiscalCompanyUpdateResult setAlerts(java.util.List<String> value) { put("alerts", array(value, v -> Json.scalar(v))); return this; }
 public java.util.List<FiscalCompanyUpdateResultWarningsItem> getWarnings() { return list(field("warnings"), v -> (v).isNull() || (v).isMissingNode() ? null : new FiscalCompanyUpdateResultWarningsItem(v)); }
 public FiscalCompanyUpdateResult setWarnings(java.util.List<FiscalCompanyUpdateResultWarningsItem> value) { put("warnings", array(value, v -> v == null ? null : v.toJson())); return this; }
 public String getBearerAccessTokenStatus() { return stringValue(field("bearer_access_token_status")); }
 public FiscalCompanyUpdateResult setBearerAccessTokenStatus(String value) { put("bearer_access_token_status", Json.scalar(value)); return this; }
 public Boolean getBearerAccessTokenPending() { return booleanValue(field("bearer_access_token_pending")); }
 public FiscalCompanyUpdateResult setBearerAccessTokenPending(Boolean value) { put("bearer_access_token_pending", Json.scalar(value)); return this; }
 public FiscalCompanyUpdateResultCredenciais getCredenciais() { return (field("credenciais")).isNull() || (field("credenciais")).isMissingNode() ? null : new FiscalCompanyUpdateResultCredenciais(field("credenciais")); }
 public FiscalCompanyUpdateResult setCredenciais(FiscalCompanyUpdateResultCredenciais value) { put("credenciais", value == null ? null : value.toJson()); return this; }
}
