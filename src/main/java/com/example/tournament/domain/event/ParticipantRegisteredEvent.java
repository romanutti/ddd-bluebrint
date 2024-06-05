package com.example.tournament.domain.event;

import java.util.UUID;

public record ParticipantRegisteredEvent(UUID tournamentId, UUID participantId) {
}

