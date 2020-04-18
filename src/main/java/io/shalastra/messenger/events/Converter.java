package io.shalastra.messenger.events;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class Converter {
    public static Message convert(String payload) {
        EEvent eEvent = EEvent.of(payload);

        log.info("Received the event of type: {}", eEvent.name());

        return eEvent.parse(payload);
    }
}
