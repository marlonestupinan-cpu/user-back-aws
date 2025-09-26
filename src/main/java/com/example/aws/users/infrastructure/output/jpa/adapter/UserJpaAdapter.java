package com.example.aws.users.infrastructure.output.jpa.adapter;

import com.example.aws.users.domain.model.User;
import com.example.aws.users.domain.spi.IUserPersistencePort;
import com.example.aws.users.infrastructure.exception.UserNotFoundException;
import com.example.aws.users.infrastructure.output.jpa.mapper.IUserEntityMapper;
import com.example.aws.users.infrastructure.output.jpa.repository.IUserRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UserJpaAdapter implements IUserPersistencePort {
    private final IUserRepository userRepository;
    private final IUserEntityMapper userEntityMapper;

    @Override
    public void saveUser(User user) {
        userRepository.save(userEntityMapper.toUserEntity(user));
    }

    @Override
    public User getUserById(Long id) {
        return userRepository
                .findById(id)
                .map(userEntityMapper::toUser)
                .orElseThrow(UserNotFoundException::new);
    }
}
