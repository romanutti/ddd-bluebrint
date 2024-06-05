package com.example.tournament.domain.model;

import com.example.tournament.domain.event.EventPublisher;
import com.example.tournament.domain.event.ParticipantRegisteredEvent;
import com.example.tournament.domain.repository.TournamentRepository;

import java.util.UUID;

public class Tournament {
    private final TournamentRepository tournamentRepository;
    private final EventPublisher eventPublisher;
    private final UUID id;

    private Participants participants;
    private TournamentStatus status;

    public Tournament(TournamentRepository tournamentRepository, EventPublisher eventPublisher) {
        this.tournamentRepository = tournamentRepository;
        this.eventPublisher = eventPublisher;
        this.id = UUID.randomUUID();
    }

    public void createTournament(Participants participants) {
        if (participants.getParticipantIds().isEmpty()) {
            throw new IllegalArgumentException("Participants should be available.");
        }

        this.participants = participants;
        this.status = TournamentStatus.CREATED;

        tournamentRepository.save(this);

        participants.getParticipantIds().forEach(participantId -> eventPublisher.publishEvent(new ParticipantRegisteredEvent(this.id, participantId)));
    }
}
