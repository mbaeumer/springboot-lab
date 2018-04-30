package se.mbaeumer.springboot.udemy.recipeapp.services;

import se.mbaeumer.springboot.udemy.recipeapp.models.Recipe;

/**
 * Created by martinbaumer on 30/04/18.
 */
public interface RecipeService {
    Iterable<Recipe> getRecipes();
}
