package org.northcoders.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import org.jetbrains.annotations.NotNull;

@Entity
public class Tag {
    @Id
    @GeneratedValue
    private long id;

    @NotNull
    private String name;
}
