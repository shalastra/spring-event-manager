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
    public <T extends Event> Map<EventType, Processor<T>> functions(List<Processor<T>> processorList) {
        Map<EventType, Processor<T>> map = new EnumMap<>(EventType.class);

        processorList.forEach(processor -> {
            log.info("Adding new executor of type: {}", processor.getClass().getSimpleName());
            map.put(processor.getEventType(), processor);
        });

        return map;
    }
}
