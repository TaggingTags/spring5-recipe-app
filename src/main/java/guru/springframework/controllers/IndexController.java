package guru.springframework.controllers;

import guru.springframework.domain.Category;
import guru.springframework.domain.UnitMeasure;
import guru.springframework.repositories.CategoryRepository;
import guru.springframework.repositories.UnitMeasureRepository;
import guru.springframework.service.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

/**
 * Created by jt on 6/1/17.
 */
@Slf4j
@Controller
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model){
        log.debug("before request");

        model.addAttribute("recipes" ,recipeService.getRecipes());

        log.debug("after request");

        return "index";
    }
}
