package knowyoursos.updatedbmicroservice.repositories;

import knowyoursos.updatedbmicroservice.entities.Police;
import knowyoursos.updatedbmicroservice.entities.compositeIds.PoliceId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PoliceRepository extends JpaRepository<Police, PoliceId> {
}
