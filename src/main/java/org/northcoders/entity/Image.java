package org.northcoders.entity;

import jakarta.persistence.*;
import org.jetbrains.annotations.NotNull;

import java.util.Set;

import static jakarta.persistence.FetchType.LAZY;

@Entity
public class Image {
    @Id
    @GeneratedValue
    int id;

    @NotNull
    String fileName;

    int fileData;

    @ManyToOne(fetch = LAZY)
    Recipe associatedRecipe;

}
