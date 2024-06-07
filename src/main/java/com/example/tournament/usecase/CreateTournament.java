package com.example.tournament.usecase;

import com.example.tournament.domain.event.EventPublisher;
import com.example.tournament.domain.event.TournamentCreatedEvent;
import com.example.tournament.domain.model.Participants;
import com.example.tournament.domain.model.Tournament;
import com.example.tournament.domain.repository.TournamentRepository;

// Contains technical logic, such as storing data and publishing events
public class CreateTournament {
    private final TournamentRepository tournamentRepository;
    private final EventPublisher eventPublisher;

    public CreateTournament(TournamentRepository tournamentRepository, EventPublisher eventPublisher) {
        this.tournamentRepository = tournamentRepository;
        this.eventPublisher = eventPublisher;
    }

    public void execute(Participants participants) {
        Tournament tournament = new Tournament();
        tournamentRepository.save(tournament);

        eventPublisher.publishEvent(new TournamentCreatedEvent(tournament.getId(), participants));
    }
}
