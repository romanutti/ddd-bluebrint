package com.example.tournament.adapter.persistence;

import com.example.tournament.domain.model.Tournament;
import com.example.tournament.domain.repository.TournamentRepository;
import org.springframework.stereotype.Repository;

@Repository
public class TournamentRepositoryImpl implements TournamentRepository {
    // private final JpaTournamentRepository jpaTournamentRepository;

    public TournamentRepositoryImpl(
            // JpaTournamentRepository jpaTournamentRepository
    ) {
        // this.jpaTournamentRepository = jpaTournamentRepository;
    }

    @Override
    public void save(Tournament tournament) {
        // jpaTournamentRepository.save(toEntity(tournament));
    }

    private Tournament toDomain(TournamentEntity entity) {
        // convert TournamentEntity to Tournament domain object
        return null;
    }

    private TournamentEntity toEntity(Tournament tournament) {
        // convert Tournament domain object to TournamentEntity
        return null;
    }
}
