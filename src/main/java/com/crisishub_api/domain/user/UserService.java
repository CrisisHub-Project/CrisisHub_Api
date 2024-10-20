package com.crisishub_api.domain.user;

import com.crisishub_api.domain.user.dto.UserCreateDto;
import com.crisishub_api.domain.user.dto.UserCreateResponseDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserService {

    private final UserRepository userRepository;
    public UserCreateResponseDto register(UserCreateDto userCreateDto) {

        User user = UserMapper.mapToUserEntity(userCreateDto);
        User savedUser = userRepository.save(user);

        return UserMapper.mapToUserCreateResponseDto(savedUser);
    }


}
