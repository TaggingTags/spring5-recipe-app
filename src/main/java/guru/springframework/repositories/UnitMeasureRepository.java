package guru.springframework.repositories;


import guru.springframework.domain.UnitMeasure;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UnitMeasureRepository extends CrudRepository<UnitMeasure, Long> {

    Optional<UnitMeasure> findByDescription(String description);
}
