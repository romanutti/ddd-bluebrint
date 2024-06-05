package com.example.tournament.domain.model;

public record Name(String firstName, String lastName) {
    public Name {
        if (firstName.isBlank() || lastName.isBlank()) {
            throw new IllegalArgumentException("Name not valid.");
        }
    }
}
