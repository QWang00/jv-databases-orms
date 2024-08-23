package org.northcoders.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import org.jetbrains.annotations.NotNull;

import java.util.Set;


@Entity
public class Category {
    @Id
    @GeneratedValue
    private long id;

    @NotNull
    private String name;

    @ManyToMany(mappedBy = "categories")
    private Set<Recipe> recipes;

}
