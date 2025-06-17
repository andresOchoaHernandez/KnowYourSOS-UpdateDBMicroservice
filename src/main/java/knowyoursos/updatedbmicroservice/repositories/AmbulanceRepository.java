package knowyoursos.updatedbmicroservice.repositories;

import knowyoursos.updatedbmicroservice.entities.Ambulance;
import knowyoursos.updatedbmicroservice.entities.compositeIds.AmbulanceId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AmbulanceRepository extends JpaRepository<Ambulance, AmbulanceId> {
}
