package com.crisishub_api.domain.user.dto;

import com.crisishub_api.domain.user.Role;
import lombok.Builder;

@Builder
public record UserCreateResponseDto(

        Long id,

        String username,

        String email,

        Role role) {

}
