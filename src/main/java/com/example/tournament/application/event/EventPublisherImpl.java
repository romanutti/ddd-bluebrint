package com.example.tournament.application.event;

import com.example.tournament.domain.event.EventPublisher;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
public class EventPublisherImpl implements EventPublisher {

    private final ApplicationEventPublisher eventPublisher;

    public EventPublisherImpl(ApplicationEventPublisher eventPublisher) {
        this.eventPublisher = eventPublisher;
    }

    @Override
    public void publishEvent(Object event) {
        this.eventPublisher.publishEvent(event);
    }
}
