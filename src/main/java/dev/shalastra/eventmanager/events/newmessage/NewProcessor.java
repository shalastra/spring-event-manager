package dev.shalastra.eventmanager.events.newmessage;

import dev.shalastra.eventmanager.events.Event;
import dev.shalastra.eventmanager.events.EventType;
import dev.shalastra.eventmanager.events.Processor;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
class NewProcessor implements Processor<NewEvent> {

    @Getter
    final EventType eventType = EventType.NEW;

    @Override
    public Event apply(NewEvent newMessage) {
        log.info("Executing the following event: {}", newMessage.toString());
        return newMessage;
    }
}
