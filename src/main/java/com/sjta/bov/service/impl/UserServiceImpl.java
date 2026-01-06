package com.sjta.bov.service.impl;

import com.sjta.bov.dto.UserRegistrationDTO;
import com.sjta.bov.entity.User;
import com.sjta.bov.repository.UserRepository;
import com.sjta.bov.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User registerUser(UserRegistrationDTO dto) {
        // 1. Logic: Check if User ID exists
        if(userRepository.findByUserId(dto.getUserId()).isPresent()) {
            throw new RuntimeException("User ID " + dto.getUserId() + " is already taken!");
        }

        // 2. Logic: Map DTO to Entity
        User user = new User();
        user.setUserId(dto.getUserId());
        user.setName(dto.getName());
        user.setMobileNumber(dto.getMobileNumber());
        user.setRole(dto.getRole());
        user.setFaceTemplate(dto.getFaceTemplate());
        user.setAssignedZone(dto.getAssignedZone());
        user.setPassword(dto.getPassword()); // In next step, we will add password encryption here

        // 3. Save to Database
        return userRepository.save(user);
    }
}