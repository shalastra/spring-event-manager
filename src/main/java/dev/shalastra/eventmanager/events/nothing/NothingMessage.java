package dev.shalastra.eventmanager.events.nothing;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import dev.shalastra.eventmanager.events.EEvent;
import dev.shalastra.eventmanager.events.Message;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class NothingMessage implements Message {

    private final EEvent eventType = EEvent.NOTHING;
    private final boolean isPublic = true;

    private Long id;
}
