package com.webmania.sdk;

import java.util.concurrent.CompletableFuture;

/** Internal future retaining deliberately safe request context across synchronous interruption. */
abstract class ContextFuture<T> extends CompletableFuture<T> {
    abstract ApiException failure(ApiException.Kind kind);
    // Newer JDKs wrap cancellation when retrieving a future. Keep the typed
    // SDK cancellation accessible consistently without changing native state.
    private static java.util.concurrent.CancellationException original(java.util.concurrent.CancellationException error) {
        if(error instanceof ApiCancellationException)return error;
        return error.getCause() instanceof ApiCancellationException context?context:error;
    }
    @Override public T get()throws InterruptedException,java.util.concurrent.ExecutionException {
        try{return super.get();}catch(java.util.concurrent.CancellationException e){throw original(e);}
    }
    @Override public T get(long timeout,java.util.concurrent.TimeUnit unit)throws InterruptedException,java.util.concurrent.ExecutionException,java.util.concurrent.TimeoutException {
        try{return super.get(timeout,unit);}catch(java.util.concurrent.CancellationException e){throw original(e);}
    }
    @Override public T join() {
        try{return super.join();}catch(java.util.concurrent.CancellationException e){throw original(e);}
    }
    @Override public T getNow(T absent) {
        try{return super.getNow(absent);}catch(java.util.concurrent.CancellationException e){throw original(e);}
    }
}
