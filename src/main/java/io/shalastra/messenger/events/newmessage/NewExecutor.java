package io.shalastra.messenger.events.newmessage;

import io.shalastra.messenger.events.EEvent;
import io.shalastra.messenger.events.Executor;
import io.shalastra.messenger.events.Message;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
class NewExecutor implements Executor<NewMessage> {

    @Getter
    final EEvent eventType = EEvent.NEW;

    @Override
    public Message apply(NewMessage newMessage) {
        log.info("Executing the following event: {}", newMessage.toString());
        return newMessage;
    }
}
