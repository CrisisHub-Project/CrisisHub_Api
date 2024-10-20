package com.crisishub_api.infrastructure.usercontroller;

import com.crisishub_api.domain.user.UserFacade;
import com.crisishub_api.domain.user.dto.UserCreateDto;
import com.crisishub_api.domain.user.dto.UserCreateResponseDto;
import jdk.jfr.Category;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/public")
@RequiredArgsConstructor
@CrossOrigin("*")
public class UserController {

    private final UserFacade userFacade;

    @PostMapping("/register")
    public ResponseEntity<UserCreateResponseDto> registerUser(@RequestBody UserCreateDto userCreateDto) {
        UserCreateResponseDto userCreateResponseDto = userFacade.registerUser(userCreateDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(userCreateResponseDto);
    }



}
