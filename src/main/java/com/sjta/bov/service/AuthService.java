package com.sjta.bov.service;

import com.sjta.bov.dto.LoginRequest;

public interface AuthService {
    String authenticateUser(LoginRequest request);
}