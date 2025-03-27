package br.com.gustavo.magalums.service;

import br.com.gustavo.magalums.controller.dto.ScheduleNotificationDTO;
import br.com.gustavo.magalums.repository.NotificationRepository;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    private final NotificationRepository notificationRepository;

    public NotificationService(NotificationRepository notificationRepository) {
        this.notificationRepository = notificationRepository;
    }

    public void scheduleNotification(ScheduleNotificationDTO dto) {
        notificationRepository.save(dto.toNotification());
    }
}
