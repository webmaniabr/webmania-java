package com.webmania.sdk.model.api1b2b;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/b2b.openapi.json; see contract-provenance.json. */
public final class ResellerCreatedCompany extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("consumer_key", "consumer_secret", "access_token", "access_token_secret", "bearer_access_token", "bearer_access_token_status", "bearer_access_token_pending", "direct_link_login", "id", "bearer_access_token_recovery_queued", "bearer_access_token_recovery_queue_status");
 public ResellerCreatedCompany() { super(FIELDS); }
 public ResellerCreatedCompany(JsonNode node) { super(node, FIELDS); }
 public String getConsumerKey() { return stringValue(field("consumer_key")); }
 public ResellerCreatedCompany setConsumerKey(String value) { put("consumer_key", Json.scalar(value)); return this; }
 public String getConsumerSecret() { return stringValue(field("consumer_secret")); }
 public ResellerCreatedCompany setConsumerSecret(String value) { put("consumer_secret", Json.scalar(value)); return this; }
 public String getAccessToken() { return stringValue(field("access_token")); }
 public ResellerCreatedCompany setAccessToken(String value) { put("access_token", Json.scalar(value)); return this; }
 public String getAccessTokenSecret() { return stringValue(field("access_token_secret")); }
 public ResellerCreatedCompany setAccessTokenSecret(String value) { put("access_token_secret", Json.scalar(value)); return this; }
 public String getBearerAccessToken() { return stringValue(field("bearer_access_token")); }
 public ResellerCreatedCompany setBearerAccessToken(String value) { put("bearer_access_token", Json.scalar(value)); return this; }
 public String getBearerAccessTokenStatus() { return stringValue(field("bearer_access_token_status")); }
 public ResellerCreatedCompany setBearerAccessTokenStatus(String value) { put("bearer_access_token_status", Json.scalar(value)); return this; }
 public Boolean getBearerAccessTokenPending() { return booleanValue(field("bearer_access_token_pending")); }
 public ResellerCreatedCompany setBearerAccessTokenPending(Boolean value) { put("bearer_access_token_pending", Json.scalar(value)); return this; }
 public String getDirectLinkLogin() { return stringValue(field("direct_link_login")); }
 public ResellerCreatedCompany setDirectLinkLogin(String value) { put("direct_link_login", Json.scalar(value)); return this; }
 public java.math.BigInteger getId() { return integerValue(field("id")); }
 public ResellerCreatedCompany setId(java.math.BigInteger value) { put("id", Json.scalar(value)); return this; }
 public ResellerCreatedCompanyBearerAccessTokenRecoveryQueued getBearerAccessTokenRecoveryQueued() { return (field("bearer_access_token_recovery_queued")).isNull() || (field("bearer_access_token_recovery_queued")).isMissingNode() ? null : new ResellerCreatedCompanyBearerAccessTokenRecoveryQueued(field("bearer_access_token_recovery_queued")); }
 public ResellerCreatedCompany setBearerAccessTokenRecoveryQueued(ResellerCreatedCompanyBearerAccessTokenRecoveryQueued value) { put("bearer_access_token_recovery_queued", value == null ? null : value.toJson()); return this; }
 public ResellerCreatedCompanyBearerAccessTokenRecoveryQueueStatus getBearerAccessTokenRecoveryQueueStatus() { return (field("bearer_access_token_recovery_queue_status")).isNull() || (field("bearer_access_token_recovery_queue_status")).isMissingNode() ? null : new ResellerCreatedCompanyBearerAccessTokenRecoveryQueueStatus(field("bearer_access_token_recovery_queue_status")); }
 public ResellerCreatedCompany setBearerAccessTokenRecoveryQueueStatus(ResellerCreatedCompanyBearerAccessTokenRecoveryQueueStatus value) { put("bearer_access_token_recovery_queue_status", value == null ? null : value.toJson()); return this; }
}
