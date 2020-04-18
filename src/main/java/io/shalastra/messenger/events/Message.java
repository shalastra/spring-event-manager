package io.shalastra.messenger.events;

public interface Message {
    boolean isPublic();

    EEvent getEventType();
}
