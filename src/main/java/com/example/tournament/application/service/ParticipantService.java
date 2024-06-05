package com.example.tournament.application.service;

import com.example.tournament.domain.event.EventPublisher;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
public class ParticipantService {
    // private final ParticipantRepository participantRepository;
    private final EventPublisher eventPublisher;

    public ParticipantService(EventPublisher eventPublisher) {
        // this.participantRepository = ...
        this.eventPublisher = eventPublisher;
    }

    @Transactional
    public void registerParticipant(UUID participantId, UUID tournamentId) {
       // logic to mark participant as belonging to tournament
    }
}
