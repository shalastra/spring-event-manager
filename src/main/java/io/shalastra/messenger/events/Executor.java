package io.shalastra.messenger.events;

public interface Executor<T extends Message> {
    EEvent getEventType();

    Message apply(T t);
}
