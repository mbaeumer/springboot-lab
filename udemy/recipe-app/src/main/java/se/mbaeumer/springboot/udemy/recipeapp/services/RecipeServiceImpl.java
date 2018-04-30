package se.mbaeumer.springboot.udemy.recipeapp.services;

import org.springframework.stereotype.Service;
import se.mbaeumer.springboot.udemy.recipeapp.models.Recipe;
import se.mbaeumer.springboot.udemy.recipeapp.repositories.RecipeRepository;

import java.util.List;

/**
 * Created by martinbaumer on 30/04/18.
 */
@Service
public class RecipeServiceImpl implements RecipeService {

    private RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public Iterable<Recipe> getRecipes() {
        return recipeRepository.findAll();
    }
}
