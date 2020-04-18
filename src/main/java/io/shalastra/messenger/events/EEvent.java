package io.shalastra.messenger.events;

import io.shalastra.messenger.events.newmessage.NewParser;
import io.shalastra.messenger.events.nothing.NothingParser;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;
import java.util.function.Supplier;

@RequiredArgsConstructor
public enum EEvent {
    NEW(NewParser::new),
    NOTHING(NothingParser::new);

    private final Supplier<Parser<? extends Message>> supplier;

    public static EEvent of(String payload) {
        return Arrays
                .stream(values())
                .filter(eEvent -> payload.contains(eEvent.name()))
                .findFirst().orElse(NOTHING);
    }

    public Message parse(String payload) {
        return supplier.get().parse(payload);
    }
}
