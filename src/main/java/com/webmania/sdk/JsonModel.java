package com.webmania.sdk;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import java.util.Set;

/** Typed fields are generated. Unknown extensions are explicit and cannot overwrite known fields. */
public abstract class JsonModel extends JsonValue {
    private final Set<String> fields;
    protected JsonModel(JsonNode node, Set<String> fields) { super(node); if (!this.node.isObject()) throw new IllegalArgumentException("Expected an object model"); this.fields = fields; }
    protected JsonModel(Set<String> fields) { this(JsonNodeFactory.instance.objectNode(), fields); }
    public final boolean has(String field) { return node.has(field); }
    public final boolean isNull(String field) { return node.has(field) && node.get(field).isNull(); }
    public final JsonModel explicitNull(String field) { if (!fields.contains(field)) throw new IllegalArgumentException("Unknown declared field"); put(field, JsonNodeFactory.instance.nullNode()); return this; }
    public final JsonModel omit(String field) { if (!fields.contains(field)) throw new IllegalArgumentException("Unknown declared field"); remove(field); return this; }
    public final JsonModel extension(String field, JsonValue value) {
        if (fields.contains(field)) throw new IllegalArgumentException("Extension overlaps a declared field");
        if (field.length() > 512) throw new IllegalArgumentException("Extension name exceeds limit");
        put(field, value == null ? null : value.toJson()); return this;
    }
    public final JsonValue extension(String field) { if (fields.contains(field)) throw new IllegalArgumentException("Use typed field"); return node.has(field) ? new JsonValue(node.get(field)) : null; }
}
