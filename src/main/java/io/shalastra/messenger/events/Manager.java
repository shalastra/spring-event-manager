package io.shalastra.messenger.events;

public interface Manager {
    void process(String sessionId, String payload);
}
