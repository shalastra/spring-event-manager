package dev.shalastra.eventmanager.events;

public interface Parser<T extends Event> {

    T parse(String payload);
}
