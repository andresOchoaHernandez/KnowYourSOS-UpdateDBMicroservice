package knowyoursos.updatedbmicroservice.repositories;

import knowyoursos.updatedbmicroservice.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Integer> {
}
