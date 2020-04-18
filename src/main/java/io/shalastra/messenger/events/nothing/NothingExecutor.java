package io.shalastra.messenger.events.nothing;

import io.shalastra.messenger.events.EEvent;
import io.shalastra.messenger.events.Executor;
import io.shalastra.messenger.events.Message;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class NothingExecutor implements Executor<NothingMessage> {

    @Getter
    private final EEvent eventType = EEvent.NOTHING;

    @Override
    public Message apply(NothingMessage nothingMessage) {
        log.info("Executing the following event: {}", nothingMessage.toString());
        return nothingMessage;
    }
}
