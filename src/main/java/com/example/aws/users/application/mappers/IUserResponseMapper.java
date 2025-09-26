package com.example.aws.users.application.mappers;

import com.example.aws.users.application.dto.response.UserResponseDto;
import com.example.aws.users.domain.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IUserResponseMapper {
    UserResponseDto toUserResponse(User userById);
}
