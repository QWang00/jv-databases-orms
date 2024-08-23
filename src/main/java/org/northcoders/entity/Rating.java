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
    int id;

    @NotNull
    int value;

    LocalDate dateRated;

    @ManyToOne(fetch = LAZY)
    Recipe associatedRecipe;

    @ManyToOne(fetch = LAZY)
    User rater;
}
