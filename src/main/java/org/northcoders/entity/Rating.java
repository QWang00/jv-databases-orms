package org.northcoders.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import org.jetbrains.annotations.NotNull;
import static jakarta.persistence.FetchType.LAZY;
import java.time.LocalDate;

@Entity
public class Rating {
    @Id
    @GeneratedValue
    private long id;

    @NotNull
    private int value;

    private LocalDate dateRated;

    @ManyToOne(fetch = LAZY)
    private Recipe associatedRecipe;

    @ManyToOne(fetch = LAZY)
    private User rater;
}
