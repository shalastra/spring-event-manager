package dev.shalastra.eventmanager.events;

public interface Executor<T extends Event> {
    EventType getEventType();

    Event apply(T t);
}
