package dev.shalastra.eventmanager.events.error;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import dev.shalastra.eventmanager.events.Event;
import dev.shalastra.eventmanager.events.Parser;

public class ErrorParser implements Parser<ErrorEvent> {

    @Override
    public Event parse(String payload) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(payload, ErrorEvent.class);
    }
}
