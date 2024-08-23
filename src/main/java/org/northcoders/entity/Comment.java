package org.northcoders.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import static jakarta.persistence.FetchType.LAZY;

@Entity
public class Comment {
    @Id
    @GeneratedValue
    private long id;

    private String text;
    private LocalDate datePosted;

    @ManyToOne(fetch=LAZY)
    private User author;

    @ManyToOne(fetch = LAZY)
    private Recipe associatedRecipe;
}
