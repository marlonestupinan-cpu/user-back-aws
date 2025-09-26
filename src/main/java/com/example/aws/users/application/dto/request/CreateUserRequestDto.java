package com.example.aws.users.application.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class CreateUserRequestDto {
    @NotBlank
    @NotNull
    private String name;
    @NotBlank
    @NotNull
    private String email;
    @NotBlank
    @NotNull
    private String document;
}
