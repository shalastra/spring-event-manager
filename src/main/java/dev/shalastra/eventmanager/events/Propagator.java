package dev.shalastra.eventmanager.events;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Propagator {

    public void propagateToAll(Event event) {
        log.info("Propagate to all: {}", event.toString());
    }

    public void propagate(Event event) {
        log.info("Propagate: {}", event.toString());
    }
}
