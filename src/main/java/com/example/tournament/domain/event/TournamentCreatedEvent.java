package com.example.tournament.domain.event;

import com.example.tournament.domain.model.Participants;

import java.util.UUID;

public record TournamentCreatedEvent(UUID tournamentId, Participants participants) {
}

