package org.northcoders.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import org.jetbrains.annotations.NotNull;


import java.time.LocalDate;

@Entity
public class User {
    @Id
    @GeneratedValue
    int id;

    @NotNull
    String userName;

    String email;
    String password;
    Role role;
    LocalDate dateRegistered;
}
