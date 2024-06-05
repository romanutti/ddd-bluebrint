package com.example.tournament.application.listener;

import com.example.tournament.application.service.ParticipantService;
import com.example.tournament.domain.event.ParticipantRegisteredEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class ParticipantRegisteredEventListener {

    private final ParticipantService participantService;

    public ParticipantRegisteredEventListener(ParticipantService participantService) {
        this.participantService = participantService;
    }

    @EventListener
    public void handleParticipantRegistered(ParticipantRegisteredEvent event) {
        this.participantService.registerParticipant(event.participantId(), event.tournamentId());
    }
}

