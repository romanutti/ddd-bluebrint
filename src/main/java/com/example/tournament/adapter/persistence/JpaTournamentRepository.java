package com.example.tournament.adapter.persistence;

import com.example.tournament.domain.model.Tournament;
import com.example.tournament.domain.repository.TournamentRepository;
import org.springframework.stereotype.Repository;

@Repository
public class JpaTournamentRepository implements TournamentRepository {
    // private final JpaTournamentRepository jpaTournamentRepository;

    public JpaTournamentRepository(
            // JpaTournamentRepository jpaTournamentRepository
    ) {
        // this.jpaTournamentRepository = jpaTournamentRepository;
    }

    @Override
    public void save(Tournament tournament) {
        // jpaTournamentRepository.save(toEntity(tournament));
    }
}
