package br.com.gustavo.magalums.controller;

import br.com.gustavo.magalums.controller.dto.ScheduleNotificationDTO;
import br.com.gustavo.magalums.service.NotificationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notifications")
public class NotificationController {

    private final NotificationService notificationService;

    public NotificationController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @PostMapping
    public ResponseEntity<Void> scheduleNotification(@RequestBody ScheduleNotificationDTO dto) {
        notificationService.scheduleNotification(dto);
        return ResponseEntity.accepted().build();

    }
}
