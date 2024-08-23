package org.northcoders.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

public class Tag {
    @Id
    @GeneratedValue
    int id;

    String name;
}
