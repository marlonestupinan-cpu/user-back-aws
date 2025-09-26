package com.example.aws.users.domain.spi;

import com.example.aws.users.domain.model.User;

public interface IUserPersistencePort {
    void saveUser(User user);

    User getUserById(Long id);
}
