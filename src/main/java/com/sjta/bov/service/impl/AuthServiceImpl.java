package com.sjta.bov.service.impl;

import com.sjta.bov.service.AuthService;
import com.sjta.bov.dto.LoginRequest;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {
    @Override
    public String authenticateUser(LoginRequest request) {
        return "Token_Placeholder";
    }
}