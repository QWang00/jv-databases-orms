package org.northcoders.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.ManyToAny;

import java.time.LocalDate;

import static jakarta.persistence.FetchType.LAZY;

@Entity
public class Comment {
    @Id
    @GeneratedValue
    int id;

    String text;
    LocalDate datePosted;

    @ManyToOne(fetch=LAZY)
    User author;

    @ManyToOne(fetch = LAZY)
    Recipe associatedRecipe;
}
