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
}
