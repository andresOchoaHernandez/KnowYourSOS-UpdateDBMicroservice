package knowyoursos.updatedbmicroservice.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import knowyoursos.updatedbmicroservice.entities.compositeIds.FireId;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Fire {
    @EmbeddedId
    private FireId fireId;
}
