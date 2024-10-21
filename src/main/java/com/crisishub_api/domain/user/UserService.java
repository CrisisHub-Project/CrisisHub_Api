package com.crisishub_api.domain.user;

import com.crisishub_api.domain.user.dto.UserCreateDto;
import com.crisishub_api.domain.user.dto.UserResponseDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public UserResponseDto register(UserCreateDto userCreateDto) {

        User user = UserMapper.mapToUserEntity(userCreateDto);
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        User savedUser = userRepository.save(user);

        return UserMapper.mapToUserCreateResponseDto(savedUser);
    }

    public UserResponseDto findUserByUsername(String username) {
        UserDetails userDetails = userRepository.findByUsername(username).orElseThrow(() -> new RuntimeException("User not found: " + username));
        User user = (User) userDetails;
        return UserMapper.mapToUserCreateResponseDto(user);
    }
}
