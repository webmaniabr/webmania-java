package com.webmania.sdk;

/** Structured diagnostics contain no raw body, URL, request, credential, or underlying exception cause. */
public final class ApiException extends RuntimeException {
    public enum Kind { VALIDATION, CAPABILITY_DISABLED, AUTH_SCOPE, TIMEOUT, CANCELLED, TRANSPORT, PROTOCOL, API, HTTP, LIMIT, REDIRECT, CLOSED }
    private final Kind kind;
    private final String operation;
    private final int status;
    private final boolean uncertain;
    private final Reference reference;
    private final String correlation;
    private final ProviderDetails details;
    private final RedirectTarget redirect;
    ApiException(Kind kind,String operation,int status,boolean uncertain,Reference reference,String correlation) {
        this(kind,operation,status,uncertain,reference,correlation,null);
    }
    ApiException(Kind kind,String operation,int status,boolean uncertain,Reference reference,String correlation,ProviderDetails details) {
        this(kind,operation,status,uncertain,reference,correlation,details,null);
    }
    ApiException(Kind kind,String operation,int status,boolean uncertain,Reference reference,String correlation,ProviderDetails details,RedirectTarget redirect) {
        super("Webmania "+kind+" for "+operation+(status>0?" (HTTP "+status+")":""),null,false,true);
        this.kind=kind;this.operation=operation;this.status=status;this.uncertain=uncertain;this.reference=reference;this.correlation=correlation;this.details=details;this.redirect=redirect;
    }
    public RedirectTarget redirect() { return redirect; }
    public Kind kind() { return kind; }
    public String operation() { return operation; }
    public int status() { return status; }
    public boolean outcomeUncertain() { return uncertain; }
    public Reference reference() { return reference; }
    public ProviderDetails details() { return details; }
    public String correlation() { return correlation; }
}
