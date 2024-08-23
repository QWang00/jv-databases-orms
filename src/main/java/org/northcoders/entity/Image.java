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

}
