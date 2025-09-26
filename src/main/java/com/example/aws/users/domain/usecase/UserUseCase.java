package com.example.aws.users.domain.usecase;

import com.example.aws.users.domain.api.IUserServicePort;
import com.example.aws.users.domain.model.User;
import com.example.aws.users.domain.spi.IUserPersistencePort;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UserUseCase implements IUserServicePort {
    private final IUserPersistencePort userPersistencePort;

    @Override
    public void createUser(User user) {
        userPersistencePort.saveUser(user);
    }

    @Override
    public User getUserById(Long id) {
        return userPersistencePort.getUserById(id);
    }
}
