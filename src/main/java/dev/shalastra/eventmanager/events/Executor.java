package dev.shalastra.eventmanager.events;

public interface Executor<T extends Message> {
    EventType getEventType();

    Message apply(T t);
}
