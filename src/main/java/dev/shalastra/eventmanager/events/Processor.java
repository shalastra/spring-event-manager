package dev.shalastra.eventmanager.events;

public interface Processor<T extends Event> extends EventTypeDeclarable {
    Event apply(T t);
}
