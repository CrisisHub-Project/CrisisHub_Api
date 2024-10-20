package com.crisishub_api.domain.user;

import com.crisishub_api.domain.user.dto.UserCreateDto;
import com.crisishub_api.domain.user.dto.UserCreateResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@RequiredArgsConstructor
@Service
public class UserFacade {

    private final UserService userService;


    public UserCreateResponseDto registerUser(UserCreateDto userCreateDto) {
        return userService.register(userCreateDto);
    }
}
