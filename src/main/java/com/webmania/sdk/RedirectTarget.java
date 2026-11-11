package com.webmania.sdk;

/** A sensitive redirect destination, recoverable only by deliberate access; no automatic fetch occurs. */
public final class RedirectTarget {
    private final String value;
    private RedirectTarget(String value) { this.value=value; }
    static RedirectTarget from(String value) {
        if(value==null || value.isBlank() || value.length()>8192 || value.codePoints().anyMatch(Character::isISOControl))return null;
        try {
            var uri=java.net.URI.create(value);
            if(uri.getScheme()!=null && !java.util.Set.of("http","https").contains(uri.getScheme().toLowerCase(java.util.Locale.ROOT)))return null;
            return new RedirectTarget(value);
        } catch(IllegalArgumentException e){return null;}
    }
    /** Exact Location value; treat it as a capability and authorize any new request explicitly. */
    public String value() { return value; }
    @com.fasterxml.jackson.annotation.JsonValue public String redactedJson() { return toString(); }
    @Override public String toString() { return "RedirectTarget[redacted]"; }
}
