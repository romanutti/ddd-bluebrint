package com.example.tournament.domain.model;

import java.util.UUID;

// Contains business logic and no technical things such as storing data and publishing event
public class Tournament {
    private final UUID id;
    private TournamentStatus status;

    private Participants participants;

    public Tournament() {
        this.id = UUID.randomUUID();
        this.status = TournamentStatus.CREATED;
    }

    public UUID getId() {
        return id;
    }

    public void addParticipants(Participants participants){
        this.participants = participants;
    }
}
