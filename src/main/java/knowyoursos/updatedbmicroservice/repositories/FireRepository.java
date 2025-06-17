package knowyoursos.updatedbmicroservice.repositories;

import knowyoursos.updatedbmicroservice.entities.Fire;
import knowyoursos.updatedbmicroservice.entities.compositeIds.FireId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FireRepository extends JpaRepository<Fire, FireId> {
}
