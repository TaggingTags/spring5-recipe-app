package guru.springframework.controllers;

import guru.springframework.domain.Category;
import guru.springframework.domain.UnitMeasure;
import guru.springframework.repositories.CategoryRepository;
import guru.springframework.repositories.UnitMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

/**
 * Created by jt on 6/1/17.
 */
@Controller
public class IndexController {

    private CategoryRepository categoryRepository;
    private UnitMeasureRepository unitMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitMeasureRepository unitMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitMeasureRepository = unitMeasureRepository;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(){
        Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
        Optional<UnitMeasure> unitMeasureOptional = unitMeasureRepository.findByDescription("Teaspoon");

        System.out.println("cat ID : " + categoryOptional.get().getId() +
                            "UOM ID : " + unitMeasureOptional.get().getId());
        return "index";
    }
}
