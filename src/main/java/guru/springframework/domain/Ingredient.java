package guru.springframework.domain;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@EqualsAndHashCode(exclude = "recipe")
@Entity
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description ;
    private BigDecimal amount;

    public Ingredient( String description, BigDecimal amount, UnitMeasure uom) {

        this.description = description;
        this.amount = amount;
        this.uom = uom;
    }

    @OneToOne(fetch = FetchType.EAGER)
    private UnitMeasure uom;

    @ManyToOne
    private Recipe recipe;

    public Ingredient() {

    }

}
