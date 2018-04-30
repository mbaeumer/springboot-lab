package se.mbaeumer.springboot.udemy.recipeapp.repositories;

import org.springframework.data.repository.CrudRepository;
import se.mbaeumer.springboot.udemy.recipeapp.models.Category;

/**
 * Created by martinbaumer on 30/04/18.
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {
}
