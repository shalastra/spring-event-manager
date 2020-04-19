package dev.shalastra.eventmanager.events.nothing;

import com.fasterxml.jackson.databind.ObjectMapper;
import dev.shalastra.eventmanager.events.Parser;
import lombok.SneakyThrows;

public class NothingParser implements Parser<NothingEvent> {

    @SneakyThrows
    @Override
    public NothingEvent parse(String payload) {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(payload, NothingEvent.class);
    }
}
