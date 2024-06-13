package com.dcat23.spring.demo.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class User {
    @NotNull
    @Size(min = 1, max = 100)
    private String username;

    @Email
    private String email;

    // Getters and setters
}