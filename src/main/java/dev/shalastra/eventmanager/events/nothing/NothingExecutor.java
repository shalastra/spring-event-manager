package dev.shalastra.eventmanager.events.nothing;

import dev.shalastra.eventmanager.events.Event;
import dev.shalastra.eventmanager.events.EventType;
import dev.shalastra.eventmanager.events.Executor;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class NothingExecutor implements Executor<NothingEvent> {

    @Getter
    private final EventType eventType = EventType.NOTHING;

    @Override
    public Event apply(NothingEvent nothingMessage) {
        log.info("Executing the following event: {}", nothingMessage.toString());
        return nothingMessage;
    }
}