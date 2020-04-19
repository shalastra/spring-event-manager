package dev.shalastra.eventmanager.events.newmessage;

import com.fasterxml.jackson.databind.ObjectMapper;
import dev.shalastra.eventmanager.events.Parser;
import lombok.SneakyThrows;

public class NewParser implements Parser<NewEvent> {

    @SneakyThrows
    @Override
    public NewEvent parse(String payload) {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(payload, NewEvent.class);
    }
}
