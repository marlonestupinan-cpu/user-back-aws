package com.example.aws.users.infrastructure.output.jpa.mapper;

import com.example.aws.users.domain.model.User;
import com.example.aws.users.infrastructure.output.jpa.entity.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IUserEntityMapper {
    UserEntity toUserEntity(User user);

    User toUser(UserEntity userEntity);
}
