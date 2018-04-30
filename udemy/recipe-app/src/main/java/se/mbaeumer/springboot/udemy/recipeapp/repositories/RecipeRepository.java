package se.mbaeumer.springboot.udemy.recipeapp.repositories;

import org.springframework.data.repository.CrudRepository;
import se.mbaeumer.springboot.udemy.recipeapp.models.Recipe;

/**
 * Created by martinbaumer on 30/04/18.
 */
public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
