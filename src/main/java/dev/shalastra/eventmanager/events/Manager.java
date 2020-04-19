package dev.shalastra.eventmanager.events;

public interface Manager {
    void process(String sessionId, String payload);
}
