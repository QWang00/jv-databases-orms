package org.northcoders.entity;

import jakarta.persistence.*;
import org.jetbrains.annotations.NotNull;
import java.time.LocalDate;
import static jakarta.persistence.FetchType.LAZY;

@Entity
public class Rating {
    @Id
    @GeneratedValue
    private long id;

    @Column(name = "rating_value")
    @NotNull
    private int value;

    private LocalDate dateRated;

    @ManyToOne(fetch = LAZY)
    private Recipe associatedRecipe;

    @ManyToOne(fetch = LAZY)
    private RecipeUser rater;

    public Rating() {
    }

    public Rating(@NotNull int value, LocalDate dateRated, Recipe associatedRecipe, RecipeUser rater) {
        this.value = value;
        this.dateRated = dateRated;
        this.associatedRecipe = associatedRecipe;
        this.rater = rater;
    }
}
