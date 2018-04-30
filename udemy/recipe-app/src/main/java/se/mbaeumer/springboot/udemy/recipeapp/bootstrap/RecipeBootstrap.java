package se.mbaeumer.springboot.udemy.recipeapp.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import se.mbaeumer.springboot.udemy.recipeapp.models.Recipe;
import se.mbaeumer.springboot.udemy.recipeapp.repositories.RecipeRepository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by martinbaumer on 30/04/18.
 */
@Component
public class RecipeBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private RecipeRepository recipeRepository;

    public RecipeBootstrap(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        recipeRepository.saveAll(getRecipes());
    }

    private List<Recipe> getRecipes(){
        List<Recipe> recipeList = new ArrayList<>();
        Recipe recipe1 = new Recipe();
        recipe1.setCookTime(1);
        recipe1.setDescription("Recipe 1");
        recipeList.add(recipe1);

        Recipe recipe2 = new Recipe();
        recipe2.setCookTime(1);
        recipe2.setDescription("Recipe 2");
        recipeList.add(recipe2);

        return recipeList;
    }
}
