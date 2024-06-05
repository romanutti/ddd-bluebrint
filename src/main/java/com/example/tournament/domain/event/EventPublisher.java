package com.example.tournament.domain.event;

public interface EventPublisher {
    void publishEvent(Object event);
}