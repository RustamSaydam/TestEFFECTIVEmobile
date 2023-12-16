package com.example.effectiveMoblile.service;

import com.example.effectiveMoblile.model.User;
import com.example.effectiveMoblile.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUser() {
        return userRepository.findAll();
    }
}
