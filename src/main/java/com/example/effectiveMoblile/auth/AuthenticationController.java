package com.example.effectiveMoblile.auth;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
@Tag(name = "Registration and Authentication")
public class AuthenticationController {

    private final AuthenticationService service;

    @Operation(
            description = "Get endpoint for user registration",
            summary = "User registration field",
            responses = {
                    @ApiResponse(
                            description = "Success!",
                            responseCode = "200"
                    ),
                    @ApiResponse(
                            description = "Unauthorized /Invalid token",
                            responseCode = "403"
                    )
            }
    )
    @PostMapping("/register")
    public ResponseEntity<AuthenticationResponse> register(@RequestBody RegisterRequest request) {
        return ResponseEntity.ok(service.register(request));
    }


    @Operation(
            description = "Get endpoint for user authentication",
            summary = "User authentication field",
            responses = {
                    @ApiResponse(
                            description = "Success!",
                            responseCode = "200"
                    ),
                    @ApiResponse(
                            description = "Unauthorized /Invalid token",
                            responseCode = "403"
                    )
            }
    )
    @PostMapping("/authenticate")
    public ResponseEntity<AuthenticationResponse> authenticate(@RequestBody AuthenticationRequest request) {
        return ResponseEntity.ok(service.authenticate(request));
    }


    public AuthenticationController(AuthenticationService service) {
        this.service = service;
    }
}
