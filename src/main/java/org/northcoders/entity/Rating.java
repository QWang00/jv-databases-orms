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
}
