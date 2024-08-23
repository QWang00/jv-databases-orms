package org.northcoders.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import org.jetbrains.annotations.NotNull;
import java.util.Set;

@Entity
public class Ingredient {
    @Id
    @GeneratedValue
    private long  id;

    @NotNull
    private String name;

    @ManyToMany(mappedBy = "ingredients")
    private Set<Recipe> recipes;

    int quantity;
    private String unitOfMeasurement;

    public Ingredient() {
    }

    public Ingredient( @NotNull String name, Set<Recipe> recipes, int quantity, String unitOfMeasurement) {

        this.name = name;
        this.recipes = recipes;
        this.quantity = quantity;
        this.unitOfMeasurement = unitOfMeasurement;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public @NotNull String getName() {
        return name;
    }

    public void setName(@NotNull String name) {
        this.name = name;
    }

    public Set<Recipe> getRecipes() {
        return recipes;
    }

    public void setRecipes(Set<Recipe> recipes) {
        this.recipes = recipes;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getUnitOfMeasurement() {
        return unitOfMeasurement;
    }

    public void setUnitOfMeasurement(String unitOfMeasurement) {
        this.unitOfMeasurement = unitOfMeasurement;
    }
}
