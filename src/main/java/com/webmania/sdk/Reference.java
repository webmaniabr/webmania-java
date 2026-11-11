package com.webmania.sdk;

/** A server-usable selector copied from the request or response, never a fabricated local identifier. */
public final class Reference {
    private final String field;
    private final String value;
    Reference(String field,String value) { this.field=field;this.value=value; }
    public String field() { return field; }
    /** Sensitive application selector: use explicitly for reconciliation, never log it. */
    public String value() { return value; }
    @com.fasterxml.jackson.annotation.JsonValue public String redactedJson() { return toString(); }
    @Override public String toString() { return "Reference["+field+", redacted]"; }
}
