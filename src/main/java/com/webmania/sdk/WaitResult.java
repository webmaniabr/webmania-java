package com.webmania.sdk;

/** Last typed processing state; unknown/invalid states never silently mean completion. */
public final class WaitResult<T> {
    public enum Stop { COMPLETE, INVALID_STATE, UNKNOWN_STATE, ATTEMPT_LIMIT, DEADLINE }
    private final ApiResult<T> last;
    private final int attempts;
    private final Stop stop;
    WaitResult(ApiResult<T> last,int attempts,Stop stop) { this.last=last;this.attempts=attempts;this.stop=stop; }
    public ApiResult<T> lastResult() { return last; }
    public int attempts() { return attempts; }
    public Stop stop() { return stop; }
    public boolean completed() { return stop==Stop.COMPLETE; }
    @com.fasterxml.jackson.annotation.JsonValue public String redactedJson() { return toString(); }
    @Override public String toString() { return "WaitResult["+attempts+" attempts, "+stop+", redacted]"; }
}
