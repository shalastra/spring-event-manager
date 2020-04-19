package dev.shalastra.eventmanager.events.newmessage;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import dev.shalastra.eventmanager.events.Event;
import dev.shalastra.eventmanager.events.EventType;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
class NewEvent implements Event {

    private final EventType eventType = EventType.NEW;
    private final boolean isPublic = false;
}
