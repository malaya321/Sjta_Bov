package com.sjta.bov.controller;

import com.sjta.bov.dto.UserRegistrationDTO;
import com.sjta.bov.entity.User;
import com.sjta.bov.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/admin")
public class AdminController {

    @Autowired
    private UserService userService; // Injecting the Service, not the Repo

    @PostMapping("/register-user")
    public ResponseEntity<?> registerUser(@RequestBody UserRegistrationDTO dto) {
        try {
            User registeredUser = userService.registerUser(dto);
            return ResponseEntity.ok(registeredUser);
        } catch (RuntimeException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}