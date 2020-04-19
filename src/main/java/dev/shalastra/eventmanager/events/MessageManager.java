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

    private final Map<EventType, Executor<Event>> functions;

    @Override
    public void process(String sessionId, String payload) {
        log.info("Processing the payload: {}", payload);
        propagate(handle(read(payload)));
    }

    private Event read(String payload) {
        log.info("Converting the payload...");
        return Converter.convert(payload);
    }

    private Event handle(Event event) {
        log.info("Handling the message...");
        Executor<Event> executor = functions.get(event.getEventType());

        log.info("Executing the event...");
        return executor.apply(event);
    }

    private void propagate(Event event) {
        log.info("Propagating the message...");
        if (event.isPublic()) propagator.propagateToAll();
        else propagator.propagate(null, null);
    }
}
