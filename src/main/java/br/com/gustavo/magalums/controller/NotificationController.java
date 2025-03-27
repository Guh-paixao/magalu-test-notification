package br.com.gustavo.magalums.controller;

import br.com.gustavo.magalums.controller.dto.ScheduleNotificationDTO;
import br.com.gustavo.magalums.entity.Notification;
import br.com.gustavo.magalums.service.NotificationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/{notificationId}")
    public ResponseEntity<Notification> getNotification(@PathVariable("notificationId") Long notificationId) {
        var notification = notificationService.findById(notificationId);

        if (notification.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(notification.get());
    }
}
