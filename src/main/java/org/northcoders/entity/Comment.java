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
    private RecipeUser author;

    @ManyToOne(fetch = LAZY)
    private Recipe associatedRecipe;

    public Comment() {
    }

    public Comment(String text, LocalDate datePosted, RecipeUser author, Recipe associatedRecipe) {

        this.text = text;
        this.datePosted = datePosted;
        this.author = author;
        this.associatedRecipe = associatedRecipe;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDate getDatePosted() {
        return datePosted;
    }

    public void setDatePosted(LocalDate datePosted) {
        this.datePosted = datePosted;
    }

    public RecipeUser getAuthor() {
        return author;
    }

    public void setAuthor(RecipeUser author) {
        this.author = author;
    }

    public Recipe getAssociatedRecipe() {
        return associatedRecipe;
    }

    public void setAssociatedRecipe(Recipe associatedRecipe) {
        this.associatedRecipe = associatedRecipe;
    }
}
