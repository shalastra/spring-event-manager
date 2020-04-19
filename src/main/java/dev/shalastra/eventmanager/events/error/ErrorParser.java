package dev.shalastra.eventmanager.events.error;

import com.fasterxml.jackson.databind.ObjectMapper;
import dev.shalastra.eventmanager.events.Parser;
import lombok.SneakyThrows;

public class ErrorParser implements Parser<ErrorEvent> {

    @SneakyThrows
    @Override
    public ErrorEvent parse(String payload) {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(payload, ErrorEvent.class);
    }
}
