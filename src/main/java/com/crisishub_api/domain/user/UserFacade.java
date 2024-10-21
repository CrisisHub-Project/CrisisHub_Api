package com.crisishub_api.domain.user;

import com.crisishub_api.domain.user.dto.UserCreateDto;
import com.crisishub_api.domain.user.dto.UserResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@RequiredArgsConstructor
@Service
public class UserFacade {

    private final UserService userService;


    public UserResponseDto registerUser(UserCreateDto userCreateDto) {
        return userService.register(userCreateDto);
    }

    public UserResponseDto findUserByUsername(String username) {
        return userService.findUserByUsername(username);
    }
}
