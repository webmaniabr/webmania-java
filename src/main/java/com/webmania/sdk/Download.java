package com.webmania.sdk;

import com.fasterxml.jackson.databind.JsonNode;

/** Bounded, buffered fiscal bytes. Password protection is not reported as plaintext authorization. */
public final class Download {
    public enum Protection { AUTHENTICATED, DOCUMENT_TOKEN, POSSIBLY_PASSWORD_PROTECTED, PUBLIC_CAPABILITY }
    /** Inspected bytes; encryption is reported without decrypting the representation. */
    public enum Kind { PDF, ENCRYPTED_PDF, XML, ZIP, ENCRYPTED_ZIP, XLSX, CSV, HTML }
    private final byte[] bytes;
    private final String contentType;
    private final Protection protection;
    private final JsonNode pending;
    private final RedirectTarget redirect;
    private final Kind kind;
    Download(byte[] bytes,String contentType,Protection protection) { this(bytes,contentType,protection,FileChecks.inspect(contentType,bytes)); }
    Download(byte[] bytes,String contentType,Protection protection,Kind kind) { this.bytes=bytes.clone();this.contentType=contentType;this.protection=protection;this.kind=kind;pending=null;redirect=null; }
    Download(JsonNode pending) { bytes=new byte[0];contentType="application/json";protection=Protection.POSSIBLY_PASSWORD_PROTECTED;this.pending=pending.deepCopy();redirect=null;kind=null; }
    Download(RedirectTarget target,Protection protection) { bytes=new byte[0];contentType="";pending=null;redirect=target;this.protection=protection;kind=null; }
    public boolean isRedirect() { return redirect!=null; }
    public RedirectTarget redirectTarget() { return redirect; }
    public byte[] bytes() { return bytes.clone(); }
    public String contentType() { return contentType; }
    public Protection protection() { return protection; }
    /** Null for a pending JSON status or redirect, which are distinct from file bytes. */
    public Kind kind() { return kind; }
    public boolean encrypted() { return kind==Kind.ENCRYPTED_PDF || kind==Kind.ENCRYPTED_ZIP; }
    public boolean pending() { return pending!=null; }
    public JsonValue pendingStatus() { return pending==null?null:new JsonValue(pending); }
    @com.fasterxml.jackson.annotation.JsonValue public String redactedJson() { return toString(); }
    @Override public String toString() { return "Download["+bytes.length+" bytes, redacted]"; }
}
