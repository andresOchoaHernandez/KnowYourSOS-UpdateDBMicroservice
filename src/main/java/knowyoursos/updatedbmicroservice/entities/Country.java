package knowyoursos.updatedbmicroservice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Country {

    @Id
    private Integer id;
    private String name;
    private String isoNumericCode;
    private String isoCodeAlpha3;
}
