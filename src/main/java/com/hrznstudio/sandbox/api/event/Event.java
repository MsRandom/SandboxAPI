package com.hrznstudio.sandbox.api.event;

import com.hrznstudio.sandbox.api.util.ClassUtil;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class Event {

    private final boolean async = ClassUtil.isAnnotationPresent(getClass(), Async.class);
    private final boolean cancellable = ClassUtil.isAnnotationPresent(getClass(), Cancellable.class);
    private boolean cancelled, complete;

    public boolean isAsync() {
        return async;
    }

    public boolean isCancellable() {
        return cancellable;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public boolean isComplete() {
        return complete;
    }

    protected void checkState() {
        if (complete) {
            throw new UnsupportedOperationException("Cannot modify event in an async context");
        }
    }

    public void cancel() {
        if (!isCancellable())
            throw new UnsupportedOperationException("Cannot cancel non-cancellable event");
        checkState();
        cancelled = true;
    }

    public void complete() {
        complete = true;
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.TYPE)
    public @interface Cancellable {

    }

    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.TYPE)
    public @interface Async {

    }
}