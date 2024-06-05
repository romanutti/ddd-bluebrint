package com.example.tournament.domain.repository;

import com.example.tournament.domain.model.Tournament;

public interface TournamentRepository {
    void save(Tournament tournament);
}