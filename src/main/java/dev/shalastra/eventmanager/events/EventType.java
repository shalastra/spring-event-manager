package dev.shalastra.eventmanager.events;

import dev.shalastra.eventmanager.events.error.ErrorParser;
import dev.shalastra.eventmanager.events.newmessage.NewParser;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;
import java.util.function.Supplier;

@RequiredArgsConstructor
public enum EventType {
    NEW(NewParser::new),
    NOTHING(ErrorParser::new);

    private final Supplier<Parser<? extends Event>> supplier;

    public static EventType of(String payload) {
        return Arrays
                .stream(values())
                .filter(eEvent -> payload.contains(eEvent.name()))
                .findFirst().orElse(NOTHING);
    }

    public Event parse(String payload) {
        return supplier.get().parse(payload);
    }
}
