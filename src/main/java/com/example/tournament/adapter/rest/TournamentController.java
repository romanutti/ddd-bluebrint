package com.example.tournament.adapter.rest;

import com.example.tournament.application.service.TournamentService;
import com.example.tournament.domain.model.Participants;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;

@RestController
public class TournamentController {

    public final TournamentService tournamentService;

    public TournamentController(TournamentService tournamentService) {
        this.tournamentService = tournamentService;
    }

    @PostMapping
    public void createTournament(){
        this.tournamentService.createNewTournament(new Participants(Collections.emptyList()));
    }
}
