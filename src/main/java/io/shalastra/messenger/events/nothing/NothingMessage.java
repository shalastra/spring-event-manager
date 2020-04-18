package io.shalastra.messenger.events.nothing;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.shalastra.messenger.events.EEvent;
import io.shalastra.messenger.events.Message;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class NothingMessage implements Message {

    private final EEvent eventType = EEvent.NOTHING;
    private final boolean isPublic = true;

    private Long id;
}
