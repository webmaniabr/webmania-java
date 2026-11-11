package com.webmania.sdk;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import java.util.List;

/** A bounded diagnostic projection, sanitized before retention. Never the raw provider response. */
public final class ProviderDetails extends JsonValue {
    public record Violation(String field,String message) { }
    private ProviderDetails(JsonNode node) { super(node); }
    public String getCode() { return node.path("code").isTextual()?node.path("code").asText():null; }
    public String getMessage() { return node.path("message").isTextual()?node.path("message").asText():null; }
    public List<Violation> getViolations() { return list(node.path("violations"),n->new Violation(n.path("field").asText(),n.path("message").asText())); }
    static ProviderDetails from(JsonNode response,Secrets secrets) {
        if(!response.isObject())return null;
        var safe=JsonNodeFactory.instance.objectNode();
        for(String key:new String[]{"code","message"}) {
            JsonNode value=response.get(key);if(value==null || !value.isValueNode() || value.isNull())continue;
            String sanitized=secrets.redact(value.asText(),key.equals("code")?64:2048);
            if(key.equals("message") || sanitized.matches("[A-Za-z0-9_.:-]{1,64}"))safe.put(key,sanitized);
        }
        if(!safe.has("message") && response.path("error").isTextual())safe.put("message",secrets.redact(response.path("error").asText(),2048));
        var violations=JsonNodeFactory.instance.arrayNode();
        JsonNode errors=response.path("errors");
        if(errors.isObject())for(var entry:errors.properties()) {
            if(violations.size()>=32)break;
            if(entry.getValue().isArray())for(JsonNode message:entry.getValue()) {
                if(violations.size()>=32)break;
                if(message.isValueNode() && !message.isNull())violations.addObject().put("field",secrets.redact(entry.getKey(),128)).put("message",secrets.redact(message.asText(),512));
            } else if(entry.getValue().isValueNode() && !entry.getValue().isNull())violations.addObject().put("field",secrets.redact(entry.getKey(),128)).put("message",secrets.redact(entry.getValue().asText(),512));
        }
        if(!violations.isEmpty())safe.set("violations",violations);
        return safe.isEmpty()?null:new ProviderDetails(safe);
    }
}
