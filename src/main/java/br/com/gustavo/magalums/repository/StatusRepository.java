package br.com.gustavo.magalums.repository;

import br.com.gustavo.magalums.entity.Status;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatusRepository extends JpaRepository<Status, Long> {
}
