package com.example.tournament.adapter.event;

import com.example.tournament.application.service.NotificationService;
import com.example.tournament.domain.event.TournamentCreatedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class SpringEventListener {

    private final NotificationService notificationService;

    public SpringEventListener(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @EventListener
    public void handleTournamentCreatedEvent(TournamentCreatedEvent event) {
        this.notificationService.sendInvitationNotification(event.participants(), event.tournamentId());
    }
}

