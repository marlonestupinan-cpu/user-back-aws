package com.example.aws.users.application.handler;

import com.example.aws.users.application.dto.request.CreateUserRequestDto;
import com.example.aws.users.application.dto.response.UserResponseDto;

public interface IUserHandler {
    void createUser(CreateUserRequestDto createUserRequest);

    UserResponseDto getUser(Long id);
}
