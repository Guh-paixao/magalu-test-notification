package br.com.gustavo.magalums.controller.dto;

import br.com.gustavo.magalums.entity.Channel;
import br.com.gustavo.magalums.entity.Notification;
import br.com.gustavo.magalums.entity.Status;

import java.time.LocalDateTime;

public record ScheduleNotificationDTO(LocalDateTime dateTime,
                                      String destination,
                                      String message,
                                      Channel.Values channel) {

    public Notification toNotification() {
        return new Notification(
                dateTime,
                destination,
                message,
                channel.toChannel(),
                Status.Values.PENDING.toStatus()
        );
    }
}
