package org.northcoders.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import org.jetbrains.annotations.NotNull;


import java.time.LocalDate;
import java.util.Set;

@Entity
public class RecipeUser {
    @Id
    @GeneratedValue
    private long id;

    @NotNull
    private String userName;

    private String email;
    private String password;
    private Role role;
    private LocalDate dateRegistered;

    @OneToMany(mappedBy = "author")
    private Set<Comment> comments;

    @OneToMany(mappedBy = "rater")
    private Set<Rating> ratings;

    @OneToMany(mappedBy = "creator")
    private Set<Recipe> recipes;

    public RecipeUser() {
    }

    public RecipeUser(@NotNull String userName, String email, String password, Role role, LocalDate dateRegistered, Set<Comment> comments, Set<Rating> ratings, Set<Recipe> recipes) {
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.role = role;
        this.dateRegistered = dateRegistered;
        this.comments = comments;
        this.ratings = ratings;
        this.recipes = recipes;
    }
}
