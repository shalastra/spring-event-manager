package dev.shalastra.eventmanager.events;

public interface Message {
    boolean isPublic();

    EventType getEventType();
}
