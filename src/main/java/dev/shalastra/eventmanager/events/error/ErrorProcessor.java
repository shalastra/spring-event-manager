package dev.shalastra.eventmanager.events.error;

import dev.shalastra.eventmanager.events.Event;
import dev.shalastra.eventmanager.events.EventType;
import dev.shalastra.eventmanager.events.Processor;
import dev.shalastra.eventmanager.events.response.ResponseEvent;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ErrorProcessor implements Processor<ErrorEvent> {

    @Getter
    private final EventType eventType = EventType.ERROR;

    @Override
    public Event apply(ErrorEvent nothingMessage) {
        log.info("Executing the following event: {}", nothingMessage.toString());
        return new ResponseEvent(nothingMessage, "Processed");
    }
}
