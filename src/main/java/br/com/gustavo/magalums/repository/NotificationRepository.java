package br.com.gustavo.magalums.repository;

import br.com.gustavo.magalums.entity.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
}
