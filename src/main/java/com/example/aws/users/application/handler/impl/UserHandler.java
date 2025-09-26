package com.example.aws.users.application.handler.impl;

import com.example.aws.users.application.dto.request.CreateUserRequestDto;
import com.example.aws.users.application.dto.response.UserResponseDto;
import com.example.aws.users.application.handler.IUserHandler;
import com.example.aws.users.application.mappers.ICreateUserRequestMapper;
import com.example.aws.users.application.mappers.IUserResponseMapper;
import com.example.aws.users.domain.api.IUserServicePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class UserHandler implements IUserHandler {
    private final IUserServicePort userService;
    private final ICreateUserRequestMapper createUserRequestMapper;
    private final IUserResponseMapper userResponseMapper;
    @Override
    public void createUser(CreateUserRequestDto createUserRequest) {
        userService.createUser(createUserRequestMapper.toUser(createUserRequest));
    }

    @Override
    public UserResponseDto getUser(Long id) {
        return userResponseMapper.toUserResponse(userService.getUserById(id));
    }
}
