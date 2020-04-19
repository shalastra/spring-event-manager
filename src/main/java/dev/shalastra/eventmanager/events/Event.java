package dev.shalastra.eventmanager.events;

public interface Event {
    boolean isPublic();

    EventType getEventType();
}
