package br.com.gustavo.magalums.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_status")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Status {
    @Id
    private Long statusId;
    private String description;

    @AllArgsConstructor
    @NoArgsConstructor
    public enum Values {
        PENDING(1L, "Pending"),
        SUCCESS(2L, "Success"),
        ERROR(3L, "Error"),
        CANCELED(4L, "Canceled");

        private Long id;
        private String description;

        public Status toStatus() {
            return new Status(id, description);
        }
    }
}
