package dev.shalastra.eventmanager.events;

import com.fasterxml.jackson.core.JsonProcessingException;
import dev.shalastra.eventmanager.events.error.ErrorEvent;
import lombok.extern.slf4j.Slf4j;

public interface Parser<T extends Event> {

    Event parse(String payload) throws JsonProcessingException;

    private Event error(String message) {
        return new ErrorEvent(message);
    }

    default Event parseEvent(String payload) {
        try {
            return parse(payload);
        } catch (JsonProcessingException e) {
            return error(e.getMessage());
        }
    }
}
