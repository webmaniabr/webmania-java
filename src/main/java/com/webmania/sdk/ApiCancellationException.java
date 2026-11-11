package com.webmania.sdk;

/** Native future cancellation with the same deliberately private context as other call failures. */
public final class ApiCancellationException extends java.util.concurrent.CancellationException {
    private final ApiException context;
    ApiCancellationException(ApiException context) {
        super(context.getMessage());this.context=context;
    }
    /** Explicit access to operation, uncertainty and the protected reconciliation reference. */
    public ApiException context() { return context; }
}
