package com.crisishub_api.domain.user.dto;

import com.crisishub_api.domain.user.Role;
import lombok.Builder;

@Builder
public record UserCreateDto(

        String username,

        String password,

        String confirmPassword,

        String email,

        Role role
) {
}
