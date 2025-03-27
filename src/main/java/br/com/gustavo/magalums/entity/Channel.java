package br.com.gustavo.magalums.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_channel")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Channel {
    @Id
    private Long channelId;
    private String description;

    @AllArgsConstructor
    @NoArgsConstructor
    public enum Values {
        EMAIL(1L, "Email"),
        SMS(2L, "SMS"),
        PUSH(3L, "Push"),
        WHATSAPP(4L, "WhatsApp");

        private Long id;
        private String description;

        public Channel toChannel() {
            return new Channel(id, description);
        }
    }



}
