package com.example.tournament.domain.model;

import java.util.UUID;

public class Participant {
    private final UUID id;
    private Name name;

    public Participant(UUID id, Name name) {
        this.id = id;
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }
}
