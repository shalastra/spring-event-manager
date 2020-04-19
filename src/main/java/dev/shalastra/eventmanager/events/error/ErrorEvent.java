package dev.shalastra.eventmanager.events.error;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import dev.shalastra.eventmanager.events.Event;
import dev.shalastra.eventmanager.events.EventType;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ErrorEvent implements Event {

    private final EventType eventType = EventType.NOTHING;
    private final boolean isPublic = true;

    private Long id;
}
