package dev.shalastra.eventmanager.events;

import dev.shalastra.eventmanager.events.error.ErrorEvent;

public interface Parser<T extends Event> {

    Event parse(String payload);

    default Event error(String message) {
        return new ErrorEvent(message);
    }
}
