package com.webmania.sdk;

/** Status plus typed data. The string representation never renders fiscal contents. */
public final class ApiResult<T> {
    private final T data;
    private final int status;
    private final String correlation;
    private final boolean uncertain;
    private final Reference reference;
    ApiResult(T data,int status,String correlation) { this(data,status,correlation,false,null); }
    ApiResult(T data,int status,String correlation,boolean uncertain,Reference reference) { this.data=data;this.status=status;this.correlation=correlation;this.uncertain=uncertain;this.reference=reference; }
    public boolean outcomeUncertain() { return uncertain; }
    public Reference reference() { return reference; }
    public T data() { return data; }
    public int status() { return status; }
    public String correlation() { return correlation; }
    @com.fasterxml.jackson.annotation.JsonValue public String redactedJson() { return toString(); }
    @Override public String toString() { return "ApiResult[HTTP "+status+", redacted]"; }
}
