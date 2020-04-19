package dev.shalastra.eventmanager.events.nothing;

import dev.shalastra.eventmanager.events.EventType;
import dev.shalastra.eventmanager.events.Executor;
import dev.shalastra.eventmanager.events.Message;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class NothingExecutor implements Executor<NothingMessage> {

    @Getter
    private final EventType eventType = EventType.NOTHING;

    @Override
    public Message apply(NothingMessage nothingMessage) {
        log.info("Executing the following event: {}", nothingMessage.toString());
        return nothingMessage;
    }
}
