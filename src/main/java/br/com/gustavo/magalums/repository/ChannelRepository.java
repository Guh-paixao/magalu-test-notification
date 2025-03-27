package br.com.gustavo.magalums.repository;

import br.com.gustavo.magalums.entity.Channel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChannelRepository extends JpaRepository<Channel, Long> {
}
