package io.shalastra.messenger;

import io.shalastra.messenger.events.Manager;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@RequiredArgsConstructor
@SpringBootApplication
public class MessengerApplication implements CommandLineRunner {

    private final Manager messageManager;

    public static void main(String[] args) {
        SpringApplication.run(MessengerApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        String nothingEvent = "{\"eventType\":\"NOTHING\", \"id\": 1}";
        String newEvent = "{\"eventType\":\"NEW\"}";

        messageManager.process(null, nothingEvent);
        messageManager.process(null, newEvent);
    }
}

