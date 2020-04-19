package dev.shalastra.eventmanager.events;

public interface Executor<T extends Event> extends EventTypeDeclarable {
    Event apply(T t);
}
