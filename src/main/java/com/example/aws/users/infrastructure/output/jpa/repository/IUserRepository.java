package com.example.aws.users.infrastructure.output.jpa.repository;

import com.example.aws.users.infrastructure.output.jpa.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<UserEntity, Long> {
}
