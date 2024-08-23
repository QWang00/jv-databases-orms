package org.northcoders.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

public class Ingredient {
    @Id
    @GeneratedValue
    int id;

    String name;
    int quantity;
    String unitOfMeasurement;
}
