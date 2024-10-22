package com.crisishub_api.domain.user.dto;

import com.crisishub_api.domain.user.Role;
import jakarta.persistence.Enumerated;
import lombok.Builder;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Builder
public record UserCreateDto(
        @NotBlank(message = "Pole nie może być puste i musi zawierać przynajmniej jeden znak specjalny")
        @Size(min = 3, message = "Musi być dłuższe niż 3 znaki")
        String username,
        @NotBlank(message = "Pole nie może być puste i musi zawierać przynajmniej jeden znak specjalny")
        @Size(min = 7, message = "Musi być dłuższe niż 7 znaków")
        String password,

        String confirmPassword,

        @Email
        String email,

        Role role
) {
}
