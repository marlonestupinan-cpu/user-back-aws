package com.example.aws.users.domain.model;

import lombok.Data;

@Data
public class User {
    private Long id;
    private String name;
    private String email;
    private String document;
}
