package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class FiscalCompanyUpdateResultCredenciais extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("consumer_key", "consumer_secret", "access_token", "access_token_secret", "bearer_access_token");
 public FiscalCompanyUpdateResultCredenciais() { super(FIELDS); }
 public FiscalCompanyUpdateResultCredenciais(JsonNode node) { super(node, FIELDS); }
 public String getConsumerKey() { return stringValue(field("consumer_key")); }
 public FiscalCompanyUpdateResultCredenciais setConsumerKey(String value) { put("consumer_key", Json.scalar(value)); return this; }
 public String getConsumerSecret() { return stringValue(field("consumer_secret")); }
 public FiscalCompanyUpdateResultCredenciais setConsumerSecret(String value) { put("consumer_secret", Json.scalar(value)); return this; }
 public String getAccessToken() { return stringValue(field("access_token")); }
 public FiscalCompanyUpdateResultCredenciais setAccessToken(String value) { put("access_token", Json.scalar(value)); return this; }
 public String getAccessTokenSecret() { return stringValue(field("access_token_secret")); }
 public FiscalCompanyUpdateResultCredenciais setAccessTokenSecret(String value) { put("access_token_secret", Json.scalar(value)); return this; }
 public String getBearerAccessToken() { return stringValue(field("bearer_access_token")); }
 public FiscalCompanyUpdateResultCredenciais setBearerAccessToken(String value) { put("bearer_access_token", Json.scalar(value)); return this; }
}
