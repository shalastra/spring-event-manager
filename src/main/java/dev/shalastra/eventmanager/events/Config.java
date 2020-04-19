package dev.shalastra.eventmanager.events;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;

@Configuration
class Config {

    @Bean
    public <T extends Message> Map<EEvent, Executor<T>> functions(List<Executor<T>> executorList) {
        Map<EEvent, Executor<T>> map = new EnumMap<>(EEvent.class);

        executorList.forEach(executor -> map.put(executor.getEventType(), executor));

        return map;
    }
}
