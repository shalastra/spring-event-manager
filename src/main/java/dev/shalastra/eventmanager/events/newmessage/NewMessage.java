package dev.shalastra.eventmanager.events.newmessage;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import dev.shalastra.eventmanager.events.EventType;
import dev.shalastra.eventmanager.events.Message;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
class NewMessage implements Message {

    private final EventType eventType = EventType.NEW;
    private final boolean isPublic = false;
}
