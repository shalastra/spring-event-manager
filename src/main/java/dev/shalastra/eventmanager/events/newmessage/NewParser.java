package dev.shalastra.eventmanager.events.newmessage;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import dev.shalastra.eventmanager.events.Event;
import dev.shalastra.eventmanager.events.Parser;

public class NewParser implements Parser<NewEvent> {

    @Override
    public Event parse(String payload) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.readValue(payload, NewEvent.class);
        } catch (JsonProcessingException e) {
            return error(e.getMessage());
        }
    }
}
