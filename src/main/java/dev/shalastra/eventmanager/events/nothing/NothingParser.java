package dev.shalastra.eventmanager.events.nothing;

import com.fasterxml.jackson.databind.ObjectMapper;
import dev.shalastra.eventmanager.events.Parser;
import lombok.SneakyThrows;

public class NothingParser implements Parser<NothingMessage> {

    @SneakyThrows
    @Override
    public NothingMessage parse(String payload) {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(payload, NothingMessage.class);
    }
}
