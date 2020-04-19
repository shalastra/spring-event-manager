package dev.shalastra.eventmanager.events;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;

import static dev.shalastra.eventmanager.events.FunctionalUtils.applyAndAccept;

@Slf4j
@Service
@RequiredArgsConstructor
public class MessageManager implements Manager {

    private final Propagator propagator;

    private final Map<EventType, Processor<Event>> functions;

    @Override
    public void process(String sessionId, String payload) {
        log.info("Processing the payload: {}", payload);

        applyAndAccept(read().andThen(handle()), propagate()).accept(payload);
    }

    private Function<String, Event> read() {
        return payload -> {
            log.info("Converting the payload...");
            return Converter.convert(payload);
        };
    }

    private Function<Event, Event> handle() {
        return event -> {
            log.info("Handling the message...");
            Processor<Event> processor = functions.get(event.getEventType());

            log.info("Executing the event...");
            return processor.apply(event);
        };
    }

    private Consumer<Event> propagate() {
        return event -> {
            log.info("Propagating the message...");
            if (event.isPublic()) propagator.propagateToAll();
            else propagator.propagate(null, null);
        };
    }
}
