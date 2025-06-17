package knowyoursos.updatedbmicroservice.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import knowyoursos.updatedbmicroservice.entities.compositeIds.AmbulanceId;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Ambulance {
    @EmbeddedId
    private AmbulanceId ambulanceId;
}
