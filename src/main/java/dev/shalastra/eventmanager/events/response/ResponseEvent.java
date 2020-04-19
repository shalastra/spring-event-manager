package dev.shalastra.eventmanager.events.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import dev.shalastra.eventmanager.events.Event;
import dev.shalastra.eventmanager.events.EventType;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResponseEvent implements Event {

    private EventType eventType;
    private boolean isPublic;

    private String message;

    public ResponseEvent(Event event, String message) {
        this.eventType = event.getEventType();
        this.isPublic = event.isPublic();

        this.message = message;
    }
}
