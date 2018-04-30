package se.mbaeumer.springboot.udemy.recipeapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import se.mbaeumer.springboot.udemy.recipeapp.services.RecipeService;

/**
 * Created by martinbaumer on 22/04/18.
 */
@Controller
public class IndexController {

    private RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getIndex(Model model){

        model.addAttribute("recipes", recipeService.getRecipes());
        return "index";
    }
}
