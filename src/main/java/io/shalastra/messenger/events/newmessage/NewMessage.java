package io.shalastra.messenger.events.newmessage;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.shalastra.messenger.events.EEvent;
import io.shalastra.messenger.events.Message;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
class NewMessage implements Message {

    private final EEvent eventType = EEvent.NEW;
    private final boolean isPublic = false;
}
