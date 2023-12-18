package com.example.effectiveMoblile.controller;

import com.example.effectiveMoblile.model.User;
import com.example.effectiveMoblile.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class UserController  {


    private final UserService userService;
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }


    @Operation(
            description = "Get all user with task",
            summary = "Find all user with them task",
            responses = {
                    @ApiResponse(
                            description = "Success!",
                            responseCode = "200"
                    ),
                    @ApiResponse(
                            description = "User does not exist",
                            responseCode = "403"
                    )
            }
    )
    @GetMapping("/user")
    public List<User> getAllUser() {
        return userService.getAllUser();
    }

}
