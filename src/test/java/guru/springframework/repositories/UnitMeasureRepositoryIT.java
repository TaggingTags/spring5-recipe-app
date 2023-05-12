package guru.springframework.repositories;

import guru.springframework.domain.UnitMeasure;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@DataJpaTest
class UnitMeasureRepositoryIT {

    @Autowired
    UnitMeasureRepository unitMeasureRepository;

    @BeforeEach
    void setUp() {
    }

    @Test
    void findByDescription() {

        Optional<UnitMeasure> unitMeasureOptional = unitMeasureRepository.findByDescription("Teaspoon");

        assertEquals("Teaspoon", unitMeasureOptional.get().getDescription());
    }
}