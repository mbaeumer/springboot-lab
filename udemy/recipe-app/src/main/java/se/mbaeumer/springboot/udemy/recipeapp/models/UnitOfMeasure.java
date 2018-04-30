package se.mbaeumer.springboot.udemy.recipeapp.models;

import javax.persistence.*;

/**
 * Created by martinbaumer on 30/04/18.
 */
@Entity
public class UnitOfMeasure {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
