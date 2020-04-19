package dev.shalastra.eventmanager.events.response;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import dev.shalastra.eventmanager.events.Event;
import dev.shalastra.eventmanager.events.Parser;

public class SuccessParser implements Parser<SuccessEvent> {

    @Override
    public Event parse(String payload) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(payload, SuccessEvent.class);
    }
}
