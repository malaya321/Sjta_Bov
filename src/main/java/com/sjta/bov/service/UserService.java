package com.sjta.bov.service;

import com.sjta.bov.dto.UserRegistrationDTO;
import com.sjta.bov.entity.User;

public interface UserService {
    User registerUser(UserRegistrationDTO dto);
}