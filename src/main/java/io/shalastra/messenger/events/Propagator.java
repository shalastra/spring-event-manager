package io.shalastra.messenger.events;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Propagator {

    public void propagateToAll() {
        log.info("Propagate to all");
    }

    public void propagate(Object o1, Object o2) {
        log.info("Propagate");
    }
}
