package com.example.aws.users.infrastructure.config;

import com.example.aws.users.application.mappers.ICreateUserRequestMapper;
import com.example.aws.users.domain.api.IUserServicePort;
import com.example.aws.users.domain.spi.IUserPersistencePort;
import com.example.aws.users.domain.usecase.UserUseCase;
import com.example.aws.users.infrastructure.output.jpa.adapter.UserJpaAdapter;
import com.example.aws.users.infrastructure.output.jpa.mapper.IUserEntityMapper;
import com.example.aws.users.infrastructure.output.jpa.repository.IUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class BeanConfiguration {
    // Mappers
    private final IUserEntityMapper userEntityMapper;
    // Repositories
    private final IUserRepository userRepository;

    public IUserPersistencePort userPersistencePort() {
        return new UserJpaAdapter(userRepository, userEntityMapper);
    }
    @Bean
    public IUserServicePort userServicePort() {
        return new UserUseCase(userPersistencePort());
    }
}
