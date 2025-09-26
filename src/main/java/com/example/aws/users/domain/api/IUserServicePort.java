package com.example.aws.users.domain.api;

import com.example.aws.users.domain.model.User;

public interface IUserServicePort {
    void createUser(User user);

    User getUserById(Long id);
}
