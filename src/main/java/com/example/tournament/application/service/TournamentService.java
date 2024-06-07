package com.example.tournament.application.service;

import com.example.tournament.domain.event.EventPublisher;
import com.example.tournament.domain.model.Participants;
import com.example.tournament.domain.repository.TournamentRepository;
import com.example.tournament.usecase.CreateTournament;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TournamentService {
    private final TournamentRepository tournamentRepository;
    private final EventPublisher eventPublisher;

    public TournamentService(TournamentRepository tournamentRepository, EventPublisher eventPublisher) {
        this.tournamentRepository = tournamentRepository;
        this.eventPublisher = eventPublisher;
    }

    @Transactional
    public void createNewTournament(Participants participants) {
        CreateTournament createTournament = new CreateTournament(tournamentRepository, eventPublisher);
        createTournament.execute(participants);
    }
}
