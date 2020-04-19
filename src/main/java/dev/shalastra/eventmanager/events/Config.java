package dev.shalastra.eventmanager.events;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;

@Slf4j
@Configuration
class Config {

    @Bean
    public <T extends Event> Map<EventType, Executor<T>> functions(List<Executor<T>> executorList) {
        Map<EventType, Executor<T>> map = new EnumMap<>(EventType.class);

        executorList.forEach(executor -> {
            log.info("Adding new executor of type: {}", executor.getClass().getSimpleName());
            map.put(executor.getEventType(), executor);
        });

        return map;
    }
}
