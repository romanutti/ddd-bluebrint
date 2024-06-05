package com.example.tournament.domain.model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public final class Participants {
    private final List<UUID> participantIds;

    public Participants(List<Participant> participants) {
        this.participantIds = participants.stream().map(Participant::getId).toList();
    }

    public List<UUID> getParticipantIds() {
        return new ArrayList<>(participantIds);
    }
}
