package com.webmania.sdk;

import java.time.Duration;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import java.util.function.Supplier;

/** One active exchange at a time, with cancellation shared by pagination and the two supported wait operations. */
abstract class BoundedWorkflow<T> extends ContextFuture<T> {
    final WebmaniaClient client;
    final String operationId;
    private CompletableFuture<?> active;
    private ScheduledFuture<?> deadline;
    private ScheduledFuture<?> next;
    private boolean terminalRequested;
    BoundedWorkflow(WebmaniaClient client,String operation,Duration limit) {
        this.client=client;this.operationId=operation;
        whenComplete((r,e)->cleanup());client.track(this);
        if(!isDone())try{deadline=client.scheduler().schedule(this::expire,limit.toNanos(),TimeUnit.NANOSECONDS);}catch(java.util.concurrent.RejectedExecutionException e){abort(ApiException.Kind.CLOSED);}
    }
    synchronized ApiException failure(ApiException.Kind kind) {
        return active instanceof ContextFuture<?> context?context.failure(kind):new ApiException(kind,operationId,0,false,null,null);
    }
    synchronized void abort(ApiException.Kind kind) { if(isDone())return;terminalRequested=true;stopActive();completeExceptionally(failure(kind)); }
    synchronized void expire() { abort(ApiException.Kind.TIMEOUT); }
    final synchronized boolean pendingExchange() { return active!=null && !active.isDone(); }
    final synchronized <R> void exchange(Supplier<CompletableFuture<R>> action,Consumer<R> success) {
        if(isDone())return;
        try {
            CompletableFuture<R> call=action.get();active=call;
            call.whenComplete((value,error)->{
                synchronized(BoundedWorkflow.this) {
                    if(isDone() || terminalRequested)return;
                    if(error!=null){Throwable cause=error;while(cause instanceof java.util.concurrent.CompletionException && cause.getCause()!=null)cause=cause.getCause();completeExceptionally(cause instanceof ApiException?cause:failure(ApiException.Kind.TRANSPORT));return;}
                    try{success.accept(value);}catch(RuntimeException e){completeExceptionally(failure(ApiException.Kind.PROTOCOL));}
                }
            });
        } catch(RuntimeException e){completeExceptionally(failure(ApiException.Kind.VALIDATION));}
    }
    final synchronized void later(Duration delay,Runnable action) {
        if(isDone())return;
        try{next=client.scheduler().schedule(()->{synchronized(BoundedWorkflow.this){if(!isDone())action.run();}},delay.toNanos(),TimeUnit.NANOSECONDS);}catch(java.util.concurrent.RejectedExecutionException e){abort(ApiException.Kind.CLOSED);}
    }
    private synchronized void cleanup() { if(deadline!=null)deadline.cancel(false);if(next!=null)next.cancel(false);if(isCompletedExceptionally() || isCancelled())stopActive(); }
    private void stopActive() { if(active!=null && !active.isDone())active.cancel(true); }
    @Override public synchronized boolean cancel(boolean interrupt) { if(isDone())return isCancelled();terminalRequested=true;stopActive();completeExceptionally(new ApiCancellationException(failure(ApiException.Kind.CANCELLED)));return isCancelled(); }
}
