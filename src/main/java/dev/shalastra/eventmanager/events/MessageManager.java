package dev.shalastra.eventmanager.events;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Map;

@Slf4j
@Service
@RequiredArgsConstructor
public class MessageManager implements Manager {

    private final Propagator propagator;

    private final Map<EEvent, Executor<Message>> functions;

    @Override
    public void process(String sessionId, String payload) {
        log.info("Processing the payload: {}", payload);
        propagate(handle(read(payload)));
    }

    private Message read(String payload) {
        log.info("Converting the payload...");
        return Converter.convert(payload);
    }

    private Message handle(Message message) {
        log.info("Handling the message...");
        Executor<Message> executor = functions.get(message.getEventType());

        log.info("Executing the event...");
        return executor.apply(message);
    }

    private void propagate(Message message) {
        log.info("Propagating the message...");
        if (message.isPublic()) propagator.propagateToAll();
        else propagator.propagate(null, null);
    }
}
