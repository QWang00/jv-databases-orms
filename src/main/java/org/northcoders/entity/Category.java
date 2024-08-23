package org.northcoders.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;


import javax.annotation.processing.Generated;

public class Category {
    @Id
    @GeneratedValue
    int id;


    String name;

}
