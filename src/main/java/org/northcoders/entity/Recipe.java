package org.northcoders.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import static jakarta.persistence.FetchType.LAZY;

@Entity
public class Recipe {
    @Id
    @GeneratedValue
    private long id;

    @OneToMany(mappedBy = "recipe")
    private Set<Comment> comments;

    @OneToMany(mappedBy = "recipe")
    private Set<Image> images;

    private String title;
    private String description;
    private String instruction;
    private int preparationTime;
    private int cookingTime;
    private int servings;
    private int difficultyLevel;

    @OneToMany(mappedBy = "recipe")
    private Set<Rating> rating;

    @ManyToMany
    @JoinTable(
            name = "recipe_ingredient",
            joinColumns = @JoinColumn(name = "recipe_id"),
            inverseJoinColumns = @JoinColumn(name = "ingredient_id")
    )
    private Set<Ingredient> ingredients;

    @ManyToMany
    @JoinTable(
            name = "recipe_category",
            joinColumns = @JoinColumn(name = "recipe_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id")
    )
    private Set<Category> categories;

    @ManyToOne(fetch = LAZY)
    private User creator;

    private LocalDate dateCreated;
    private LocalDate lastModified;
}
