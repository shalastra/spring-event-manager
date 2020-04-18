package io.shalastra.messenger.events;

public interface Parser<T extends Message> {

    T parse(String payload);
}
