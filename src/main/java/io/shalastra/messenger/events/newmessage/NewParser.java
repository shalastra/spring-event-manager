package io.shalastra.messenger.events.newmessage;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.shalastra.messenger.events.Parser;
import lombok.SneakyThrows;

public class NewParser implements Parser<NewMessage> {

    @SneakyThrows
    @Override
    public NewMessage parse(String payload) {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(payload, NewMessage.class);
    }
}
