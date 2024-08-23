package org.northcoders.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.LocalDate;

public class User {
    @Id
    @GeneratedValue
    int id;

    String userName;
    String email;
    String password;
    Role role;
    LocalDate dateRegistered;
}
