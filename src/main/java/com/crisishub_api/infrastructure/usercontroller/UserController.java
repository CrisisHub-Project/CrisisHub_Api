package com.crisishub_api.infrastructure.usercontroller;

import com.crisishub_api.domain.user.UserFacade;
import com.crisishub_api.domain.user.dto.UserResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
@CrossOrigin("*")
public class UserController {

    private final UserFacade userFacade;

    @GetMapping("/current-user")
    @ResponseBody
    public ResponseEntity<UserResponseDto> getCurrentUser(@AuthenticationPrincipal UserDetails principal) {
        String username = principal.getUsername();
        UserResponseDto userByUsername = userFacade.findUserByUsername(username);
        return ResponseEntity.ok(userByUsername);
    }
}
