package se.mbaeumer.springboot.udemy.recipeapp.repositories;

import org.springframework.data.repository.CrudRepository;
import se.mbaeumer.springboot.udemy.recipeapp.models.UnitOfMeasure;

/**
 * Created by martinbaumer on 30/04/18.
 */
public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
}
