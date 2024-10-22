package com.crisishub_api.domain.user.dto;

import com.crisishub_api.domain.user.Role;
import lombok.Builder;
import org.antlr.v4.runtime.misc.NotNull;

@Builder
public record UserResponseDto(

        Long id,

        String username,

        String email,

        Role role) {

}
