package com.crisishub_api.infrastructure.usercontroller;

import com.crisishub_api.domain.user.UserFacade;
import com.crisishub_api.domain.user.dto.UserCreateDto;
import com.crisishub_api.domain.user.dto.UserResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/public")
@RequiredArgsConstructor
@CrossOrigin("*")
public class AuthController {

    private final UserFacade userFacade;

    @PostMapping("/register")
    public ResponseEntity<UserResponseDto> registerUser(@RequestBody UserCreateDto userCreateDto) {
        UserResponseDto userResponseDto = userFacade.registerUser(userCreateDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(userResponseDto);
    }




}
