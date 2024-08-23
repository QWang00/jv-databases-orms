package org.northcoders.entity;

import jakarta.persistence.*;
import org.jetbrains.annotations.NotNull;
import static jakarta.persistence.FetchType.LAZY;

@Entity
public class Image {
    @Id
    @GeneratedValue
    private long id;

    @NotNull
    private String fileName;

    private int fileData;

    @ManyToOne(fetch = LAZY)
    private Recipe associatedRecipe;

    public Image(@NotNull String fileName, int fileData, Recipe associatedRecipe) {
        this.fileName = fileName;
        this.fileData = fileData;
        this.associatedRecipe = associatedRecipe;
    }

    public Image() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public @NotNull String getFileName() {
        return fileName;
    }

    public void setFileName(@NotNull String fileName) {
        this.fileName = fileName;
    }

    public int getFileData() {
        return fileData;
    }

    public void setFileData(int fileData) {
        this.fileData = fileData;
    }

    public Recipe getAssociatedRecipe() {
        return associatedRecipe;
    }

    public void setAssociatedRecipe(Recipe associatedRecipe) {
        this.associatedRecipe = associatedRecipe;
    }
}
