package dev.shalastra.eventmanager;

import dev.shalastra.eventmanager.events.Manager;
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
        String nothingEvent = "{\"eventType\":\"ERROR\"}";
        String newEvent = "{\"eventType\":\"NEW\", \"id\": 1}";

        messageManager.process(null, newEvent);
        messageManager.process(null, "");
    }
}

