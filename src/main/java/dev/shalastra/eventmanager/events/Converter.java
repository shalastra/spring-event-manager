package dev.shalastra.eventmanager.events;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class Converter {
    public static Event convert(String payload) {
        EventType eventType = EventType.of(payload);

        log.info("Received the event of type: {}", eventType.name());

        return eventType.parse(payload);
    }
}
