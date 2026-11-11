package com.webmania.sdk.model.api1b2b;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/b2b.openapi.json; see contract-provenance.json. */
public final class ResellerCompanyCredentials extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("consumer_key", "consumer_secret", "access_token", "access_token_secret", "bearer_access_token", "bearer_access_token_status", "bearer_access_token_pending", "direct_link_login");
 public ResellerCompanyCredentials() { super(FIELDS); }
 public ResellerCompanyCredentials(JsonNode node) { super(node, FIELDS); }
 public String getConsumerKey() { return stringValue(field("consumer_key")); }
 public ResellerCompanyCredentials setConsumerKey(String value) { put("consumer_key", Json.scalar(value)); return this; }
 public String getConsumerSecret() { return stringValue(field("consumer_secret")); }
 public ResellerCompanyCredentials setConsumerSecret(String value) { put("consumer_secret", Json.scalar(value)); return this; }
 public String getAccessToken() { return stringValue(field("access_token")); }
 public ResellerCompanyCredentials setAccessToken(String value) { put("access_token", Json.scalar(value)); return this; }
 public String getAccessTokenSecret() { return stringValue(field("access_token_secret")); }
 public ResellerCompanyCredentials setAccessTokenSecret(String value) { put("access_token_secret", Json.scalar(value)); return this; }
 public String getBearerAccessToken() { return stringValue(field("bearer_access_token")); }
 public ResellerCompanyCredentials setBearerAccessToken(String value) { put("bearer_access_token", Json.scalar(value)); return this; }
 public String getBearerAccessTokenStatus() { return stringValue(field("bearer_access_token_status")); }
 public ResellerCompanyCredentials setBearerAccessTokenStatus(String value) { put("bearer_access_token_status", Json.scalar(value)); return this; }
 public Boolean getBearerAccessTokenPending() { return booleanValue(field("bearer_access_token_pending")); }
 public ResellerCompanyCredentials setBearerAccessTokenPending(Boolean value) { put("bearer_access_token_pending", Json.scalar(value)); return this; }
 public String getDirectLinkLogin() { return stringValue(field("direct_link_login")); }
 public ResellerCompanyCredentials setDirectLinkLogin(String value) { put("direct_link_login", Json.scalar(value)); return this; }
}
