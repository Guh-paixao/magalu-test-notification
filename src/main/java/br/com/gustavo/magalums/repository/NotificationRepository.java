package br.com.gustavo.magalums.repository;

import br.com.gustavo.magalums.entity.Notification;
import br.com.gustavo.magalums.entity.Status;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
    List<Notification> findByStatusInAndDateTimeBefore(List<Status> status, LocalDateTime dateTime);
}
