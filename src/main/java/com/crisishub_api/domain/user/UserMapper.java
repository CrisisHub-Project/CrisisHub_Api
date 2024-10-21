package com.crisishub_api.domain.user;

import com.crisishub_api.domain.user.dto.UserCreateDto;
import com.crisishub_api.domain.user.dto.UserResponseDto;

public class UserMapper {

    static UserResponseDto mapToUserCreateResponseDto(User user) {
        return UserResponseDto.builder().id(user.getId()).username(user.getUsername()).email(user.getEmail()).role(user.getRole()).build();
    }

   static User mapToUserEntity(UserCreateDto userCreateDto) {
        return User.builder().username(userCreateDto.username()).email(userCreateDto.email()).password(userCreateDto.password()).role(userCreateDto.role()).build();
    }
}
