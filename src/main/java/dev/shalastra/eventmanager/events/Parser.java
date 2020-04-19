package dev.shalastra.eventmanager.events;

public interface Parser<T extends Message> {

    T parse(String payload);
}
