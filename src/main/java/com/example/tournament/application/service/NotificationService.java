package com.example.tournament.application.service;

import com.example.tournament.domain.event.EventPublisher;
import com.example.tournament.domain.model.Participants;
import com.example.tournament.usecase.SendInvitationNotification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
public class NotificationService {
    private final EventPublisher eventPublisher;

    public NotificationService(EventPublisher eventPublisher) {
        this.eventPublisher = eventPublisher;
    }

    @Transactional
    public void sendInvitationNotification(Participants participants, UUID tournamentId) {
        SendInvitationNotification sendInvitationNotification = new SendInvitationNotification();
        sendInvitationNotification.execute();

        // this.eventPublisher.publishEvent(...);
    }
}
