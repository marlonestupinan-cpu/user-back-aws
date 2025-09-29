package com.example.aws.users.infrastructure.input.rest;

import com.example.aws.users.application.dto.request.CreateUserRequestDto;
import com.example.aws.users.application.dto.response.UserResponseDto;
import com.example.aws.users.application.handler.IUserHandler;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserRestController {
    public final IUserHandler userHandler;

    @PostMapping
    public ResponseEntity<Void> createUser(
            @RequestBody @Valid CreateUserRequestDto createUserRequest
            ) {
        userHandler.createUser(createUserRequest);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserResponseDto> updateUser(
            @PathVariable Long id
    ) {
        return ResponseEntity.ok(userHandler.getUser(id));
    }

    @GetMapping("/health")
    public ResponseEntity<Void> checkHealth() {
        return ResponseEntity.ok().build();
    }
}
